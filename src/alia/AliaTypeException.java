package alia;

import org.antlr.runtime.tree.Tree;

/** Exception class to signal type errors in the Alia compiler */
public class AliaTypeException extends AliaException {

	private static final long serialVersionUID = 1L;
    // Ctor which only requires the error message to be printed.
	public AliaTypeException(String msg) {
        super(msg);
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public AliaTypeException(String msg, Tree tree) {
        super(msg, tree);
    }

}
