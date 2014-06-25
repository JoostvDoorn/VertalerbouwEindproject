// $ANTLR 3.5.2 src\\alia\\AliaChecker.g 2014-06-25 11:02:04

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
		"DEF", "DIGIT", "DIV", "DO", "ELSE", "ELSEIF", "END", "EQ", "EXPR_LIST", 
		"FALSE", "FUNC", "GE", "GT", "IDENTIFIER", "IF", "INT", "LE", "LETTER", 
		"LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", "MOD", "NEWLINE", "NOT", 
		"NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", "PRINT", "PROGRAM", 
		"READ", "RPAREN", "SEMICOLON", "SQUOTE", "STRING", "TIMES", "TRUE", "UPPER", 
		"WHILE", "WS", "INTEGER"
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
	public static final int DEF=15;
	public static final int DIGIT=16;
	public static final int DIV=17;
	public static final int DO=18;
	public static final int ELSE=19;
	public static final int ELSEIF=20;
	public static final int END=21;
	public static final int EQ=22;
	public static final int EXPR_LIST=23;
	public static final int FALSE=24;
	public static final int FUNC=25;
	public static final int GE=26;
	public static final int GT=27;
	public static final int IDENTIFIER=28;
	public static final int IF=29;
	public static final int INT=30;
	public static final int LE=31;
	public static final int LETTER=32;
	public static final int LOWER=33;
	public static final int LPAREN=34;
	public static final int LT=35;
	public static final int MINUS=36;
	public static final int MINUS_OP=37;
	public static final int MOD=38;
	public static final int NEWLINE=39;
	public static final int NOT=40;
	public static final int NQ=41;
	public static final int NUMBER=42;
	public static final int OR=43;
	public static final int OR_ALT=44;
	public static final int PLUS=45;
	public static final int PLUS_OP=46;
	public static final int PRINT=47;
	public static final int PROGRAM=48;
	public static final int READ=49;
	public static final int RPAREN=50;
	public static final int SEMICOLON=51;
	public static final int SQUOTE=52;
	public static final int STRING=53;
	public static final int TIMES=54;
	public static final int TRUE=55;
	public static final int UPPER=56;
	public static final int WHILE=57;
	public static final int WS=58;
	public static final int INTEGER=59;

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

	@Override public String[] getTokenNames() { return AliaChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\alia\\AliaChecker.g"; }


	    // idset - a set of declared identifiers.
	    private Set<String> idset = new HashSet<String>();   
	    
	    public boolean  isDeclared(String s)     { return idset.contains(s); }
	    public void     declare(String s)        { idset.add(s);             }



	// $ANTLR start "program"
	// src\\alia\\AliaChecker.g:36:1: program : ^( PROGRAM ( statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\alia\\AliaChecker.g:37:5: ( ^( PROGRAM ( statement )+ ) )
			// src\\alia\\AliaChecker.g:37:9: ^( PROGRAM ( statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program144); 
			match(input, Token.DOWN, null); 
			// src\\alia\\AliaChecker.g:37:19: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= BECOMES)||LA1_0==COMPOUND||LA1_0==DIV||LA1_0==EQ||LA1_0==FALSE||(LA1_0 >= GE && LA1_0 <= IF)||(LA1_0 >= LE && LA1_0 <= LETTER)||(LA1_0 >= LT && LA1_0 <= MOD)||(LA1_0 >= NOT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaChecker.g:37:20: statement
					{
					pushFollow(FOLLOW_statement_in_program147);
					statement();
					state._fsp--;

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

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "statements"
	// src\\alia\\AliaChecker.g:40:1: statements returns [_Type type = new _Void()] : (t= statement )* ;
	public final _Type statements() throws RecognitionException {
		_Type type =  new _Void();


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:41:2: ( (t= statement )* )
			// src\\alia\\AliaChecker.g:41:4: (t= statement )*
			{
			// src\\alia\\AliaChecker.g:41:4: (t= statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==COMPOUND||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= IF)||(LA2_0 >= LE && LA2_0 <= LETTER)||(LA2_0 >= LT && LA2_0 <= MOD)||(LA2_0 >= NOT && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaChecker.g:41:5: t= statement
					{
					pushFollow(FOLLOW_statement_in_statements171);
					t=statement();
					state._fsp--;

					 type = t; 
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// src\\alia\\AliaChecker.g:45:1: statement returns [_Type type = new _Void()] : ( ^( WHILE t= expr DO statements END ) |t= expr );
	public final _Type statement() throws RecognitionException {
		_Type type =  new _Void();


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:46:5: ( ^( WHILE t= expr DO statements END ) |t= expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||LA3_0==COMPOUND||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= IF)||(LA3_0 >= LE && LA3_0 <= LETTER)||(LA3_0 >= LT && LA3_0 <= MOD)||(LA3_0 >= NOT && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TIMES && LA3_0 <= TRUE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src\\alia\\AliaChecker.g:46:9: ^( WHILE t= expr DO statements END )
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement202); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement206);
					t=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_statement208); 
					pushFollow(FOLLOW_statements_in_statement210);
					statements();
					state._fsp--;

					match(input,END,FOLLOW_END_in_statement212); 
					match(input, Token.UP, null); 

					 checkBoolType(t); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:48:9: t= expr
					{
					pushFollow(FOLLOW_expr_in_statement231);
					t=expr();
					state._fsp--;

					 type = t; 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// src\\alia\\AliaChecker.g:52:1: expr returns [_Type type] : ( (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? ) | ^( COMPOUND t= statements ) );
	public final _Type expr() throws RecognitionException {
		_Type type = null;


		CommonTree id=null;
		_Type t =null;
		_Type ts =null;
		_Type t1 =null;
		_Type t2 =null;

		try {
			// src\\alia\\AliaChecker.g:53:5: ( (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? ) | ^( COMPOUND t= statements ) )
			int alt8=4;
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
			case MOD:
			case NOT:
			case NQ:
			case NUMBER:
			case OR:
			case OR_ALT:
			case PLUS:
			case PLUS_OP:
			case PRINT:
			case READ:
			case TIMES:
			case TRUE:
				{
				alt8=1;
				}
				break;
			case IF:
				{
				alt8=2;
				}
				break;
			case BECOMES:
				{
				alt8=3;
				}
				break;
			case COMPOUND:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// src\\alia\\AliaChecker.g:53:9: (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
					{
					// src\\alia\\AliaChecker.g:53:9: (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
					int alt4=6;
					switch ( input.LA(1) ) {
					case FALSE:
					case IDENTIFIER:
					case LETTER:
					case NUMBER:
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
					case MOD:
					case PLUS:
					case TIMES:
						{
						alt4=3;
						}
						break;
					case PRINT:
						{
						alt4=4;
						}
						break;
					case READ:
						{
						alt4=5;
						}
						break;
					case MINUS_OP:
					case NOT:
					case PLUS_OP:
						{
						alt4=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// src\\alia\\AliaChecker.g:53:10: t= operand
							{
							pushFollow(FOLLOW_operand_in_expr265);
							t=operand();
							state._fsp--;

							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:54:9: t= expr_comp
							{
							pushFollow(FOLLOW_expr_comp_in_expr277);
							t=expr_comp();
							state._fsp--;

							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:55:9: t= expr_math
							{
							pushFollow(FOLLOW_expr_math_in_expr289);
							t=expr_math();
							state._fsp--;

							}
							break;
						case 4 :
							// src\\alia\\AliaChecker.g:56:7: ^( PRINT t= exprlist )
							{
							match(input,PRINT,FOLLOW_PRINT_in_expr298); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_exprlist_in_expr302);
							t=exprlist();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 5 :
							// src\\alia\\AliaChecker.g:57:7: ^( READ t= varlist )
							{
							match(input,READ,FOLLOW_READ_in_expr312); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_varlist_in_expr316);
							t=varlist();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 6 :
							// src\\alia\\AliaChecker.g:58:4: ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand )
							{
							if ( input.LA(1)==MINUS_OP||input.LA(1)==NOT||input.LA(1)==PLUS_OP ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_operand_in_expr337);
							t=operand();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;

					}


					    		type = t;
					        
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:62:9: ^( IF t= expr ts= statements ( ELSEIF t= expr DO ts= statements )* ( ELSE ts= statements )? )
					{
					match(input,IF,FOLLOW_IF_in_expr357); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr361);
					t=expr();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_expr365);
					ts=statements();
					state._fsp--;


						   			List<_Type> types = new ArrayList();
							   		types.add(ts);
						   			checkBoolType(t);
						   		
					// src\\alia\\AliaChecker.g:68:7: ( ELSEIF t= expr DO ts= statements )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ELSEIF) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src\\alia\\AliaChecker.g:68:8: ELSEIF t= expr DO ts= statements
							{
							match(input,ELSEIF,FOLLOW_ELSEIF_in_expr382); 
							pushFollow(FOLLOW_expr_in_expr386);
							t=expr();
							state._fsp--;

							match(input,DO,FOLLOW_DO_in_expr388); 
							pushFollow(FOLLOW_statements_in_expr392);
							ts=statements();
							state._fsp--;


									   			types.add(ts);
									   			checkBoolType(t);
									   		
							}
							break;

						default :
							break loop5;
						}
					}

					// src\\alia\\AliaChecker.g:74:7: ( ELSE ts= statements )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ELSE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// src\\alia\\AliaChecker.g:74:8: ELSE ts= statements
							{
							match(input,ELSE,FOLLOW_ELSE_in_expr419); 
							pushFollow(FOLLOW_statements_in_expr423);
							ts=statements();
							state._fsp--;


									   			types.add(ts);
									   		
							}
							break;

					}

					match(input, Token.UP, null); 


					   			checkBoolType(t);
					   			type = checkTypesIf(types);
					   		
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:85:9: ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr472); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr476); 
					pushFollow(FOLLOW_expr_in_expr480);
					t1=expr();
					state._fsp--;

					// src\\alia\\AliaChecker.g:85:41: ( COLON t2= type )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src\\alia\\AliaChecker.g:85:42: COLON t2= type
							{
							match(input,COLON,FOLLOW_COLON_in_expr483); 
							pushFollow(FOLLOW_type_in_expr487);
							t2=type();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					   
					        	t = checkEqualType(t1, t2);
					        	declare((id!=null?id.getText():null), t);
					    		type = t;
					        
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:91:9: ^( COMPOUND t= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr511); 
					 // Openscope
					   			openScope();
					   		
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr527);
						t=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}


					        	// Closescope
					        	closeScope();
					    		type = t;
					        
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_comp"
	// src\\alia\\AliaChecker.g:103:1: expr_comp returns [_Type type] : ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) ;
	public final _Type expr_comp() throws RecognitionException {
		_Type type = null;


		_Type t1 =null;
		_Type t2 =null;

		try {
			// src\\alia\\AliaChecker.g:104:2: ( ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:104:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
			{
			// src\\alia\\AliaChecker.g:104:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
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
					// src\\alia\\AliaChecker.g:104:7: ^( OR t1= expr t2= expr )
					{
					match(input,OR,FOLLOW_OR_in_expr_comp564); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp568);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp572);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:105:9: ^( OR_ALT t1= expr t2= expr )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr_comp584); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp588);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp592);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:106:9: ^( AND t1= expr t2= expr )
					{
					match(input,AND,FOLLOW_AND_in_expr_comp604); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp608);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp612);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:107:9: ^( AND_ALT t1= expr t2= expr )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr_comp624); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp628);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp632);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// src\\alia\\AliaChecker.g:108:9: ^( EQ t1= expr t2= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr_comp644); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp648);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp652);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// src\\alia\\AliaChecker.g:109:9: ^( NQ t1= expr t2= expr )
					{
					match(input,NQ,FOLLOW_NQ_in_expr_comp664); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp668);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp672);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// src\\alia\\AliaChecker.g:110:9: ^( LE t1= expr t2= expr )
					{
					match(input,LE,FOLLOW_LE_in_expr_comp684); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp688);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp692);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// src\\alia\\AliaChecker.g:111:9: ^( GE t1= expr t2= expr )
					{
					match(input,GE,FOLLOW_GE_in_expr_comp704); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp708);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp712);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// src\\alia\\AliaChecker.g:112:9: ^( GT t1= expr t2= expr )
					{
					match(input,GT,FOLLOW_GT_in_expr_comp724); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp728);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp732);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// src\\alia\\AliaChecker.g:113:9: ^( LT t1= expr t2= expr )
					{
					match(input,LT,FOLLOW_LT_in_expr_comp744); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp748);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp752);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}


			   	  checkEqualType(t1, t2);
			   	  type = t1;
			   	
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr_comp"



	// $ANTLR start "expr_math"
	// src\\alia\\AliaChecker.g:120:1: expr_math returns [_Type type] : ( ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) | ^( MOD t1= expr t2= expr ) );
	public final _Type expr_math() throws RecognitionException {
		_Type type = null;


		_Type t1 =null;
		_Type t2 =null;

		try {
			// src\\alia\\AliaChecker.g:121:5: ( ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) | ^( MOD t1= expr t2= expr ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DIV||LA11_0==MINUS||LA11_0==PLUS||LA11_0==TIMES) ) {
				alt11=1;
			}
			else if ( (LA11_0==MOD) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// src\\alia\\AliaChecker.g:121:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
					{
					// src\\alia\\AliaChecker.g:121:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
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
							// src\\alia\\AliaChecker.g:121:10: ^( PLUS t1= expr t2= expr )
							{
							match(input,PLUS,FOLLOW_PLUS_in_expr_math785); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr_math789);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr_math793);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:122:9: ^( MINUS t1= expr t2= expr )
							{
							match(input,MINUS,FOLLOW_MINUS_in_expr_math805); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr_math809);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr_math813);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:123:9: ^( TIMES t1= expr t2= expr )
							{
							match(input,TIMES,FOLLOW_TIMES_in_expr_math825); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr_math829);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr_math833);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 4 :
							// src\\alia\\AliaChecker.g:124:9: ^( DIV t1= expr t2= expr )
							{
							match(input,DIV,FOLLOW_DIV_in_expr_math845); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr_math849);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr_math853);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;

					}

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:125:9: ^( MOD t1= expr t2= expr )
					{
					match(input,MOD,FOLLOW_MOD_in_expr_math866); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math870);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math874);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 
					    	checkMathType(t1, t2);
					    	type = new _Int();
					    
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr_math"



	// $ANTLR start "operand"
	// src\\alia\\AliaChecker.g:131:1: operand returns [_Type type] : (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) );
	public final _Type operand() throws RecognitionException {
		_Type type = null;


		CommonTree id=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;

		try {
			// src\\alia\\AliaChecker.g:132:5: (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) )
			int alt12=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt12=1;
				}
				break;
			case NUMBER:
				{
				alt12=2;
				}
				break;
			case LETTER:
				{
				alt12=3;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// src\\alia\\AliaChecker.g:132:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand905); 
					 type = getType((id!=null?id.getText():null));
					        	// TODO: In functions type inference should also be included here. Example function test(x) x = x + 1
					         
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:136:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand928); 
					 type = new _Int(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:138:9: c= LETTER
					{
					c=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_operand948); 
					 type = new _Char(); 
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:140:9: b= ( TRUE | FALSE )
					{
					b=(CommonTree)input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 type = new _Bool(); 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "operand"



	// $ANTLR start "varlist"
	// src\\alia\\AliaChecker.g:145:1: varlist returns [_Type type] : id= IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final _Type varlist() throws RecognitionException {
		_Type type = null;


		CommonTree id=null;

		try {
			// src\\alia\\AliaChecker.g:146:2: (id= IDENTIFIER ( COMMA IDENTIFIER )* )
			// src\\alia\\AliaChecker.g:146:4: id= IDENTIFIER ( COMMA IDENTIFIER )*
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1002); 

						type = getType((id!=null?id.getText():null));
					
			// src\\alia\\AliaChecker.g:150:3: ( COMMA IDENTIFIER )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src\\alia\\AliaChecker.g:150:4: COMMA IDENTIFIER
					{
					match(input,COMMA,FOLLOW_COMMA_in_varlist1011); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1013); 

									type = new _Void();
								
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "varlist"



	// $ANTLR start "exprlist"
	// src\\alia\\AliaChecker.g:156:1: exprlist returns [_Type type] : t= expr ( COMMA t= expr )* ;
	public final _Type exprlist() throws RecognitionException {
		_Type type = null;


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:157:5: (t= expr ( COMMA t= expr )* )
			// src\\alia\\AliaChecker.g:157:7: t= expr ( COMMA t= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist1041);
			t=expr();
			state._fsp--;


						checkNotVoid(t);
						type = t;
					
			// src\\alia\\AliaChecker.g:162:3: ( COMMA t= expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src\\alia\\AliaChecker.g:162:4: COMMA t= expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprlist1050); 
					pushFollow(FOLLOW_expr_in_exprlist1054);
					t=expr();
					state._fsp--;


									checkNotVoid(t);
									type = new _Void();
								
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "exprlist"



	// $ANTLR start "type"
	// src\\alia\\AliaChecker.g:170:1: type returns [_Type type] : ( INTEGER | CHAR | BOOL );
	public final _Type type() throws RecognitionException {
		_Type type = null;


		try {
			// src\\alia\\AliaChecker.g:171:5: ( INTEGER | CHAR | BOOL )
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
					// src\\alia\\AliaChecker.g:171:9: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1084); 
					 type = new _Int(); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:173:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1104); 
					 type = new _Char(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:175:9: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_type1124); 
					 type = new _Bool(); 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program147 = new BitSet(new long[]{0x02C2FF79BD424078L});
	public static final BitSet FOLLOW_statement_in_statements171 = new BitSet(new long[]{0x02C2FF79BD424072L});
	public static final BitSet FOLLOW_WHILE_in_statement202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement206 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_statement208 = new BitSet(new long[]{0x02C2FF79BD624070L});
	public static final BitSet FOLLOW_statements_in_statement210 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_END_in_statement212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_math_in_expr289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_expr298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_expr302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_expr316 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x02C2FF79BD5A4078L});
	public static final BitSet FOLLOW_statements_in_expr365 = new BitSet(new long[]{0x0000000000180008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr382 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr386 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr388 = new BitSet(new long[]{0x02C2FF79BD5A4078L});
	public static final BitSet FOLLOW_statements_in_expr392 = new BitSet(new long[]{0x0000000000180008L});
	public static final BitSet FOLLOW_ELSE_in_expr419 = new BitSet(new long[]{0x02C2FF79BD424078L});
	public static final BitSet FOLLOW_statements_in_expr423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr472 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr476 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr480 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_COLON_in_expr483 = new BitSet(new long[]{0x0800000000000300L});
	public static final BitSet FOLLOW_type_in_expr487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr_comp564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp568 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr_comp584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp588 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr_comp604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp608 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr_comp624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp628 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp632 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr_comp644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp648 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr_comp664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp668 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp672 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr_comp684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp688 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp692 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr_comp704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp708 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr_comp724 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp728 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp732 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr_comp744 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp748 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_comp752 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr_math785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math789 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_math793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_math805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math809 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_math813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr_math825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math829 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_math833 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr_math845 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math849 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_math853 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr_math866 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math870 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_expr_math874 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_operand948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1002 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_varlist1011 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1013 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_expr_in_exprlist1041 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1050 = new BitSet(new long[]{0x00C2FF79BD424070L});
	public static final BitSet FOLLOW_expr_in_exprlist1054 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_INTEGER_in_type1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1124 = new BitSet(new long[]{0x0000000000000002L});
}
