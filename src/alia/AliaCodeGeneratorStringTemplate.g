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
      (statement)+
    ;

statements
  : (t=statement
  )*;
    
statement
    :   ^(WHILE t=expr ^(DO statements))
    |   t=expr
    ; 
    
expr
    :   (t=operand
    |   t=expr_comp
    |   t=expr_math
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
    
expr_comp
  :   (^(OR t1=expr t2=expr)
    |   ^(OR_ALT t1=expr t2=expr)
    |   ^(AND t1=expr t2=expr)
    |   ^(AND_ALT t1=expr t2=expr)
    |   ^(EQ t1=expr t2=expr)
    |   ^(NQ t1=expr t2=expr)
    |   ^(LE t1=expr t2=expr)
    |   ^(GE t1=expr t2=expr)
    |   ^(GT t1=expr t2=expr)
    |   ^(LT t1=expr t2=expr))
    ;

expr_math
    :   (^(PLUS t1=expr t2=expr)
    |   ^(MINUS t1=expr t2=expr)
    |   ^(TIMES t1=expr t2=expr)
    |   ^(DIV t1=expr t2=expr)
    |   ^(MOD t1=expr t2=expr))
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
