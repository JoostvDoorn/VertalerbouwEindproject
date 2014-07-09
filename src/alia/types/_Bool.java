package alia.types;

/**
 * Boolean type class, used for Type checking and code generation
 */
public class _Bool extends _Type {
	public _Bool() {
		this.typename = "bool";
		this.T = 'Z';
	}
	public boolean _bool = true;
	public boolean _void = false;
}
