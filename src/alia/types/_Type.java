package alia.types;

public abstract class _Type {
	protected String typename;
	
	public _Type() {
		this.typename = "type";
	}
	
	public boolean equals(_Type type) {
		return typename.equals(type.typename);
	}
	
	public String toString(){
		return this.typename;
	}
	public boolean _void = true;
	public boolean _char = false;
	public boolean _int = false;
	public boolean _bool = false;
	public char T = 'V';
}
