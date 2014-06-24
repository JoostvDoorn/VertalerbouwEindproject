tree grammar AliaChecker;

options {
    tokenVocab=Alia;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package alia;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: CalcExceptions are propagated upwards.
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
    
statement 
    :   ^(BECOMES id=IDENTIFIER expr)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    |   ^(PRINT expr)
    |   ^(SWAP id1=IDENTIFIER id2=IDENTIFIER)
        {   if (!isDeclared($id1.text))
                throw new CalcException($id1, "is not declared");
            if (!isDeclared($id2.text))
                throw new CalcException($id2, "is not declared");
        }
    |	^(DO (statement)* WHILE expr)
    |   ^(VAR id=IDENTIFIER type)
        {   if (isDeclared($id.text))
                throw new CalcException($id, "is already declared");
            else 
                declare($id.getText()); 
        }
    ; 
    
expr 
    :   operand
	|	^(NOT operand)
	|	^(PLUS operand)
	|	^(MINUS operand)
    |   ^(OR expr)
    |   ^(OR_ALT expr)
    |   ^(AND expr)
    |   ^(AND_ALT expr)
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    |   ^(TIMES expr expr)
    |   ^(DIV expr expr)
   	|   ^(IF expr expr expr?)
   	|   ^(EQ expr expr)
   	|   ^(NQ expr expr)
   	|   ^(LE expr expr)
   	|   ^(GE expr expr)
   	|   ^(GT expr expr)
   	|   ^(LT expr expr)
   	|   ^(BECOMES id=IDENTIFIER expr)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    ;
    
operand
    :   id=IDENTIFIER 
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    |   n=NUMBER 
    ;
    
type
    :   INTEGER
    ;
