// $ANTLR 3.5.2 src\\alia\\AliaChecker.g 2014-06-24 16:40:45

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
	// src\\alia\\AliaChecker.g:43:1: statement returns [_Type type = new _Void()] : ( ^( WHILE t= expr DO statements END ) |t= expr );
	public final AliaChecker.statement_return statement() throws RecognitionException {
		AliaChecker.statement_return retval = new AliaChecker.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree WHILE3=null;
		CommonTree DO4=null;
		CommonTree END6=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope statements5 =null;

		CommonTree WHILE3_tree=null;
		CommonTree DO4_tree=null;
		CommonTree END6_tree=null;

		try {
			// src\\alia\\AliaChecker.g:44:5: ( ^( WHILE t= expr DO statements END ) |t= expr )
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
					// src\\alia\\AliaChecker.g:44:9: ^( WHILE t= expr DO statements END )
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
					pushFollow(FOLLOW_expr_in_statement197);
					t=expr();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					_last = (CommonTree)input.LT(1);
					DO4=(CommonTree)match(input,DO,FOLLOW_DO_in_statement199); 
					DO4_tree = (CommonTree)adaptor.dupNode(DO4);


					adaptor.addChild(root_1, DO4_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statements_in_statement201);
					statements5=statements();
					state._fsp--;

					adaptor.addChild(root_1, statements5.getTree());

					_last = (CommonTree)input.LT(1);
					END6=(CommonTree)match(input,END,FOLLOW_END_in_statement203); 
					END6_tree = (CommonTree)adaptor.dupNode(END6);


					adaptor.addChild(root_1, END6_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 checkBoolType((t!=null?((AliaChecker.expr_return)t).type:null)); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:46:9: t= expr
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_statement222);
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
	// src\\alia\\AliaChecker.g:50:1: expr returns [_Type type] : ( (t= expr_op |t= expr_comp |t= expr_math ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO !ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t= expr ) );
	public final AliaChecker.expr_return expr() throws RecognitionException {
		AliaChecker.expr_return retval = new AliaChecker.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree IF7=null;
		CommonTree ELSEIF8=null;
		CommonTree DO9=null;
		CommonTree ELSE10=null;
		CommonTree BECOMES11=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope ts =null;

		CommonTree id_tree=null;
		CommonTree IF7_tree=null;
		CommonTree ELSEIF8_tree=null;
		CommonTree DO9_tree=null;
		CommonTree ELSE10_tree=null;
		CommonTree BECOMES11_tree=null;

		try {
			// src\\alia\\AliaChecker.g:51:5: ( (t= expr_op |t= expr_comp |t= expr_math ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO !ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t= expr ) )
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
					// src\\alia\\AliaChecker.g:51:9: (t= expr_op |t= expr_comp |t= expr_math )
					{
					root_0 = (CommonTree)adaptor.nil();


					// src\\alia\\AliaChecker.g:51:9: (t= expr_op |t= expr_comp |t= expr_math )
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
							// src\\alia\\AliaChecker.g:51:10: t= expr_op
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_op_in_expr256);
							t=expr_op();
							state._fsp--;

							adaptor.addChild(root_0, t.getTree());

							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:52:9: t= expr_comp
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_comp_in_expr268);
							t=expr_comp();
							state._fsp--;

							adaptor.addChild(root_0, t.getTree());

							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:53:9: t= expr_math
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_math_in_expr280);
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
					// src\\alia\\AliaChecker.g:57:9: ^( IF t= expr ts= statements ( ELSEIF t= expr DO !ts= statements )* ( ELSE ts= statements )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IF7=(CommonTree)match(input,IF,FOLLOW_IF_in_expr299); 
					IF7_tree = (CommonTree)adaptor.dupNode(IF7);


					root_1 = (CommonTree)adaptor.becomeRoot(IF7_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr303);
					t=expr();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statements_in_expr307);
					ts=statements();
					state._fsp--;

					adaptor.addChild(root_1, ts.getTree());


						   			List<_Type> types = new ArrayList();
							   		types.add((ts!=null?((AliaChecker.statements_return)ts).type:null));
						   			checkBoolType((t!=null?((AliaChecker.expr_return)t).type:null));
						   		
					// src\\alia\\AliaChecker.g:63:7: ( ELSEIF t= expr DO !ts= statements )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ELSEIF) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src\\alia\\AliaChecker.g:63:8: ELSEIF t= expr DO !ts= statements
							{
							_last = (CommonTree)input.LT(1);
							ELSEIF8=(CommonTree)match(input,ELSEIF,FOLLOW_ELSEIF_in_expr324); 
							ELSEIF8_tree = (CommonTree)adaptor.dupNode(ELSEIF8);


							adaptor.addChild(root_1, ELSEIF8_tree);

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr328);
							t=expr();
							state._fsp--;

							adaptor.addChild(root_1, t.getTree());

							_last = (CommonTree)input.LT(1);
							DO9=(CommonTree)match(input,DO,FOLLOW_DO_in_expr330); 

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_expr335);
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

					// src\\alia\\AliaChecker.g:69:7: ( ELSE ts= statements )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ELSE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// src\\alia\\AliaChecker.g:69:8: ELSE ts= statements
							{
							_last = (CommonTree)input.LT(1);
							ELSE10=(CommonTree)match(input,ELSE,FOLLOW_ELSE_in_expr362); 
							ELSE10_tree = (CommonTree)adaptor.dupNode(ELSE10);


							adaptor.addChild(root_1, ELSE10_tree);

							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_statements_in_expr366);
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
					// src\\alia\\AliaChecker.g:80:9: ^( BECOMES id= IDENTIFIER t= expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BECOMES11=(CommonTree)match(input,BECOMES,FOLLOW_BECOMES_in_expr415); 
					BECOMES11_tree = (CommonTree)adaptor.dupNode(BECOMES11);


					root_1 = (CommonTree)adaptor.becomeRoot(BECOMES11_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr419); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr423);
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
	// src\\alia\\AliaChecker.g:87:1: expr_op returns [_Type type] : (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) ;
	public final AliaChecker.expr_op_return expr_op() throws RecognitionException {
		AliaChecker.expr_op_return retval = new AliaChecker.expr_op_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set12=null;
		TreeRuleReturnScope t =null;

		CommonTree set12_tree=null;

		try {
			// src\\alia\\AliaChecker.g:88:2: ( (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) )
			// src\\alia\\AliaChecker.g:88:6: (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:88:6: (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
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
					// src\\alia\\AliaChecker.g:88:7: t= operand
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr_op461);
					t=operand();
					state._fsp--;

					adaptor.addChild(root_0, t.getTree());

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:89:4: ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set12=(CommonTree)input.LT(1);
					if ( input.LA(1)==MINUS_OP||input.LA(1)==NOT||input.LA(1)==PLUS_OP ) {
						input.consume();
						set12_tree = (CommonTree)adaptor.dupNode(set12);


						root_1 = (CommonTree)adaptor.becomeRoot(set12_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr_op481);
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
	// src\\alia\\AliaChecker.g:92:1: expr_comp returns [_Type type] : ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) ;
	public final AliaChecker.expr_comp_return expr_comp() throws RecognitionException {
		AliaChecker.expr_comp_return retval = new AliaChecker.expr_comp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree OR13=null;
		CommonTree OR_ALT14=null;
		CommonTree AND15=null;
		CommonTree AND_ALT16=null;
		CommonTree EQ17=null;
		CommonTree NQ18=null;
		CommonTree LE19=null;
		CommonTree GE20=null;
		CommonTree GT21=null;
		CommonTree LT22=null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		CommonTree OR13_tree=null;
		CommonTree OR_ALT14_tree=null;
		CommonTree AND15_tree=null;
		CommonTree AND_ALT16_tree=null;
		CommonTree EQ17_tree=null;
		CommonTree NQ18_tree=null;
		CommonTree LE19_tree=null;
		CommonTree GE20_tree=null;
		CommonTree GT21_tree=null;
		CommonTree LT22_tree=null;

		try {
			// src\\alia\\AliaChecker.g:93:2: ( ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:93:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:93:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
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
					// src\\alia\\AliaChecker.g:93:7: ^( OR t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OR13=(CommonTree)match(input,OR,FOLLOW_OR_in_expr_comp504); 
					OR13_tree = (CommonTree)adaptor.dupNode(OR13);


					root_1 = (CommonTree)adaptor.becomeRoot(OR13_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp508);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp512);
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
					// src\\alia\\AliaChecker.g:94:9: ^( OR_ALT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OR_ALT14=(CommonTree)match(input,OR_ALT,FOLLOW_OR_ALT_in_expr_comp524); 
					OR_ALT14_tree = (CommonTree)adaptor.dupNode(OR_ALT14);


					root_1 = (CommonTree)adaptor.becomeRoot(OR_ALT14_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp528);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp532);
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
					// src\\alia\\AliaChecker.g:95:9: ^( AND t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AND15=(CommonTree)match(input,AND,FOLLOW_AND_in_expr_comp544); 
					AND15_tree = (CommonTree)adaptor.dupNode(AND15);


					root_1 = (CommonTree)adaptor.becomeRoot(AND15_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp548);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp552);
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
					// src\\alia\\AliaChecker.g:96:9: ^( AND_ALT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AND_ALT16=(CommonTree)match(input,AND_ALT,FOLLOW_AND_ALT_in_expr_comp564); 
					AND_ALT16_tree = (CommonTree)adaptor.dupNode(AND_ALT16);


					root_1 = (CommonTree)adaptor.becomeRoot(AND_ALT16_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp568);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp572);
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
					// src\\alia\\AliaChecker.g:97:9: ^( EQ t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQ17=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expr_comp584); 
					EQ17_tree = (CommonTree)adaptor.dupNode(EQ17);


					root_1 = (CommonTree)adaptor.becomeRoot(EQ17_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp588);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp592);
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
					// src\\alia\\AliaChecker.g:98:9: ^( NQ t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NQ18=(CommonTree)match(input,NQ,FOLLOW_NQ_in_expr_comp604); 
					NQ18_tree = (CommonTree)adaptor.dupNode(NQ18);


					root_1 = (CommonTree)adaptor.becomeRoot(NQ18_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp608);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp612);
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
					// src\\alia\\AliaChecker.g:99:9: ^( LE t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LE19=(CommonTree)match(input,LE,FOLLOW_LE_in_expr_comp624); 
					LE19_tree = (CommonTree)adaptor.dupNode(LE19);


					root_1 = (CommonTree)adaptor.becomeRoot(LE19_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp628);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp632);
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
					// src\\alia\\AliaChecker.g:100:9: ^( GE t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GE20=(CommonTree)match(input,GE,FOLLOW_GE_in_expr_comp644); 
					GE20_tree = (CommonTree)adaptor.dupNode(GE20);


					root_1 = (CommonTree)adaptor.becomeRoot(GE20_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp648);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp652);
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
					// src\\alia\\AliaChecker.g:101:9: ^( GT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GT21=(CommonTree)match(input,GT,FOLLOW_GT_in_expr_comp664); 
					GT21_tree = (CommonTree)adaptor.dupNode(GT21);


					root_1 = (CommonTree)adaptor.becomeRoot(GT21_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp668);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp672);
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
					// src\\alia\\AliaChecker.g:102:9: ^( LT t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LT22=(CommonTree)match(input,LT,FOLLOW_LT_in_expr_comp684); 
					LT22_tree = (CommonTree)adaptor.dupNode(LT22);


					root_1 = (CommonTree)adaptor.becomeRoot(LT22_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp688);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_comp692);
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
	// src\\alia\\AliaChecker.g:109:1: expr_math returns [_Type type] : ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) ;
	public final AliaChecker.expr_math_return expr_math() throws RecognitionException {
		AliaChecker.expr_math_return retval = new AliaChecker.expr_math_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PLUS23=null;
		CommonTree MINUS24=null;
		CommonTree TIMES25=null;
		CommonTree DIV26=null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		CommonTree PLUS23_tree=null;
		CommonTree MINUS24_tree=null;
		CommonTree TIMES25_tree=null;
		CommonTree DIV26_tree=null;

		try {
			// src\\alia\\AliaChecker.g:110:5: ( ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:110:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:110:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
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
					// src\\alia\\AliaChecker.g:110:10: ^( PLUS t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PLUS23=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr_math725); 
					PLUS23_tree = (CommonTree)adaptor.dupNode(PLUS23);


					root_1 = (CommonTree)adaptor.becomeRoot(PLUS23_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math729);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math733);
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
					// src\\alia\\AliaChecker.g:111:9: ^( MINUS t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUS24=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr_math745); 
					MINUS24_tree = (CommonTree)adaptor.dupNode(MINUS24);


					root_1 = (CommonTree)adaptor.becomeRoot(MINUS24_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math749);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math753);
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
					// src\\alia\\AliaChecker.g:112:9: ^( TIMES t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					TIMES25=(CommonTree)match(input,TIMES,FOLLOW_TIMES_in_expr_math765); 
					TIMES25_tree = (CommonTree)adaptor.dupNode(TIMES25);


					root_1 = (CommonTree)adaptor.becomeRoot(TIMES25_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math769);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math773);
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
					// src\\alia\\AliaChecker.g:113:9: ^( DIV t1= expr t2= expr )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DIV26=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr_math785); 
					DIV26_tree = (CommonTree)adaptor.dupNode(DIV26);


					root_1 = (CommonTree)adaptor.becomeRoot(DIV26_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math789);
					t1=expr();
					state._fsp--;

					adaptor.addChild(root_1, t1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr_math793);
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
	// src\\alia\\AliaChecker.g:119:1: operand returns [_Type type] : (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) );
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
			// src\\alia\\AliaChecker.g:120:5: (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) )
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
					// src\\alia\\AliaChecker.g:120:9: id= IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand825); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					adaptor.addChild(root_0, id_tree);

					 retval.type = getType((id!=null?id.getText():null));
					        	// TODO: In functions type inference should also be included here. Example function test(x) x = x + 1
					         
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:124:9: n= NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand848); 
					n_tree = (CommonTree)adaptor.dupNode(n);


					adaptor.addChild(root_0, n_tree);

					 retval.type = new _Int(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:126:9: c= LETTER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					c=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_operand868); 
					c_tree = (CommonTree)adaptor.dupNode(c);


					adaptor.addChild(root_0, c_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:128:9: b= ( TRUE | FALSE )
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
	// src\\alia\\AliaChecker.g:132:1: operand_special returns [_Type type] : ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) ) ;
	public final AliaChecker.operand_special_return operand_special() throws RecognitionException {
		AliaChecker.operand_special_return retval = new AliaChecker.operand_special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PRINT27=null;
		CommonTree READ28=null;
		TreeRuleReturnScope t =null;

		CommonTree PRINT27_tree=null;
		CommonTree READ28_tree=null;

		try {
			// src\\alia\\AliaChecker.g:133:5: ( ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) ) )
			// src\\alia\\AliaChecker.g:133:9: ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// src\\alia\\AliaChecker.g:133:9: ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) )
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
					// src\\alia\\AliaChecker.g:133:10: ^( PRINT t= exprlist )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PRINT27=(CommonTree)match(input,PRINT,FOLLOW_PRINT_in_operand_special925); 
					PRINT27_tree = (CommonTree)adaptor.dupNode(PRINT27);


					root_1 = (CommonTree)adaptor.becomeRoot(PRINT27_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exprlist_in_operand_special929);
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
					// src\\alia\\AliaChecker.g:135:7: ^( READ t= varlist )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					READ28=(CommonTree)match(input,READ,FOLLOW_READ_in_operand_special944); 
					READ28_tree = (CommonTree)adaptor.dupNode(READ28);


					root_1 = (CommonTree)adaptor.becomeRoot(READ28_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_varlist_in_operand_special948);
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
	// src\\alia\\AliaChecker.g:140:1: varlist returns [_Type type] : id= IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final AliaChecker.varlist_return varlist() throws RecognitionException {
		AliaChecker.varlist_return retval = new AliaChecker.varlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree COMMA29=null;
		CommonTree IDENTIFIER30=null;

		CommonTree id_tree=null;
		CommonTree COMMA29_tree=null;
		CommonTree IDENTIFIER30_tree=null;

		try {
			// src\\alia\\AliaChecker.g:141:2: (id= IDENTIFIER ( COMMA IDENTIFIER )* )
			// src\\alia\\AliaChecker.g:141:4: id= IDENTIFIER ( COMMA IDENTIFIER )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist972); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_0, id_tree);


						retval.type = getType((id!=null?id.getText():null));
					
			// src\\alia\\AliaChecker.g:145:3: ( COMMA IDENTIFIER )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src\\alia\\AliaChecker.g:145:4: COMMA IDENTIFIER
					{
					_last = (CommonTree)input.LT(1);
					COMMA29=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_varlist981); 
					COMMA29_tree = (CommonTree)adaptor.dupNode(COMMA29);


					adaptor.addChild(root_0, COMMA29_tree);

					_last = (CommonTree)input.LT(1);
					IDENTIFIER30=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist983); 
					IDENTIFIER30_tree = (CommonTree)adaptor.dupNode(IDENTIFIER30);


					adaptor.addChild(root_0, IDENTIFIER30_tree);


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
	// src\\alia\\AliaChecker.g:151:1: exprlist returns [_Type type] : t= expr ( COMMA t= expr )* ;
	public final AliaChecker.exprlist_return exprlist() throws RecognitionException {
		AliaChecker.exprlist_return retval = new AliaChecker.exprlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree COMMA31=null;
		TreeRuleReturnScope t =null;

		CommonTree COMMA31_tree=null;

		try {
			// src\\alia\\AliaChecker.g:152:5: (t= expr ( COMMA t= expr )* )
			// src\\alia\\AliaChecker.g:152:7: t= expr ( COMMA t= expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_exprlist1011);
			t=expr();
			state._fsp--;

			adaptor.addChild(root_0, t.getTree());


						checkNotVoid((t!=null?((AliaChecker.expr_return)t).type:null));
						retval.type = (t!=null?((AliaChecker.expr_return)t).type:null);
					
			// src\\alia\\AliaChecker.g:157:3: ( COMMA t= expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src\\alia\\AliaChecker.g:157:4: COMMA t= expr
					{
					_last = (CommonTree)input.LT(1);
					COMMA31=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_exprlist1020); 
					COMMA31_tree = (CommonTree)adaptor.dupNode(COMMA31);


					adaptor.addChild(root_0, COMMA31_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_exprlist1024);
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
	// src\\alia\\AliaChecker.g:165:1: type returns [_Type type] : ( INTEGER | CHAR | BOOL );
	public final AliaChecker.type_return type() throws RecognitionException {
		AliaChecker.type_return retval = new AliaChecker.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INTEGER32=null;
		CommonTree CHAR33=null;
		CommonTree BOOL34=null;

		CommonTree INTEGER32_tree=null;
		CommonTree CHAR33_tree=null;
		CommonTree BOOL34_tree=null;

		try {
			// src\\alia\\AliaChecker.g:166:5: ( INTEGER | CHAR | BOOL )
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
					// src\\alia\\AliaChecker.g:166:9: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTEGER32=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_type1054); 
					INTEGER32_tree = (CommonTree)adaptor.dupNode(INTEGER32);


					adaptor.addChild(root_0, INTEGER32_tree);

					 retval.type = new _Int(); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:168:9: CHAR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					CHAR33=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type1074); 
					CHAR33_tree = (CommonTree)adaptor.dupNode(CHAR33);


					adaptor.addChild(root_0, CHAR33_tree);

					 retval.type = new _Char(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:170:9: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOOL34=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_type1094); 
					BOOL34_tree = (CommonTree)adaptor.dupNode(BOOL34);


					adaptor.addChild(root_0, BOOL34_tree);

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
	public static final BitSet FOLLOW_expr_in_statement197 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_statement199 = new BitSet(new long[]{0x00580FE737AC4070L});
	public static final BitSet FOLLOW_statements_in_statement201 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_statement203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_op_in_expr256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_math_in_expr280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x00580FE737AB4078L});
	public static final BitSet FOLLOW_statements_in_expr307 = new BitSet(new long[]{0x0000000000030008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr324 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_expr330 = new BitSet(new long[]{0x00580FE737AB4078L});
	public static final BitSet FOLLOW_statements_in_expr335 = new BitSet(new long[]{0x0000000000030008L});
	public static final BitSet FOLLOW_ELSE_in_expr362 = new BitSet(new long[]{0x00580FE737A84078L});
	public static final BitSet FOLLOW_statements_in_expr366 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr419 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_op461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr_op467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr_op481 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr_comp504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp508 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr_comp524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp528 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp532 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr_comp544 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp548 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp552 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr_comp564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp568 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr_comp584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp588 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr_comp604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp608 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr_comp624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp628 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp632 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr_comp644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp648 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr_comp664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp668 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp672 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr_comp684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp688 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_comp692 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr_math725 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math729 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_math745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math749 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math753 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr_math765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math769 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math773 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr_math785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math789 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_expr_math793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_operand868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_operand_special925 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_operand_special929 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_operand_special944 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_operand_special948 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist972 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_varlist981 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist983 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expr_in_exprlist1011 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1020 = new BitSet(new long[]{0x00180FE737A84070L});
	public static final BitSet FOLLOW_expr_in_exprlist1024 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INTEGER_in_type1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1094 = new BitSet(new long[]{0x0000000000000002L});
}
