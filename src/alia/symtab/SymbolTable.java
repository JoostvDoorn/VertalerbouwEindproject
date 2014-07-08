package alia.symtab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;



public class SymbolTable<Entry extends IdEntry> {
	private Map<String, Stack<Entry>> symtab;
	private Stack<List<String>> scopeStack; 
	private int currentIdentifier = 2;
	private int maxIdentifier = 1;
	private int level = -1;
    /**
     * Constructor.
     * @ensures  this.currentLevel() == -1
     */
    public SymbolTable() {
    	symtab = new HashMap<String, Stack<Entry>>();
    	scopeStack = new Stack<List<String>>();
    	level = -1;
    }

    /**
     * Opens a new scope.
     * @ensures this.currentLevel() == old.currentLevel()+1;
     */
    public void openScope()  {
    	level++;
    	scopeStack.push(new ArrayList<String>());
    }

    /**
     * Closes the current scope. All identifiers in
     * the current scope will be removed from the SymbolTable.
     * @requires old.currentLevel() > -1;
     * @ensures  this.currentLevel() == old.currentLevel()-1;
     */
    public void closeScope() {
    	// Remove the items from the symbol table
    	for(String item : scopeStack.pop()) {
    		symtab.get(item).pop();
    		currentIdentifier--;
    		
    	}
    	level--;
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return level;
    }

    /**
     * Enters an id together with an entry into this SymbolTable
     * using the current scope level. The entry's level is set to
     * currentLevel().
     * @requires id != null && id.length() > 0 && entry != null;
     * @ensures  this.retrieve(id).getLevel() == currentLevel();
     * @throws SymbolTableException when there is no valid
     *    current scope level, or when the id is already declared
     *    on the current level.
     */
    public void enter(String id, Entry entry)
            throws SymbolTableException {
    	Stack<Entry> entryStack = symtab.get(id);
    	if(entryStack == null) {
    		entryStack = new Stack<Entry>();
        	symtab.put(id, entryStack);
    	}
    	if(level == -1) {
    		throw (new SymbolTableException("No valid scope level!"));
    	}
    	else if(!entryStack.empty() && entryStack.peek().getLevel() == level) {
    		throw (new SymbolTableException("Id already declared on this level"));
    	}
    	else {
        	entry.setLevel(level);
        	entry.setIdentifier(currentIdentifier);
        	currentIdentifier++;
        	maxIdentifier = maxIdentifier < currentIdentifier ? currentIdentifier : maxIdentifier;
        	scopeStack.peek().add(id);
        	entryStack.push(entry);
    	}
    }

    /**
     * Get the Entry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * @return  Entry of this id on the highest level
     *          null if this SymbolTable does not contain id
     * @throws SymbolTableException 
     */
    public Entry retrieve(String id) throws SymbolTableException {
    	Stack<Entry> resultStack = symtab.get(id);
    	if(resultStack == null || resultStack.empty()) {
    		throw (new SymbolTableException(" " + id + " has not yet been declared"));
    	}
        return resultStack.peek();
    }
    
    /**
     * Returns true if the entry is defined.
     * @return  true if there is an entry for the symbol
     */
    public boolean isDefined(String id) {
    	Stack<Entry> resultStack = symtab.get(id);
        return !(resultStack == null || resultStack.empty());
    }
    
    /**
     * Returns the current identifier
     * @return current identifier id.
     */
    public int maxIdentifier() {
    	return maxIdentifier;
    }
}


