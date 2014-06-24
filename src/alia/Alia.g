grammar Alia;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
    COLON       =   ':'     ;
    NEWLINE       =   '\n'     ;
    COMMA       =   ','     ;
    SEMICOLON   =   ';'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    SQUOTE      =   '\''     ;

    // operators
    BECOMES     =   '='    ;
    PLUS        =   '+'     ;
    PLUS_OP     =   'plusop'     ;
    MINUS       =   '-'     ;
    MINUS_OP    =   'minop'     ;
    TIMES       =   '*'     ;
    DIV         =   '/'     ;
    
    // comp. operators
    GT          =   '>'     ;
    GE          =   '>='    ;
    LT          =   '<'     ;
    LE     	    =   '<='    ;
    EQ          =   '=='    ;
    NQ          =   '!='    ;
    
    
    AND  		=   'and'    ;
    AND_ALT    	=   '&&'    ;
    OR     		=   'or'    ;
    OR_ALT     	=   '||'    ;
    NOT         =   '!'    ;
    MOD         =   '%'    ;
    
    // types
    INT    		=   'int';
    BOOL    	=   'boolean';
    CHAR    	=   'char';
    STRING    	=   'string';

    // keywords
    PROGRAM     =   'program'   ;
    PRINT       =   'print'     ;
    READ        =   'read'     ;
    IF     		=   'if'   ;
    ELSE     	=   'else'   ;
    ELSEIF		= 	'elseif'  ;
    DO          =   'do'        ;
    END         =   'end'        ;
    WHILE       =   'while'     ;
    TRUE		=   'true'    ;
    FALSE		=   'false'    ;
    DEF         =   'def'        ;
    
    FUNC        =   'func' ;
    EXPR_LIST   =   'exprlist';
}

@lexer::header {
package alia;
}

@header {
package alia;
}



program : (declaration | statement | NEWLINE!)*;
declaration : func_def;
statements : (statement | NEWLINE!)*;
statement : expr_assignment (COLON type)? end_statement |
			while_stmnt;
			
end_statement : NEWLINE! | SEMICOLON! | EOF!;

// Syntactic predicate to recognize assignments
// Syntactic predicates can be easily left out if we do not allow expr as statements
expr_assignment : (IDENTIFIER BECOMES) => (IDENTIFIER BECOMES^) expr_assignment |
			expr ;

expr : expr1 ((OR | OR_ALT)^ expr1)*;
expr1 : expr2 ((AND | AND_ALT)^ expr2)*;
expr2 : expr3 ((GT | GE | LT | LE | EQ | NQ)^ expr3)*;
expr3 : expr4 ((PLUS | MINUS)^ expr4)*;
expr4 : expr5 ((TIMES | DIV | MOD)^ expr5)*;
expr5 : NOT^ operand | operand | expr_minus | expr_plus;
expr_minus : MINUS operand -> ^(MINUS_OP operand);
expr_plus : PLUS operand -> ^(PLUS_OP operand);
operand : read |
	   	  print |
	   	  if_stmnt |
	   	  LPAREN! expr RPAREN! |
	   	  NUMBER |
	   	  char_expr |
	   	  boolean_expr |
	   	  func_identifier;

char_expr : SQUOTE! LETTER SQUOTE!;

func_identifier : IDENTIFIER 
				(LPAREN^ exprlist? RPAREN)?;
//


while_stmnt : WHILE^ expr DO statements END;

if_stmnt : IF^ expr DO! statements (ELSEIF expr DO! statements)* (ELSE statements)? END!;

print : PRINT^ LPAREN! exprlist RPAREN!;
read : READ^ LPAREN! varlist RPAREN!;

varlist : IDENTIFIER (COMMA IDENTIFIER)*;

exprlist : expr (COMMA expr)*;

func_def : DEF IDENTIFIER LPAREN!  RPAREN! statements END;





// Lexer rules


boolean_expr : TRUE | FALSE;

type : CHAR | INT | BOOL;


IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;


COMMENT
    :   ('//' .* '\n' | '/*' .* '*/')
            { $channel=HIDDEN; }
        
    ;

WS
    :   (' ' | '\t' | '\f' | '\r')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;


//TODO: Constanten
//TODO: Compound expressions