package alia.types;

/**
 * Abstract type class, it contains helper methods used to type checking
 */
public abstract class _Type {
	protected String typename;
	
	public _Type() {
		this.typename = "type";
	}
	
	/**
	 * @param type
	 * @return true iff type is equal to internal type of class.
	 */
	public boolean equals(_Type type) {
		return typename.equals(type.typename);
	}
	
	/**
	 * Provides the name of the type.
	 */
	public String toString(){
		return this.typename;
	}
	/**
	 * These variables are used in the string template for conditional statements.
	 */
	public boolean _void = true;
	public boolean _char = false;
	public boolean _int = false;
	public boolean _bool = false;
	public char T = 'V';
}
