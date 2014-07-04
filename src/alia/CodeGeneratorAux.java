package alia;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

import alia.types.*;

public class CodeGeneratorAux extends TreeParser {
	
	protected int labelId = 0;
	protected int stackMax = 0;
	protected int stackPointer = 0;
	
	public CodeGeneratorAux(TreeNodeStream input) {
		super(input);
	}
	public CodeGeneratorAux(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}
	
	public NumberType whatNumber(long x){
		
		boolean lessthanfive, minusone, isbyte, isshort, isint;
		lessthanfive = minusone = isbyte = isshort = isint = false;
		
		if (x <= 5 && x >= 0){
			lessthanfive = true;
		} else if(x == -1){
			minusone = true;
		} else if(x <= 127 && x >= -128){
			isbyte = true;
		} else if(x <= 32767 && x >= -32768){
			isshort = true;
		} else {    //if(x <= 2147483647 && x >= -2147483648){   - if we ever want to support longs
			isint = true;
		} 
		NumberType numbool = new NumberType(lessthanfive, minusone, isbyte, isshort, isint);
		return numbool;
	}
	
	public int newLabel() {
		return labelId++;
	}

	public void incStack() {
		stackPointer++;
	}

	public void decStack() {
		stackPointer--;
	}
	
	public void changeStack(int stackSize) {
		stackPointer+=stackSize;
	}
	
	public _Type getType(String type) {
		_Type result = new _Void();
		if(type == "bool") {
			result = new _Bool();
		}
		else if(type == "int") {
			result = new _Int();
		}
		else if(type == "char") {
			result = new _Char();
		}
		return result;
	}


}

