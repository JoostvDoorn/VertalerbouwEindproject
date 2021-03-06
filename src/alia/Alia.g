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
    LCURLY      =   '{'     ;
    RCURLY      =   '}'     ;
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
    LOCALSIZE;
}

@lexer::header {
package alia;
}

@header {
package alia;
}


program : (func_def | (statement end_statement) | NEWLINE!)*;

statements : (statement (end_statement statements)? | NEWLINE! statements)?;
statements_cond : statement (end_statement statements)? | NEWLINE! statements_cond;
statement : (expr_assignment | const_assignment) (COLON^ type)?
			| while_stmnt;
end_statement : NEWLINE! | SEMICOLON! | EOF!;

// Syntactic predicate to recognize assignments
// Syntactic predicates can be easily left out if we do not allow expr as statements
expr_assignment : (IDENTIFIER BECOMES) => (IDENTIFIER BECOMES^) expr_assignment |
			expr ;
			
const_assignment : CONST^ IDENTIFIER BECOMES primitive;

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

while_stmnt : WHILE statements_cond DO statements END -> ^(WHILE statements_cond ^(DO statements));

if_stmnt : IF statements_cond DO statements else_stmnt? END ->
			^(IF statements_cond ^(DO statements?) else_stmnt?);

else_stmnt
    : ELSEIF statements_cond DO statements else_stmnt? ->
    	^(ELSEIF statements_cond ^(DO statements?) else_stmnt?)
	| (ELSE^ statements)
	; 
	
print : PRINT^ LPAREN! exprlist RPAREN!;
read : READ^ LPAREN! varlist RPAREN!;

varlist : IDENTIFIER (COMMA! IDENTIFIER)*;
exprlist : expr (COMMA! expr)*;

func_def : DEF IDENTIFIER LPAREN! varlist RPAREN! statements END;

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