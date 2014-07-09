// $ANTLR 3.5.2 src\\alia\\AliaChecker.g 2014-07-09 15:37:08

package alia;
import alia.types.*;
import alia.symtab.SymbolTable;
import alia.symtab.IdEntry;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class AliaChecker extends CheckerAux {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ALT", "BECOMES", "BEGIN", 
		"BOOL", "CHAR", "CHAR_EXPR", "COLON", "COMMA", "COMMENT", "COMPOUND", 
		"CONST", "DEF", "DIGIT", "DIV", "DO", "ELSE", "ELSEIF", "END", "EQ", "EXPR_LIST", 
		"FALSE", "FUNC", "GE", "GT", "ID", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LE", "LETTER", "LOCALSIZE", "LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", 
		"MOD", "NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", 
		"PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "SQUOTE", 
		"STRING", "TIMES", "TRUE", "TYPE", "UPPER", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int AND_ALT=5;
	public static final int BECOMES=6;
	public static final int BEGIN=7;
	public static final int BOOL=8;
	public static final int CHAR=9;
	public static final int CHAR_EXPR=10;
	public static final int COLON=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int COMPOUND=14;
	public static final int CONST=15;
	public static final int DEF=16;
	public static final int DIGIT=17;
	public static final int DIV=18;
	public static final int DO=19;
	public static final int ELSE=20;
	public static final int ELSEIF=21;
	public static final int END=22;
	public static final int EQ=23;
	public static final int EXPR_LIST=24;
	public static final int FALSE=25;
	public static final int FUNC=26;
	public static final int GE=27;
	public static final int GT=28;
	public static final int ID=29;
	public static final int IDENTIFIER=30;
	public static final int IF=31;
	public static final int INT=32;
	public static final int LCURLY=33;
	public static final int LE=34;
	public static final int LETTER=35;
	public static final int LOCALSIZE=36;
	public static final int LOWER=37;
	public static final int LPAREN=38;
	public static final int LT=39;
	public static final int MINUS=40;
	public static final int MINUS_OP=41;
	public static final int MOD=42;
	public static final int NEWLINE=43;
	public static final int NOT=44;
	public static final int NQ=45;
	public static final int NUMBER=46;
	public static final int OR=47;
	public static final int OR_ALT=48;
	public static final int PLUS=49;
	public static final int PLUS_OP=50;
	public static final int PRINT=51;
	public static final int PROGRAM=52;
	public static final int RCURLY=53;
	public static final int READ=54;
	public static final int RPAREN=55;
	public static final int SEMICOLON=56;
	public static final int SQUOTE=57;
	public static final int STRING=58;
	public static final int TIMES=59;
	public static final int TRUE=60;
	public static final int TYPE=61;
	public static final int UPPER=62;
	public static final int WHILE=63;
	public static final int WS=64;

	// delegates
	public CheckerAux[] getDelegates() {
		return new CheckerAux[] {};
	}

	// delegators


	public AliaChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public AliaChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AliaChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\alia\\AliaChecker.g"; }





	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src\\alia\\AliaChecker.g:35:1: program : ( statement )+ -> LOCALSIZE[getLocalSize()] ( statement )+ ;
	public final AliaChecker.program_return program() throws RecognitionException {
		AliaChecker.program_return retval = new AliaChecker.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope statement1 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// src\\alia\\AliaChecker.g:36:5: ( ( statement )+ -> LOCALSIZE[getLocalSize()] ( statement )+ )
			// src\\alia\\AliaChecker.g:36:9: ( statement )+
			{
			 symTab.openScope(); 
			// src\\alia\\AliaChecker.g:37:6: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= BECOMES)||(LA1_0 >= CHAR_EXPR && LA1_0 <= COLON)||(LA1_0 >= COMPOUND && LA1_0 <= CONST)||LA1_0==DIV||LA1_0==EQ||LA1_0==FALSE||(LA1_0 >= GE && LA1_0 <= GT)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==LE||(LA1_0 >= LT && LA1_0 <= MOD)||(LA1_0 >= NOT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaChecker.g:37:7: statement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_program160);
					statement1=statement();
					state._fsp--;

					stream_statement.add(statement1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 symTab.closeScope(); 
			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 39:6: -> LOCALSIZE[getLocalSize()] ( statement )+
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(LOCALSIZE, getLocalSize()));
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_0, stream_statement.nextTree());
				}
				stream_statement.reset();

			}


			retval.tree = root_0;

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends TreeRuleReturnScope {
		public _Type type = new _Void();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// src\\alia\\AliaChecker.g:42:1: statements returns [_Type type = new _Void()] : (t= statement )* ;
	public final AliaChecker.statements_return statements() throws RecognitionException {
		AliaChecker.statements_return retval = new AliaChecker.statements_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope t =null;


		try {
			// src\\alia\\AliaChecker.g:43:2: ( (t= statement )* )
			// src\\alia\\AliaChecker.g:43:4: (t= statement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:43:4: (t= statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||(LA2_0 >= CHAR_EXPR && LA2_0 <= COLON)||(LA2_0 >= COMPOUND && LA2_0 <= CONST)||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= GT)||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LE||(LA2_0 >= LT && LA2_0 <= MOD)||(LA2_0 >= NOT && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaChecker.g:43:5: t= statement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_statements205);
					t=statement();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());

					 retval.type = (t!=null?((AliaChecker.statement_return)t).type:null); 
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends TreeRuleReturnScope {
		public _Type type = new _Void();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// src\\alia\\AliaChecker.g:47:1: statement returns [_Type type = new _Void()] : ( ^( WHILE stat= statements ^( DO statements ) ) |t= expr );
	public final AliaChecker.statement_return statement() throws RecognitionException {
		AliaChecker.statement_return retval = new AliaChecker.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree WHILE2=null;
		CommonTree DO3=null;
		TreeRuleReturnScope stat =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope statements4 =null;

		CommonTree WHILE2_tree=null;
		CommonTree DO3_tree=null;

		try {
			// src\\alia\\AliaChecker.g:48:5: ( ^( WHILE stat= statements ^( DO statements ) ) |t= expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||(LA3_0 >= CHAR_EXPR && LA3_0 <= COLON)||(LA3_0 >= COMPOUND && LA3_0 <= CONST)||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= GT)||(LA3_0 >= IDENTIFIER && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= MOD)||(LA3_0 >= NOT && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TIMES && LA3_0 <= TRUE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src\\alia\\AliaChecker.g:48:9: ^( WHILE stat= statements ^( DO statements ) )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					WHILE2=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_statement236); 
					WHILE2_tree = (CommonTree)adaptor.dupNode(WHILE2);


					root_1 = (CommonTree)adaptor.becomeRoot(WHILE2_tree, root_1);

					symTab.openScope();
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statements_in_statement242);
						stat=statements();
						state._fsp--;

						adaptor.addChild(root_1, stat.getTree());

						symTab.openScope();
						_last = (CommonTree)input.LT(1);
						{
						CommonTree _save_last_2 = _last;
						CommonTree _first_2 = null;
						CommonTree root_2 = (CommonTree)adaptor.nil();
						_last = (CommonTree)input.LT(1);
						DO3=(CommonTree)match(input,DO,FOLLOW_DO_in_statement254); 
						DO3_tree = (CommonTree)adaptor.dupNode(DO3);


						root_2 = (CommonTree)adaptor.becomeRoot(DO3_tree, root_2);

						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_statement256);
							statements4=statements();
							state._fsp--;

							adaptor.addChild(root_2, statements4.getTree());

							match(input, Token.UP, null); 
						}
						adaptor.addChild(root_1, root_2);
						_last = _save_last_2;
						}


						symTab.closeScope();symTab.closeScope();
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 checkBoolType((stat!=null?((AliaChecker.statements_return)stat).type:null), (stat!=null?((CommonTree)stat.getTree()):null)); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:51:9: t= expr
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_statement280);
					t=expr();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());

					 retval.type = (t!=null?((AliaChecker.expr_return)t).type:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expr_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// src\\alia\\AliaChecker.g:56:1: expr returns [_Type type] : (to= operand | ( ^(c= OR t1= expr t2= expr ) | ^(c= OR_ALT t1= expr t2= expr ) | ^(c= AND t1= expr t2= expr ) | ^(c= AND_ALT t1= expr t2= expr ) ) -> ^( $c expr expr TYPE[typename] ) | ( ^(c= EQ t1= expr t2= expr ) | ^(c= NQ t1= expr t2= expr ) | ^(c= LE t1= expr t2= expr ) | ^(c= GE t1= expr t2= expr ) | ^(c= GT t1= expr t2= expr ) | ^(c= LT t1= expr t2= expr ) ) -> ^( $c expr expr TYPE[typename] ) | ( ^(c= PLUS te1= expr te2= expr ) | ^(c= MINUS te1= expr te2= expr ) | ^(c= TIMES te1= expr te2= expr ) | ^(c= DIV te1= expr te2= expr ) | ^(c= MOD te1= expr te2= expr ) ) -> ^( $c expr expr TYPE[typename] ) | ^( PRINT te= exprlist ) -> ^( PRINT TYPE[typename] exprlist ) | ^( READ tv= varlist ) -> ^( READ TYPE[typename] varlist ) | ^(c= ( NOT ) to= operand ) -> ^( $c operand TYPE[typename] ) | ^(c= ( PLUS_OP | MINUS_OP ) o= operand ) -> ^( $c operand TYPE[typename] ) | ^( IF t= statements ^( DO ts= statements ) (texp= else_stmnt )? ) | ^( COLON ^( BECOMES id= IDENTIFIER t1= expr ) typ= type ) -> ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr ) | ^( BECOMES id= IDENTIFIER t1= expr ) -> ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr ) | ^( COMPOUND t= statements ) -> ^( COMPOUND TYPE[typename] statements ) | ^( CONST id= IDENTIFIER BECOMES prim= primitive ( COLON typ= type )? ) ->);
	public final AliaChecker.expr_return expr() throws RecognitionException {
		AliaChecker.expr_return retval = new AliaChecker.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree c=null;
		CommonTree id=null;
		CommonTree PRINT5=null;
		CommonTree READ6=null;
		CommonTree IF7=null;
		CommonTree DO8=null;
		CommonTree COLON9=null;
		CommonTree BECOMES10=null;
		CommonTree BECOMES11=null;
		CommonTree COMPOUND12=null;
		CommonTree CONST13=null;
		CommonTree BECOMES14=null;
		CommonTree COLON15=null;
		TreeRuleReturnScope to =null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;
		TreeRuleReturnScope te1 =null;
		TreeRuleReturnScope te2 =null;
		TreeRuleReturnScope te =null;
		TreeRuleReturnScope tv =null;
		TreeRuleReturnScope o =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope texp =null;
		TreeRuleReturnScope typ =null;
		TreeRuleReturnScope prim =null;

		CommonTree c_tree=null;
		CommonTree id_tree=null;
		CommonTree PRINT5_tree=null;
		CommonTree READ6_tree=null;
		CommonTree IF7_tree=null;
		CommonTree DO8_tree=null;
		CommonTree COLON9_tree=null;
		CommonTree BECOMES10_tree=null;
		CommonTree BECOMES11_tree=null;
		CommonTree COMPOUND12_tree=null;
		CommonTree CONST13_tree=null;
		CommonTree BECOMES14_tree=null;
		CommonTree COLON15_tree=null;
		RewriteRuleNodeStream stream_AND_ALT=new RewriteRuleNodeStream(adaptor,"token AND_ALT");
		RewriteRuleNodeStream stream_GE=new RewriteRuleNodeStream(adaptor,"token GE");
		RewriteRuleNodeStream stream_LT=new RewriteRuleNodeStream(adaptor,"token LT");
		RewriteRuleNodeStream stream_MOD=new RewriteRuleNodeStream(adaptor,"token MOD");
		RewriteRuleNodeStream stream_CONST=new RewriteRuleNodeStream(adaptor,"token CONST");
		RewriteRuleNodeStream stream_NQ=new RewriteRuleNodeStream(adaptor,"token NQ");
		RewriteRuleNodeStream stream_BECOMES=new RewriteRuleNodeStream(adaptor,"token BECOMES");
		RewriteRuleNodeStream stream_NOT=new RewriteRuleNodeStream(adaptor,"token NOT");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
		RewriteRuleNodeStream stream_AND=new RewriteRuleNodeStream(adaptor,"token AND");
		RewriteRuleNodeStream stream_PRINT=new RewriteRuleNodeStream(adaptor,"token PRINT");
		RewriteRuleNodeStream stream_COMPOUND=new RewriteRuleNodeStream(adaptor,"token COMPOUND");
		RewriteRuleNodeStream stream_COLON=new RewriteRuleNodeStream(adaptor,"token COLON");
		RewriteRuleNodeStream stream_READ=new RewriteRuleNodeStream(adaptor,"token READ");
		RewriteRuleNodeStream stream_IDENTIFIER=new RewriteRuleNodeStream(adaptor,"token IDENTIFIER");
		RewriteRuleNodeStream stream_OR=new RewriteRuleNodeStream(adaptor,"token OR");
		RewriteRuleNodeStream stream_OR_ALT=new RewriteRuleNodeStream(adaptor,"token OR_ALT");
		RewriteRuleNodeStream stream_GT=new RewriteRuleNodeStream(adaptor,"token GT");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS_OP=new RewriteRuleNodeStream(adaptor,"token MINUS_OP");
		RewriteRuleNodeStream stream_PLUS_OP=new RewriteRuleNodeStream(adaptor,"token PLUS_OP");
		RewriteRuleNodeStream stream_DIV=new RewriteRuleNodeStream(adaptor,"token DIV");
		RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
		RewriteRuleNodeStream stream_TIMES=new RewriteRuleNodeStream(adaptor,"token TIMES");
		RewriteRuleNodeStream stream_LE=new RewriteRuleNodeStream(adaptor,"token LE");
		RewriteRuleSubtreeStream stream_varlist=new RewriteRuleSubtreeStream(adaptor,"rule varlist");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
		RewriteRuleSubtreeStream stream_exprlist=new RewriteRuleSubtreeStream(adaptor,"rule exprlist");
		RewriteRuleSubtreeStream stream_primitive=new RewriteRuleSubtreeStream(adaptor,"rule primitive");

		try {
			// src\\alia\\AliaChecker.g:57:5: (to= operand | ( ^(c= OR t1= expr t2= expr ) | ^(c= OR_ALT t1= expr t2= expr ) | ^(c= AND t1= expr t2= expr ) | ^(c= AND_ALT t1= expr t2= expr ) ) -> ^( $c expr expr TYPE[typename] ) | ( ^(c= EQ t1= expr t2= expr ) | ^(c= NQ t1= expr t2= expr ) | ^(c= LE t1= expr t2= expr ) | ^(c= GE t1= expr t2= expr ) | ^(c= GT t1= expr t2= expr ) | ^(c= LT t1= expr t2= expr ) ) -> ^( $c expr expr TYPE[typename] ) | ( ^(c= PLUS te1= expr te2= expr ) | ^(c= MINUS te1= expr te2= expr ) | ^(c= TIMES te1= expr te2= expr ) | ^(c= DIV te1= expr te2= expr ) | ^(c= MOD te1= expr te2= expr ) ) -> ^( $c expr expr TYPE[typename] ) | ^( PRINT te= exprlist ) -> ^( PRINT TYPE[typename] exprlist ) | ^( READ tv= varlist ) -> ^( READ TYPE[typename] varlist ) | ^(c= ( NOT ) to= operand ) -> ^( $c operand TYPE[typename] ) | ^(c= ( PLUS_OP | MINUS_OP ) o= operand ) -> ^( $c operand TYPE[typename] ) | ^( IF t= statements ^( DO ts= statements ) (texp= else_stmnt )? ) | ^( COLON ^( BECOMES id= IDENTIFIER t1= expr ) typ= type ) -> ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr ) | ^( BECOMES id= IDENTIFIER t1= expr ) -> ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr ) | ^( COMPOUND t= statements ) -> ^( COMPOUND TYPE[typename] statements ) | ^( CONST id= IDENTIFIER BECOMES prim= primitive ( COLON typ= type )? ) ->)
			int alt10=13;
			switch ( input.LA(1) ) {
			case CHAR_EXPR:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt10=1;
				}
				break;
			case AND:
			case AND_ALT:
			case OR:
			case OR_ALT:
				{
				alt10=2;
				}
				break;
			case EQ:
			case GE:
			case GT:
			case LE:
			case LT:
			case NQ:
				{
				alt10=3;
				}
				break;
			case DIV:
			case MINUS:
			case MOD:
			case PLUS:
			case TIMES:
				{
				alt10=4;
				}
				break;
			case PRINT:
				{
				alt10=5;
				}
				break;
			case READ:
				{
				alt10=6;
				}
				break;
			case NOT:
				{
				alt10=7;
				}
				break;
			case MINUS_OP:
			case PLUS_OP:
				{
				alt10=8;
				}
				break;
			case IF:
				{
				alt10=9;
				}
				break;
			case COLON:
				{
				alt10=10;
				}
				break;
			case BECOMES:
				{
				alt10=11;
				}
				break;
			case COMPOUND:
				{
				alt10=12;
				}
				break;
			case CONST:
				{
				alt10=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src\\alia\\AliaChecker.g:57:9: to= operand
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr310);
					to=operand();
					state._fsp--;

					adaptor.addChild(root_0, to.getTree());


								retval.type = (to!=null?((AliaChecker.operand_return)to).type:null);
						    
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:61:9: ( ^(c= OR t1= expr t2= expr ) | ^(c= OR_ALT t1= expr t2= expr ) | ^(c= AND t1= expr t2= expr ) | ^(c= AND_ALT t1= expr t2= expr ) )
					{
					// src\\alia\\AliaChecker.g:61:9: ( ^(c= OR t1= expr t2= expr ) | ^(c= OR_ALT t1= expr t2= expr ) | ^(c= AND t1= expr t2= expr ) | ^(c= AND_ALT t1= expr t2= expr ) )
					int alt4=4;
					switch ( input.LA(1) ) {
					case OR:
						{
						alt4=1;
						}
						break;
					case OR_ALT:
						{
						alt4=2;
						}
						break;
					case AND:
						{
						alt4=3;
						}
						break;
					case AND_ALT:
						{
						alt4=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// src\\alia\\AliaChecker.g:61:10: ^(c= OR t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,OR,FOLLOW_OR_in_expr328); 
							 
							stream_OR.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr332);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr336);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:62:9: ^(c= OR_ALT t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,OR_ALT,FOLLOW_OR_ALT_in_expr350); 
							 
							stream_OR_ALT.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr354);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr358);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:63:9: ^(c= AND t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,AND,FOLLOW_AND_in_expr372); 
							 
							stream_AND.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr376);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr380);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 4 :
							// src\\alia\\AliaChecker.g:64:9: ^(c= AND_ALT t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,AND_ALT,FOLLOW_AND_ALT_in_expr394); 
							 
							stream_AND_ALT.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr398);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr402);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;

					}


					          checkEqualType((t1!=null?((AliaChecker.expr_return)t1).type:null), (t2!=null?((AliaChecker.expr_return)t2).type:null), (t1!=null?((CommonTree)t1.getTree()):null));
					          checkBoolType((t1!=null?((AliaChecker.expr_return)t1).type:null), (t1!=null?((CommonTree)t1.getTree()):null));
					          retval.type = new _Bool();
					          String typename = String.valueOf(retval.type);
					      
					// AST REWRITE
					// elements: expr, c, expr
					// token labels: c
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 71:7: -> ^( $c expr expr TYPE[typename] )
					{
						// src\\alia\\AliaChecker.g:71:10: ^( $c expr expr TYPE[typename] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:72:9: ( ^(c= EQ t1= expr t2= expr ) | ^(c= NQ t1= expr t2= expr ) | ^(c= LE t1= expr t2= expr ) | ^(c= GE t1= expr t2= expr ) | ^(c= GT t1= expr t2= expr ) | ^(c= LT t1= expr t2= expr ) )
					{
					// src\\alia\\AliaChecker.g:72:9: ( ^(c= EQ t1= expr t2= expr ) | ^(c= NQ t1= expr t2= expr ) | ^(c= LE t1= expr t2= expr ) | ^(c= GE t1= expr t2= expr ) | ^(c= GT t1= expr t2= expr ) | ^(c= LT t1= expr t2= expr ) )
					int alt5=6;
					switch ( input.LA(1) ) {
					case EQ:
						{
						alt5=1;
						}
						break;
					case NQ:
						{
						alt5=2;
						}
						break;
					case LE:
						{
						alt5=3;
						}
						break;
					case GE:
						{
						alt5=4;
						}
						break;
					case GT:
						{
						alt5=5;
						}
						break;
					case LT:
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// src\\alia\\AliaChecker.g:72:10: ^(c= EQ t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expr446); 
							 
							stream_EQ.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr450);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr454);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:73:9: ^(c= NQ t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,NQ,FOLLOW_NQ_in_expr468); 
							 
							stream_NQ.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr472);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr476);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:74:9: ^(c= LE t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,LE,FOLLOW_LE_in_expr490); 
							 
							stream_LE.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr494);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr498);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 4 :
							// src\\alia\\AliaChecker.g:75:9: ^(c= GE t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,GE,FOLLOW_GE_in_expr512); 
							 
							stream_GE.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr516);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr520);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 5 :
							// src\\alia\\AliaChecker.g:76:9: ^(c= GT t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,GT,FOLLOW_GT_in_expr534); 
							 
							stream_GT.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr538);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr542);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 6 :
							// src\\alia\\AliaChecker.g:77:9: ^(c= LT t1= expr t2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,LT,FOLLOW_LT_in_expr556); 
							 
							stream_LT.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr560);
							t1=expr();
							state._fsp--;

							stream_expr.add(t1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr564);
							t2=expr();
							state._fsp--;

							stream_expr.add(t2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;

					}


						   	    checkEqualType((t1!=null?((AliaChecker.expr_return)t1).type:null), (t2!=null?((AliaChecker.expr_return)t2).type:null), (t1!=null?((CommonTree)t1.getTree()):null));
						   	    retval.type = new _Bool();
					        	String typename = String.valueOf(retval.type);
						   	
					// AST REWRITE
					// elements: expr, expr, c
					// token labels: c
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 83:6: -> ^( $c expr expr TYPE[typename] )
					{
						// src\\alia\\AliaChecker.g:83:9: ^( $c expr expr TYPE[typename] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:84:9: ( ^(c= PLUS te1= expr te2= expr ) | ^(c= MINUS te1= expr te2= expr ) | ^(c= TIMES te1= expr te2= expr ) | ^(c= DIV te1= expr te2= expr ) | ^(c= MOD te1= expr te2= expr ) )
					{
					// src\\alia\\AliaChecker.g:84:9: ( ^(c= PLUS te1= expr te2= expr ) | ^(c= MINUS te1= expr te2= expr ) | ^(c= TIMES te1= expr te2= expr ) | ^(c= DIV te1= expr te2= expr ) | ^(c= MOD te1= expr te2= expr ) )
					int alt6=5;
					switch ( input.LA(1) ) {
					case PLUS:
						{
						alt6=1;
						}
						break;
					case MINUS:
						{
						alt6=2;
						}
						break;
					case TIMES:
						{
						alt6=3;
						}
						break;
					case DIV:
						{
						alt6=4;
						}
						break;
					case MOD:
						{
						alt6=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// src\\alia\\AliaChecker.g:84:10: ^(c= PLUS te1= expr te2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr606); 
							 
							stream_PLUS.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr610);
							te1=expr();
							state._fsp--;

							stream_expr.add(te1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr614);
							te2=expr();
							state._fsp--;

							stream_expr.add(te2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:85:9: ^(c= MINUS te1= expr te2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr628); 
							 
							stream_MINUS.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr632);
							te1=expr();
							state._fsp--;

							stream_expr.add(te1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr636);
							te2=expr();
							state._fsp--;

							stream_expr.add(te2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:86:9: ^(c= TIMES te1= expr te2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,TIMES,FOLLOW_TIMES_in_expr650); 
							 
							stream_TIMES.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr654);
							te1=expr();
							state._fsp--;

							stream_expr.add(te1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr658);
							te2=expr();
							state._fsp--;

							stream_expr.add(te2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 4 :
							// src\\alia\\AliaChecker.g:87:9: ^(c= DIV te1= expr te2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr672); 
							 
							stream_DIV.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr676);
							te1=expr();
							state._fsp--;

							stream_expr.add(te1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr680);
							te2=expr();
							state._fsp--;

							stream_expr.add(te2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;
						case 5 :
							// src\\alia\\AliaChecker.g:88:9: ^(c= MOD te1= expr te2= expr )
							{
							_last = (CommonTree)input.LT(1);
							{
							CommonTree _save_last_1 = _last;
							CommonTree _first_1 = null;
							CommonTree root_1 = (CommonTree)adaptor.nil();
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr694); 
							 
							stream_MOD.add(c);

							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr698);
							te1=expr();
							state._fsp--;

							stream_expr.add(te1.getTree());
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr702);
							te2=expr();
							state._fsp--;

							stream_expr.add(te2.getTree());
							match(input, Token.UP, null); 
							adaptor.addChild(root_0, root_1);
							_last = _save_last_1;
							}


							}
							break;

					}

					 
						    	checkMathType((te1!=null?((AliaChecker.expr_return)te1).type:null), (te2!=null?((AliaChecker.expr_return)te2).type:null), (te1!=null?((CommonTree)te1.getTree()):null));
						    	retval.type = new _Int();
					        	String typename = String.valueOf(retval.type);
						    
					// AST REWRITE
					// elements: c, expr, expr
					// token labels: c
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 94:6: -> ^( $c expr expr TYPE[typename] )
					{
						// src\\alia\\AliaChecker.g:94:9: ^( $c expr expr TYPE[typename] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// src\\alia\\AliaChecker.g:95:7: ^( PRINT te= exprlist )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PRINT5=(CommonTree)match(input,PRINT,FOLLOW_PRINT_in_expr739); 
					 
					stream_PRINT.add(PRINT5);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exprlist_in_expr743);
					te=exprlist();
					state._fsp--;

					stream_exprlist.add(te.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    		retval.type = (te!=null?((AliaChecker.exprlist_return)te).type:null);
					        	String typename = String.valueOf(retval.type);
					        
					// AST REWRITE
					// elements: exprlist, PRINT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:6: -> ^( PRINT TYPE[typename] exprlist )
					{
						// src\\alia\\AliaChecker.g:100:9: ^( PRINT TYPE[typename] exprlist )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_PRINT.nextNode()
						, root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_1, stream_exprlist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// src\\alia\\AliaChecker.g:101:7: ^( READ tv= varlist )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					READ6=(CommonTree)match(input,READ,FOLLOW_READ_in_expr776); 
					 
					stream_READ.add(READ6);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_varlist_in_expr780);
					tv=varlist();
					state._fsp--;

					stream_varlist.add(tv.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    		retval.type = (tv!=null?((AliaChecker.varlist_return)tv).type:null);
					        	String typename = String.valueOf(retval.type);
					        
					// AST REWRITE
					// elements: varlist, READ
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 106:6: -> ^( READ TYPE[typename] varlist )
					{
						// src\\alia\\AliaChecker.g:106:9: ^( READ TYPE[typename] varlist )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_READ.nextNode()
						, root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_1, stream_varlist.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// src\\alia\\AliaChecker.g:107:4: ^(c= ( NOT ) to= operand )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					// src\\alia\\AliaChecker.g:107:8: ( NOT )
					// src\\alia\\AliaChecker.g:107:9: NOT
					{
					_last = (CommonTree)input.LT(1);
					c=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expr813); 
					 
					stream_NOT.add(c);

					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr818);
					to=operand();
					state._fsp--;

					stream_operand.add(to.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    		  retval.type = (to!=null?((AliaChecker.operand_return)to).type:null);
					        	String typename = String.valueOf(retval.type);
					        	checkBoolType((to!=null?((AliaChecker.operand_return)to).type:null), (to!=null?((CommonTree)to.getTree()):null));
					        
					// AST REWRITE
					// elements: c, operand
					// token labels: c
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 113:6: -> ^( $c operand TYPE[typename] )
					{
						// src\\alia\\AliaChecker.g:113:9: ^( $c operand TYPE[typename] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// src\\alia\\AliaChecker.g:114:6: ^(c= ( PLUS_OP | MINUS_OP ) o= operand )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					// src\\alia\\AliaChecker.g:114:10: ( PLUS_OP | MINUS_OP )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==PLUS_OP) ) {
						alt7=1;
					}
					else if ( (LA7_0==MINUS_OP) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// src\\alia\\AliaChecker.g:114:12: PLUS_OP
							{
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,PLUS_OP,FOLLOW_PLUS_OP_in_expr855); 
							 
							stream_PLUS_OP.add(c);

							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:114:22: MINUS_OP
							{
							_last = (CommonTree)input.LT(1);
							c=(CommonTree)match(input,MINUS_OP,FOLLOW_MINUS_OP_in_expr859); 
							 
							stream_MINUS_OP.add(c);

							}
							break;

					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr865);
					o=operand();
					state._fsp--;

					stream_operand.add(o.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



						        retval.type = (o!=null?((AliaChecker.operand_return)o).type:null);
					          String typename = String.valueOf(retval.type);
					          checkEqualType((o!=null?((AliaChecker.operand_return)o).type:null), new _Int(), (o!=null?((CommonTree)o.getTree()):null));
						    
					// AST REWRITE
					// elements: operand, c
					// token labels: c
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleNodeStream stream_c=new RewriteRuleNodeStream(adaptor,"token c",c);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 120:6: -> ^( $c operand TYPE[typename] )
					{
						// src\\alia\\AliaChecker.g:120:9: ^( $c operand TYPE[typename] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_c.nextNode(), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// src\\alia\\AliaChecker.g:121:9: ^( IF t= statements ^( DO ts= statements ) (texp= else_stmnt )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IF7=(CommonTree)match(input,IF,FOLLOW_IF_in_expr901); 
					IF7_tree = (CommonTree)adaptor.dupNode(IF7);


					root_1 = (CommonTree)adaptor.becomeRoot(IF7_tree, root_1);


					   				symTab.openScope(); // Open scope for conditional statements, the scope is the same for the IF and ELSEIF conditions
					   			
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statements_in_expr919);
						t=statements();
						state._fsp--;

						adaptor.addChild(root_1, t.getTree());


						   				symTab.openScope(); // Open scope for the first statement
						   			
						_last = (CommonTree)input.LT(1);
						{
						CommonTree _save_last_2 = _last;
						CommonTree _first_2 = null;
						CommonTree root_2 = (CommonTree)adaptor.nil();
						_last = (CommonTree)input.LT(1);
						DO8=(CommonTree)match(input,DO,FOLLOW_DO_in_expr936); 
						DO8_tree = (CommonTree)adaptor.dupNode(DO8);


						root_2 = (CommonTree)adaptor.becomeRoot(DO8_tree, root_2);

						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_expr946);
							ts=statements();
							state._fsp--;

							adaptor.addChild(root_2, ts.getTree());


								   			checkBoolType((t!=null?((AliaChecker.statements_return)t).type:null), (ts!=null?((CommonTree)ts.getTree()):null));
								   			symTab.closeScope(); // Close scope for the first statement
								   		
							match(input, Token.UP, null); 
						}
						adaptor.addChild(root_1, root_2);
						_last = _save_last_2;
						}


						// src\\alia\\AliaChecker.g:136:11: (texp= else_stmnt )?
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= ELSE && LA8_0 <= ELSEIF)) ) {
							alt8=1;
						}
						switch (alt8) {
							case 1 :
								// src\\alia\\AliaChecker.g:136:11: texp= else_stmnt
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_else_stmnt_in_expr972);
								texp=else_stmnt();
								state._fsp--;

								adaptor.addChild(root_1, texp.getTree());

								}
								break;

						}


						   				symTab.closeScope(); // Close scope for the conditional statements
							   			checkBoolType((t!=null?((AliaChecker.statements_return)t).type:null), (t!=null?((CommonTree)t.getTree()):null));
							   			retval.type = checkTypesIf((ts!=null?((AliaChecker.statements_return)ts).type:null),(texp!=null?((AliaChecker.else_stmnt_return)texp).type:null));
						   			
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 10 :
					// src\\alia\\AliaChecker.g:143:9: ^( COLON ^( BECOMES id= IDENTIFIER t1= expr ) typ= type )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					COLON9=(CommonTree)match(input,COLON,FOLLOW_COLON_in_expr999); 
					 
					stream_COLON.add(COLON9);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BECOMES10=(CommonTree)match(input,BECOMES,FOLLOW_BECOMES_in_expr1002); 
					 
					stream_BECOMES.add(BECOMES10);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1006); 
					 
					stream_IDENTIFIER.add(id);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr1010);
					t1=expr();
					state._fsp--;

					stream_expr.add(t1.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_expr1015);
					typ=type();
					state._fsp--;

					stream_type.add(typ.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					   
					        	_Type declType = checkEqualType((t1!=null?((AliaChecker.expr_return)t1).type:null), (typ!=null?((AliaChecker.type_return)typ).type:null), (t1!=null?((CommonTree)t1.getTree()):null));
					        	declare((id!=null?id.getText():null), declType, (t1!=null?((CommonTree)t1.getTree()):null));
					    		retval.type = declType;
					    		
					        	String typename = String.valueOf(retval.type);
					        	String identifier = String.valueOf(getIdentifier((id!=null?id.getText():null), id_tree));
					        
					// AST REWRITE
					// elements: expr, BECOMES, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 152:9: -> ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr )
					{
						// src\\alia\\AliaChecker.g:152:12: ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_BECOMES.nextNode()
						, root_1);
						// src\\alia\\AliaChecker.g:152:22: ^( IDENTIFIER TYPE[typename] ID[identifier] )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_IDENTIFIER.nextNode()
						, root_2);
						adaptor.addChild(root_2, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_2, (CommonTree)adaptor.create(ID, identifier));
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// src\\alia\\AliaChecker.g:153:9: ^( BECOMES id= IDENTIFIER t1= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BECOMES11=(CommonTree)match(input,BECOMES,FOLLOW_BECOMES_in_expr1063); 
					 
					stream_BECOMES.add(BECOMES11);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1067); 
					 
					stream_IDENTIFIER.add(id);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr1071);
					t1=expr();
					state._fsp--;

					stream_expr.add(t1.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					   
					        	declare((id!=null?id.getText():null), (t1!=null?((AliaChecker.expr_return)t1).type:null), (t1!=null?((CommonTree)t1.getTree()):null));
					    		retval.type = (t1!=null?((AliaChecker.expr_return)t1).type:null);
					    		checkNotVoid(retval.type, (t1!=null?((CommonTree)t1.getTree()):null));
					    		
					        	String typename = String.valueOf(retval.type);
					        	String identifier = String.valueOf(getIdentifier((id!=null?id.getText():null), id_tree));
					        
					// AST REWRITE
					// elements: BECOMES, expr, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 162:6: -> ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr )
					{
						// src\\alia\\AliaChecker.g:162:9: ^( BECOMES ^( IDENTIFIER TYPE[typename] ID[identifier] ) expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_BECOMES.nextNode()
						, root_1);
						// src\\alia\\AliaChecker.g:162:19: ^( IDENTIFIER TYPE[typename] ID[identifier] )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_IDENTIFIER.nextNode()
						, root_2);
						adaptor.addChild(root_2, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_2, (CommonTree)adaptor.create(ID, identifier));
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// src\\alia\\AliaChecker.g:163:9: ^( COMPOUND t= statements )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					COMPOUND12=(CommonTree)match(input,COMPOUND,FOLLOW_COMPOUND_in_expr1116); 
					 
					stream_COMPOUND.add(COMPOUND12);

					 // symTab.openScope
					   			symTab.openScope();
					   		
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statements_in_expr1132);
						t=statements();
						state._fsp--;

						stream_statements.add(t.getTree());
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					        	// closeScope
					        	symTab.closeScope();
					    		retval.type = (t!=null?((AliaChecker.statements_return)t).type:null);
					        	String typename = String.valueOf(retval.type);
					        
					// AST REWRITE
					// elements: COMPOUND, statements
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 174:6: -> ^( COMPOUND TYPE[typename] statements )
					{
						// src\\alia\\AliaChecker.g:174:9: ^( COMPOUND TYPE[typename] statements )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_COMPOUND.nextNode()
						, root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
						adaptor.addChild(root_1, stream_statements.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// src\\alia\\AliaChecker.g:175:9: ^( CONST id= IDENTIFIER BECOMES prim= primitive ( COLON typ= type )? )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CONST13=(CommonTree)match(input,CONST,FOLLOW_CONST_in_expr1170); 
					 
					stream_CONST.add(CONST13);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1174); 
					 
					stream_IDENTIFIER.add(id);

					_last = (CommonTree)input.LT(1);
					BECOMES14=(CommonTree)match(input,BECOMES,FOLLOW_BECOMES_in_expr1176); 
					 
					stream_BECOMES.add(BECOMES14);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_primitive_in_expr1180);
					prim=primitive();
					state._fsp--;

					stream_primitive.add(prim.getTree());
					// src\\alia\\AliaChecker.g:175:54: ( COLON typ= type )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==COLON) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// src\\alia\\AliaChecker.g:175:55: COLON typ= type
							{
							_last = (CommonTree)input.LT(1);
							COLON15=(CommonTree)match(input,COLON,FOLLOW_COLON_in_expr1183); 
							 
							stream_COLON.add(COLON15);

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_type_in_expr1187);
							typ=type();
							state._fsp--;

							stream_type.add(typ.getTree());
							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 _Type declType = checkEqualType((prim!=null?((AliaChecker.primitive_return)prim).type:null), (typ!=null?((AliaChecker.type_return)typ).type:null), (prim!=null?((CommonTree)prim.getTree()):null));
					            declareConst((id!=null?id.getText():null), declType, prim, (prim!=null?((CommonTree)prim.getTree()):null));
					            retval.type = declType;
					            String typename = String.valueOf(retval.type);
					            String identifier = String.valueOf(getIdentifier((id!=null?id.getText():null), (prim!=null?((CommonTree)prim.getTree()):null)));
					            
					            
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 183:7: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class else_stmnt_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "else_stmnt"
	// src\\alia\\AliaChecker.g:186:1: else_stmnt returns [_Type type] : ( ^( ELSEIF t= statements ^( DO ts= statements ) (te= else_stmnt )? ) | ^( ELSE ts= statements ) );
	public final AliaChecker.else_stmnt_return else_stmnt() throws RecognitionException {
		AliaChecker.else_stmnt_return retval = new AliaChecker.else_stmnt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ELSEIF16=null;
		CommonTree DO17=null;
		CommonTree ELSE18=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope te =null;

		CommonTree ELSEIF16_tree=null;
		CommonTree DO17_tree=null;
		CommonTree ELSE18_tree=null;

		try {
			// src\\alia\\AliaChecker.g:187:2: ( ^( ELSEIF t= statements ^( DO ts= statements ) (te= else_stmnt )? ) | ^( ELSE ts= statements ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ELSEIF) ) {
				alt12=1;
			}
			else if ( (LA12_0==ELSE) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src\\alia\\AliaChecker.g:188:3: ^( ELSEIF t= statements ^( DO ts= statements ) (te= else_stmnt )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ELSEIF16=(CommonTree)match(input,ELSEIF,FOLLOW_ELSEIF_in_else_stmnt1235); 
					ELSEIF16_tree = (CommonTree)adaptor.dupNode(ELSEIF16);


					root_1 = (CommonTree)adaptor.becomeRoot(ELSEIF16_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statements_in_else_stmnt1239);
						t=statements();
						state._fsp--;

						adaptor.addChild(root_1, t.getTree());

						_last = (CommonTree)input.LT(1);
						{
						CommonTree _save_last_2 = _last;
						CommonTree _first_2 = null;
						CommonTree root_2 = (CommonTree)adaptor.nil();
						_last = (CommonTree)input.LT(1);
						DO17=(CommonTree)match(input,DO,FOLLOW_DO_in_else_stmnt1245); 
						DO17_tree = (CommonTree)adaptor.dupNode(DO17);


						root_2 = (CommonTree)adaptor.becomeRoot(DO17_tree, root_2);


						   				symTab.openScope(); // Open scope for this elseif statement
						   			
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_else_stmnt1260);
							ts=statements();
							state._fsp--;

							adaptor.addChild(root_2, ts.getTree());

							match(input, Token.UP, null); 
						}
						adaptor.addChild(root_1, root_2);
						_last = _save_last_2;
						}


						// src\\alia\\AliaChecker.g:195:9: (te= else_stmnt )?
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= ELSE && LA11_0 <= ELSEIF)) ) {
							alt11=1;
						}
						switch (alt11) {
							case 1 :
								// src\\alia\\AliaChecker.g:195:9: te= else_stmnt
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_else_stmnt_in_else_stmnt1275);
								te=else_stmnt();
								state._fsp--;

								adaptor.addChild(root_1, te.getTree());

								}
								break;

						}


							   			checkBoolType((t!=null?((AliaChecker.statements_return)t).type:null), (t!=null?((CommonTree)t.getTree()):null));
							   			retval.type = checkTypesIf((ts!=null?((AliaChecker.statements_return)ts).type:null), (te!=null?((AliaChecker.else_stmnt_return)te).type:null));
							   			symTab.closeScope();
							   		
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:202:4: ^( ELSE ts= statements )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ELSE18=(CommonTree)match(input,ELSE,FOLLOW_ELSE_in_else_stmnt1294); 
					ELSE18_tree = (CommonTree)adaptor.dupNode(ELSE18);


					root_1 = (CommonTree)adaptor.becomeRoot(ELSE18_tree, root_1);


					   				symTab.openScope(); // Open scope for the else statement
					   			
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statements_in_else_stmnt1309);
						ts=statements();
						state._fsp--;

						adaptor.addChild(root_1, ts.getTree());


							   			retval.type = (ts!=null?((AliaChecker.statements_return)ts).type:null);
						   				symTab.closeScope(); // Open scope for the else statement
							   		
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "else_stmnt"


	public static class operand_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src\\alia\\AliaChecker.g:215:1: operand returns [_Type type] : (id= identifier |n= NUMBER |c= CHAR_EXPR |b= ( TRUE | FALSE ) );
	public final AliaChecker.operand_return operand() throws RecognitionException {
		AliaChecker.operand_return retval = new AliaChecker.operand_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;
		TreeRuleReturnScope id =null;

		CommonTree n_tree=null;
		CommonTree c_tree=null;
		CommonTree b_tree=null;

		try {
			// src\\alia\\AliaChecker.g:216:5: (id= identifier |n= NUMBER |c= CHAR_EXPR |b= ( TRUE | FALSE ) )
			int alt13=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt13=1;
				}
				break;
			case NUMBER:
				{
				alt13=2;
				}
				break;
			case CHAR_EXPR:
				{
				alt13=3;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src\\alia\\AliaChecker.g:216:9: id= identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_identifier_in_operand1348);
					id=identifier();
					state._fsp--;

					adaptor.addChild(root_0, id.getTree());

					 retval.type = (id!=null?((AliaChecker.identifier_return)id).type:null); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:218:9: n= NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1371); 
					n_tree = (CommonTree)adaptor.dupNode(n);


					adaptor.addChild(root_0, n_tree);

					 retval.type = new _Int();checkInt(n);  
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:220:9: c= CHAR_EXPR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand1390); 
					c_tree = (CommonTree)adaptor.dupNode(c);


					adaptor.addChild(root_0, c_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:222:9: b= ( TRUE | FALSE )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					b=(CommonTree)input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						b_tree = (CommonTree)adaptor.dupNode(b);


						adaptor.addChild(root_0, b_tree);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					 retval.type = new _Bool(); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class identifier_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// src\\alia\\AliaChecker.g:226:1: identifier returns [_Type type] : id= IDENTIFIER -> {constant && typename.equals(\"int\") }? ^( NUMBER[value] ) -> {constant && typename.equals(\"char\") }? ^( CHAR_EXPR[value] ) -> {constant && typename.equals(\"bool\") && value.getText().equals(\"true\") }? ^( TRUE[value] ) -> {constant && typename.equals(\"bool\") && value.getText().equals(\"false\") }? ^( FALSE[value] ) -> ^( IDENTIFIER TYPE[typename] ID[identifier] ) ;
	public final AliaChecker.identifier_return identifier() throws RecognitionException {
		AliaChecker.identifier_return retval = new AliaChecker.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;

		CommonTree id_tree=null;
		RewriteRuleNodeStream stream_IDENTIFIER=new RewriteRuleNodeStream(adaptor,"token IDENTIFIER");

		try {
			// src\\alia\\AliaChecker.g:227:2: (id= IDENTIFIER -> {constant && typename.equals(\"int\") }? ^( NUMBER[value] ) -> {constant && typename.equals(\"char\") }? ^( CHAR_EXPR[value] ) -> {constant && typename.equals(\"bool\") && value.getText().equals(\"true\") }? ^( TRUE[value] ) -> {constant && typename.equals(\"bool\") && value.getText().equals(\"false\") }? ^( FALSE[value] ) -> ^( IDENTIFIER TYPE[typename] ID[identifier] ) )
			// src\\alia\\AliaChecker.g:228:2: id= IDENTIFIER
			{
			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1443); 
			 
			stream_IDENTIFIER.add(id);


						retval.type = getType((id!=null?id.getText():null), id_tree);
			            String typename = String.valueOf(retval.type);
			            String identifier = String.valueOf(getIdentifier((id!=null?id.getText():null), id_tree));
			        	Boolean constant = retrieve((id!=null?id.getText():null), id_tree).isConstant();
				        Token value = getConstant((id!=null?id.getText():null));
					
			// AST REWRITE
			// elements: IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 236:2: -> {constant && typename.equals(\"int\") }? ^( NUMBER[value] )
			if (constant && typename.equals("int") ) {
				// src\\alia\\AliaChecker.g:236:44: ^( NUMBER[value] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMBER, value), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 237:2: -> {constant && typename.equals(\"char\") }? ^( CHAR_EXPR[value] )
			if (constant && typename.equals("char") ) {
				// src\\alia\\AliaChecker.g:237:45: ^( CHAR_EXPR[value] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAR_EXPR, value), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 238:2: -> {constant && typename.equals(\"bool\") && value.getText().equals(\"true\") }? ^( TRUE[value] )
			if (constant && typename.equals("bool") && value.getText().equals("true")  ) {
				// src\\alia\\AliaChecker.g:238:80: ^( TRUE[value] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRUE, value), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 239:2: -> {constant && typename.equals(\"bool\") && value.getText().equals(\"false\") }? ^( FALSE[value] )
			if (constant && typename.equals("bool") && value.getText().equals("false")  ) {
				// src\\alia\\AliaChecker.g:239:81: ^( FALSE[value] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FALSE, value), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 240:2: -> ^( IDENTIFIER TYPE[typename] ID[identifier] )
			{
				// src\\alia\\AliaChecker.g:240:5: ^( IDENTIFIER TYPE[typename] ID[identifier] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(
				stream_IDENTIFIER.nextNode()
				, root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, typename));
				adaptor.addChild(root_1, (CommonTree)adaptor.create(ID, identifier));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class varlist_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varlist"
	// src\\alia\\AliaChecker.g:244:1: varlist returns [_Type type] : t= identifier ( identifier )* ;
	public final AliaChecker.varlist_return varlist() throws RecognitionException {
		AliaChecker.varlist_return retval = new AliaChecker.varlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope t =null;
		TreeRuleReturnScope identifier19 =null;


		try {
			// src\\alia\\AliaChecker.g:245:2: (t= identifier ( identifier )* )
			// src\\alia\\AliaChecker.g:245:4: t= identifier ( identifier )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_identifier_in_varlist1519);
			t=identifier();
			state._fsp--;

			adaptor.addChild(root_0, t.getTree());


						retval.type = (t!=null?((AliaChecker.identifier_return)t).type:null);
					
			// src\\alia\\AliaChecker.g:249:3: ( identifier )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==IDENTIFIER) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src\\alia\\AliaChecker.g:249:4: identifier
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_identifier_in_varlist1528);
					identifier19=identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier19.getTree());


									retval.type = new _Void();
								
					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varlist"


	public static class exprlist_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprlist"
	// src\\alia\\AliaChecker.g:257:1: exprlist returns [_Type type] : tl= exprentry (t= exprentry )* ;
	public final AliaChecker.exprlist_return exprlist() throws RecognitionException {
		AliaChecker.exprlist_return retval = new AliaChecker.exprlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope tl =null;
		TreeRuleReturnScope t =null;


		try {
			// src\\alia\\AliaChecker.g:258:5: (tl= exprentry (t= exprentry )* )
			// src\\alia\\AliaChecker.g:258:7: tl= exprentry (t= exprentry )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_exprentry_in_exprlist1563);
			tl=exprentry();
			state._fsp--;

			adaptor.addChild(root_0, tl.getTree());


						checkNotVoid((tl!=null?((AliaChecker.exprentry_return)tl).type:null), (tl!=null?((CommonTree)tl.getTree()):null));
						retval.type = (tl!=null?((AliaChecker.exprentry_return)tl).type:null);
					
			// src\\alia\\AliaChecker.g:263:3: (t= exprentry )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= AND && LA15_0 <= BECOMES)||(LA15_0 >= CHAR_EXPR && LA15_0 <= COLON)||(LA15_0 >= COMPOUND && LA15_0 <= CONST)||LA15_0==DIV||LA15_0==EQ||LA15_0==FALSE||(LA15_0 >= GE && LA15_0 <= GT)||(LA15_0 >= IDENTIFIER && LA15_0 <= IF)||LA15_0==LE||(LA15_0 >= LT && LA15_0 <= MOD)||(LA15_0 >= NOT && LA15_0 <= PRINT)||LA15_0==READ||(LA15_0 >= TIMES && LA15_0 <= TRUE)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src\\alia\\AliaChecker.g:263:4: t= exprentry
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exprentry_in_exprlist1574);
					t=exprentry();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());


									checkNotVoid((t!=null?((AliaChecker.exprentry_return)t).type:null), (t!=null?((CommonTree)t.getTree()):null));
									retval.type = new _Void();
								
					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprlist"


	public static class exprentry_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprentry"
	// src\\alia\\AliaChecker.g:271:1: exprentry returns [_Type type] : t= expr -> TYPE[typename] expr ;
	public final AliaChecker.exprentry_return exprentry() throws RecognitionException {
		AliaChecker.exprentry_return retval = new AliaChecker.exprentry_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope t =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// src\\alia\\AliaChecker.g:272:2: (t= expr -> TYPE[typename] expr )
			// src\\alia\\AliaChecker.g:272:4: t= expr
			{
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_exprentry1601);
			t=expr();
			state._fsp--;

			stream_expr.add(t.getTree());

					retval.type = (t!=null?((AliaChecker.expr_return)t).type:null);
			      	String typename = String.valueOf((t!=null?((AliaChecker.expr_return)t).type:null));
				
			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 276:4: -> TYPE[typename] expr
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(TYPE, typename));
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprentry"


	public static class type_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// src\\alia\\AliaChecker.g:279:1: type returns [_Type type] : ( INT | CHAR | BOOL );
	public final AliaChecker.type_return type() throws RecognitionException {
		AliaChecker.type_return retval = new AliaChecker.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INT20=null;
		CommonTree CHAR21=null;
		CommonTree BOOL22=null;

		CommonTree INT20_tree=null;
		CommonTree CHAR21_tree=null;
		CommonTree BOOL22_tree=null;

		try {
			// src\\alia\\AliaChecker.g:280:5: ( INT | CHAR | BOOL )
			int alt16=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt16=1;
				}
				break;
			case CHAR:
				{
				alt16=2;
				}
				break;
			case BOOL:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// src\\alia\\AliaChecker.g:280:9: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INT20=(CommonTree)match(input,INT,FOLLOW_INT_in_type1631); 
					INT20_tree = (CommonTree)adaptor.dupNode(INT20);


					adaptor.addChild(root_0, INT20_tree);

					 retval.type = new _Int(); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:282:9: CHAR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					CHAR21=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type1651); 
					CHAR21_tree = (CommonTree)adaptor.dupNode(CHAR21);


					adaptor.addChild(root_0, CHAR21_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:284:9: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOOL22=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_type1671); 
					BOOL22_tree = (CommonTree)adaptor.dupNode(BOOL22);


					adaptor.addChild(root_0, BOOL22_tree);

					 retval.type = new _Bool(); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class primitive_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primitive"
	// src\\alia\\AliaChecker.g:288:1: primitive returns [_Type type] : ( NUMBER | CHAR_EXPR | boolean_expr );
	public final AliaChecker.primitive_return primitive() throws RecognitionException {
		AliaChecker.primitive_return retval = new AliaChecker.primitive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NUMBER23=null;
		CommonTree CHAR_EXPR24=null;
		TreeRuleReturnScope boolean_expr25 =null;

		CommonTree NUMBER23_tree=null;
		CommonTree CHAR_EXPR24_tree=null;

		try {
			// src\\alia\\AliaChecker.g:288:32: ( NUMBER | CHAR_EXPR | boolean_expr )
			int alt17=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt17=1;
				}
				break;
			case CHAR_EXPR:
				{
				alt17=2;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// src\\alia\\AliaChecker.g:289:7: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NUMBER23=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_primitive1709); 
					NUMBER23_tree = (CommonTree)adaptor.dupNode(NUMBER23);


					adaptor.addChild(root_0, NUMBER23_tree);

					retval.type = new _Int();
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:290:7: CHAR_EXPR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					CHAR_EXPR24=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_primitive1720); 
					CHAR_EXPR24_tree = (CommonTree)adaptor.dupNode(CHAR_EXPR24);


					adaptor.addChild(root_0, CHAR_EXPR24_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:292:7: boolean_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_boolean_expr_in_primitive1739);
					boolean_expr25=boolean_expr();
					state._fsp--;

					adaptor.addChild(root_0, boolean_expr25.getTree());

					 retval.type = new _Bool(); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitive"


	public static class boolean_expr_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// src\\alia\\AliaChecker.g:295:1: boolean_expr : ( TRUE | FALSE );
	public final AliaChecker.boolean_expr_return boolean_expr() throws RecognitionException {
		AliaChecker.boolean_expr_return retval = new AliaChecker.boolean_expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set26=null;

		CommonTree set26_tree=null;

		try {
			// src\\alia\\AliaChecker.g:295:14: ( TRUE | FALSE )
			// src\\alia\\AliaChecker.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set26=(CommonTree)input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				set26_tree = (CommonTree)adaptor.dupNode(set26);


				adaptor.addChild(root_0, set26_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		    	if(!e.getMessage().equals("")) {
					System.err.println("Exception!:"+e.getMessage());
				}
				throw (new AliaException(""));
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_expr"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program160 = new BitSet(new long[]{0x984FF784DA84CC72L});
	public static final BitSet FOLLOW_statement_in_statements205 = new BitSet(new long[]{0x984FF784DA84CC72L});
	public static final BitSet FOLLOW_WHILE_in_statement236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_statement242 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_statement254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_statement256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_expr328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr336 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr350 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr354 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr376 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr394 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr398 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr402 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr450 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr454 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr472 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr494 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr498 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr516 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr538 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr542 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr560 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr564 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr610 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr614 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr628 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr632 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr650 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr654 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr658 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr676 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr680 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr698 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_expr739 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_expr743 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_expr780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_OP_in_expr855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_OP_in_expr859 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr865 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr901 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr919 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr936 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr946 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_else_stmnt_in_expr972 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COLON_in_expr999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BECOMES_in_expr1002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1006 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr1010 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_type_in_expr1015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr1063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1067 = new BitSet(new long[]{0x184FF784DA84CC70L});
	public static final BitSet FOLLOW_expr_in_expr1071 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr1116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_in_expr1170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1174 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_expr1176 = new BitSet(new long[]{0x1000400002000400L});
	public static final BitSet FOLLOW_primitive_in_expr1180 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_COLON_in_expr1183 = new BitSet(new long[]{0x0000000100000300L});
	public static final BitSet FOLLOW_type_in_expr1187 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_else_stmnt1235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_else_stmnt1239 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_else_stmnt1245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_else_stmnt1260 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_else_stmnt_in_else_stmnt1275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_else_stmnt1294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_else_stmnt1309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_operand1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_varlist1519 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_identifier_in_varlist1528 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_exprentry_in_exprlist1563 = new BitSet(new long[]{0x184FF784DA84CC72L});
	public static final BitSet FOLLOW_exprentry_in_exprlist1574 = new BitSet(new long[]{0x184FF784DA84CC72L});
	public static final BitSet FOLLOW_expr_in_exprentry1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_primitive1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_primitive1720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_primitive1739 = new BitSet(new long[]{0x0000000000000002L});
}
