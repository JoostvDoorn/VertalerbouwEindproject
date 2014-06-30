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
    CONST       = 'const'   ;
    DEF         =   'def'        ;
    BEGIN       =   'begin'        ;
    
    FUNC        =   'func' ;
    EXPR_LIST;
    COMPOUND;
    TYPE;
    ID;
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
statement : (expr_assignment | const_assignment) (COLON type)? end_statement |
			while_stmnt;
			
end_statement : NEWLINE! | SEMICOLON! | EOF!;

const_assignment : CONST^ IDENTIFIER BECOMES primitive;

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
	   	  compound_stmnt |
	   	  primitive |
	   	  func_identifier;

compound_stmnt : BEGIN statements END -> ^(COMPOUND statements);

primitive : NUMBER | CHAR_EXPR | boolean_expr;

char_expr : SQUOTE! LETTER SQUOTE!;

func_identifier : IDENTIFIER 
				(LPAREN^ exprlist? RPAREN)?;
//



while_stmnt : WHILE expr DO statements END -> ^(WHILE expr ^(DO statements));

if_stmnt : IF^ statements (DO^ statements) else_stmnt END!;

else_stmnt
    : (ELSEIF^ expr (DO^ statements) else_stmnt)
	| (ELSE^ statements)
	; 
print : PRINT^ LPAREN! exprlist RPAREN!;
read : READ^ LPAREN! varlist RPAREN!;

varlist : IDENTIFIER (COMMA! IDENTIFIER)*;

exprlist : expr (COMMA! expr)*;

func_def : DEF IDENTIFIER LPAREN!  RPAREN! statements END;





// Lexer rules


boolean_expr : TRUE | FALSE;

type : CHAR | INT | BOOL;



CHAR_EXPR : SQUOTE LETTER SQUOTE;

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

fragment LETTER :   LOWER | UPPER ;
fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;


//TODO: Constanten