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

    // operators
    BECOMES     =   '='    ;
    PLUS        =   '+'     ;
    MINUS       =   '-'     ;
    TIMES       =   '*'     ;
    DIV         =   '/'     ;
    
    // comp. operators
    GT          =   '>'     ;
    GTEQ        =   '>='    ;
    LT          =   '<'     ;
    LTEQ        =   '<='    ;
    EQ          =   '=='    ;
    NEQ         =   '!='    ;

    // keywords
    PROGRAM     =   'program'   ;
    PRINT       =   'print'     ;
    IF     		=   'if'   ;
    ELSE     	=   'else'   ;
    ELSEIF		= 	'elseif'  ;
    DO          =   'do'        ;
    WHILE       =   'while'     ;
    TRUE		=   'true'    ;
    FALSE		=   'false'    ;
}

@lexer::header {
package alia;
}

@header {
package alia;
}



program = (declaration | statement)*;
declaration = func_def;
statements = (statement)*;
statement = assignment (\n | ";") |
			expr  (\n | ";") |
			while;

expr : expr1 (OR expr1)*;
expr1 : expr2 (AND expr2)*;
expr2 : expr3 ((GT | GE | LT | LE | EQ | NQ) expr3)*;
expr3 : expr4 ((PLUS | MINUS) expr4)*;
expr4 : expr5 ((TIMES | DIV | MOD) expr5)*;
expr5 : (NOT | PLUS | MINUS) operand
operand : read |
	   	  print |
	   	  func |
	   	  if |
	   	  LPAREN expr RPAREN |
	   	  NUMBER |
	   	  BOOLEAN |
	   	  IDENTIFIER;

assignment = (identifier BECOMES)+ expr (: type)?;

while = WHILE expr DO statements END;

if = IF expr DO statements (ELSEIF expr DO statements)* (ELSE statements)? END;

print = PRINT LPAREN exprlist ")";
read = READ LPAREN varlist ")";

varlist = var (COMMA var)*;

exprlist = expr (COMMA expr)*;

func_def = DEF identifier LPAREN  RPAREN statements END;

func = identifier LPAREN exprlist RPAREN;


// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;
BOOLEAN = TRUE | FALSE;

COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;
