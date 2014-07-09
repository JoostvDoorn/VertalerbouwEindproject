package alia.types;

/**
 * Char type class, used for Type checking and code generation
 */
public class _Char extends _Type {
	public _Char() {
		this.typename = "char";
		this.T = 'C';
	}
	public boolean _char = true;
	public boolean _void = false;
}
