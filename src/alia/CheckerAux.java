package alia;

import java.util.HashMap;
import java.util.Map;

import alia.types.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import alia.symtab.*;


public abstract class CheckerAux extends TreeParser {
	
    protected SymbolTable<IdEntry> symTab = new SymbolTable<IdEntry>(); //Symbol table that keeps track of entered symbols
    protected Map<String, TreeRuleReturnScope> constants = new HashMap<String, TreeRuleReturnScope>(); //keeps track of constants and their values

	
	public CheckerAux(TreeNodeStream input) {
		super(input);
	}

	public CheckerAux(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	// Check type methods
	/**
	 * Checks if a is of type bool
	 * @throws AliaTypeException
	 */
	protected void checkBoolType (_Type a, CommonTree tree) throws AliaTypeException{
		if (!a.equals(new _Bool())){
			System.out.println("1");
			throw new AliaTypeException("Type exception, expression is not a boolean.", tree);
		}
	}
	
	/**
	 * Checks if a and b are of same type, then returns that type, else returns void.
	 * @throws AliaException
	 */
	protected _Type checkTypesIf(_Type a, _Type b) {
		_Type t = new _Void();
		if(b != null) { // This is done for those functions that have an optional value b.
			if(!a.equals(b)){
				t = new _Void();
			}
			else {
				t = a;
			}
		}
		return t;
	}
	
	/**
	 * Checks if a and b are of the same type. If so, returns that type. Else throws exception.
	 * @throws AliaTypeException
	 */
	protected _Type checkEqualType(_Type a, _Type b, CommonTree tree) throws AliaTypeException{
		if(b != null) { // This is done for those functions that have an optional value b.
			if(!a.equals(b)){
				throw new AliaTypeException("Type " + a.toString() + " is not equal to " + b.toString() + ".", tree);
			}
		}
		return a;
	}
	
	/**
	 * Checks if a and b are of type int, else throws exception.
	 * @throws AliaTypeException
	 */
	protected void checkMathType(_Type a, _Type b, CommonTree tree) throws AliaTypeException{
		if(!a.equals(new _Int()) || !b.equals(new _Int())){
			throw new AliaTypeException("Math expressions require type Int", tree);
		}
	}
	
	/**
	 * Checks if a is not of type void, else throws exception.
	 * @throws AliaTypeException
	 */
	protected void checkNotVoid(_Type a, CommonTree tree) throws AliaTypeException{
		if(a == null || a.equals(new _Void())){
			throw new AliaTypeException("Type is void.", tree);
		}
	}
	
	//Symbol table related functions
	/**
	 * Declares an entry, putting it into the symbol table.
	 * @param name - name of entry
	 * @param t - type of entry
	 * @return declared IdEntry
	 * @throws AliaException - if already declared.
	 */
	protected IdEntry declare(String name, _Type t, CommonTree tree) throws AliaException{
		IdEntry entry = new IdEntry();
		entry.setType(t);
		try {
			if(symTab.retrieve(name).isConstant()){
				throw new AliaTypeException("Attempting to redefine constant.", tree);
			}
		} catch (SymbolTableException e1) {
			//ignore
		}
		if(!symTab.isDefined(name)) {
			try {
				symTab.enter(name, entry);
			} catch (SymbolTableException e) {
				// Ignore
			}
		}
		return entry;
	}
	
	/**
	 * Declares a constant in the symbol table, marking it as constant and saving its value for replacement later on.
	 * @param name - identifier of the constant
	 * @param t - type of the constant
	 * @param value - value of the constant
	 * @throws AliaException
	 */
	protected void declareConst(String name, _Type t, TreeRuleReturnScope value, CommonTree tree) throws AliaException{
		IdEntry entry = declare(name, t, tree);
		entry.setConstant();
		constants.put(name, value);
	}
	
	/**
	 * Returns the original token that belongs to a constant
	 * @param name - identifier of the constant
	 * @return token - token originally put as value of constant
	 */
	protected Token getConstant(String name){
		TreeRuleReturnScope nodes = null;
		Token token = null;
		if(constants.containsKey(name)){
			nodes = constants.get(name); //returns a TreeRuleReturnScope, which possible contains a tree of nodes
			CommonTree wrapper = (CommonTree) nodes.getStart(); //returns a commontree containing a node
			token = wrapper.token; //the node contained
		} else {
			token = new CommonToken(0, "default"); //dummy result if not a constant, result is then not used.
			//prevents possibility that null is used as a value to java.
		}
		return token;
	}

	/**
	 * Wrapper for symboltable retrieve that throws aliaexceptions.
	 * @throws AliaException
	 */
	protected _Type getType(String name, CommonTree tree) throws AliaException {
		IdEntry id;
		try {
			id = symTab.retrieve(name);
		} catch (SymbolTableException e) {
			System.out.println("6");
			if(tree == null){
				throw new AliaException(e.getMessage());
			} else{
				throw new AliaException(e.getMessage(), tree);
			}
			
		}
		return id.getType();
	}
	
	/**
	 * Returns the number assigned to the identifier.
	 * @return identifier of the given identifier, e.g. 0 or 1 or higher.
	 * @throws AliaException
	 */
	protected int getIdentifier(String name, CommonTree tree) throws AliaException {
		IdEntry id;
		try {
			id = symTab.retrieve(name);
		} catch (SymbolTableException e) {
			System.out.println("6");
			throw new AliaException("test"+e.getMessage());
		}
		return id.getIdentifier();
	}
	
	/**
	 * Wrapper for symbolTable retrieve that throws aliaexceptions.
	 * @throws AliaException
	 */
	protected IdEntry retrieve(String name, CommonTree tree) throws AliaException{
		try {
			return symTab.retrieve(name);
		} catch (SymbolTableException e) {
			throw new AliaException(e.getMessage());
		}
	}
	
	/**
	 * Returns the required size of the local variables for the JVM
	 * @return Local size for the method
	 */
	protected String getLocalSize() {
		return symTab.maxIdentifier()+"";
	}
	
	/**
	 * Used to check for correctly formed integers
	 * @throws AliaException if the number is out of bound
	 */
	protected void checkInt(CommonTree n) throws AliaException {
		try {
			Integer.parseInt(n.toString());
		}
		catch(NumberFormatException e) {
			throw new AliaException("Illegal integer exception, an integer should be declared between "+Integer.MIN_VALUE+" and "+Integer.MAX_VALUE+".", n);
		}
	}
	
}
