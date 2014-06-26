// $ANTLR 3.5.2 src\\alia\\AliaCodeGeneratorStringTemplate.g 2014-06-26 16:16:04

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
public class AliaCodeGeneratorStringTemplate extends CodeGeneratorAux {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ALT", "BECOMES", "BEGIN", 
		"BOOL", "CHAR", "CHAR_EXPR", "COLON", "COMMA", "COMMENT", "COMPOUND", 
		"DEF", "DIGIT", "DIV", "DO", "ELSE", "ELSEIF", "END", "EQ", "EXPR_LIST", 
		"FALSE", "FUNC", "GE", "GT", "ID", "IDENTIFIER", "IF", "INT", "LE", "LETTER", 
		"LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", "MOD", "NEWLINE", "NOT", 
		"NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", "PRINT", "PROGRAM", 
		"READ", "RPAREN", "SEMICOLON", "SQUOTE", "STRING", "TIMES", "TRUE", "TYPE", 
		"UPPER", "WHILE", "WS", "INTEGER"
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
	public static final int ID=28;
	public static final int IDENTIFIER=29;
	public static final int IF=30;
	public static final int INT=31;
	public static final int LE=32;
	public static final int LETTER=33;
	public static final int LOWER=34;
	public static final int LPAREN=35;
	public static final int LT=36;
	public static final int MINUS=37;
	public static final int MINUS_OP=38;
	public static final int MOD=39;
	public static final int NEWLINE=40;
	public static final int NOT=41;
	public static final int NQ=42;
	public static final int NUMBER=43;
	public static final int OR=44;
	public static final int OR_ALT=45;
	public static final int PLUS=46;
	public static final int PLUS_OP=47;
	public static final int PRINT=48;
	public static final int PROGRAM=49;
	public static final int READ=50;
	public static final int RPAREN=51;
	public static final int SEMICOLON=52;
	public static final int SQUOTE=53;
	public static final int STRING=54;
	public static final int TIMES=55;
	public static final int TRUE=56;
	public static final int TYPE=57;
	public static final int UPPER=58;
	public static final int WHILE=59;
	public static final int WS=60;
	public static final int INTEGER=61;

