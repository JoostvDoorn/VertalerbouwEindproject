// $ANTLR 3.5.2 src\\alia\\AliaCodeGeneratorStringTemplate.g 2014-06-25 15:19:31

package alia;
import alia.symtab.SymbolTable;
import alia.symtab.IdEntry;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class AliaCodeGeneratorStringTemplate extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public AliaCodeGeneratorStringTemplate(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public AliaCodeGeneratorStringTemplate(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("AliaCodeGeneratorStringTemplateTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return AliaCodeGeneratorStringTemplate.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\alia\\AliaCodeGeneratorStringTemplate.g"; }





	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:32:1: program : ( statement )+ ;
	public final AliaCodeGeneratorStringTemplate.program_return program() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.program_return retval = new AliaCodeGeneratorStringTemplate.program_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:33:5: ( ( statement )+ )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:7: ( statement )+
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:7: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= BECOMES)||LA1_0==CHAR_EXPR||LA1_0==COMPOUND||LA1_0==DIV||LA1_0==EQ||LA1_0==FALSE||(LA1_0 >= GE && LA1_0 <= IF)||LA1_0==LE||(LA1_0 >= LT && LA1_0 <= MOD)||(LA1_0 >= NOT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:8: statement
					{
					pushFollow(FOLLOW_statement_in_program150);
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

			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statements"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:37:1: statements : (t= statement )* ;
	public final AliaCodeGeneratorStringTemplate.statements_return statements() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.statements_return retval = new AliaCodeGeneratorStringTemplate.statements_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:3: ( (t= statement )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:5: (t= statement )*
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:5: (t= statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==CHAR_EXPR||LA2_0==COMPOUND||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= IF)||LA2_0==LE||(LA2_0 >= LT && LA2_0 <= MOD)||(LA2_0 >= NOT && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:6: t= statement
					{
					pushFollow(FOLLOW_statement_in_statements170);
					t=statement();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:41:1: statement : ( ^( WHILE t= expr ^( DO statements ) ) |t= expr );
	public final AliaCodeGeneratorStringTemplate.statement_return statement() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.statement_return retval = new AliaCodeGeneratorStringTemplate.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:42:5: ( ^( WHILE t= expr ^( DO statements ) ) |t= expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||LA3_0==CHAR_EXPR||LA3_0==COMPOUND||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= MOD)||(LA3_0 >= NOT && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TIMES && LA3_0 <= TRUE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:42:9: ^( WHILE t= expr ^( DO statements ) )
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement194); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement198);
					t=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_statement201); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_statement203);
						statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:43:9: t= expr
					{
					pushFollow(FOLLOW_expr_in_statement217);
					t=expr();
					state._fsp--;

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:46:1: expr : ( (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) | ^( IF t= statements ^( DO ts= statements ) ( ELSEIF t= statements ^( DO ts= statements ) )* ( ^( ELSE ts= statements ) )? ) | ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? ) | ^( COMPOUND t= statements ) );
	public final AliaCodeGeneratorStringTemplate.expr_return expr() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_return retval = new AliaCodeGeneratorStringTemplate.expr_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:5: ( (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) | ^( IF t= statements ^( DO ts= statements ) ( ELSEIF t= statements ^( DO ts= statements ) )* ( ^( ELSE ts= statements ) )? ) | ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? ) | ^( COMPOUND t= statements ) )
			int alt8=4;
			switch ( input.LA(1) ) {
			case AND:
			case AND_ALT:
			case CHAR_EXPR:
			case DIV:
			case EQ:
			case FALSE:
			case GE:
			case GT:
			case IDENTIFIER:
			case LE:
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
					{
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: (t= operand |t= expr_comp |t= expr_math | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
					int alt4=6;
					switch ( input.LA(1) ) {
					case CHAR_EXPR:
					case FALSE:
					case IDENTIFIER:
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
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:10: t= operand
							{
							pushFollow(FOLLOW_operand_in_expr244);
							t=operand();
							state._fsp--;

							}
							break;
						case 2 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:48:9: t= expr_comp
							{
							pushFollow(FOLLOW_expr_comp_in_expr256);
							t=expr_comp();
							state._fsp--;

							}
							break;
						case 3 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:49:9: t= expr_math
							{
							pushFollow(FOLLOW_expr_math_in_expr268);
							t=expr_math();
							state._fsp--;

							}
							break;
						case 4 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:50:7: ^( PRINT t= exprlist )
							{
							match(input,PRINT,FOLLOW_PRINT_in_expr277); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_exprlist_in_expr281);
							t=exprlist();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 5 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:51:7: ^( READ t= varlist )
							{
							match(input,READ,FOLLOW_READ_in_expr291); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_varlist_in_expr295);
							t=varlist();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 6 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:52:5: ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand )
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
							pushFollow(FOLLOW_operand_in_expr317);
							t=operand();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;

					}

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:53:9: ^( IF t= statements ^( DO ts= statements ) ( ELSEIF t= statements ^( DO ts= statements ) )* ( ^( ELSE ts= statements ) )? )
					{
					match(input,IF,FOLLOW_IF_in_expr330); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr342);
						t=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_expr353); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_expr357);
							ts=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:56:9: ( ELSEIF t= statements ^( DO ts= statements ) )*
						loop5:
						while (true) {
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ELSEIF) ) {
								alt5=1;
							}

							switch (alt5) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:56:10: ELSEIF t= statements ^( DO ts= statements )
								{
								match(input,ELSEIF,FOLLOW_ELSEIF_in_expr369); 
								pushFollow(FOLLOW_statements_in_expr373);
								t=statements();
								state._fsp--;

								match(input,DO,FOLLOW_DO_in_expr386); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									pushFollow(FOLLOW_statements_in_expr392);
									ts=statements();
									state._fsp--;

									match(input, Token.UP, null); 
								}

								}
								break;

							default :
								break loop5;
							}
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:60:9: ( ^( ELSE ts= statements ) )?
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ELSE) ) {
							alt6=1;
						}
						switch (alt6) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:60:10: ^( ELSE ts= statements )
								{
								match(input,ELSE,FOLLOW_ELSE_in_expr427); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									pushFollow(FOLLOW_statements_in_expr441);
									ts=statements();
									state._fsp--;

									match(input, Token.UP, null); 
								}

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:9: ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr479); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr483); 
					pushFollow(FOLLOW_expr_in_expr487);
					t1=expr();
					state._fsp--;

					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:41: ( COLON t2= type )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:42: COLON t2= type
							{
							match(input,COLON,FOLLOW_COLON_in_expr490); 
							pushFollow(FOLLOW_type_in_expr494);
							t2=type();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:66:9: ^( COMPOUND t= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr508); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr518);
						t=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_comp_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr_comp"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:70:1: expr_comp : ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) ;
	public final AliaCodeGeneratorStringTemplate.expr_comp_return expr_comp() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_comp_return retval = new AliaCodeGeneratorStringTemplate.expr_comp_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:3: ( ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) ) )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:7: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:7: ( ^( OR t1= expr t2= expr ) | ^( OR_ALT t1= expr t2= expr ) | ^( AND t1= expr t2= expr ) | ^( AND_ALT t1= expr t2= expr ) | ^( EQ t1= expr t2= expr ) | ^( NQ t1= expr t2= expr ) | ^( LE t1= expr t2= expr ) | ^( GE t1= expr t2= expr ) | ^( GT t1= expr t2= expr ) | ^( LT t1= expr t2= expr ) )
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:8: ^( OR t1= expr t2= expr )
					{
					match(input,OR,FOLLOW_OR_in_expr_comp542); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp546);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp550);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:72:9: ^( OR_ALT t1= expr t2= expr )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr_comp562); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp566);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp570);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:73:9: ^( AND t1= expr t2= expr )
					{
					match(input,AND,FOLLOW_AND_in_expr_comp582); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp586);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp590);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:74:9: ^( AND_ALT t1= expr t2= expr )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr_comp602); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp606);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp610);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:75:9: ^( EQ t1= expr t2= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr_comp622); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp626);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp630);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:76:9: ^( NQ t1= expr t2= expr )
					{
					match(input,NQ,FOLLOW_NQ_in_expr_comp642); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp646);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp650);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:77:9: ^( LE t1= expr t2= expr )
					{
					match(input,LE,FOLLOW_LE_in_expr_comp662); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp666);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp670);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:78:9: ^( GE t1= expr t2= expr )
					{
					match(input,GE,FOLLOW_GE_in_expr_comp682); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp686);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp690);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:79:9: ^( GT t1= expr t2= expr )
					{
					match(input,GT,FOLLOW_GT_in_expr_comp702); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp706);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp710);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:80:9: ^( LT t1= expr t2= expr )
					{
					match(input,LT,FOLLOW_LT_in_expr_comp722); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_comp726);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_comp730);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_comp"


	public static class expr_math_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr_math"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:83:1: expr_math : ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) | ^( MOD t1= expr t2= expr ) ) ;
	public final AliaCodeGeneratorStringTemplate.expr_math_return expr_math() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_math_return retval = new AliaCodeGeneratorStringTemplate.expr_math_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:5: ( ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) | ^( MOD t1= expr t2= expr ) ) )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) | ^( MOD t1= expr t2= expr ) )
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:9: ( ^( PLUS t1= expr t2= expr ) | ^( MINUS t1= expr t2= expr ) | ^( TIMES t1= expr t2= expr ) | ^( DIV t1= expr t2= expr ) | ^( MOD t1= expr t2= expr ) )
			int alt10=5;
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
			case MOD:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:10: ^( PLUS t1= expr t2= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_math753); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math757);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math761);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:9: ^( MINUS t1= expr t2= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_math773); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math777);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math781);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:86:9: ^( TIMES t1= expr t2= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_math793); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math797);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math801);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:9: ^( DIV t1= expr t2= expr )
					{
					match(input,DIV,FOLLOW_DIV_in_expr_math813); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math817);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math821);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:9: ^( MOD t1= expr t2= expr )
					{
					match(input,MOD,FOLLOW_MOD_in_expr_math833); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_math837);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_math841);
					t2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_math"


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:90:1: operand : (id= IDENTIFIER |n= NUMBER |c= CHAR_EXPR |b= ( TRUE | FALSE ) );
	public final AliaCodeGeneratorStringTemplate.operand_return operand() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.operand_return retval = new AliaCodeGeneratorStringTemplate.operand_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:5: (id= IDENTIFIER |n= NUMBER |c= CHAR_EXPR |b= ( TRUE | FALSE ) )
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
			case CHAR_EXPR:
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand863); 
					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand876); 
					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:93:9: c= CHAR_EXPR
					{
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand889); 
					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:94:9: b= ( TRUE | FALSE )
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
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class varlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "varlist"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:98:1: varlist : id= IDENTIFIER ( IDENTIFIER )* ;
	public final AliaCodeGeneratorStringTemplate.varlist_return varlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varlist_return retval = new AliaCodeGeneratorStringTemplate.varlist_return();
		retval.start = input.LT(1);

		CommonTree id=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:3: (id= IDENTIFIER ( IDENTIFIER )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:5: id= IDENTIFIER ( IDENTIFIER )*
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist925); 
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:5: ( IDENTIFIER )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==IDENTIFIER) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:6: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist932); 
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varlist"


	public static class exprlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprlist"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:102:1: exprlist : t= expr (t= expr )* ;
	public final AliaCodeGeneratorStringTemplate.exprlist_return exprlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprlist_return retval = new AliaCodeGeneratorStringTemplate.exprlist_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:103:5: (t= expr (t= expr )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:103:7: t= expr (t= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist948);
			t=expr();
			state._fsp--;

			// src\\alia\\AliaCodeGeneratorStringTemplate.g:104:5: (t= expr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= AND && LA13_0 <= BECOMES)||LA13_0==CHAR_EXPR||LA13_0==COMPOUND||LA13_0==DIV||LA13_0==EQ||LA13_0==FALSE||(LA13_0 >= GE && LA13_0 <= IF)||LA13_0==LE||(LA13_0 >= LT && LA13_0 <= MOD)||(LA13_0 >= NOT && LA13_0 <= PRINT)||LA13_0==READ||(LA13_0 >= TIMES && LA13_0 <= TRUE)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:104:6: t= expr
					{
					pushFollow(FOLLOW_expr_in_exprlist957);
					t=expr();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprlist"


	public static class type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:107:1: type : ( INTEGER | CHAR | BOOL );
	public final AliaCodeGeneratorStringTemplate.type_return type() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.type_return retval = new AliaCodeGeneratorStringTemplate.type_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:108:5: ( INTEGER | CHAR | BOOL )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:
			{
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INTEGER ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		 
		    catch (RecognitionException e) { 
		    System.out.println("Exception!:"+e.getMessage());
		        throw e; 
		        // TODO: Fix this
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program150 = new BitSet(new long[]{0x02C2FF78BD424472L});
	public static final BitSet FOLLOW_statement_in_statements170 = new BitSet(new long[]{0x02C2FF78BD424472L});
	public static final BitSet FOLLOW_WHILE_in_statement194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement198 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_statement201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_statement203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_math_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_expr277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_expr281 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_expr295 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr303 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr317 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr342 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr369 = new BitSet(new long[]{0x02C2FF78BD464470L});
	public static final BitSet FOLLOW_statements_in_expr373 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_expr427 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr483 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr487 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_COLON_in_expr490 = new BitSet(new long[]{0x0800000000000300L});
	public static final BitSet FOLLOW_type_in_expr494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr508 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr_comp542 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp546 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr_comp562 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp566 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr_comp582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp586 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr_comp602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp606 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr_comp622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp626 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr_comp642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp646 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr_comp662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp666 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr_comp682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp686 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr_comp702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp706 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr_comp722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_comp726 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_comp730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr_math753 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math757 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_math761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_math773 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math777 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_math781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr_math793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math797 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_math801 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr_math813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math817 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_math821 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr_math833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_math837 = new BitSet(new long[]{0x00C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr_math841 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist925 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist932 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_expr_in_exprlist948 = new BitSet(new long[]{0x00C2FF78BD424472L});
	public static final BitSet FOLLOW_expr_in_exprlist957 = new BitSet(new long[]{0x00C2FF78BD424472L});
}
