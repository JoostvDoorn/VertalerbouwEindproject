package alia;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

public class CodeGeneratorAux extends TreeParser {
	
	
	public CodeGeneratorAux(TreeNodeStream input) {
		super(input);
	}
	public CodeGeneratorAux(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}
	
	public boolean[] whatNumber(long x){
		
		boolean lessthanfive, minusone, isbyte, isshort, isint, islong;
		lessthanfive = minusone = isbyte = isshort = isint = islong = false;
		
		if (x <= 5 && x >= 0){
			lessthanfive = true;
		} else if(x == -1){
			minusone = true;
		} else if(x <= 127 && x >= -128){
			isbyte = true;
		} else if(x <= 32767 && x >= -32768){
			isshort = true;
		} else if(x <= 2147483647 && x >= -2147483648){
			isint = true;
		} else {
			islong = true;
		}
		boolean[] array = new boolean[6];
		array[0] = lessthanfive;
		array[1] = minusone;
		array[2] = isbyte;
		array[3] = isshort;
		array[4] = isint;
		array[5] = islong;
		return array;
	}


}
