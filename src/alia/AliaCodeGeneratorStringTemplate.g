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
    

expr
    :   o=operand
    |   ^(OR t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(OR_ALT t1=expr t2=expr t=TYPE)   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(AND t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(AND_ALT t1=expr t2=expr t=TYPE)   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(EQ t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"eq"})
    |   ^(NQ t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ne"})
    |   ^(LE t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"le"})
    |   ^(GE t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ge"})
    |   ^(GT t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"gt"})
    |   ^(LT t1=expr t2=expr t=TYPE)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"lt"})
    |   ^(PLUS t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"add"})
    |   ^(MINUS t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"sub"})
    |   ^(TIMES t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"mul"})
    |   ^(DIV t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"div"})
    |   ^(MOD t1=expr t2=expr t=TYPE)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"rem"})
    | ^(WHILE cond=expr ^(DO t2=statements))  -> whilestmt(x={$cond.st}, y={$t2.st})
    | ^(PRINT t=TYPE exp=exprlist)                   -> printstmt(x={$exp.st})
    | ^(READ t=TYPE v=varlist)                     -> readstmt(x={$v.st})
    | ^(NOT o=operand t=TYPE)                    -> unarynot(x={$o.st}, instr={"not"})
    | ^(PLUS_OP o=operand t=TYPE)                  -> unaryplus(x={$o.st}, instr={"plus"})
    | ^(MINUS_OP o=operand t=TYPE)                 -> unarymin(x={$o.st}, instr={"neg"})
    |   ^(IF
        stif1=statements
        ^(DO stif2=statements)
        (ELSEIF stelseif1=statements
          ^(DO   stelseif2=statements
          )
        )*
        (^(ELSE
          stelse=statements
        ))?
      )
      
    |   ^(BECOMES ^(id=IDENTIFIER t=TYPE a=ID) t1=expr) -> assign(var={$id},addr={$a}, expr={$t1.st}) //TODO address
    |   ^(COMPOUND t=TYPE s=statements)                 -> statements(instructions={$s.st})
    ;
     
operand
    :   identifier
    |   n=NUMBER                 -> number(n={$n})
    |   c=CHAR_EXPR              -> character(c={$c})
    |   b=(TRUE | FALSE)         -> boolean(b={$b})
    ;

identifier
  : ^(id=IDENTIFIER t=TYPE a=ID)           //-> id(id={$id.st}) //TODO address?
  ;
varlist
  : identifier
    (identifier)*;

exprlist
    : t=expr
    (t=expr)*
  ;

type
    :   INTEGER
    |   CHAR
    |   BOOL
    ;
