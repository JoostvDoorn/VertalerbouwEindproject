package alia;

import java.util.List;

import alia.types.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import alia.symtab.*;


public abstract class CheckerAux extends TreeParser {
	
    protected SymbolTable<IdEntry> symTab = new SymbolTable<IdEntry>();

	
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
		_Type t = a;
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
			System.out.println(a);
			System.out.println("5");
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
	
	protected void declareConst(String name, _Type t) throws AliaException{
		IdEntry entry = declare(name, t);
		entry.setConstant();
	}

	protected _Type getType(String name) throws AliaException {
		IdEntry id;
		try {
			id = symTab.retrieve(name);
		} catch (SymbolTableException e) {
			System.out.println("6");
			throw new AliaException("test"+e.getMessage());
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
	
	
}
