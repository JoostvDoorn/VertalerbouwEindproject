package alia;

public class NumberType {
    public boolean lessthanfive;
	public boolean minusone;
	public boolean byteType;
	public boolean shortType;
	public boolean intType;
	/**
	 * A class that serves as a container for what the smallest JVM instruction a number can be loaded with.
	 * @param lessthanfive - is the character between 0 and 5
	 * @param minusone - is the number -1
	 * @param byteType - does the character fit into a byte and not a smaller type
	 * @param shortType - does the character fit into a short and not a smaller type 
	 * @param intType - does the character fit into a int and not a smaller type
	 */
    public NumberType(boolean lessthanfive, boolean minusone, boolean byteType, boolean shortType, boolean intType) {
    	this.lessthanfive = lessthanfive;
    	this.minusone = minusone;
    	this.byteType = byteType;
    	this.shortType = shortType;
    	this.intType = intType;
    }
}