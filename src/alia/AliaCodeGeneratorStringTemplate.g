tree grammar AliaCodeGeneratorStringTemplate;

options {
    k=1;                                // LL(1) - do not use LL(*)
    tokenVocab=Alia;                    // import tokens from Calc.tokens
    output = template;
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
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
    :   (t=operand
    |   ^(OR t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(OR_ALT t1=expr t2=expr)   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"or"})
    |   ^(AND t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(AND_ALT t1=expr t2=expr)   	-> binexpr(x={$t1.st}, y={$t2.st}, instr={"and"})
    |   ^(EQ t1=expr t2=expr)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"eq"})
    |   ^(NQ t1=expr t2=expr)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ne"})
    |   ^(LE t1=expr t2=expr)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"le"})
    |   ^(GE t1=expr t2=expr)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"ge"})
    |   ^(GT t1=expr t2=expr)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"gt"})
    |   ^(LT t1=expr t2=expr)   		-> binexprcomp(x={$t1.st}, y={$t2.st}, instr={"lt"})
    |   ^(PLUS t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"add"})
    |   ^(MINUS t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"sub"})
    |   ^(TIMES t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"mul"})
    |   ^(DIV t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"div"})
    |   ^(MOD t1=expr t2=expr)   		-> binexpr(x={$t1.st}, y={$t2.st}, instr={"rem"})
    | ^(WHILE expr ^(DO statements))
    | ^(PRINT t=exprlist)
    | ^(READ t=varlist)
  | ^((NOT | PLUS_OP | MINUS_OP) t=operand))
    |   ^(IF
        t=statements
        ^(DO ts=statements)
        (ELSEIF t=statements
          ^(DO   ts=statements
          )
        )*
        (^(ELSE
          ts=statements
        ))?
      )
      
    |   ^(BECOMES id=IDENTIFIER t1=expr (COLON t2=type)?)
    |   ^(COMPOUND
      t=statements)
    ;
     
operand
    :   id=IDENTIFIER 
    |   n=NUMBER 
    |   c=CHAR_EXPR
    |   b=(TRUE | FALSE)
    ;


varlist
  : id=IDENTIFIER
    (IDENTIFIER)*;

exprlist
    : t=expr
    (t=expr)*
  ;

type
    :   INTEGER
    |   CHAR
    |   BOOL
    ;
