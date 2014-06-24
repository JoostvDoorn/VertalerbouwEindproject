// $ANTLR 3.5.2 src\\alia\\AliaChecker.g 2014-06-24 12:01:11

package alia;


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
		"IF", "INT", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", 
		"NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PRINT", "PROGRAM", 
		"READ", "RPAREN", "SEMICOLON", "STRING", "TIMES", "TRUE", "UPPER", "WHILE", 
		"WS", "INTEGER", "SWAP", "VAR"
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
	public static final int MOD=34;
	public static final int NEWLINE=35;
	public static final int NOT=36;
	public static final int NQ=37;
	public static final int NUMBER=38;
	public static final int OR=39;
	public static final int OR_ALT=40;
	public static final int PLUS=41;
	public static final int PRINT=42;
	public static final int PROGRAM=43;
	public static final int READ=44;
	public static final int RPAREN=45;
	public static final int SEMICOLON=46;
	public static final int STRING=47;
	public static final int TIMES=48;
	public static final int TRUE=49;
	public static final int UPPER=50;
	public static final int WHILE=51;
	public static final int WS=52;
	public static final int INTEGER=53;
	public static final int SWAP=54;
	public static final int VAR=55;

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
	// src\\alia\\AliaChecker.g:28:1: program : ^( PROGRAM ( statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\alia\\AliaChecker.g:29:5: ( ^( PROGRAM ( statement )+ ) )
			// src\\alia\\AliaChecker.g:29:9: ^( PROGRAM ( statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// src\\alia\\AliaChecker.g:29:19: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BECOMES||LA1_0==DO||LA1_0==PRINT||(LA1_0 >= SWAP && LA1_0 <= VAR)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaChecker.g:29:20: statement
					{
					pushFollow(FOLLOW_statement_in_program97);
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



	// $ANTLR start "statement"
	// src\\alia\\AliaChecker.g:32:1: statement : ( ^( BECOMES id= IDENTIFIER expr ) | ^( PRINT expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) | ^( DO ( statement )* WHILE expr ) | ^( VAR id= IDENTIFIER type ) );
	public final void statement() throws RecognitionException {
		CommonTree id=null;
		CommonTree id1=null;
		CommonTree id2=null;

		try {
			// src\\alia\\AliaChecker.g:33:5: ( ^( BECOMES id= IDENTIFIER expr ) | ^( PRINT expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) | ^( DO ( statement )* WHILE expr ) | ^( VAR id= IDENTIFIER type ) )
			int alt3=5;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt3=1;
				}
				break;
			case PRINT:
				{
				alt3=2;
				}
				break;
			case SWAP:
				{
				alt3=3;
				}
				break;
			case DO:
				{
				alt3=4;
				}
				break;
			case VAR:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src\\alia\\AliaChecker.g:33:9: ^( BECOMES id= IDENTIFIER expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_statement125); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement129); 
					pushFollow(FOLLOW_expr_in_statement131);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:37:9: ^( PRINT expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement153); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement155);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:38:9: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement167); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement171); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement175); 
					match(input, Token.UP, null); 

					   if (!isDeclared((id1!=null?id1.getText():null)))
					                throw new CalcException(id1, "is not declared");
					            if (!isDeclared((id2!=null?id2.getText():null)))
					                throw new CalcException(id2, "is not declared");
					        
					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:44:7: ^( DO ( statement )* WHILE expr )
					{
					match(input,DO,FOLLOW_DO_in_statement195); 
					match(input, Token.DOWN, null); 
					// src\\alia\\AliaChecker.g:44:12: ( statement )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==BECOMES||LA2_0==DO||LA2_0==PRINT||(LA2_0 >= SWAP && LA2_0 <= VAR)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// src\\alia\\AliaChecker.g:44:13: statement
							{
							pushFollow(FOLLOW_statement_in_statement198);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop2;
						}
					}

					match(input,WHILE,FOLLOW_WHILE_in_statement202); 
					pushFollow(FOLLOW_expr_in_statement204);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// src\\alia\\AliaChecker.g:45:9: ^( VAR id= IDENTIFIER type )
					{
					match(input,VAR,FOLLOW_VAR_in_statement216); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement220); 
					pushFollow(FOLLOW_type_in_statement222);
					type();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is already declared");
					            else 
					                declare(id.getText()); 
					        
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
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// src\\alia\\AliaChecker.g:53:1: expr : ( operand | ^( NOT operand ) | ^( PLUS operand ) | ^( MINUS operand ) | ^( OR expr ) | ^( OR_ALT expr ) | ^( AND expr ) | ^( AND_ALT expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( TIMES expr expr ) | ^( DIV expr expr ) | ^( IF expr expr ( expr )? ) | ^( EQ expr expr ) | ^( NQ expr expr ) | ^( LE expr expr ) | ^( GE expr expr ) | ^( GT expr expr ) | ^( LT expr expr ) | ^( BECOMES id= IDENTIFIER expr ) );
	public final void expr() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\alia\\AliaChecker.g:54:5: ( operand | ^( NOT operand ) | ^( PLUS operand ) | ^( MINUS operand ) | ^( OR expr ) | ^( OR_ALT expr ) | ^( AND expr ) | ^( AND_ALT expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( TIMES expr expr ) | ^( DIV expr expr ) | ^( IF expr expr ( expr )? ) | ^( EQ expr expr ) | ^( NQ expr expr ) | ^( LE expr expr ) | ^( GE expr expr ) | ^( GT expr expr ) | ^( LT expr expr ) | ^( BECOMES id= IDENTIFIER expr ) )
			int alt5=20;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt5=1;
				}
				break;
			case NOT:
				{
				alt5=2;
				}
				break;
			case PLUS:
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3==DOWN) ) {
					switch ( input.LA(3) ) {
					case IDENTIFIER:
						{
						int LA5_21 = input.LA(4);
						if ( (LA5_21==UP) ) {
							alt5=3;
						}
						else if ( ((LA5_21 >= AND && LA5_21 <= BECOMES)||LA5_21==DIV||LA5_21==EQ||(LA5_21 >= GE && LA5_21 <= IF)||LA5_21==LE||(LA5_21 >= LT && LA5_21 <= MINUS)||(LA5_21 >= NOT && LA5_21 <= PLUS)||LA5_21==TIMES) ) {
							alt5=9;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NUMBER:
						{
						int LA5_22 = input.LA(4);
						if ( (LA5_22==UP) ) {
							alt5=3;
						}
						else if ( ((LA5_22 >= AND && LA5_22 <= BECOMES)||LA5_22==DIV||LA5_22==EQ||(LA5_22 >= GE && LA5_22 <= IF)||LA5_22==LE||(LA5_22 >= LT && LA5_22 <= MINUS)||(LA5_22 >= NOT && LA5_22 <= PLUS)||LA5_22==TIMES) ) {
							alt5=9;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 22, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case AND:
					case AND_ALT:
					case BECOMES:
					case DIV:
					case EQ:
					case GE:
					case GT:
					case IF:
					case LE:
					case LT:
					case MINUS:
					case NOT:
					case NQ:
					case OR:
					case OR_ALT:
					case PLUS:
					case TIMES:
						{
						alt5=9;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
				{
				int LA5_4 = input.LA(2);
				if ( (LA5_4==DOWN) ) {
					switch ( input.LA(3) ) {
					case IDENTIFIER:
						{
						int LA5_24 = input.LA(4);
						if ( (LA5_24==UP) ) {
							alt5=4;
						}
						else if ( ((LA5_24 >= AND && LA5_24 <= BECOMES)||LA5_24==DIV||LA5_24==EQ||(LA5_24 >= GE && LA5_24 <= IF)||LA5_24==LE||(LA5_24 >= LT && LA5_24 <= MINUS)||(LA5_24 >= NOT && LA5_24 <= PLUS)||LA5_24==TIMES) ) {
							alt5=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NUMBER:
						{
						int LA5_25 = input.LA(4);
						if ( (LA5_25==UP) ) {
							alt5=4;
						}
						else if ( ((LA5_25 >= AND && LA5_25 <= BECOMES)||LA5_25==DIV||LA5_25==EQ||(LA5_25 >= GE && LA5_25 <= IF)||LA5_25==LE||(LA5_25 >= LT && LA5_25 <= MINUS)||(LA5_25 >= NOT && LA5_25 <= PLUS)||LA5_25==TIMES) ) {
							alt5=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 25, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case AND:
					case AND_ALT:
					case BECOMES:
					case DIV:
					case EQ:
					case GE:
					case GT:
					case IF:
					case LE:
					case LT:
					case MINUS:
					case NOT:
					case NQ:
					case OR:
					case OR_ALT:
					case PLUS:
					case TIMES:
						{
						alt5=10;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OR:
				{
				alt5=5;
				}
				break;
			case OR_ALT:
				{
				alt5=6;
				}
				break;
			case AND:
				{
				alt5=7;
				}
				break;
			case AND_ALT:
				{
				alt5=8;
				}
				break;
			case TIMES:
				{
				alt5=11;
				}
				break;
			case DIV:
				{
				alt5=12;
				}
				break;
			case IF:
				{
				alt5=13;
				}
				break;
			case EQ:
				{
				alt5=14;
				}
				break;
			case NQ:
				{
				alt5=15;
				}
				break;
			case LE:
				{
				alt5=16;
				}
				break;
			case GE:
				{
				alt5=17;
				}
				break;
			case GT:
				{
				alt5=18;
				}
				break;
			case LT:
				{
				alt5=19;
				}
				break;
			case BECOMES:
				{
				alt5=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src\\alia\\AliaChecker.g:54:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr258);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:55:4: ^( NOT operand )
					{
					match(input,NOT,FOLLOW_NOT_in_expr264); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr266);
					operand();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaChecker.g:56:4: ^( PLUS operand )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr273); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr275);
					operand();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaChecker.g:57:4: ^( MINUS operand )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr282); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr284);
					operand();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// src\\alia\\AliaChecker.g:58:9: ^( OR expr )
					{
					match(input,OR,FOLLOW_OR_in_expr296); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr298);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// src\\alia\\AliaChecker.g:59:9: ^( OR_ALT expr )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr310); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr312);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// src\\alia\\AliaChecker.g:60:9: ^( AND expr )
					{
					match(input,AND,FOLLOW_AND_in_expr324); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr326);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// src\\alia\\AliaChecker.g:61:9: ^( AND_ALT expr )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr338); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr340);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// src\\alia\\AliaChecker.g:62:9: ^( PLUS expr expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr352); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr354);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr356);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// src\\alia\\AliaChecker.g:63:9: ^( MINUS expr expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr368); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr370);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr372);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// src\\alia\\AliaChecker.g:64:9: ^( TIMES expr expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr384); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr386);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr388);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 12 :
					// src\\alia\\AliaChecker.g:65:9: ^( DIV expr expr )
					{
					match(input,DIV,FOLLOW_DIV_in_expr400); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr402);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr404);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 13 :
					// src\\alia\\AliaChecker.g:66:9: ^( IF expr expr ( expr )? )
					{
					match(input,IF,FOLLOW_IF_in_expr416); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr418);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr420);
					expr();
					state._fsp--;

					// src\\alia\\AliaChecker.g:66:24: ( expr )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= AND && LA4_0 <= BECOMES)||LA4_0==DIV||LA4_0==EQ||(LA4_0 >= GE && LA4_0 <= IF)||LA4_0==LE||(LA4_0 >= LT && LA4_0 <= MINUS)||(LA4_0 >= NOT && LA4_0 <= PLUS)||LA4_0==TIMES) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// src\\alia\\AliaChecker.g:66:24: expr
							{
							pushFollow(FOLLOW_expr_in_expr422);
							expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 14 :
					// src\\alia\\AliaChecker.g:67:9: ^( EQ expr expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr435); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr437);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr439);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 15 :
					// src\\alia\\AliaChecker.g:68:9: ^( NQ expr expr )
					{
					match(input,NQ,FOLLOW_NQ_in_expr451); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr453);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr455);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// src\\alia\\AliaChecker.g:69:9: ^( LE expr expr )
					{
					match(input,LE,FOLLOW_LE_in_expr467); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr469);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr471);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// src\\alia\\AliaChecker.g:70:9: ^( GE expr expr )
					{
					match(input,GE,FOLLOW_GE_in_expr483); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr485);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr487);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// src\\alia\\AliaChecker.g:71:9: ^( GT expr expr )
					{
					match(input,GT,FOLLOW_GT_in_expr499); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr501);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr503);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// src\\alia\\AliaChecker.g:72:9: ^( LT expr expr )
					{
					match(input,LT,FOLLOW_LT_in_expr515); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr517);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr519);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 20 :
					// src\\alia\\AliaChecker.g:73:9: ^( BECOMES id= IDENTIFIER expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr531); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr535); 
					pushFollow(FOLLOW_expr_in_expr537);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
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
	}
	// $ANTLR end "expr"



	// $ANTLR start "operand"
	// src\\alia\\AliaChecker.g:79:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// src\\alia\\AliaChecker.g:80:5: (id= IDENTIFIER |n= NUMBER )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENTIFIER) ) {
				alt6=1;
			}
			else if ( (LA6_0==NUMBER) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src\\alia\\AliaChecker.g:80:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand573); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// src\\alia\\AliaChecker.g:84:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand596); 
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
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// src\\alia\\AliaChecker.g:87:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// src\\alia\\AliaChecker.g:88:5: ( INTEGER )
			// src\\alia\\AliaChecker.g:88:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type620); 
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program97 = new BitSet(new long[]{0x00C0040000008048L});
	public static final BitSet FOLLOW_BECOMES_in_statement125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement129 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_statement131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_statement153 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement155 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement171 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_statement195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statement198 = new BitSet(new long[]{0x00C8040000008040L});
	public static final BitSet FOLLOW_WHILE_in_statement202 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_statement204 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_statement216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement220 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_type_in_statement222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr284 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr296 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr312 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr340 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr354 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr368 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr386 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr400 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr402 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr418 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr420 = new BitSet(new long[]{0x000103F317884078L});
	public static final BitSet FOLLOW_expr_in_expr422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr437 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr439 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr453 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr469 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr483 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr485 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr501 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr517 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr535 = new BitSet(new long[]{0x000103F317884070L});
	public static final BitSet FOLLOW_expr_in_expr537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type620 = new BitSet(new long[]{0x0000000000000002L});
}
