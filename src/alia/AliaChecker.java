// $ANTLR 3.5.2 src\\alia\\AliaChecker.g 2014-06-24 17:06:49

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ALT", "BECOMES", "BEGIN", 
		"BOOL", "CHAR", "COLON", "COMMA", "COMMENT", "COMPOUND", "DEF", "DIGIT", 
		"DIV", "DO", "ELSE", "ELSEIF", "END", "EQ", "EXPR_LIST", "FALSE", "FUNC", 
		"GE", "GT", "IDENTIFIER", "IF", "INT", "LE", "LETTER", "LOWER", "LPAREN", 
		"LT", "MINUS", "MINUS_OP", "MOD", "NEWLINE", "NOT", "NQ", "NUMBER", "OR", 
		"OR_ALT", "PLUS", "PLUS_OP", "PRINT", "PROGRAM", "READ", "RPAREN", "SEMICOLON", 
		"SQUOTE", "STRING", "TIMES", "TRUE", "UPPER", "WHILE", "WS", "INTEGER"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int AND_ALT=5;
	public static final int BECOMES=6;
	public static final int BEGIN=7;
	public static final int BOOL=8;
	public static final int CHAR=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int COMPOUND=13;
	public static final int DEF=14;
	public static final int DIGIT=15;
	public static final int DIV=16;
	public static final int DO=17;
	public static final int ELSE=18;
	public static final int ELSEIF=19;
	public static final int END=20;
	public static final int EQ=21;
	public static final int EXPR_LIST=22;
	public static final int FALSE=23;
	public static final int FUNC=24;
	public static final int GE=25;
	public static final int GT=26;
	public static final int IDENTIFIER=27;
	public static final int IF=28;
	public static final int INT=29;
	public static final int LE=30;
	public static final int LETTER=31;
	public static final int LOWER=32;
	public static final int LPAREN=33;
	public static final int LT=34;
	public static final int MINUS=35;
	public static final int MINUS_OP=36;
	public static final int MOD=37;
	public static final int NEWLINE=38;
	public static final int NOT=39;
	public static final int NQ=40;
	public static final int NUMBER=41;
	public static final int OR=42;
	public static final int OR_ALT=43;
	public static final int PLUS=44;
	public static final int PLUS_OP=45;
	public static final int PRINT=46;
	public static final int PROGRAM=47;
	public static final int READ=48;
	public static final int RPAREN=49;
	public static final int SEMICOLON=50;
	public static final int SQUOTE=51;
	public static final int STRING=52;
	public static final int TIMES=53;
	public static final int TRUE=54;
	public static final int UPPER=55;
	public static final int WHILE=56;
	public static final int WS=57;
	public static final int INTEGER=58;

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

	@Override public String[] getTokenNames() { return AliaChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\alia\\AliaChecker.g"; }


	    // idset - a set of declared identifiers.
	    private Set<String> idset = new HashSet<String>();   
	    
	    public boolean  isDeclared(String s)     { return idset.contains(s); }
	    public void     declare(String s)        { idset.add(s);             }



	// $ANTLR start "program"
	// src\\alia\\AliaChecker.g:34:1: program : ^( PROGRAM ( statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\alia\\AliaChecker.g:35:5: ( ^( PROGRAM ( statement )+ ) )
			// src\\alia\\AliaChecker.g:35:9: ^( PROGRAM ( statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program135); 
			match(input, Token.DOWN, null); 
			// src\\alia\\AliaChecker.g:35:19: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= BECOMES)||LA1_0==COMPOUND||LA1_0==DIV||LA1_0==EQ||LA1_0==FALSE||(LA1_0 >= GE && LA1_0 <= IF)||(LA1_0 >= LE && LA1_0 <= LETTER)||(LA1_0 >= LT && LA1_0 <= MINUS_OP)||(LA1_0 >= NOT && LA1_0 <= PLUS_OP)||(LA1_0 >= TIMES && LA1_0 <= TRUE)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaChecker.g:35:20: statement
					{
					pushFollow(FOLLOW_statement_in_program138);
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
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "statements"
	// src\\alia\\AliaChecker.g:38:1: statements returns [_Type type = new _Void()] : (t= statement )* ;
	public final _Type statements() throws RecognitionException {
		_Type type =  new _Void();


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:39:2: ( (t= statement )* )
			// src\\alia\\AliaChecker.g:39:4: (t= statement )*
			{
			// src\\alia\\AliaChecker.g:39:4: (t= statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==COMPOUND||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= IF)||(LA2_0 >= LE && LA2_0 <= LETTER)||(LA2_0 >= LT && LA2_0 <= MINUS_OP)||(LA2_0 >= NOT && LA2_0 <= PLUS_OP)||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaChecker.g:39:5: t= statement
					{
					pushFollow(FOLLOW_statement_in_statements162);
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
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// src\\alia\\AliaChecker.g:43:1: statement returns [_Type type = new _Void()] : ( ^( WHILE t= expr DO statements END ) |t= expr );
	public final _Type statement() throws RecognitionException {
		_Type type =  new _Void();


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:44:5: ( ^( WHILE t= expr DO statements END ) |t= expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||LA3_0==COMPOUND||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= IF)||(LA3_0 >= LE && LA3_0 <= LETTER)||(LA3_0 >= LT && LA3_0 <= MINUS_OP)||(LA3_0 >= NOT && LA3_0 <= PLUS_OP)||(LA3_0 >= TIMES && LA3_0 <= TRUE)) ) {
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
					match(input,WHILE,FOLLOW_WHILE_in_statement193); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement197);
					t=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_statement199); 
					pushFollow(FOLLOW_statements_in_statement201);
					statements();
					state._fsp--;

					match(input,END,FOLLOW_END_in_statement203); 
					match(input, Token.UP, null); 

					 checkBoolType(t); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:46:9: t= expr
					{
					pushFollow(FOLLOW_expr_in_statement222);
					t=expr();
					state._fsp--;

					 type = t; 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// src\\alia\\AliaChecker.g:50:1: expr returns [_Type type] : ( (t= expr_op |t= expr_comp |t= expr_math ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t= expr ) | ^( COMPOUND t= statements ) );
	public final _Type expr() throws RecognitionException {
		_Type type = null;


		CommonTree id=null;
		_Type t =null;
		_Type ts =null;

		try {
			// src\\alia\\AliaChecker.g:51:5: ( (t= expr_op |t= expr_comp |t= expr_math ) | ^( IF t= expr ts= statements ( ELSEIF t= expr DO ts= statements )* ( ELSE ts= statements )? ) | ^( BECOMES id= IDENTIFIER t= expr ) | ^( COMPOUND t= statements ) )
			int alt7=4;
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
			case COMPOUND:
				{
				alt7=4;
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
							pushFollow(FOLLOW_expr_op_in_expr256);
							t=expr_op();
							state._fsp--;

							}
							break;
						case 2 :
							// src\\alia\\AliaChecker.g:52:9: t= expr_comp
							{
							pushFollow(FOLLOW_expr_comp_in_expr268);
							t=expr_comp();
							state._fsp--;

							}
							break;
						case 3 :
							// src\\alia\\AliaChecker.g:53:9: t= expr_math
							{
							pushFollow(FOLLOW_expr_math_in_expr280);
							t=expr_math();
							state._fsp--;

							}
							break;

					}


					    		type = t;
					        
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:57:9: ^( IF t= expr ts= statements ( ELSEIF t= expr DO ts= statements )* ( ELSE ts= statements )? )
					{
					match(input,IF,FOLLOW_IF_in_expr299); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr303);
					t=expr();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_expr307);
					ts=statements();
					state._fsp--;


						   			List<_Type> types = new ArrayList();
							   		types.add(ts);
						   			checkBoolType(t);
						   		
					// src\\alia\\AliaChecker.g:63:7: ( ELSEIF t= expr DO ts= statements )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ELSEIF) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src\\alia\\AliaChecker.g:63:8: ELSEIF t= expr DO ts= statements
							{
							match(input,ELSEIF,FOLLOW_ELSEIF_in_expr324); 
							pushFollow(FOLLOW_expr_in_expr328);
							t=expr();
							state._fsp--;

							match(input,DO,FOLLOW_DO_in_expr330); 
							pushFollow(FOLLOW_statements_in_expr334);
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
							match(input,ELSE,FOLLOW_ELSE_in_expr361); 
							pushFollow(FOLLOW_statements_in_expr365);
							ts=statements();
							state._fsp--;


									   			types.add(ts);
									   		
							}
							break;

					}

					match(input, Token.UP, null); 


					   			checkBoolType(t);
					   			type = checkTypesIf($types.type);
					   		
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:80:9: ^( BECOMES id= IDENTIFIER t= expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr414); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr418); 
					pushFollow(FOLLOW_expr_in_expr422);
					t=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					   
					        	declare((id!=null?id.getText():null), t);
					    		type = t;
					        
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:85:9: ^( COMPOUND t= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr444); 
					 // Openscope
					   		
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr460);
						t=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}


					        	// Closescope
					    		type = t;
					        
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_op"
	// src\\alia\\AliaChecker.g:95:1: expr_op returns [_Type type] : (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) ;
	public final _Type expr_op() throws RecognitionException {
		_Type type = null;


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:96:2: ( (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) )
			// src\\alia\\AliaChecker.g:96:6: (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
			{
			// src\\alia\\AliaChecker.g:96:6: (t= operand | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
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
					// src\\alia\\AliaChecker.g:96:7: t= operand
					{
					pushFollow(FOLLOW_operand_in_expr_op498);
					t=operand();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:97:4: ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand )
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
					pushFollow(FOLLOW_operand_in_expr_op518);
					t=operand();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			 type = t; 
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr_op"



	// $ANTLR start "expr_comp"
	// src\\alia\\AliaChecker.g:100:1: expr_comp returns [_Type type] : ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) ;
	public final _Type expr_comp() throws RecognitionException {
		_Type type = null;


		_Type t1 =null;
		_Type t2 =null;

		try {
			// src\\alia\\AliaChecker.g:101:2: ( ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:101:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
			{
			// src\\alia\\AliaChecker.g:101:6: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
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
					// src\\alia\\AliaChecker.g:101:7: ^( OR t1= expr t2= expr )
					{
					match(input,OR,FOLLOW_OR_in_expr_comp541); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp545);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp549);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:102:9: ^( OR_ALT t1= expr t2= expr )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr_comp561); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp565);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp569);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:103:9: ^( AND t1= expr t2= expr )
					{
					match(input,AND,FOLLOW_AND_in_expr_comp581); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp585);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp589);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:104:9: ^( AND_ALT t1= expr t2= expr )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr_comp601); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp605);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp609);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// src\\alia\\AliaChecker.g:105:9: ^( EQ t1= expr t2= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr_comp621); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp625);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp629);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// src\\alia\\AliaChecker.g:106:9: ^( NQ t1= expr t2= expr )
					{
					match(input,NQ,FOLLOW_NQ_in_expr_comp641); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp645);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp649);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// src\\alia\\AliaChecker.g:107:9: ^( LE t1= expr t2= expr )
					{
					match(input,LE,FOLLOW_LE_in_expr_comp661); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp665);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp669);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// src\\alia\\AliaChecker.g:108:9: ^( GE t1= expr t2= expr )
					{
					match(input,GE,FOLLOW_GE_in_expr_comp681); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp685);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp689);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// src\\alia\\AliaChecker.g:109:9: ^( GT t1= expr t2= expr )
					{
					match(input,GT,FOLLOW_GT_in_expr_comp701); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp705);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp709);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// src\\alia\\AliaChecker.g:110:9: ^( LT t1= expr t2= expr )
					{
					match(input,LT,FOLLOW_LT_in_expr_comp721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp725);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp729);
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
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr_comp"



	// $ANTLR start "expr_math"
	// src\\alia\\AliaChecker.g:117:1: expr_math returns [_Type type] : ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) ;
	public final _Type expr_math() throws RecognitionException {
		_Type type = null;


		_Type t1 =null;
		_Type t2 =null;

		try {
			// src\\alia\\AliaChecker.g:118:5: ( ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) ) )
			// src\\alia\\AliaChecker.g:118:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
			{
			// src\\alia\\AliaChecker.g:118:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) )
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
					// src\\alia\\AliaChecker.g:118:10: ^( PLUS t1= expr t2= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_math762); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math766);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math770);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:119:9: ^( MINUS t1= expr t2= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_math782); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math786);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math790);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:120:9: ^( TIMES t1= expr t2= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_math802); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math806);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math810);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:121:9: ^( DIV t1= expr t2= expr )
					{
					match(input,DIV,FOLLOW_DIV_in_expr_math822); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math826);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math830);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			 
			    	checkMathType(t1, t2);
			    	type = new _Int();
			    
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "expr_math"



	// $ANTLR start "operand"
	// src\\alia\\AliaChecker.g:127:1: operand returns [_Type type] : (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) );
	public final _Type operand() throws RecognitionException {
		_Type type = null;


		CommonTree id=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;

		try {
			// src\\alia\\AliaChecker.g:128:5: (id= IDENTIFIER |n= NUMBER |c= LETTER |b= ( TRUE | FALSE ) )
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
					// src\\alia\\AliaChecker.g:128:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand862); 
					 type = getType((id!=null?id.getText():null));
					        	// TODO: In functions type inference should also be included here. Example function test(x) x = x + 1
					         
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:132:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand885); 
					 type = new _Int(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:134:9: c= LETTER
					{
					c=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_operand905); 
					 type = new _Char(); 
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:136:9: b= ( TRUE | FALSE )
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
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "operand"



	// $ANTLR start "operand_special"
	// src\\alia\\AliaChecker.g:140:1: operand_special returns [_Type type] : ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) ) ;
	public final _Type operand_special() throws RecognitionException {
		_Type type = null;


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:141:5: ( ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) ) )
			// src\\alia\\AliaChecker.g:141:9: ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) )
			{
			// src\\alia\\AliaChecker.g:141:9: ( ^( PRINT t= exprlist ) | ^( READ t= varlist ) )
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
					// src\\alia\\AliaChecker.g:141:10: ^( PRINT t= exprlist )
					{
					match(input,PRINT,FOLLOW_PRINT_in_operand_special962); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprlist_in_operand_special966);
					t=exprlist();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:143:7: ^( READ t= varlist )
					{
					match(input,READ,FOLLOW_READ_in_operand_special981); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_varlist_in_operand_special985);
					t=varlist();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}


			    	type = t;
			    
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "operand_special"



	// $ANTLR start "varlist"
	// src\\alia\\AliaChecker.g:148:1: varlist returns [_Type type] : id= IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final _Type varlist() throws RecognitionException {
		_Type type = null;


		CommonTree id=null;

		try {
			// src\\alia\\AliaChecker.g:149:2: (id= IDENTIFIER ( COMMA IDENTIFIER )* )
			// src\\alia\\AliaChecker.g:149:4: id= IDENTIFIER ( COMMA IDENTIFIER )*
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1009); 

						type = getType((id!=null?id.getText():null));
					
			// src\\alia\\AliaChecker.g:153:3: ( COMMA IDENTIFIER )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src\\alia\\AliaChecker.g:153:4: COMMA IDENTIFIER
					{
					match(input,COMMA,FOLLOW_COMMA_in_varlist1018); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1020); 

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
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "varlist"



	// $ANTLR start "exprlist"
	// src\\alia\\AliaChecker.g:159:1: exprlist returns [_Type type] : t= expr ( COMMA t= expr )* ;
	public final _Type exprlist() throws RecognitionException {
		_Type type = null;


		_Type t =null;

		try {
			// src\\alia\\AliaChecker.g:160:5: (t= expr ( COMMA t= expr )* )
			// src\\alia\\AliaChecker.g:160:7: t= expr ( COMMA t= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist1048);
			t=expr();
			state._fsp--;


						checkNotVoid(t);
						type = t;
					
			// src\\alia\\AliaChecker.g:165:3: ( COMMA t= expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src\\alia\\AliaChecker.g:165:4: COMMA t= expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprlist1057); 
					pushFollow(FOLLOW_expr_in_exprlist1061);
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
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "exprlist"



	// $ANTLR start "type"
	// src\\alia\\AliaChecker.g:173:1: type returns [_Type type] : ( INTEGER | CHAR | BOOL );
	public final _Type type() throws RecognitionException {
		_Type type = null;


		try {
			// src\\alia\\AliaChecker.g:174:5: ( INTEGER | CHAR | BOOL )
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
					// src\\alia\\AliaChecker.g:174:9: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1091); 
					 type = new _Int(); 
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:176:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1111); 
					 type = new _Char(); 
					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:178:9: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_type1131); 
					 type = new _Bool(); 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program138 = new BitSet(new long[]{0x01603F9CDEA12078L});
	public static final BitSet FOLLOW_statement_in_statements162 = new BitSet(new long[]{0x01603F9CDEA12072L});
	public static final BitSet FOLLOW_WHILE_in_statement193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement197 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DO_in_statement199 = new BitSet(new long[]{0x01603F9CDEB12070L});
	public static final BitSet FOLLOW_statements_in_statement201 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_END_in_statement203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_op_in_expr256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_math_in_expr280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x01603F9CDEAD2078L});
	public static final BitSet FOLLOW_statements_in_expr307 = new BitSet(new long[]{0x00000000000C0008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr324 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DO_in_expr330 = new BitSet(new long[]{0x01603F9CDEAD2078L});
	public static final BitSet FOLLOW_statements_in_expr334 = new BitSet(new long[]{0x00000000000C0008L});
	public static final BitSet FOLLOW_ELSE_in_expr361 = new BitSet(new long[]{0x01603F9CDEA12078L});
	public static final BitSet FOLLOW_statements_in_expr365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr418 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_op498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr_op504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr_op518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr_comp541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp545 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr_comp561 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp565 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr_comp581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp585 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp589 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr_comp601 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp605 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp609 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr_comp621 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp625 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr_comp641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp645 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr_comp661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp665 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp669 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr_comp681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp685 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr_comp701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp705 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp709 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr_comp721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp725 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_comp729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr_math762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math766 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_math770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_math782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math786 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_math790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr_math802 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math806 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_math810 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr_math822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math826 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_expr_math830 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LETTER_in_operand905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_operand_special962 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_operand_special966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_operand_special981 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_operand_special985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1009 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_varlist1018 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1020 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_expr_in_exprlist1048 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1057 = new BitSet(new long[]{0x00603F9CDEA12070L});
	public static final BitSet FOLLOW_expr_in_exprlist1061 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_INTEGER_in_type1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type1131 = new BitSet(new long[]{0x0000000000000002L});
}
