package alia;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/** Exception class to signal problems within the Alia compiler */
public class AliaException extends RecognitionException {

	/**
	 * 
	 */
	private String msg;
	private static final long serialVersionUID = 1L;
    // Ctor which only requires the error message to be printed.
    public AliaException(String msg) {
        super();
        this.msg = msg;
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public AliaException(String msg, Tree tree) {
        super();
        this.msg = tree.getText() +
                " (" + tree.getLine() +
                ":" + tree.getCharPositionInLine() +
                ") " + msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
