package alia;

import org.antlr.runtime.tree.Tree;

public class AliaTypeException extends AliaException {

	private static final long serialVersionUID = 1L;
    // Ctor which only requires the error message to be printed.
	public AliaTypeException(String msg) {
        super(msg);
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public AliaTypeException(Tree tree, String msg) {
        super(tree,msg);
    }

}
