tree grammar AliaChecker;

options {
    k=1;                                // LL(1) - do not use LL(*)
    tokenVocab=Alia;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
    superClass=CheckerAux;
    output=AST;
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
    	if(!e.getMessage().equals("")) {
			System.err.println("Exception!:"+e.getMessage());
		}
		throw (new AliaException(""));
    } 
}

@members {

}

program
    :   { symTab.openScope(); }
    	(statement)+
    	{ symTab.closeScope(); }
    	-> LOCALSIZE[getLocalSize()] (statement)+
    ;

statements returns [_Type type = new _Void()]
	: (t=statement
		{ $type = $t.type; }
	)*;
    
statement returns [_Type type = new _Void()]
    :   ^(WHILE {symTab.openScope();} stat=statements {symTab.openScope();}
    			^(DO statements) {symTab.closeScope();symTab.closeScope();}  )
    { checkBoolType($stat.type, $stat.tree); }
    |   t=expr
	{ $type = $t.type; }
    ; 


expr returns [_Type type]
    :   to=operand
		{
			$type = $to.type;
	    }
    |   (^(c=OR t1=expr t2=expr)
    |   ^(c=OR_ALT t1=expr t2=expr)
    |   ^(c=AND t1=expr t2=expr)
    |   ^(c=AND_ALT t1=expr t2=expr))
      {
          checkEqualType($t1.type, $t2.type, $t1.tree);
          checkBoolType($t1.type, $t1.tree);
          $type = new _Bool();
          String typename = String.valueOf($type);
      }
      -> ^($c expr expr TYPE[typename])
    |   (^(c=EQ t1=expr t2=expr)
   	|   ^(c=NQ t1=expr t2=expr)
   	|   ^(c=LE t1=expr t2=expr)
   	|   ^(c=GE t1=expr t2=expr)
   	|   ^(c=GT t1=expr t2=expr)
   	|   ^(c=LT t1=expr t2=expr))
	   	{
	   	    checkEqualType($t1.type, $t2.type, $t1.tree);
	   	    $type = new _Bool();
        	String typename = String.valueOf($type);
	   	}
	   	-> ^($c expr expr TYPE[typename])
    |   (^(c=PLUS te1=expr te2=expr)
    |   ^(c=MINUS te1=expr te2=expr)
    |   ^(c=TIMES te1=expr te2=expr)
    |   ^(c=DIV te1=expr te2=expr)
    |   ^(c=MOD te1=expr te2=expr))
	    { 
	    	checkMathType($te1.type, $te2.type, $te1.tree);
	    	$type = new _Int();
        	String typename = String.valueOf($type);
	    }
	   	-> ^($c expr expr TYPE[typename])
    |	^(PRINT te=exprlist)
    	{
    		$type = $te.type;
        	String typename = String.valueOf($type);
        }
	   	-> ^(PRINT TYPE[typename] exprlist)
    |	^(READ tv=varlist)
    	{
    		$type = $tv.type;
        	String typename = String.valueOf($type);
        }
	   	-> ^(READ TYPE[typename] varlist)
	|	^(c=(NOT) to=operand)
    	{
    		  $type = $to.type;
        	String typename = String.valueOf($type);
        	checkBoolType($to.type, $to.tree);
        }
	   	-> ^($c operand TYPE[typename])
	  | ^(c=( PLUS_OP | MINUS_OP ) o=operand)
	    {
	        $type = $o.type;
          String typename = String.valueOf($type);
          checkEqualType($o.type, new _Int(), $o.tree);
	    }
	    -> ^($c operand TYPE[typename])
   	|   ^(IF
   			{
   				symTab.openScope(); // Open scope for conditional statements, the scope is the same for the IF and ELSEIF conditions
   			}
   			t=statements
   			{
   				symTab.openScope(); // Open scope for the first statement
   			}
   			^(DO
   			ts=statements
	   		{
	   			checkBoolType($t.type, $ts.tree);
	   			symTab.closeScope(); // Close scope for the first statement
	   		}
   			)
   			texp=else_stmnt?
   			{
   				symTab.closeScope(); // Close scope for the conditional statements
	   			checkBoolType($t.type, $t.tree);
	   			$type = checkTypesIf($ts.type,$texp.type);
   			}
   		)
   	|   ^(COLON ^(BECOMES id=IDENTIFIER t1=expr) typ=type)
        {   
        	_Type declType = checkEqualType($t1.type, $typ.type, $t1.tree);
        	declare($id.text, declType, $t1.tree);
    		$type = declType;
    		
        	String typename = String.valueOf($type);
        	String identifier = String.valueOf(getIdentifier($id.text, $id.tree));
        }
        -> ^(BECOMES ^(IDENTIFIER TYPE[typename] ID[identifier]) expr)
   	|   ^(BECOMES id=IDENTIFIER t1=expr)
        {   
        	declare($id.text, $t1.type, $t1.tree);
    		$type = $t1.type;
    		checkNotVoid($type, $t1.tree);
    		
        	String typename = String.valueOf($type);
        	String identifier = String.valueOf(getIdentifier($id.text, $id.tree));
        }
	   	-> ^(BECOMES ^(IDENTIFIER TYPE[typename] ID[identifier]) expr)
   	|   ^(COMPOUND
   		{ // symTab.openScope
   			symTab.openScope();
   		}
   		t=statements)
        {
        	// closeScope
        	symTab.closeScope();
    		$type = $t.type;
        	String typename = String.valueOf($type);
        }
	   	-> ^(COMPOUND TYPE[typename] statements)
	   |   ^(CONST id=IDENTIFIER BECOMES prim=primitive (COLON typ=type)?)
          { _Type declType = checkEqualType($prim.type, $typ.type, $prim.tree);
            declareConst($id.text, declType, prim, $prim.tree);
            $type = declType;
            String typename = String.valueOf($type);
            String identifier = String.valueOf(getIdentifier($id.text, $prim.tree));
            
            }
      -> //^(CONST ^(BECOMES ^(IDENTIFIER TYPE[typename] ID[identifier]) primitive))
         // constants are not used after checking fase, thus they are removed
    ;
   
