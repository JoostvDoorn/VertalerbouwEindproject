// $ANTLR 3.5.2 src\\alia\\AliaChecker.g 2014-06-24 16:15:45

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
public class AliaChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ALT", "BECOMES", "BOOL", 
		"CHAR", "COLON", "COMMA", "COMMENT", "DEF", "DIGIT", "DIV", "DO", "ELSE", 
		"ELSEIF", "END", "EQ", "EXPR_LIST", "FALSE", "FUNC", "GE", "GT", "IDENTIFIER", 
		"IF", "INT", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", 
		"MOD", "NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", 
		"PRINT", "PROGRAM", "READ", "RPAREN", "SEMICOLON", "SQUOTE", "STRING", 
		"TIMES", "TRUE", "UPPER", "WHILE", "WS", "INTEGER"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int AND_ALT=5;
	public static final int BECOMES=6;
	public static final int BOOL=7;
	public static final int CHAR=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int DEF=12;
	public static final int DIGIT=13;
	public static final int DIV=14;
	public static final int DO=15;
	public static final int ELSE=16;
	public static final int ELSEIF=17;
	public static final int END=18;
	public static final int EQ=19;
	public static final int EXPR_LIST=20;
	public static final int FALSE=21;
	public static final int FUNC=22;
	public static final int GE=23;
	public static final int GT=24;
	public static final int IDENTIFIER=25;
	public static final int IF=26;
	public static final int INT=27;
	public static final int LE=28;
	public static final int LETTER=29;
	public static final int LOWER=30;
	public static final int LPAREN=31;
	public static final int LT=32;
	public static final int MINUS=33;
	public static final int MINUS_OP=34;
	public static final int MOD=35;
	public static final int NEWLINE=36;
	public static final int NOT=37;
	public static final int NQ=38;
	public static final int NUMBER=39;
	public static final int OR=40;
	public static final int OR_ALT=41;
	public static final int PLUS=42;
	public static final int PLUS_OP=43;
	public static final int PRINT=44;
	public static final int PROGRAM=45;
	public static final int READ=46;
	public static final int RPAREN=47;
	public static final int SEMICOLON=48;
	public static final int SQUOTE=49;
	public static final int STRING=50;
	public static final int TIMES=51;
	public static final int TRUE=52;
	public static final int UPPER=53;
	public static final int WHILE=54;
	public static final int WS=55;
	public static final int INTEGER=56;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
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


	    // idset - a set of declared identifiers.
	    private Set<String> idset = new HashSet<String>();   
	    
	    public boolean  isDeclared(String s)     { return idset.contains(s); }
	    public void     declare(String s)        { idset.add(s);             }


	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src\\alia\\AliaChecker.g:34:1: program : ^( PROGRAM ( statement )+ ) ;
	public final AliaChecker.program_return program() throws RecognitionException {
		AliaChecker.program_return retval = new AliaChecker.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PROGRAM1=null;
		TreeRuleReturnScope statement2 =null;

		CommonTree PROGRAM1_tree=null;

		try {
			// src\\alia\\AliaChecker.g:35:5: ( ^( PROGRAM ( statement )+ ) )
			// src\\alia\\AliaChecker.g:35:9: ^( PROGRAM ( statement )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			PROGRAM1=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program135); 
			PROGRAM1_tree = (CommonTree)adaptor.dupNode(PROGRAM1);


			root_1 = (CommonTree)adaptor.becomeRoot(PROGRAM1_tree, root_1);

			match(input, Token.DOWN, null); 
			// src\\alia\\AliaChecker.g:35:19: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= BECOMES)||LA1_0==DIV||LA1_0==EQ||LA1_0==FALSE||(LA1_0 >= GE && LA1_0 <= IF)||(LA1_0 >= LE && LA1_0 <= LETTER)||(LA1_0 >= LT && LA1_0 <= MINUS_OP)||(LA1_0 >= NOT && LA1_0 <= PLUS_OP)||(LA1_0 >= TIMES && LA1_0 <= TRUE)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaChecker.g:35:20: statement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_program138);
					statement2=statement();
					state._fsp--;

					adaptor.addChild(root_1, statement2.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
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
	// src\\alia\\AliaChecker.g:38:1: statements returns [_Type type = new _Void()] : (t= statement )* ;
	public final AliaChecker.statements_return statements() throws RecognitionException {
		AliaChecker.statements_return retval = new AliaChecker.statements_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope t =null;


		try {
			// src\\alia\\AliaChecker.g:39:2: ( (t= statement )* )
			// src\\alia\\AliaChecker.g:39:4: (t= statement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:39:4: (t= statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= IF)||(LA2_0 >= LE && LA2_0 <= LETTER)||(LA2_0 >= LT && LA2_0 <= MINUS_OP)||(LA2_0 >= NOT && LA2_0 <= PLUS_OP)||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaChecker.g:39:5: t= statement
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_statements162);
					t=statement();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());

					 retval.type = new _Void();
							//TODO: Fix for statement that is an expression
							 
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
		        throw e; 
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
	// src\\alia\\AliaChecker.g:45:1: statement returns [_Type type = new _Void()] : ( ^( WHILE expr DO statements END ) |t= expr );
	public final AliaChecker.statement_return statement() throws RecognitionException {
		AliaChecker.statement_return retval = new AliaChecker.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree WHILE3=null;
		CommonTree DO5=null;
		CommonTree END7=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope expr4 =null;
		TreeRuleReturnScope statements6 =null;

		CommonTree WHILE3_tree=null;
		CommonTree DO5_tree=null;
		CommonTree END7_tree=null;

		try {
			// src\\alia\\AliaChecker.g:46:5: ( ^( WHILE expr DO statements END ) |t= expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= IF)||(LA3_0 >= LE && LA3_0 <= LETTER)||(LA3_0 >= LT && LA3_0 <= MINUS_OP)||(LA3_0 >= NOT && LA3_0 <= PLUS_OP)||(LA3_0 >= TIMES && LA3_0 <= TRUE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src\\alia\\AliaChecker.g:46:9: ^( WHILE expr DO statements END )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					WHILE3=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_statement193); 
					WHILE3_tree = (CommonTree)adaptor.dupNode(WHILE3);


					root_1 = (CommonTree)adaptor.becomeRoot(WHILE3_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_statement195);
					expr4=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr4.getTree());

					_last = (CommonTree)input.LT(1);
					DO5=(CommonTree)match(input,DO,FOLLOW_DO_in_statement197); 
					DO5_tree = (CommonTree)adaptor.dupNode(DO5);


					adaptor.addChild(root_1, DO5_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statements_in_statement199);
					statements6=statements();
					state._fsp--;

					adaptor.addChild(root_1, statements6.getTree());

					_last = (CommonTree)input.LT(1);
					END7=(CommonTree)match(input,END,FOLLOW_END_in_statement201); 
					END7_tree = (CommonTree)adaptor.dupNode(END7);


					adaptor.addChild(root_1, END7_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:48:9: t= expr
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_statement220);
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
		        throw e; 
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
	// src\\alia\\AliaChecker.g:52:1: expr returns [_Type type] : ( (t= expr_op |t= expr_comp |t= expr_math ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO !ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t= expr ) );
	public final AliaChecker.expr_return expr() throws RecognitionException {
		AliaChecker.expr_return retval = new AliaChecker.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree IF8=null;
		CommonTree ELSEIF9=null;
		CommonTree DO10=null;
		CommonTree ELSE11=null;
		CommonTree BECOMES12=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope ts =null;

		CommonTree id_tree=null;
		CommonTree IF8_tree=null;
		CommonTree ELSEIF9_tree=null;
		CommonTree DO10_tree=null;
		CommonTree ELSE11_tree=null;
		CommonTree BECOMES12_tree=null;

		try {
			// src\\alia\\AliaChecker.g:53:5: ( (t= expr_op |t= expr_comp |t= expr_math ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO !ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t= expr ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case AND:
			case AND_ALT:
			case DIV:
			case EQ:
			case FALSE:
			case GE:
			case GT:
			case IDENTIFIER:
			case LE:
			case LETTER:
			case LT:
			case MINUS:
			case MINUS_OP:
			case NOT:
			case NQ:
			case NUMBER:
			case OR:
			case OR_ALT:
			case PLUS:
			case PLUS_OP:
			case TIMES:
			case TRUE:
				{
				alt7=1;
				}
				break;
			case IF:
				{
				alt7=2;
				}
				break;
			case BECOMES:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src\\alia\\AliaChecker.g:53:9: (t= expr_op |t= expr_comp |t= expr_math )
					{
					root_0 = (CommonTree)adaptor.nil();


					// src\\alia\\AliaChecker.g:53:9: (t= expr_op |t= expr_comp |t= expr_math )
					int alt4=3;
					switch ( input.LA(1) ) {
					case FALSE:
					case IDENTIFIER:
					case LETTER:
					case MINUS_OP:
					case NOT:
					case NUMBER:
					case PLUS_OP:
					case TRUE:
						{
						alt4=1;
						}
						break;
					case AND:
					case AND_ALT:
					case EQ:
					case GE:
					case GT:
					case LE:
					case LT:
					case NQ:
					case OR:
					case OR_ALT:
						{
						alt4=2;
						}
						break;
					case DIV:
					case MINUS:
					case PLUS:
					case TIMES:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// src\\alia\\AliaChecker.g:53:10: t= expr_op
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_op_in_expr254);
							t=expr_op();
							state._fsp--;

							adaptor.addChild(root_0, t.getTree());

							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:54:9: t= expr_comp
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_comp_in_expr266);
							t=expr_comp();
							state._fsp--;

							adaptor.addChild(root_0, t.getTree());

							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:55:9: t= expr_math
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_math_in_expr278);
							t=expr_math();
							state._fsp--;

							adaptor.addChild(root_0, t.getTree());

							}
							break;

					}


					    		retval.type = (t!=null?((AliaChecker.expr_return)t).type:null);
					        
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:59:9: ^( IF t= expr ts= statements ( ELSEIF t= expr DO !ts= statements )* ( ELSE ts= statements )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IF8=(CommonTree)match(input,IF,FOLLOW_IF_in_expr297); 
					IF8_tree = (CommonTree)adaptor.dupNode(IF8);


					root_1 = (CommonTree)adaptor.becomeRoot(IF8_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr301);
					t=expr();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statements_in_expr305);
					ts=statements();
					state._fsp--;

					adaptor.addChild(root_1, ts.getTree());


						   			List<_Type> types = new ArrayList();
							   		types.add((ts!=null?((AliaChecker.statements_return)ts).type:null));
						   			checkBoolType((t!=null?((AliaChecker.expr_return)t).type:null));
						   		
					// src\\alia\\AliaChecker.g:65:7: ( ELSEIF t= expr DO !ts= statements )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ELSEIF) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src\\alia\\AliaChecker.g:65:8: ELSEIF t= expr DO !ts= statements
							{
							_last = (CommonTree)input.LT(1);
							ELSEIF9=(CommonTree)match(input,ELSEIF,FOLLOW_ELSEIF_in_expr322); 
							ELSEIF9_tree = (CommonTree)adaptor.dupNode(ELSEIF9);


							adaptor.addChild(root_1, ELSEIF9_tree);

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr326);
							t=expr();
							state._fsp--;

							adaptor.addChild(root_1, t.getTree());

							_last = (CommonTree)input.LT(1);
							DO10=(CommonTree)match(input,DO,FOLLOW_DO_in_expr328); 

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_expr333);
							ts=statements();
							state._fsp--;

							adaptor.addChild(root_1, ts.getTree());


									   			types.add((ts!=null?((AliaChecker.statements_return)ts).type:null));
									   			checkBoolType((t!=null?((AliaChecker.expr_return)t).type:null));
									   		
							}
							break;

						default :
							break loop5;
						}
					}

					// src\\alia\\AliaChecker.g:71:7: ( ELSE ts= statements )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ELSE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// src\\alia\\AliaChecker.g:71:8: ELSE ts= statements
							{
							_last = (CommonTree)input.LT(1);
							ELSE11=(CommonTree)match(input,ELSE,FOLLOW_ELSE_in_expr360); 
							ELSE11_tree = (CommonTree)adaptor.dupNode(ELSE11);


							adaptor.addChild(root_1, ELSE11_tree);

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_expr364);
							ts=statements();
							state._fsp--;

							adaptor.addChild(root_1, ts.getTree());


									   			types.add((ts!=null?((AliaChecker.statements_return)ts).type:null));
									   		
							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					   			checkBoolType((t!=null?((AliaChecker.expr_return)t).type:null));
					   			retval.type = checkTypesIf($types.type);
					   		
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:82:9: ^( BECOMES id= IDENTIFIER t= expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BECOMES12=(CommonTree)match(input,BECOMES,FOLLOW_BECOMES_in_expr413); 
					BECOMES12_tree = (CommonTree)adaptor.dupNode(BECOMES12);


					root_1 = (CommonTree)adaptor.becomeRoot(BECOMES12_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr417); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr421);
					t=expr();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					   
					        	declare((id!=null?id.getText():null), (t!=null?((AliaChecker.expr_return)t).type:null));
					    		retval.type = (t!=null?((AliaChecker.expr_return)t).type:null);
					        
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_op_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_op"
	// src\\alia\\AliaChecker.g:89:1: expr_op returns [_Type type] : (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) ;
	public final AliaChecker.expr_op_return expr_op() throws RecognitionException {
		AliaChecker.expr_op_return retval = new AliaChecker.expr_op_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set13=null;
		TreeRuleReturnScope t =null;

		CommonTree set13_tree=null;

		try {
			// src\\alia\\AliaChecker.g:90:2: ( (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) )
			// src\\alia\\AliaChecker.g:90:6: (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:90:6: (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==FALSE||LA8_0==IDENTIFIER||LA8_0==LETTER||LA8_0==NUMBER||LA8_0==TRUE) ) {
				alt8=1;
			}
			else if ( (LA8_0==MINUS_OP||LA8_0==NOT||LA8_0==PLUS_OP) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src\\alia\\AliaChecker.g:90:7: t= operand
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr_op459);
					t=operand();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:91:4: ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set13=(CommonTree)input.LT(1);
					if ( input.LA(1)==MINUS_OP||input.LA(1)==NOT||input.LA(1)==PLUS_OP ) {
						input.consume();
						set13_tree = (CommonTree)adaptor.dupNode(set13);


						root_1 = (CommonTree)adaptor.becomeRoot(set13_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr_op479);
					t=operand();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}

			 retval.type = (t!=null?((AliaChecker.operand_return)t).type:null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_op"


	public static class expr_comp_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_comp"
	// src\\alia\\AliaChecker.g:94:1: expr_comp returns [_Type type] : ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) ;
	public final AliaChecker.expr_comp_return expr_comp() throws RecognitionException {
		AliaChecker.expr_comp_return retval = new AliaChecker.expr_comp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree OR14=null;
		CommonTree OR_ALT15=null;
		CommonTree AND16=null;
		CommonTree AND_ALT17=null;
		CommonTree EQ18=null;
		CommonTree NQ19=null;
		CommonTree LE20=null;
		CommonTree GE21=null;
		CommonTree GT22=null;
		CommonTree LT23=null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		CommonTree OR14_tree=null;
		CommonTree OR_ALT15_tree=null;
		CommonTree AND16_tree=null;
		CommonTree AND_ALT17_tree=null;
		CommonTree EQ18_tree=null;
		CommonTree NQ19_tree=null;
		CommonTree LE20_tree=null;
		CommonTree GE21_tree=null;
		CommonTree GT22_tree=null;
		CommonTree LT23_tree=null;

		try {
			// src\\alia\\AliaChecker.g:95:2: ( ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:95:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:95:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
			int alt9=10;
			switch ( input.LA(1) ) {
			case OR:
				{
				alt9=1;
				}
				break;
			case OR_ALT:
				{
				alt9=2;
				}
				break;
			case AND:
				{
				alt9=3;
				}
				break;
			case AND_ALT:
				{
				alt9=4;
				}
				break;
			case EQ:
				{
				alt9=5;
				}
				break;
			case NQ:
				{
				alt9=6;
				}
				break;
			case LE:
				{
				alt9=7;
				}
				break;
			case GE:
				{
				alt9=8;
				}
				break;
			case GT:
				{
				alt9=9;
				}
				break;
			case LT:
				{
				alt9=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src\\alia\\AliaChecker.g:95:7: ^( OR t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OR14=(CommonTree)match(input,OR,FOLLOW_OR_in_expr_comp502); 
					OR14_tree = (CommonTree)adaptor.dupNode(OR14);


					root_1 = (CommonTree)adaptor.becomeRoot(OR14_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp506);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp510);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:96:9: ^( OR_ALT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OR_ALT15=(CommonTree)match(input,OR_ALT,FOLLOW_OR_ALT_in_expr_comp522); 
					OR_ALT15_tree = (CommonTree)adaptor.dupNode(OR_ALT15);


					root_1 = (CommonTree)adaptor.becomeRoot(OR_ALT15_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp526);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp530);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:97:9: ^( AND t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AND16=(CommonTree)match(input,AND,FOLLOW_AND_in_expr_comp542); 
					AND16_tree = (CommonTree)adaptor.dupNode(AND16);


					root_1 = (CommonTree)adaptor.becomeRoot(AND16_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp546);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp550);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:98:9: ^( AND_ALT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AND_ALT17=(CommonTree)match(input,AND_ALT,FOLLOW_AND_ALT_in_expr_comp562); 
					AND_ALT17_tree = (CommonTree)adaptor.dupNode(AND_ALT17);


					root_1 = (CommonTree)adaptor.becomeRoot(AND_ALT17_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp566);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp570);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// src\\alia\\AliaChecker.g:99:9: ^( EQ t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQ18=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expr_comp582); 
					EQ18_tree = (CommonTree)adaptor.dupNode(EQ18);


					root_1 = (CommonTree)adaptor.becomeRoot(EQ18_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp586);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp590);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// src\\alia\\AliaChecker.g:100:9: ^( NQ t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NQ19=(CommonTree)match(input,NQ,FOLLOW_NQ_in_expr_comp602); 
					NQ19_tree = (CommonTree)adaptor.dupNode(NQ19);


					root_1 = (CommonTree)adaptor.becomeRoot(NQ19_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp606);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp610);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 7 :
					// src\\alia\\AliaChecker.g:101:9: ^( LE t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LE20=(CommonTree)match(input,LE,FOLLOW_LE_in_expr_comp622); 
					LE20_tree = (CommonTree)adaptor.dupNode(LE20);


					root_1 = (CommonTree)adaptor.becomeRoot(LE20_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp626);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp630);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 8 :
					// src\\alia\\AliaChecker.g:102:9: ^( GE t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GE21=(CommonTree)match(input,GE,FOLLOW_GE_in_expr_comp642); 
					GE21_tree = (CommonTree)adaptor.dupNode(GE21);


					root_1 = (CommonTree)adaptor.becomeRoot(GE21_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp646);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp650);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 9 :
					// src\\alia\\AliaChecker.g:103:9: ^( GT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GT22=(CommonTree)match(input,GT,FOLLOW_GT_in_expr_comp662); 
					GT22_tree = (CommonTree)adaptor.dupNode(GT22);


					root_1 = (CommonTree)adaptor.becomeRoot(GT22_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp666);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp670);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 10 :
					// src\\alia\\AliaChecker.g:104:9: ^( LT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LT23=(CommonTree)match(input,LT,FOLLOW_LT_in_expr_comp682); 
					LT23_tree = (CommonTree)adaptor.dupNode(LT23);


					root_1 = (CommonTree)adaptor.becomeRoot(LT23_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp686);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp690);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}


			   	  checkEqualType((t1!=null?((AliaChecker.expr_return)t1).type:null), (t2!=null?((AliaChecker.expr_return)t2).type:null));
			   	  retval.type = (t1!=null?((AliaChecker.expr_return)t1).type:null);
			   	
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_comp"


	public static class expr_math_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_math"
	// src\\alia\\AliaChecker.g:111:1: expr_math returns [_Type type] : ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) ;
	public final AliaChecker.expr_math_return expr_math() throws RecognitionException {
		AliaChecker.expr_math_return retval = new AliaChecker.expr_math_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PLUS24=null;
		CommonTree MINUS25=null;
		CommonTree TIMES26=null;
		CommonTree DIV27=null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		CommonTree PLUS24_tree=null;
		CommonTree MINUS25_tree=null;
		CommonTree TIMES26_tree=null;
		CommonTree DIV27_tree=null;

		try {
			// src\\alia\\AliaChecker.g:112:5: ( ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:112:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:112:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
			int alt10=4;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt10=1;
				}
				break;
			case MINUS:
				{
				alt10=2;
				}
				break;
			case TIMES:
				{
				alt10=3;
				}
				break;
			case DIV:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src\\alia\\AliaChecker.g:112:10: ^( PLUS t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PLUS24=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr_math723); 
					PLUS24_tree = (CommonTree)adaptor.dupNode(PLUS24);


					root_1 = (CommonTree)adaptor.becomeRoot(PLUS24_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math727);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math731);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:113:9: ^( MINUS t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUS25=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr_math743); 
					MINUS25_tree = (CommonTree)adaptor.dupNode(MINUS25);


					root_1 = (CommonTree)adaptor.becomeRoot(MINUS25_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math747);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math751);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:114:9: ^( TIMES t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					TIMES26=(CommonTree)match(input,TIMES,FOLLOW_TIMES_in_expr_math763); 
					TIMES26_tree = (CommonTree)adaptor.dupNode(TIMES26);


					root_1 = (CommonTree)adaptor.becomeRoot(TIMES26_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math767);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math771);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:115:9: ^( DIV t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DIV27=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr_math783); 
					DIV27_tree = (CommonTree)adaptor.dupNode(DIV27);


					root_1 = (CommonTree)adaptor.becomeRoot(DIV27_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math787);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math791);
					t2=expr();
					state._fsp--;

					adaptor.addChild(root_1, t2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}

			 
			    	checkMathType((t1!=null?((AliaChecker.expr_return)t1).type:null), (t2!=null?((AliaChecker.expr_return)t2).type:null));
			    	retval.type = new _Int();
			    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_math"


	public static class operand_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src\\alia\\AliaChecker.g:121:1: operand returns [_Type type] : (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) );
	public final AliaChecker.operand_return operand() throws RecognitionException {
		AliaChecker.operand_return retval = new AliaChecker.operand_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;

		CommonTree id_tree=null;
		CommonTree n_tree=null;
		CommonTree c_tree=null;
		CommonTree b_tree=null;

		try {
			// src\\alia\\AliaChecker.g:122:5: (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) )
			int alt11=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt11=1;
				}
				break;
			case NUMBER:
				{
				alt11=2;
				}
				break;
			case LETTER:
				{
				alt11=3;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// src\\alia\\AliaChecker.g:122:9: id= IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand823); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					adaptor.addChild(root_0, id_tree);

					 retval.type = getType((id!=null?id.getText():null));
					        	// TODO: In functions type inference should also be included here. Example function test(x) x = x + 1
					         
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:126:9: n= NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand846); 
					n_tree = (CommonTree)adaptor.dupNode(n);


					adaptor.addChild(root_0, n_tree);

					 retval.type = new _Int(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:128:9: c= LETTER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					c=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_operand866); 
					c_tree = (CommonTree)adaptor.dupNode(c);


					adaptor.addChild(root_0, c_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:130:9: b= ( TRUE | FALSE )
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
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class operand_special_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operand_special"
	// src\\alia\\AliaChecker.g:134:1: operand_special returns [_Type type] : ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) ) ;
	public final AliaChecker.operand_special_return operand_special() throws RecognitionException {
		AliaChecker.operand_special_return retval = new AliaChecker.operand_special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PRINT28=null;
		CommonTree READ29=null;
		TreeRuleReturnScope t =null;

		CommonTree PRINT28_tree=null;
		CommonTree READ29_tree=null;

		try {
			// src\\alia\\AliaChecker.g:135:5: ( ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) ) )
			// src\\alia\\AliaChecker.g:135:9: ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:135:9: ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==PRINT) ) {
				alt12=1;
			}
			else if ( (LA12_0==READ) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src\\alia\\AliaChecker.g:135:10: ^( PRINT t= exprlist )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PRINT28=(CommonTree)match(input,PRINT,FOLLOW_PRINT_in_operand_special923); 
					PRINT28_tree = (CommonTree)adaptor.dupNode(PRINT28);


					root_1 = (CommonTree)adaptor.becomeRoot(PRINT28_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exprlist_in_operand_special927);
					t=exprlist();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:137:7: ^( READ t= varlist )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					READ29=(CommonTree)match(input,READ,FOLLOW_READ_in_operand_special942); 
					READ29_tree = (CommonTree)adaptor.dupNode(READ29);


					root_1 = (CommonTree)adaptor.becomeRoot(READ29_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_varlist_in_operand_special946);
					t=varlist();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}


			    	retval.type = (t!=null?((AliaChecker.varlist_return)t).type:null);
			    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand_special"


	public static class varlist_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varlist"
	// src\\alia\\AliaChecker.g:142:1: varlist returns [_Type type] : id= IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final AliaChecker.varlist_return varlist() throws RecognitionException {
		AliaChecker.varlist_return retval = new AliaChecker.varlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree COMMA30=null;
		CommonTree IDENTIFIER31=null;

		CommonTree id_tree=null;
		CommonTree COMMA30_tree=null;
		CommonTree IDENTIFIER31_tree=null;

		try {
			// src\\alia\\AliaChecker.g:143:2: (id= IDENTIFIER ( COMMA IDENTIFIER )* )
			// src\\alia\\AliaChecker.g:143:4: id= IDENTIFIER ( COMMA IDENTIFIER )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist970); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_0, id_tree);


						retval.type = getType((id!=null?id.getText():null));
					
			// src\\alia\\AliaChecker.g:147:3: ( COMMA IDENTIFIER )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src\\alia\\AliaChecker.g:147:4: COMMA IDENTIFIER
					{
					_last = (CommonTree)input.LT(1);
					COMMA30=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_varlist979); 
					COMMA30_tree = (CommonTree)adaptor.dupNode(COMMA30);


					adaptor.addChild(root_0, COMMA30_tree);

					_last = (CommonTree)input.LT(1);
					IDENTIFIER31=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist981); 
					IDENTIFIER31_tree = (CommonTree)adaptor.dupNode(IDENTIFIER31);


					adaptor.addChild(root_0, IDENTIFIER31_tree);


									retval.type = new _Void();
								
					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
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
	// src\\alia\\AliaChecker.g:153:1: exprlist returns [_Type type] : t= expr ( COMMA t= expr )* ;
	public final AliaChecker.exprlist_return exprlist() throws RecognitionException {
		AliaChecker.exprlist_return retval = new AliaChecker.exprlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree COMMA32=null;
		TreeRuleReturnScope t =null;

		CommonTree COMMA32_tree=null;

		try {
			// src\\alia\\AliaChecker.g:154:5: (t= expr ( COMMA t= expr )* )
			// src\\alia\\AliaChecker.g:154:7: t= expr ( COMMA t= expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_exprlist1009);
			t=expr();
			state._fsp--;

			adaptor.addChild(root_0, t.getTree());


						checkNotVoid((t!=null?((AliaChecker.expr_return)t).type:null));
						retval.type = (t!=null?((AliaChecker.expr_return)t).type:null);
					
			// src\\alia\\AliaChecker.g:159:3: ( COMMA t= expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src\\alia\\AliaChecker.g:159:4: COMMA t= expr
					{
					_last = (CommonTree)input.LT(1);
					COMMA32=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_exprlist1018); 
					COMMA32_tree = (CommonTree)adaptor.dupNode(COMMA32);


					adaptor.addChild(root_0, COMMA32_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_exprlist1022);
					t=expr();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());


									checkNotVoid((t!=null?((AliaChecker.expr_return)t).type:null));
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
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprlist"


	public static class type_return extends TreeRuleReturnScope {
		public _Type type;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// src\\alia\\AliaChecker.g:167:1: type returns [_Type type] : ( INTEGER | CHAR | BOOL );
	public final AliaChecker.type_return type() throws RecognitionException {
		AliaChecker.type_return retval = new AliaChecker.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INTEGER33=null;
		CommonTree CHAR34=null;
		CommonTree BOOL35=null;

		CommonTree INTEGER33_tree=null;
		CommonTree CHAR34_tree=null;
		CommonTree BOOL35_tree=null;

		try {
			// src\\alia\\AliaChecker.g:168:5: ( INTEGER | CHAR | BOOL )
			int alt15=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt15=1;
				}
				break;
			case CHAR:
				{
				alt15=2;
				}
				break;
			case BOOL:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// src\\alia\\AliaChecker.g:168:9: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTEGER33=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_type1052); 
					INTEGER33_tree = (CommonTree)adaptor.dupNode(INTEGER33);


					adaptor.addChild(root_0, INTEGER33_tree);

					 retval.type = new _Int(); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:170:9: CHAR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					CHAR34=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type1072); 
					CHAR34_tree = (CommonTree)adaptor.dupNode(CHAR34);


					adaptor.addChild(root_0, CHAR34_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:172:9: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOOL35=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_type1092); 
					BOOL35_tree = (CommonTree)adaptor.dupNode(BOOL35);


					adaptor.addChild(root_0, BOOL35_tree);

					 retval.type = new _Bool(); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program138 = new BitSet(new long[]{0x00580FE737A84078L});
	public static final BitSet FOLLOW_statement_in_statements162 = new BitSet(new long[]{0x00580FE737A84072L});
	public static final BitSet FOLLOW_WHILE_in_statement193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement195 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_statement197 = new BitSet(new long[]{0x00580FE737AC4070L});
	public static final BitSet FOLLOW_statements_in_statement199 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_statement201 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_op_in_expr254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_math_in_expr278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr297 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr301 = new BitSet(new long[]{0x00580FE737AB4078L});
	public static final BitSet FOLLOW_statements_in_expr305 = new BitSet(new long[]{0x0000000000030008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr322 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr326 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_expr328 = new BitSet(new long[]{0x00580FE737AB4078L});
	public static final BitSet FOLLOW_statements_in_expr333 = new BitSet(new long[]{0x0000000000030008L});
	public static final BitSet FOLLOW_ELSE_in_expr360 = new BitSet(new long[]{0x00580FE737A84078L});
	public static final BitSet FOLLOW_statements_in_expr364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr417 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr421 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_op459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr_op465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr_op479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr_comp502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp506 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp510 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr_comp522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp526 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr_comp542 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp546 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr_comp562 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp566 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr_comp582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp586 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr_comp602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp606 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr_comp622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp626 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr_comp642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp646 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr_comp662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp666 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr_comp682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp686 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr_math723 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math727 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_math743 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math747 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr_math763 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math767 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math771 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr_math783 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math787 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math791 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_operand866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_operand_special923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_operand_special927 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_operand_special942 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_operand_special946 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist970 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_varlist979 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist981 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expr_in_exprlist1009 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1018 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_exprlist1022 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INTEGER_in_type1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1092 = new BitSet(new long[]{0x0000000000000002L});
}
