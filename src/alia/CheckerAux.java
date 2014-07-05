package alia;

import java.util.HashMap;
import java.util.Map;

import alia.types.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import alia.symtab.*;


public abstract class CheckerAux extends TreeParser {
	
    protected SymbolTable<IdEntry> symTab = new SymbolTable<IdEntry>();
    protected Map<String, TreeRuleReturnScope> constants = new HashMap<String, TreeRuleReturnScope>();

	
	public CheckerAux(TreeNodeStream input) {
		super(input);
	}

	public CheckerAux(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	// Check type methods
	protected void checkBoolType (_Type a) throws AliaTypeException{
		if (!a.equals(new _Bool())){
			System.out.println("1");
			throw new AliaTypeException("Type exception, expression is not a boolean.");
		}
	}
	
	protected _Type checkTypesIf(_Type a, _Type b) throws AliaException{
		_Type t = a == null ? new _Void() : a;
		if(b != null) { // This is done for those functions that have an optional value b.
			if(!a.equals(b)){
				t = new _Void();
			}
		}
		return t;
	}
	
	protected _Type checkEqualType(_Type a, _Type b) throws AliaTypeException{
		if(b != null) { // This is done for those functions that have an optional value b.
			if(!a.equals(b)){
				throw new AliaTypeException("Type " + a.toString() + " is not equal to " + b.toString() + ".");
			}
		}
		return a;
	}
	
	protected void checkMathType(_Type a, _Type b) throws AliaTypeException{
		if(!a.equals(new _Int()) || !b.equals(new _Int())){
			System.out.println("4");
			throw new AliaTypeException("Math expressions require type Int");
		}
	}
	
	protected void checkNotVoid(_Type a) throws AliaTypeException{
		if(a == null || a.equals(new _Void())){
			throw new AliaTypeException("Type is void.");
		}
	}
	
	//Symbol table related functions
	protected IdEntry declare(String name, _Type t) throws AliaException{
		IdEntry entry = new IdEntry();
		entry.setType(t);
		try {
			if(symTab.retrieve(name).isConstant()){
				throw new AliaTypeException("Attempting to redefine constant.");
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
	 * Declares a constant in the symbol table, marking it as constant and saving its value for replacement.
	 * @param name - identifier of the constant
	 * @param t - type of the constant
	 * @param value - value of the constant
	 * @throws AliaException
	 */
	protected void declareConst(String name, _Type t, TreeRuleReturnScope value) throws AliaException{
		IdEntry entry = declare(name, t);
		entry.setConstant();
		constants.put(name, value);
	}
	
	protected Token getConstant(String name){
		TreeRuleReturnScope nodes = null;
		Token token = null;
		if(constants.containsKey(name)){
			nodes = constants.get(name); //returns a TreeRuleReturnScope, which possible contains a tree of nodes
			CommonTree wrapper = (CommonTree) nodes.getStart(); //returns a commontree containing a node
			token = wrapper.token; //the node contained
		} else {
			token = new CommonToken(0, "default"); //dummy result if not a constant, result is then not used.
		}
		return token;
	}

	protected _Type getType(String name) throws AliaException {
		IdEntry id;
		try {
			id = symTab.retrieve(name);
		} catch (SymbolTableException e) {
			System.out.println("6");
			throw new AliaException(e.getMessage());
		}
		return id.getType();
	}
	
	protected int getIdentifier(String name) throws AliaException {
		IdEntry id;
		try {
			id = symTab.retrieve(name);
		} catch (SymbolTableException e) {
			System.out.println("6");
			throw new AliaException("test"+e.getMessage());
		}
		return id.getIdentifier();
	}
	
	//Calls symtab retrieve while catching the exception and throwing alia exception
	protected IdEntry retrieve(String name) throws AliaException{
		try {
			return symTab.retrieve(name);
		} catch (SymbolTableException e) {
			throw new AliaException(e.getMessage());
		}
	}
	
	
}
