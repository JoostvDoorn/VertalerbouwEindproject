package alia;

import org.antlr.runtime.tree.Tree;

public class AliaTypeException extends AliaException {

	private String msg;
	private static final long serialVersionUID = 1L;
    // Ctor which only requires the error message to be printed.
	public AliaException(String msg) {
        super();
        this.msg = msg;
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public AliaException(Tree tree, String msg) {
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