else_stmnt returns [_Type type]
	:
		^(ELSEIF t=statements
			^(DO
   			{
   				symTab.openScope(); // Open scope for this elseif statement
   			}
			ts=statements
			)
	   		te=else_stmnt?
	   		{
	   			checkBoolType($t.type, $t.tree);
	   			$type = checkTypesIf($ts.type, $te.type);
	   			symTab.closeScope();
	   		}
		)
	|	^(ELSE
   			{
   				symTab.openScope(); // Open scope for the else statement
   			}
			ts=statements
	   		{
	   			$type = $ts.type;
   				symTab.closeScope(); // Open scope for the else statement
	   		}
	   	)
	; 


operand returns [_Type type]
    :   id=identifier 
        { $type = $id.type; }
    |   n=NUMBER
    	{ $type = new _Int();checkInt(n);  }
    |   c=CHAR_EXPR
    	{ $type = new _Char(); }
    |   b=(TRUE | FALSE)
    	{ $type = new _Bool(); }
    ;

identifier returns [_Type type]
	:
	id=IDENTIFIER
		{
			$type = getType($id.text, $id.tree);
            String typename = String.valueOf($type);
            String identifier = String.valueOf(getIdentifier($id.text, $id.tree));
        	// TODO: In functions type inference should also be included here. Example function test(x) x = x + 1
	        Boolean constant = retrieve($id.text, $id.tree).isConstant();
	        Token value = getConstant($id.text); //possibly only if constant?
		}
	-> {constant && typename.equals("int") }? ^(NUMBER[value])
	-> {constant && typename.equals("char") }? ^(CHAR_EXPR[value])
	-> {constant && typename.equals("bool") && value.getText().equals("true")  }? ^(TRUE[value])
	-> {constant && typename.equals("bool") && value.getText().equals("false")  }? ^(FALSE[value])
	-> ^(IDENTIFIER TYPE[typename] ID[identifier])
	;


varlist returns [_Type type] 
	: t=identifier
		{
			$type = $t.type;
		}
		(identifier
			{
				$type = new _Void();
			}
			
		)*
	;
	
exprlist returns [_Type type]
    : tl=exprentry
		{
			checkNotVoid($tl.type, $tl.tree);
			$type = $tl.type;
		}
		(t=exprentry
			{
				checkNotVoid($t.type, $t.tree);
				$type = new _Void();
			}
		)*
	;

exprentry returns [_Type type]
	: t=expr
	{
		$type = $t.type;
      	String typename = String.valueOf($t.type);
	} -> TYPE[typename] expr
	;

type returns [_Type type]
    :   INT
        { $type = new _Int(); }
    |   CHAR
        { $type = new _Char(); }
    |   BOOL
        { $type = new _Bool(); }
    ;
    
primitive returns [_Type type] : 
      NUMBER {$type = new _Int();} 
    | CHAR_EXPR 
        { $type = new _Char(); }
    | boolean_expr
        { $type = new _Bool(); }
    ;
boolean_expr : TRUE | FALSE;
