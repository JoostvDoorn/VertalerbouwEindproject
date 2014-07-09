package alia.symtab;

import alia.types._Type;


/**
 * Entry for the symboltable. An IdEntry stores the type of an entry, if it is a constant and the level on which the variable is declared.
 */
public class IdEntry {
    private int  level = -1;
    private _Type type  = null;
    private int identifier = -1;
    private boolean isConstant = false;

    /**
     * @return The type of the IdEntry
     */
    public _Type  getType()				{ return this.type; }
    /**
     * Change the type of the Entry.
     * @param type - type to be changed to.
     */
    public void  setType(_Type type) 	{ this.type = type; }
    /**
     * @return the level this entry was set on
     */
    public int   getLevel()             { return this.level;         }
    /**
     * @param level - level to be set to
     */
    public void  setLevel(int level)    { this.level = level;   }
    /**
     * @return Number that uniquely identifies this identifier
     */
    public int   getIdentifier()        { return this.identifier; }
    /**
     * @param identifier Number that uniquely identifies this identifier
     */
    public void  setIdentifier(int identifier) { this.identifier = identifier; }
    /**
     * Sets that this entry is a constant.
     */
    public void  setConstant()			{isConstant = true;}
    /**
     * @return true iff this entry is a constant
     */
    public boolean isConstant()			{ return isConstant;} ;
    //add primitive value to keep track of what value to place if constant?
}
