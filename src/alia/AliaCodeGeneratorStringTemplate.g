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

program
    :
      localSize=LOCALSIZE (s+=exprPop)+
            ->  file(instructions={$s},stackMax={getStackMax()},localSize={$localSize},classname={getProgramClass()})
    ;

statements @init { startExpression(); }
		   @after { endExpression(); }
  : (s+=exprPopInterleaved)* ->  statements(instructions={$s});

statementsPop @init { startExpression(); }
		   @after { endExpression(); }
  : (s+=exprPop)* ->  statements(instructions={$s});
            
exprPopInterleaved @init { String pop = ""; }
  : {pop=pops(endExpression());startExpression();}
  	s=expr ->  exprPopInterleaved(instruction={$s.st}, pop={pop});
            
exprPop @init { String pop = ""; }
  : {startExpression();}
  	s=expr
  	{pop=pops(endExpression());} ->  exprPop(instruction={$s.st}, pop={pop});

expr @init { }
	 @after {}
    :   o=operand 						-> statement(instruction={$o.st})
    |   ^(OR t1=expr t2=expr t=TYPE) {decStack();}   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(OR_ALT t1=expr t2=expr t=TYPE) {decStack();}   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(AND t1=expr t2=expr t=TYPE) {decStack();}   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(AND_ALT t1=expr t2=expr t=TYPE) {decStack();}   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(EQ t1=expr t2=expr t=TYPE) {decStack();}   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"eq"})
    |   ^(NQ t1=expr t2=expr t=TYPE) {decStack();}   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ne"})
    |   ^(LE t1=expr t2=expr t=TYPE) {decStack();}   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"le"})
    |   ^(GE t1=expr t2=expr t=TYPE) {decStack();}   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ge"})
    |   ^(GT t1=expr t2=expr t=TYPE) {decStack();}   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"gt"})
    |   ^(LT t1=expr t2=expr t=TYPE) {decStack();}   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"lt"})
    |   ^(PLUS t1=expr t2=expr t=TYPE) {decStack();}  		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"add"})
    |   ^(MINUS t1=expr t2=expr t=TYPE) {decStack();}   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"sub"})
    |   ^(TIMES t1=expr t2=expr t=TYPE) {decStack();}   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"mul"})
    |   ^(DIV t1=expr t2=expr t=TYPE) {decStack();}   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"div"})
    |   ^(MOD t1=expr t2=expr t=TYPE) {decStack();}   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"rem"})
    | ^(WHILE cond=statements {decStack();} ^(DO t2=statementsPop))  -> whilestmt(expr={$cond.st}, statement={$t2.st}, labelCond={newLabel()}, labelWhile={newLabel()})
    | ^(PRINT t=TYPE te=TYPE fexp=expr (exp+=exprPrint)*) {decStackIfVoid(getType($t.toString()));}                   -> printstmt(firststatement={$fexp.st},statements={$exp},type={getType($t.toString())},t={getType($te.toString()).T})
    | ^(READ t=TYPE ^(id=IDENTIFIER t=TYPE a=ID) {incStack();} (v+=varRead)*) {decStackIfVoid(getType($t.toString()));}                     -> readstmt(statements={$v},addr={$a},type={getType($t.toString())},t={getType($t.toString()).T},void={$t.toString().equals("void")},classname={getProgramClass()})
    | ^(NOT o=operand t=TYPE)                    -> unarynot(x={$o.st}, instr={"not"})
    | ^(PLUS_OP o=operand t=TYPE)                  -> unaryplus(x={$o.st}, instr={"plus"})
    | ^(MINUS_OP o=operand t=TYPE)                 -> unarymin(x={$o.st}, instr={"neg"})
    |   { startExpression(); } ^(IF
        stif1=statements
        ^(DO stif2=statements)
        (elsestmnts=elseif)?
      ) { decStack();endExpression(); }                                             -> ifstmnt(cond={$stif1.st}, statements={$stif2.st}, elseStmnts={elsestmnts}, labelElse={newLabel()}, labelNext={newLabel()})
    |   ^(BECOMES ^(id=IDENTIFIER t=TYPE a=ID) {incStack();} t1=expr {decStack();}) -> assign(var={$id},addr={$a}, expr={$t1.st})
    |   ^(COMPOUND t=TYPE s=statements)                 -> statements(instructions={$s.st})
    ;
elseif @init { decStack(); }
   :
  	^(ELSEIF stelseif1=statements
          ^(DO   stelseif2=statements)  {decStack();}
          elsestmnts=elseif)            ->  elseifstmnt(cond={$stelseif1.st}, statements={$stelseif2.st}, elseStmnts={elsestmnts}, labelElse={newLabel()}, labelNext={newLabel()})
  | ^(ELSE stelse=statements)                       -> elsemaybestmnt(statements={$stelse.st}) 
       ;
operand @init {incStack();}
    :   i=identifier			 -> statement(instruction={$i.st})
    |   n=NUMBER                 -> number(n={$n.toString()}, numberType={whatNumber(Integer.parseInt($n.toString()))})
    |   c=CHAR_EXPR              -> character(c={(int) c.toString().charAt(1)})
    |   b=(TRUE | FALSE)        -> boolean(b={$b.toString().equals("true")})
    ;
    
exprPrint @init {decStack();} :
	t=TYPE exp=expr -> printexpr(statements={$exp.st},t={getType($t.toString()).T})
	;
	
varRead @init {incStack();decStack();} :
	^(id=IDENTIFIER t=TYPE a=ID) -> readvar(var={$id},addr={$a},type={getType($t.toString())},classname={getProgramClass()})
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