	// delegates
	public CodeGeneratorAux[] getDelegates() {
		return new CodeGeneratorAux[] {};
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:33:1: program : (s+= expr )+ -> file(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.program_return program() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.program_return retval = new AliaCodeGeneratorStringTemplate.program_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:5: ( (s+= expr )+ -> file(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:35:7: (s+= expr )+
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:35:7: (s+= expr )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= BECOMES)||LA1_0==CHAR_EXPR||LA1_0==COMPOUND||LA1_0==DIV||LA1_0==EQ||LA1_0==FALSE||(LA1_0 >= GE && LA1_0 <= GT)||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==LE||(LA1_0 >= LT && LA1_0 <= MOD)||(LA1_0 >= NOT && LA1_0 <= PRINT)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:35:8: s+= expr
					{
					pushFollow(FOLLOW_expr_in_program161);
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
			// 36:13: -> file(instructions=$s)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:39:1: statements : (s+= expr )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.statements_return statements() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.statements_return retval = new AliaCodeGeneratorStringTemplate.statements_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:40:3: ( (s+= expr )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:40:5: (s+= expr )*
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:40:5: (s+= expr )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==CHAR_EXPR||LA2_0==COMPOUND||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= GT)||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LE||(LA2_0 >= LT && LA2_0 <= MOD)||(LA2_0 >= NOT && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:40:6: s+= expr
					{
					pushFollow(FOLLOW_expr_in_statements203);
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
			// 42:13: -> statements(instructions=$s)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:1: expr : (o= operand | ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= expr ^( DO t2= statements ) ) -> whilestmt(x=$cond.sty=$t2.st)| ^( PRINT t= TYPE exp= exprlist ) -> printstmt(x=$exp.st)| ^( READ t= TYPE v= varlist ) -> readstmt(x=$v.st)| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) ( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) )* ( ^( ELSE stelse= statements ) )? ) | ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(x=$s.st));
	public final AliaCodeGeneratorStringTemplate.expr_return expr() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_return retval = new AliaCodeGeneratorStringTemplate.expr_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		CommonTree id=null;
		CommonTree a=null;
		TreeRuleReturnScope o =null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope stif1 =null;
		TreeRuleReturnScope stif2 =null;
		TreeRuleReturnScope stelseif1 =null;
		TreeRuleReturnScope stelseif2 =null;
		TreeRuleReturnScope stelse =null;
		TreeRuleReturnScope s =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:46:5: (o= operand | ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= expr ^( DO t2= statements ) ) -> whilestmt(x=$cond.sty=$t2.st)| ^( PRINT t= TYPE exp= exprlist ) -> printstmt(x=$exp.st)| ^( READ t= TYPE v= varlist ) -> readstmt(x=$v.st)| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) ( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) )* ( ^( ELSE stelse= statements ) )? ) | ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(x=$s.st))
			int alt5=25;
			switch ( input.LA(1) ) {
			case CHAR_EXPR:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt5=1;
				}
				break;
			case OR:
				{
				alt5=2;
				}
				break;
			case OR_ALT:
				{
				alt5=3;
				}
				break;
			case AND:
				{
				alt5=4;
				}
				break;
			case AND_ALT:
				{
				alt5=5;
				}
				break;
			case EQ:
				{
				alt5=6;
				}
				break;
			case NQ:
				{
				alt5=7;
				}
				break;
			case LE:
				{
				alt5=8;
				}
				break;
			case GE:
				{
				alt5=9;
				}
				break;
			case GT:
				{
				alt5=10;
				}
				break;
			case LT:
				{
				alt5=11;
				}
				break;
			case PLUS:
				{
				alt5=12;
				}
				break;
			case MINUS:
				{
				alt5=13;
				}
				break;
			case TIMES:
				{
				alt5=14;
				}
				break;
			case DIV:
				{
				alt5=15;
				}
				break;
			case MOD:
				{
				alt5=16;
				}
				break;
			case WHILE:
				{
				alt5=17;
				}
				break;
			case PRINT:
				{
				alt5=18;
				}
				break;
			case READ:
				{
				alt5=19;
				}
				break;
			case NOT:
				{
				alt5=20;
				}
				break;
			case PLUS_OP:
				{
				alt5=21;
				}
				break;
			case MINUS_OP:
				{
				alt5=22;
				}
				break;
			case IF:
				{
				alt5=23;
				}
				break;
			case BECOMES:
				{
				alt5=24;
				}
				break;
			case COMPOUND:
				{
				alt5=25;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:46:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_expr251);
					o=operand();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: ^( OR t1= expr t2= expr t= TYPE )
					{
					match(input,OR,FOLLOW_OR_in_expr262); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr266);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr270);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr274); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 47:42: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:48:9: ^( OR_ALT t1= expr t2= expr t= TYPE )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr309); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr313);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr317);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr321); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 48:45: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:49:9: ^( AND t1= expr t2= expr t= TYPE )
					{
					match(input,AND,FOLLOW_AND_in_expr355); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr359);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr363);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr367); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 49:43: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 5 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:50:9: ^( AND_ALT t1= expr t2= expr t= TYPE )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr402); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr406);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr410);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr414); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 50:46: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 6 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:51:9: ^( EQ t1= expr t2= expr t= TYPE )
					{
					match(input,EQ,FOLLOW_EQ_in_expr448); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr452);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr456);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr460); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 51:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "eq"));
					}



					}
					break;
				case 7 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:52:9: ^( NQ t1= expr t2= expr t= TYPE )
					{
					match(input,NQ,FOLLOW_NQ_in_expr495); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr499);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr503);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr507); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 52:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ne"));
					}



					}
					break;
				case 8 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:53:9: ^( LE t1= expr t2= expr t= TYPE )
					{
					match(input,LE,FOLLOW_LE_in_expr542); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr546);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr550);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr554); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 53:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "le"));
					}



					}
					break;
				case 9 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:54:9: ^( GE t1= expr t2= expr t= TYPE )
					{
					match(input,GE,FOLLOW_GE_in_expr589); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr593);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr597);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr601); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 54:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ge"));
					}



					}
					break;
				case 10 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:55:9: ^( GT t1= expr t2= expr t= TYPE )
					{
					match(input,GT,FOLLOW_GT_in_expr636); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr640);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr644);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr648); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 55:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "gt"));
					}



					}
					break;
				case 11 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:56:9: ^( LT t1= expr t2= expr t= TYPE )
					{
					match(input,LT,FOLLOW_LT_in_expr683); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr687);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr691);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr695); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 56:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "lt"));
					}



					}
					break;
				case 12 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:57:9: ^( PLUS t1= expr t2= expr t= TYPE )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr730); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr734);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr738);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr742); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 57:44: -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "add"));
					}



					}
					break;
				case 13 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:58:9: ^( MINUS t1= expr t2= expr t= TYPE )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr777); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr781);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr785);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr789); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 58:45: -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "sub"));
					}



					}
					break;
				case 14 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:59:9: ^( TIMES t1= expr t2= expr t= TYPE )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr824); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr828);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr832);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr836); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 59:45: -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "mul"));
					}



					}
					break;
				case 15 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:60:9: ^( DIV t1= expr t2= expr t= TYPE )
					{
					match(input,DIV,FOLLOW_DIV_in_expr871); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr875);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr879);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr883); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 60:43: -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "div"));
					}



					}
					break;
				case 16 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:61:9: ^( MOD t1= expr t2= expr t= TYPE )
					{
					match(input,MOD,FOLLOW_MOD_in_expr918); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr922);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr926);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr930); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 61:43: -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "rem"));
					}



					}
					break;
				case 17 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:62:7: ^( WHILE cond= expr ^( DO t2= statements ) )
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr963); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr967);
					cond=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr970); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr974);
						t2=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 62:47: -> whilestmt(x=$cond.sty=$t2.st)
					{
						retval.st = templateLib.getInstanceOf("whilestmt",new STAttrMap().put("x", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)));
					}



					}
					break;
				case 18 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:7: ^( PRINT t= TYPE exp= exprlist )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expr1000); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1004); 
					pushFollow(FOLLOW_exprlist_in_expr1008);
					exp=exprlist();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:54: -> printstmt(x=$exp.st)
					{
						retval.st = templateLib.getInstanceOf("printstmt",new STAttrMap().put("x", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
					}



					}
					break;
				case 19 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:7: ^( READ t= TYPE v= varlist )
					{
					match(input,READ,FOLLOW_READ_in_expr1045); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1049); 
					pushFollow(FOLLOW_varlist_in_expr1053);
					v=varlist();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 64:52: -> readstmt(x=$v.st)
					{
						retval.st = templateLib.getInstanceOf("readstmt",new STAttrMap().put("x", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 20 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:7: ^( NOT o= operand t= TYPE )
					{
					match(input,NOT,FOLLOW_NOT_in_expr1092); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1096);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1100); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 65:50: -> unarynot(x=$o.stinstr=\"not\")
					{
						retval.st = templateLib.getInstanceOf("unarynot",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "not"));
					}



					}
					break;
				case 21 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:66:7: ^( PLUS_OP o= operand t= TYPE )
					{
					match(input,PLUS_OP,FOLLOW_PLUS_OP_in_expr1143); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1147);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1151); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 66:52: -> unaryplus(x=$o.stinstr=\"plus\")
					{
						retval.st = templateLib.getInstanceOf("unaryplus",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "plus"));
					}



					}
					break;
				case 22 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:67:7: ^( MINUS_OP o= operand t= TYPE )
					{
					match(input,MINUS_OP,FOLLOW_MINUS_OP_in_expr1192); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1196);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1200); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 67:52: -> unarymin(x=$o.stinstr=\"neg\")
					{
						retval.st = templateLib.getInstanceOf("unarymin",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "neg"));
					}



					}
					break;
				case 23 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:68:9: ^( IF stif1= statements ^( DO stif2= statements ) ( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) )* ( ^( ELSE stelse= statements ) )? )
					{
					match(input,IF,FOLLOW_IF_in_expr1242); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1254);
						stif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_expr1265); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_expr1269);
							stif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:9: ( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) )*
						loop3:
						while (true) {
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==ELSEIF) ) {
								alt3=1;
							}

							switch (alt3) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:10: ELSEIF stelseif1= statements ^( DO stelseif2= statements )
								{
								match(input,ELSEIF,FOLLOW_ELSEIF_in_expr1281); 
								pushFollow(FOLLOW_statements_in_expr1285);
								stelseif1=statements();
								state._fsp--;

								match(input,DO,FOLLOW_DO_in_expr1298); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									pushFollow(FOLLOW_statements_in_expr1304);
									stelseif2=statements();
									state._fsp--;

									match(input, Token.UP, null); 
								}

								}
								break;

							default :
								break loop3;
							}
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:75:9: ( ^( ELSE stelse= statements ) )?
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ELSE) ) {
							alt4=1;
						}
						switch (alt4) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:75:10: ^( ELSE stelse= statements )
								{
								match(input,ELSE,FOLLOW_ELSE_in_expr1339); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									pushFollow(FOLLOW_statements_in_expr1353);
									stelse=statements();
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
				case 24 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:80:9: ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr1391); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1396); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1400); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1404); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_expr_in_expr1409);
					t1=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 80:57: -> assign(var=$idaddr=$aexpr=$t1.st)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("var", id).put("addr", a).put("expr", (t1!=null?((StringTemplate)t1.getTemplate()):null)));
					}



					}
					break;
				case 25 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:81:9: ^( COMPOUND t= TYPE s= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr1440); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1444); 
					pushFollow(FOLLOW_statements_in_expr1448);
					s=statements();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 81:66: -> statements(x=$s.st)
					{
						retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("x", (s!=null?((StringTemplate)s.getTemplate()):null)));
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:1: operand : ( identifier |n= NUMBER -> number(n=$n)|c= CHAR_EXPR -> character(c=$c)|b= ( TRUE | FALSE ) -> boolean(b=$b));
	public final AliaCodeGeneratorStringTemplate.operand_return operand() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.operand_return retval = new AliaCodeGeneratorStringTemplate.operand_return();
		retval.start = input.LT(1);

		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:5: ( identifier |n= NUMBER -> number(n=$n)|c= CHAR_EXPR -> character(c=$c)|b= ( TRUE | FALSE ) -> boolean(b=$b))
			int alt7=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt7=1;
				}
				break;
			case NUMBER:
				{
				alt7=2;
				}
				break;
			case CHAR_EXPR:
				{
				alt7=3;
				}
				break;
			case FALSE:
			case TRUE:
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:9: identifier
					{
					pushFollow(FOLLOW_identifier_in_operand1507);
					identifier();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:86:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1519); 
					// TEMPLATE REWRITE
					// 86:34: -> number(n=$n)
					{
						retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", n));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:9: c= CHAR_EXPR
					{
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand1556); 
					// TEMPLATE REWRITE
					// 87:34: -> character(c=$c)
					{
						retval.st = templateLib.getInstanceOf("character",new STAttrMap().put("c", c));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:9: b= ( TRUE | FALSE )
					{
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:11: ( TRUE | FALSE )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==TRUE) ) {
						alt6=1;
					}
					else if ( (LA6_0==FALSE) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:12: TRUE
							{
							b=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_operand1591); 
							}
							break;
						case 2 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:19: FALSE
							{
							b=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_operand1595); 
							}
							break;

					}

					// TEMPLATE REWRITE
					// 88:34: -> boolean(b=$b)
					{
						retval.st = templateLib.getInstanceOf("boolean",new STAttrMap().put("b", b));
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


	public static class identifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identifier"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:1: identifier : ^(id= IDENTIFIER t= TYPE a= ID ) ;
	public final AliaCodeGeneratorStringTemplate.identifier_return identifier() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.identifier_return retval = new AliaCodeGeneratorStringTemplate.identifier_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree t=null;
		CommonTree a=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:3: ( ^(id= IDENTIFIER t= TYPE a= ID ) )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:5: ^(id= IDENTIFIER t= TYPE a= ID )
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1631); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_identifier1635); 
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier1639); 
			match(input, Token.UP, null); 

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
	// $ANTLR end "identifier"


	public static class varlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "varlist"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:94:1: varlist : identifier ( identifier )* ;
	public final AliaCodeGeneratorStringTemplate.varlist_return varlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varlist_return retval = new AliaCodeGeneratorStringTemplate.varlist_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:3: ( identifier ( identifier )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:5: identifier ( identifier )*
			{
			pushFollow(FOLLOW_identifier_in_varlist1663);
			identifier();
			state._fsp--;

			// src\\alia\\AliaCodeGeneratorStringTemplate.g:96:5: ( identifier )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==IDENTIFIER) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:96:6: identifier
					{
					pushFollow(FOLLOW_identifier_in_varlist1670);
					identifier();
					state._fsp--;

					}
					break;

				default :
					break loop8;
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:98:1: exprlist : t= expr (t= expr )* ;
	public final AliaCodeGeneratorStringTemplate.exprlist_return exprlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprlist_return retval = new AliaCodeGeneratorStringTemplate.exprlist_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope t =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:5: (t= expr (t= expr )* )
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:7: t= expr (t= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist1686);
			t=expr();
			state._fsp--;

			// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:5: (t= expr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= AND && LA9_0 <= BECOMES)||LA9_0==CHAR_EXPR||LA9_0==COMPOUND||LA9_0==DIV||LA9_0==EQ||LA9_0==FALSE||(LA9_0 >= GE && LA9_0 <= GT)||(LA9_0 >= IDENTIFIER && LA9_0 <= IF)||LA9_0==LE||(LA9_0 >= LT && LA9_0 <= MOD)||(LA9_0 >= NOT && LA9_0 <= PRINT)||LA9_0==READ||(LA9_0 >= TIMES && LA9_0 <= TRUE)||LA9_0==WHILE) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:6: t= expr
					{
					pushFollow(FOLLOW_expr_in_exprlist1695);
					t=expr();
					state._fsp--;

					}
					break;

				default :
					break loop9;
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:103:1: type : ( INTEGER | CHAR | BOOL );
	public final AliaCodeGeneratorStringTemplate.type_return type() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.type_return retval = new AliaCodeGeneratorStringTemplate.type_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:104:5: ( INTEGER | CHAR | BOOL )
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



	public static final BitSet FOLLOW_expr_in_program161 = new BitSet(new long[]{0x0985FEF16D424472L});
	public static final BitSet FOLLOW_expr_in_statements203 = new BitSet(new long[]{0x0985FEF16D424472L});
	public static final BitSet FOLLOW_operand_in_expr251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_expr262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr266 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr270 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr313 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr317 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr359 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr363 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr452 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr456 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr499 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr503 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr507 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr542 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr546 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr550 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr593 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr597 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr640 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr644 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr648 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr683 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr687 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr691 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr695 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr734 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr738 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr781 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr785 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr789 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr824 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr828 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr832 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr836 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr871 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr875 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr879 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr883 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr922 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_expr_in_expr926 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr930 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expr963 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr967 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr974 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_expr1000 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1004 = new BitSet(new long[]{0x0985FEF16D424470L});
	public static final BitSet FOLLOW_exprlist_in_expr1008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr1045 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1049 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_varlist_in_expr1053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr1092 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1096 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1100 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_OP_in_expr1143 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1147 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_OP_in_expr1192 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1196 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1200 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr1242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1254 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr1265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1269 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_expr1281 = new BitSet(new long[]{0x0985FEF16D464470L});
	public static final BitSet FOLLOW_statements_in_expr1285 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DO_in_expr1298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_expr1339 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr1391 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1400 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_expr1404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_expr1409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr1440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1444 = new BitSet(new long[]{0x0985FEF16D424478L});
	public static final BitSet FOLLOW_statements_in_expr1448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_operand1507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier1631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_identifier1635 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_identifier1639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_varlist1663 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_identifier_in_varlist1670 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_expr_in_exprlist1686 = new BitSet(new long[]{0x0985FEF16D424472L});
	public static final BitSet FOLLOW_expr_in_exprlist1695 = new BitSet(new long[]{0x0985FEF16D424472L});
}
