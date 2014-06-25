// $ANTLR 3.5.2 src\\alia\\AliaCodeGeneratorStringTemplate.g 2014-06-25 16:40:37

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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:32:1: program : (s+= expr )+ -> file(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.program_return program() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.program_return retval = new AliaCodeGeneratorStringTemplate.program_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:33:5: ( (s+= expr )+ -> file(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:7: (s+= expr )+
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:7: (s+= expr )+
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:8: s+= expr
					{
					pushFollow(FOLLOW_expr_in_program152);
					s=expr();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// TEMPLATE REWRITE
			// 35:13: -> file(instructions=$s)
			{
				retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("instructions", list_s));
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:1: statements : (s+= expr )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.statements_return statements() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.statements_return retval = new AliaCodeGeneratorStringTemplate.statements_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:39:3: ( (s+= expr )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:39:5: (s+= expr )*
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:39:5: (s+= expr )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==CHAR_EXPR||LA2_0==COMPOUND||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= IF)||LA2_0==LE||(LA2_0 >= LT && LA2_0 <= MOD)||(LA2_0 >= NOT && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:39:6: s+= expr
					{
					pushFollow(FOLLOW_expr_in_statements194);
					s=expr();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					break loop2;
				}
			}

			// TEMPLATE REWRITE
			// 41:13: -> statements(instructions=$s)
			{
				retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", list_s));
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


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:44:1: expr : ( (t= operand | ^( OR t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE expr ^( DO statements ) ) | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) | ^( IF t= statements ^( DO ts= statements ) ( ELSEIF t= statements ^( DO ts= statements ) )* ( ^( ELSE ts= statements ) )? ) | ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? ) | ^( COMPOUND t= statements ) );
	public final AliaCodeGeneratorStringTemplate.expr_return expr() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_return retval = new AliaCodeGeneratorStringTemplate.expr_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;
		TreeRuleReturnScope ts =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:5: ( (t= operand | ^( OR t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE expr ^( DO statements ) ) | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) ) | ^( IF t= statements ^( DO ts= statements ) ( ELSEIF t= statements ^( DO ts= statements ) )* ( ^( ELSE ts= statements ) )? ) | ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? ) | ^( COMPOUND t= statements ) )
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
			case WHILE:
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:9: (t= operand | ^( OR t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE expr ^( DO statements ) ) | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
					{
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:9: (t= operand | ^( OR t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE expr ^( DO statements ) ) | ^( PRINT t= exprlist ) | ^( READ t= varlist ) | ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand ) )
					int alt4=20;
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
					case OR:
						{
						alt4=2;
						}
						break;
					case OR_ALT:
						{
						alt4=3;
						}
						break;
					case AND:
						{
						alt4=4;
						}
						break;
					case AND_ALT:
						{
						alt4=5;
						}
						break;
					case EQ:
						{
						alt4=6;
						}
						break;
					case NQ:
						{
						alt4=7;
						}
						break;
					case LE:
						{
						alt4=8;
						}
						break;
					case GE:
						{
						alt4=9;
						}
						break;
					case GT:
						{
						alt4=10;
						}
						break;
					case LT:
						{
						alt4=11;
						}
						break;
					case PLUS:
						{
						alt4=12;
						}
						break;
					case MINUS:
						{
						alt4=13;
						}
						break;
					case TIMES:
						{
						alt4=14;
						}
						break;
					case DIV:
						{
						alt4=15;
						}
						break;
					case MOD:
						{
						alt4=16;
						}
						break;
					case WHILE:
						{
						alt4=17;
						}
						break;
					case PRINT:
						{
						alt4=18;
						}
						break;
					case READ:
						{
						alt4=19;
						}
						break;
					case MINUS_OP:
					case NOT:
					case PLUS_OP:
						{
						alt4=20;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:10: t= operand
							{
							pushFollow(FOLLOW_operand_in_expr243);
							t=operand();
							state._fsp--;

							}
							break;
						case 2 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:46:9: ^( OR t1= expr t2= expr )
							{
							match(input,OR,FOLLOW_OR_in_expr254); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr258);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr262);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 46:35: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
							}



							}
							break;
						case 3 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: ^( OR_ALT t1= expr t2= expr )
							{
							match(input,OR_ALT,FOLLOW_OR_ALT_in_expr297); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr301);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr305);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 47:38: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
							}



							}
							break;
						case 4 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:48:9: ^( AND t1= expr t2= expr )
							{
							match(input,AND,FOLLOW_AND_in_expr339); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr343);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr347);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 48:36: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
							}



							}
							break;
						case 5 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:49:9: ^( AND_ALT t1= expr t2= expr )
							{
							match(input,AND_ALT,FOLLOW_AND_ALT_in_expr382); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr386);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr390);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 49:39: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
							}



							}
							break;
						case 6 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:50:9: ^( EQ t1= expr t2= expr )
							{
							match(input,EQ,FOLLOW_EQ_in_expr424); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr428);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr432);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 50:35: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")
							{
								retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "eq"));
							}



							}
							break;
						case 7 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:51:9: ^( NQ t1= expr t2= expr )
							{
							match(input,NQ,FOLLOW_NQ_in_expr467); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr471);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr475);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 51:35: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")
							{
								retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ne"));
							}



							}
							break;
						case 8 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:52:9: ^( LE t1= expr t2= expr )
							{
							match(input,LE,FOLLOW_LE_in_expr510); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr514);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr518);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 52:35: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")
							{
								retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "le"));
							}



							}
							break;
						case 9 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:53:9: ^( GE t1= expr t2= expr )
							{
							match(input,GE,FOLLOW_GE_in_expr553); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr557);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr561);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 53:35: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")
							{
								retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ge"));
							}



							}
							break;
						case 10 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:54:9: ^( GT t1= expr t2= expr )
							{
							match(input,GT,FOLLOW_GT_in_expr596); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr600);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr604);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 54:35: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")
							{
								retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "gt"));
							}



							}
							break;
						case 11 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:55:9: ^( LT t1= expr t2= expr )
							{
							match(input,LT,FOLLOW_LT_in_expr639); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr643);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr647);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 55:35: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")
							{
								retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "lt"));
							}



							}
							break;
						case 12 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:56:9: ^( PLUS t1= expr t2= expr )
							{
							match(input,PLUS,FOLLOW_PLUS_in_expr682); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr686);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr690);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 56:37: -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "add"));
							}



							}
							break;
						case 13 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:57:9: ^( MINUS t1= expr t2= expr )
							{
							match(input,MINUS,FOLLOW_MINUS_in_expr725); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr729);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr733);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 57:38: -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "sub"));
							}



							}
							break;
						case 14 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:58:9: ^( TIMES t1= expr t2= expr )
							{
							match(input,TIMES,FOLLOW_TIMES_in_expr768); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr772);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr776);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 58:38: -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "mul"));
							}



							}
							break;
						case 15 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:59:9: ^( DIV t1= expr t2= expr )
							{
							match(input,DIV,FOLLOW_DIV_in_expr811); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr815);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr819);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 59:36: -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "div"));
							}



							}
							break;
						case 16 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:60:9: ^( MOD t1= expr t2= expr )
							{
							match(input,MOD,FOLLOW_MOD_in_expr854); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr858);
							t1=expr();
							state._fsp--;

							pushFollow(FOLLOW_expr_in_expr862);
							t2=expr();
							state._fsp--;

							match(input, Token.UP, null); 

							// TEMPLATE REWRITE
							// 60:36: -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")
							{
								retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "rem"));
							}



							}
							break;
						case 17 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:61:7: ^( WHILE expr ^( DO statements ) )
							{
							match(input,WHILE,FOLLOW_WHILE_in_expr895); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_expr_in_expr897);
							expr();
							state._fsp--;

							match(input,DO,FOLLOW_DO_in_expr900); 
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); 
								pushFollow(FOLLOW_statements_in_expr902);
								statements();
								state._fsp--;

								match(input, Token.UP, null); 
							}

							match(input, Token.UP, null); 

							}
							break;
						case 18 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:62:7: ^( PRINT t= exprlist )
							{
							match(input,PRINT,FOLLOW_PRINT_in_expr913); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_exprlist_in_expr917);
							t=exprlist();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 19 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:7: ^( READ t= varlist )
							{
							match(input,READ,FOLLOW_READ_in_expr927); 
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_varlist_in_expr931);
							t=varlist();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;
						case 20 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:5: ^( ( NOT | PLUS_OP | MINUS_OP ) t= operand )
							{
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:7: ( NOT | PLUS_OP | MINUS_OP )
							int alt3=3;
							switch ( input.LA(1) ) {
							case NOT:
								{
								alt3=1;
								}
								break;
							case PLUS_OP:
								{
								alt3=2;
								}
								break;
							case MINUS_OP:
								{
								alt3=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}
							switch (alt3) {
								case 1 :
									// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:8: NOT
									{
									match(input,NOT,FOLLOW_NOT_in_expr940); 
									}
									break;
								case 2 :
									// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:14: PLUS_OP
									{
									match(input,PLUS_OP,FOLLOW_PLUS_OP_in_expr944); 
									}
									break;
								case 3 :
									// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:24: MINUS_OP
									{
									match(input,MINUS_OP,FOLLOW_MINUS_OP_in_expr948); 
									}
									break;

							}

							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_operand_in_expr953);
							t=operand();
							state._fsp--;

							match(input, Token.UP, null); 

							}
							break;

					}

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:9: ^( IF t= statements ^( DO ts= statements ) ( ELSEIF t= statements ^( DO ts= statements ) )* ( ^( ELSE ts= statements ) )? )
					{
					match(input,IF,FOLLOW_IF_in_expr966); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr978);
						t=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_expr989); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_expr993);
							ts=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:68:9: ( ELSEIF t= statements ^( DO ts= statements ) )*
						loop5:
						while (true) {
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ELSEIF) ) {
								alt5=1;
							}

							switch (alt5) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:68:10: ELSEIF t= statements ^( DO ts= statements )
								{
								match(input,ELSEIF,FOLLOW_ELSEIF_in_expr1005); 
								pushFollow(FOLLOW_statements_in_expr1009);
								t=statements();
								state._fsp--;

								match(input,DO,FOLLOW_DO_in_expr1022); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									pushFollow(FOLLOW_statements_in_expr1028);
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

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:72:9: ( ^( ELSE ts= statements ) )?
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ELSE) ) {
							alt6=1;
						}
						switch (alt6) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:72:10: ^( ELSE ts= statements )
								{
								match(input,ELSE,FOLLOW_ELSE_in_expr1063); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									pushFollow(FOLLOW_statements_in_expr1077);
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:77:9: ^( BECOMES id= IDENTIFIER t1= expr ( COLON t2= type )? )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr1115); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1119); 
					pushFollow(FOLLOW_expr_in_expr1123);
					t1=expr();
					state._fsp--;

					// src\\alia\\AliaCodeGeneratorStringTemplate.g:77:41: ( COLON t2= type )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:77:42: COLON t2= type
							{
							match(input,COLON,FOLLOW_COLON_in_expr1126); 
							pushFollow(FOLLOW_type_in_expr1130);
							t2=type();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:78:9: ^( COMPOUND t= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr1144); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1154);
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


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:82:1: operand : (id= IDENTIFIER |n= NUMBER |c= CHAR_EXPR |b= ( TRUE | FALSE ) );
	public final AliaCodeGeneratorStringTemplate.operand_return operand() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.operand_return retval = new AliaCodeGeneratorStringTemplate.operand_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:83:5: (id= IDENTIFIER |n= NUMBER |c= CHAR_EXPR |b= ( TRUE | FALSE ) )
			int alt9=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt9=1;
				}
				break;
			case NUMBER:
				{
				alt9=2;
				}
				break;
			case CHAR_EXPR:
				{
				alt9=3;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:83:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1181); 
					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1194); 
					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:9: c= CHAR_EXPR
					{
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand1207); 
					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:86:9: b= ( TRUE | FALSE )
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:90:1: varlist : id= IDENTIFIER ( IDENTIFIER )* ;
	public final AliaCodeGeneratorStringTemplate.varlist_return varlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varlist_return retval = new AliaCodeGeneratorStringTemplate.varlist_return();
		retval.start = input.LT(1);

		CommonTree id=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:3: (id= IDENTIFIER ( IDENTIFIER )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:5: id= IDENTIFIER ( IDENTIFIER )*
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1243); 
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:5: ( IDENTIFIER )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENTIFIER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:6: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1250); 
					}
					break;

				default :
					break loop10;
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:94:1: exprlist : t= expr (t= expr )* ;
	public final AliaCodeGeneratorStringTemplate.exprlist_return exprlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprlist_return retval = new AliaCodeGeneratorStringTemplate.exprlist_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:5: (t= expr (t= expr )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:7: t= expr (t= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist1266);
			t=expr();
			state._fsp--;

			// src\\alia\\AliaCodeGeneratorStringTemplate.g:96:5: (t= expr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= AND && LA11_0 <= BECOMES)||LA11_0==CHAR_EXPR||LA11_0==COMPOUND||LA11_0==DIV||LA11_0==EQ||LA11_0==FALSE||(LA11_0 >= GE && LA11_0 <= IF)||LA11_0==LE||(LA11_0 >= LT && LA11_0 <= MOD)||(LA11_0 >= NOT && LA11_0 <= PRINT)||LA11_0==READ||(LA11_0 >= TIMES && LA11_0 <= TRUE)||LA11_0==WHILE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:96:6: t= expr
					{
					pushFollow(FOLLOW_expr_in_exprlist1275);
					t=expr();
					state._fsp--;

					}
					break;

				default :
					break loop11;
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:1: type : ( INTEGER | CHAR | BOOL );
	public final AliaCodeGeneratorStringTemplate.type_return type() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.type_return retval = new AliaCodeGeneratorStringTemplate.type_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:5: ( INTEGER | CHAR | BOOL )
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



	public static final BitSet FOLLOW_expr_in_program152 = new BitSet(new long[]{0x02C2FF78BD424472L});
	public static final BitSet FOLLOW_expr_in_statements194 = new BitSet(new long[]{0x02C2FF78BD424472L});
	public static final BitSet FOLLOW_operand_in_expr243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_expr254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr258 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr297 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr301 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr305 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr339 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr343 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr386 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr428 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr471 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr514 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr553 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr557 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr561 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr596 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr600 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr604 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr639 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr643 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr647 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr686 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr725 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr729 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr772 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr811 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr815 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr819 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr858 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr862 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expr895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr897 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_expr913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprlist_in_expr917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr927 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varlist_in_expr931 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr940 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_OP_in_expr944 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_OP_in_expr948 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr966 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr978 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr989 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr993 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr1005 = new BitSet(new long[]{0x02C2FF78BD464470L});
	public static final BitSet FOLLOW_statements_in_expr1009 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr1022 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1028 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_expr1063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1077 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr1115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1119 = new BitSet(new long[]{0x02C2FF78BD424470L});
	public static final BitSet FOLLOW_expr_in_expr1123 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_COLON_in_expr1126 = new BitSet(new long[]{0x0800000000000300L});
	public static final BitSet FOLLOW_type_in_expr1130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr1144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1154 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1243 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1250 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_expr_in_exprlist1266 = new BitSet(new long[]{0x02C2FF78BD424472L});
	public static final BitSet FOLLOW_expr_in_exprlist1275 = new BitSet(new long[]{0x02C2FF78BD424472L});
}
