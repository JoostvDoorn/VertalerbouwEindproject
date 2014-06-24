package alia.symtab;

import alia.types.Type;


public class IdEntry {
    private int  level = -1;
    private Type type  = null;

    public Type  getType()				{ return this.type; }
    public void  setType(Type type) 	{ this.type = type; }
    public int   getLevel()             { return this.level;         }
    public void  setLevel(int level)    { this.level = level;   }
}
