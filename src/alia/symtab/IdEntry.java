package alia.symtab;

import alia.types._Type;


public class IdEntry {
    private int  level = -1;
    private _Type type  = null;

    public _Type  getType()				{ return this.type; }
    public void  setType(_Type type) 	{ this.type = type; }
    public int   getLevel()             { return this.level;         }
    public void  setLevel(int level)    { this.level = level;   }
}
