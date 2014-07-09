package alia;

import java.util.Stack;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

import alia.types.*;

public class CodeGeneratorAux extends TreeParser {
	
	protected int labelId = 0;
	protected int stackMax = 0;
	protected int stackPointer = 0;
	protected Stack<Integer> stackScope = new Stack<Integer>();
	private String className;
	
	public CodeGeneratorAux(TreeNodeStream input) {
		super(input);
	}
	public CodeGeneratorAux(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}
	
	/**
	 * Checks how big a number is and what the most efficient java instruction is that can be used to call it.
	 * @param x - number to be checked.
	 * @return array of booleans telling what the number fits into
	 */
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

	/**
	 * Starts a new expression.
	 */
	public void startExpression() {
		stackScope.push(stackPointer);
	}
	/**
	 * Returns the difference in stack height
	 */
	public int endExpression() {
		int result = stackPointer - stackScope.pop();
		return result;
	}
	
	/**
	 * @param n - number of pops
	 * @return String with n pop followed by a newline.
	 */
	public String pops(int n) {
		String result = "";
		for(int i = 0; i<n; i++) {
			result += "pop\n";
			decStack();
		}
		return result;
	}
	
	/**
	 * @return new label for an identifier
	 */
	public int newLabel() {
		return labelId++;
	}

	/**
	 * Increments the stackpointer.
	 */
	public void incStack() {
		stackPointer++;
		stackMax = stackMax < stackPointer ? stackPointer : stackMax;
	}

	/**
	 * Decrements the stackpointer.
	 */
	public void decStack() {
		stackPointer--;
	}
	
	/**
	 * Only decrements the stackpointer if type is void
	 */
	public void decStackIfVoid(_Type type) {
		if(type.equals(new _Void())) {
			stackPointer--;
		}
	}
	
	/**
	 * @return minimum height of stack needed.
	 */
	public int getStackMax() {
		return stackMax+1;
	}
	/**
	 * @param stackSize - number to change stackpointer to
	 */
	public void changeStack(int stackSize) {
		stackPointer+=stackSize;
	}
	/**
	 * Returns the _Type that a _type belongs to, otherwise returns _Void.
	 * @param type - string to be checked against 
	 * @return _type class
	 */
	public _Type getType(String type) {
		_Type result = new _Void();
		if(type == "bool") { //using the values of the actual classes would just make lots of code
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

	/**
	 * @return class of the program.
	 */
	public String getProgramClass() {
		return className;
	}
	/**
	 * Sets the class of the program.
	 * @param className
	 */
	public void setProgramClass(String className) {
		this.className  = className.equals("") ? "Test" : className;
		
	}


}

