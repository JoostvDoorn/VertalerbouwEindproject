package alia.types;

public abstract class _Type {
	protected final String typename = "type";
	
	public boolean equals(_Type type) {
		return typename.equals(type.typename);
	}
}
