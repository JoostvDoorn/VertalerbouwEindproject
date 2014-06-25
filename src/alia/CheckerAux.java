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
			throw new AliaTypeException("Type exception, expression is not a boolean.");
		}
	}
	
	protected _Type checkTypesIf(List<_Type> list) throws AliaException{
		_Type t = new _Bool();
		if(list.isEmpty()){
			throw new AliaException("No types to be checked.");
		} else {
			_Type c = list.get(0);
			for(_Type x : list){
				if(!x.equals(c)){
					t = new _Void();
				}
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
			throw new AliaTypeException("Math expressions require type Int");
		}
	}
	
	protected void checkNotVoid(_Type a) throws AliaTypeException{
		if(!a.equals(new _Void())){
			throw new AliaTypeException("Not type void.");
		}
	}
	
	
	//Symbol table related functions
	protected void declare(String name, _Type t) throws SymbolTableException{
		IdEntry entry = new IdEntry();
		entry.setType(t);
		symTab.enter(name, entry);
	}
	
	
}
