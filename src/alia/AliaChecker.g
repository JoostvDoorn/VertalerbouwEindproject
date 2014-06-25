tree grammar AliaChecker;

options {
    k=1;                                // LL(1) - do not use LL(*)
    tokenVocab=Alia;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
    superClass=CheckerAux;
}

@header {
package alia;
import alia.types.*;
import alia.symtab.SymbolTable;
import alia.symtab.IdEntry;
import java.util.Set;
import java.util.HashSet;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: AliaExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    // idset - a set of declared identifiers.
    private Set<String> idset = new HashSet<String>();   
    
    public boolean  isDeclared(String s)     { return idset.contains(s); }
    public void     declare(String s)        { idset.add(s);             }
}

program
    :   ^(PROGRAM (statement)+)
    ;

statements returns [_Type type = new _Void()]
	: (t=statement
		{ $type = $t.type; }
	)*;
    
statement returns [_Type type = new _Void()]
    :   ^(WHILE t=expr DO statements END)
    { checkBoolType($t.type); }
    |   t=expr
	{ $type = $t.type; }
    ; 
    
expr returns [_Type type]
    :   (t=operand
    |   t=expr_comp
    |   t=expr_math
    |	^(PRINT t=exprlist)
    |	^(READ t=varlist)
	|	^((NOT | PLUS_OP | MINUS_OP) t=operand))
    	{
    		$type = $t.type;
        }
   	|   ^(IF t=expr ts=statements
	   		{
	   			List<_Type> types = new ArrayList();
		   		types.add($ts.type);
	   			checkBoolType($t.type);
	   		}
   			(ELSEIF t=expr DO ts=statements
		   		{
		   			types.add($ts.type);
		   			checkBoolType($t.type);
		   		}
		   	)*
   			(ELSE ts=statements
		   		{
		   			types.add($ts.type);
		   		}
		   	)?
   		)
   		{
   			checkBoolType($t.type);
   			$type = checkTypesIf($types.type);
   		}
   		
   	|   ^(BECOMES id=IDENTIFIER t1=expr (COLON t2=type)?)
        {   
        	t = checkEqualType($t1.type, $t2.type);
        	declare($id.text, t);
    		$type = t;
        }
   	|   ^(COMPOUND
   		{ // Openscope
   			openScope();
   		}
   		t=statements)
        {
        	// Closescope
        	closeScope();
    		$type = $t.type;
        }
    ;
    
expr_comp returns [_Type type]
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
   	{
   	  checkEqualType($t1.type, $t2.type);
   	  $type = $t1.type;
   	}
   	;

expr_math returns [_Type type]
    :   (^(PLUS t1=expr t2=expr)
    |   ^(MINUS t1=expr t2=expr)
    |   ^(TIMES t1=expr t2=expr)
    |   ^(DIV t1=expr t2=expr))
    |   ^(MOD t1=expr t2=expr)
    { 
    	checkMathType($t1.type, $t2.type);
    	$type = new _Int();
    }
    ;
operand returns [_Type type]
    :   id=IDENTIFIER 
        { $type = getType($id.text);
        	// TODO: In functions type inference should also be included here. Example function test(x) x = x + 1
         }
    |   n=NUMBER 
    	{ $type = new _Int(); }
    |   c=LETTER
    	{ $type = new _Char(); }
    |   b=(TRUE | FALSE)
    	{ $type = new _Bool(); }
    ;


varlist returns [_Type type] 
	: id=IDENTIFIER
		{
			$type = getType($id.text);
		}
		(COMMA IDENTIFIER
			{
				$type = new _Void();
			}
		)*;

exprlist returns [_Type type]
    : t=expr
		{
			checkNotVoid($t.type);
			$type = $t.type;
		}
		(COMMA t=expr
			{
				checkNotVoid($t.type);
				$type = new _Void();
			}
		)*
	;

type returns [_Type type]
    :   INTEGER
        { $type = new _Int(); }
    |   CHAR
        { $type = new _Char(); }
    |   BOOL
        { $type = new _Bool(); }
    ;
