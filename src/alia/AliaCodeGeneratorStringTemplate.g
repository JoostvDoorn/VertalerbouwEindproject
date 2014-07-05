tree grammar AliaCodeGeneratorStringTemplate;

options {
    k=1;                                // LL(1) - do not use LL(*)
    tokenVocab=Alia;                    // import tokens from Calc.tokens
    output = template;
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
    superClass=CodeGeneratorAux;
}

@header {
package alia;
import alia.symtab.SymbolTable;
import alia.symtab.IdEntry;
import java.util.Set;
import java.util.HashSet;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: AliaExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
    System.out.println("Exception!:"+e.getMessage());
        throw e; 
        // TODO: Fix this
    } 
}

@members {

}

program
    :
      (s+=expr)+
            ->  file(instructions={$s})
    ;

statements
  : (s+=expr
  )*
            ->  statements(instructions={$s});
    

expr @init { }
	 @after {}
    :   o=operand 						-> statement(instruction={$o.st})
    |   ^(OR t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(OR_ALT t1=expr t2=expr t=TYPE)   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(AND t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(AND_ALT t1=expr t2=expr t=TYPE)   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(EQ t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"eq"})
    |   ^(NQ t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ne"})
    |   { startExpression(); }^(LE t1=expr t2=expr t=TYPE){ decStack();endExpression(); }   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"le"})
    |   ^(GE t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ge"})
    |   ^(GT t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"gt"})
    |   { startExpression(); }^(LT t1=expr t2=expr t=TYPE){ decStack();endExpression(); }   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"lt"})
    |   ^(PLUS t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"add"})
    |   ^(MINUS t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"sub"})
    |   ^(TIMES t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"mul"})
    |   ^(DIV t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"div"})
    |   ^(MOD t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"rem"})
    | ^(WHILE cond=expr ^(DO t2=statements))  -> whilestmt(expr={$cond.st}, statement={$t2.st}, labelCond={newLabel()}, labelWhile={newLabel()})
    | ^(PRINT t=TYPE te=TYPE fexp=expr (exp+=exprPrint)*)                   -> printstmt(firststatement={$fexp.st},statements={$exp},type={getType($t.toString())},t={getType($te.toString()).T})
    | ^(READ t=TYPE ^(id=IDENTIFIER t=TYPE a=ID) (v+=varRead)*)                     -> readstmt(statements={$v},addr={$a},type={getType($t.toString())},t={getType($t.toString()).T},void={$t.toString().equals("void")})
    | ^(NOT o=operand t=TYPE)                    -> unarynot(x={$o.st}, instr={"not"})
    | ^(PLUS_OP o=operand t=TYPE)                  -> unaryplus(x={$o.st}, instr={"plus"})
    | ^(MINUS_OP o=operand t=TYPE)                 -> unarymin(x={$o.st}, instr={"neg"})
    |   { startExpression(); } ^(IF
        { startExpression(); } stif1=statements {endExpression(); } 
        ^(DO stif2=statements)
        (elsestmnts=elseif)?
      ) { decStack();endExpression(); }                                             -> ifstmnt(cond={$stif1.st}, statements={$stif2.st}, elseStmnts={elsestmnts}, labelElse={newLabel()}, labelNext={newLabel()})
    |   { startExpression(); }^(BECOMES ^(id=IDENTIFIER t=TYPE a=ID) t1=expr){ decStack();endExpression(); } -> assign(var={$id},addr={$a}, expr={$t1.st})
    |   ^(COMPOUND t=TYPE s=statements)                 -> statements(instructions={$s.st})
    ;
    // TODO: add code generation for constant
elseif :
  	^(ELSEIF stelseif1=statements
          ^(DO   stelseif2=statements)
          elsestmnts=statements)            ->  elseifstmnt(cond={$stelseif1.st}, statements={$stelseif2.st}, elseStmnts={elsestmnts}, labelElse={newLabel()}, labelNext={newLabel()})
  | ^(ELSE stelse=statements)                       -> elsemaybestmnt(statements={$stelse.st}) 
       ;
operand @init {incStack();}
    :   i=identifier			 -> statement(instruction={$i.st})
    |   n=NUMBER                 -> number(n={$n.toString()}, numberType={whatNumber(Integer.parseInt($n.toString()))})
    |   c=CHAR_EXPR              -> character(c={(int) c.toString().charAt(1)})
    |   b=(TRUE | FALSE)         -> boolean(b={$b})
    ;
    
exprPrint :
	t=TYPE exp=expr -> printexpr(statements={$exp.st},t={getType($t.toString()).T})
	;
	
varRead :
	^(id=IDENTIFIER t=TYPE a=ID) -> readvar(var={$id},addr={$a})
	;

identifier
  : ^(id=IDENTIFIER t=TYPE a=ID)           -> identifier(addr={$a})
  ;

varlist
  : s+=identifier
    (s+=identifier)*
    ->  statements(instructions={$s});

exprlist
    : s+=expr
    (s+=expr)*
    ->  statements(instructions={$s})
  ;

type
    :   INTEGER
    |   CHAR
    |   BOOL
    ;
