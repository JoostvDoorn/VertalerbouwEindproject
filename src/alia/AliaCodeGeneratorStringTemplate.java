// $ANTLR 3.5.2 src\\alia\\AliaCodeGeneratorStringTemplate.g 2014-07-03 16:23:42

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
		"CONST", "DEF", "DIGIT", "DIV", "DO", "ELSE", "ELSEIF", "END", "EQ", "EXPR_LIST", 
		"FALSE", "FUNC", "GE", "GT", "ID", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", "MOD", "NEWLINE", 
		"NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", "PRINT", "PROGRAM", 
		"RCURLY", "READ", "RPAREN", "SEMICOLON", "SQUOTE", "STRING", "TIMES", 
		"TRUE", "TYPE", "UPPER", "WHILE", "WS", "INTEGER"
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
	public static final int LOWER=36;
	public static final int LPAREN=37;
	public static final int LT=38;
	public static final int MINUS=39;
	public static final int MINUS_OP=40;
	public static final int MOD=41;
	public static final int NEWLINE=42;
	public static final int NOT=43;
	public static final int NQ=44;
	public static final int NUMBER=45;
	public static final int OR=46;
	public static final int OR_ALT=47;
	public static final int PLUS=48;
	public static final int PLUS_OP=49;
	public static final int PRINT=50;
	public static final int PROGRAM=51;
	public static final int RCURLY=52;
	public static final int READ=53;
	public static final int RPAREN=54;
	public static final int SEMICOLON=55;
	public static final int SQUOTE=56;
	public static final int STRING=57;
	public static final int TIMES=58;
	public static final int TRUE=59;
	public static final int TYPE=60;
	public static final int UPPER=61;
	public static final int WHILE=62;
	public static final int WS=63;
	public static final int INTEGER=64;

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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:1: expr : (o= operand -> statement(instruction=$o.st)| ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= expr ^( DO t2= statements ) ) -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())| ^( PRINT t= TYPE exp+= expr (exp+= exprPrint )* ) -> printstmt(statements=$expvoid=$t.toString().equals(\"void\"))| ^( READ t= TYPE v= varlist ) -> readstmt(statements=$v.st)| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? ) -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(instructions=$s.st));
	public final AliaCodeGeneratorStringTemplate.expr_return expr() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_return retval = new AliaCodeGeneratorStringTemplate.expr_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		CommonTree id=null;
		CommonTree a=null;
		List<Object> list_exp=null;
		TreeRuleReturnScope o =null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope stif1 =null;
		TreeRuleReturnScope stif2 =null;
		TreeRuleReturnScope elsestmnts =null;
		TreeRuleReturnScope s =null;
		RuleReturnScope exp = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:46:5: (o= operand -> statement(instruction=$o.st)| ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= expr ^( DO t2= statements ) ) -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())| ^( PRINT t= TYPE exp+= expr (exp+= exprPrint )* ) -> printstmt(statements=$expvoid=$t.toString().equals(\"void\"))| ^( READ t= TYPE v= varlist ) -> readstmt(statements=$v.st)| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? ) -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(instructions=$s.st))
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

					// TEMPLATE REWRITE
					// 46:25: -> statement(instruction=$o.st)
					{
						retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("instruction", (o!=null?((StringTemplate)o.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: ^( OR t1= expr t2= expr t= TYPE )
					{
					match(input,OR,FOLLOW_OR_in_expr277); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr281);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr285);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr289); 
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
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr324); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr328);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr332);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr336); 
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
					match(input,AND,FOLLOW_AND_in_expr370); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr374);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr378);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr382); 
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
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr417); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr421);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr425);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr429); 
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
					match(input,EQ,FOLLOW_EQ_in_expr463); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr467);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr471);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr475); 
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
					match(input,NQ,FOLLOW_NQ_in_expr510); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr514);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr518);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr522); 
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
					match(input,LE,FOLLOW_LE_in_expr557); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr561);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr565);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr569); 
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
					match(input,GE,FOLLOW_GE_in_expr604); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr608);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr612);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr616); 
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
					match(input,GT,FOLLOW_GT_in_expr651); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr655);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr659);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr663); 
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
					match(input,LT,FOLLOW_LT_in_expr698); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr702);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr706);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr710); 
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
					match(input,PLUS,FOLLOW_PLUS_in_expr745); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr749);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr753);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr757); 
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
					match(input,MINUS,FOLLOW_MINUS_in_expr792); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr796);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr800);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr804); 
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
					match(input,TIMES,FOLLOW_TIMES_in_expr839); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr843);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr847);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr851); 
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
					match(input,DIV,FOLLOW_DIV_in_expr886); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr890);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr894);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr898); 
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
					match(input,MOD,FOLLOW_MOD_in_expr933); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr937);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr941);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr945); 
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
					match(input,WHILE,FOLLOW_WHILE_in_expr978); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr982);
					cond=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr985); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr989);
						t2=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 62:47: -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())
					{
						retval.st = templateLib.getInstanceOf("whilestmt",new STAttrMap().put("expr", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("statement", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("labelCond", newLabel()).put("labelWhile", newLabel()));
					}



					}
					break;
				case 18 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:7: ^( PRINT t= TYPE exp+= expr (exp+= exprPrint )* )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expr1025); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1029); 
					pushFollow(FOLLOW_expr_in_expr1033);
					exp=expr();
					state._fsp--;

					if (list_exp==null) list_exp=new ArrayList<Object>();
					list_exp.add(exp.getTemplate());
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:32: (exp+= exprPrint )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||LA3_0==CHAR_EXPR||LA3_0==COMPOUND||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= GT)||(LA3_0 >= IDENTIFIER && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= MOD)||(LA3_0 >= NOT && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TIMES && LA3_0 <= TRUE)||LA3_0==WHILE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:33: exp+= exprPrint
							{
							pushFollow(FOLLOW_exprPrint_in_expr1038);
							exp=exprPrint();
							state._fsp--;

							if (list_exp==null) list_exp=new ArrayList<Object>();
							list_exp.add(exp.getTemplate());
							}
							break;

						default :
							break loop3;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:69: -> printstmt(statements=$expvoid=$t.toString().equals(\"void\"))
					{
						retval.st = templateLib.getInstanceOf("printstmt",new STAttrMap().put("statements", list_exp).put("void", t.toString().equals("void")));
					}



					}
					break;
				case 19 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:7: ^( READ t= TYPE v= varlist )
					{
					match(input,READ,FOLLOW_READ_in_expr1081); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1085); 
					pushFollow(FOLLOW_varlist_in_expr1089);
					v=varlist();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 64:52: -> readstmt(statements=$v.st)
					{
						retval.st = templateLib.getInstanceOf("readstmt",new STAttrMap().put("statements", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 20 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:7: ^( NOT o= operand t= TYPE )
					{
					match(input,NOT,FOLLOW_NOT_in_expr1128); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1132);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1136); 
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
					match(input,PLUS_OP,FOLLOW_PLUS_OP_in_expr1179); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1183);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1187); 
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
					match(input,MINUS_OP,FOLLOW_MINUS_OP_in_expr1228); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1232);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1236); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 67:52: -> unarymin(x=$o.stinstr=\"neg\")
					{
						retval.st = templateLib.getInstanceOf("unarymin",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "neg"));
					}



					}
					break;
				case 23 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:68:9: ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? )
					{
					match(input,IF,FOLLOW_IF_in_expr1278); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1290);
						stif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_expr1301); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_expr1305);
							stif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:9: (elsestmnts= elseif )?
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ELSE && LA4_0 <= ELSEIF)) ) {
							alt4=1;
						}
						switch (alt4) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:10: elsestmnts= elseif
								{
								pushFollow(FOLLOW_elseif_in_expr1319);
								elsestmnts=elseif();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 72:53: -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())
					{
						retval.st = templateLib.getInstanceOf("ifstmnt",new STAttrMap().put("cond", (stif1!=null?((StringTemplate)stif1.getTemplate()):null)).put("statements", (stif2!=null?((StringTemplate)stif2.getTemplate()):null)).put("elseStmnts", elsestmnts).put("labelElse", newLabel()).put("labelNext", newLabel()));
					}



					}
					break;
				case 24 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:73:9: ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr1413); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1418); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1422); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1426); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_expr_in_expr1431);
					t1=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 73:57: -> assign(var=$idaddr=$aexpr=$t1.st)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("var", id).put("addr", a).put("expr", (t1!=null?((StringTemplate)t1.getTemplate()):null)));
					}



					}
					break;
				case 25 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:74:9: ^( COMPOUND t= TYPE s= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr1461); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1465); 
					pushFollow(FOLLOW_statements_in_expr1469);
					s=statements();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 74:57: -> statements(instructions=$s.st)
					{
						retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", (s!=null?((StringTemplate)s.getTemplate()):null)));
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


	public static class elseif_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "elseif"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:77:1: elseif : ( ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= statements ) -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( ELSE stelse= statements ) -> elsemaybestmnt(statements=$stelse.st));
	public final AliaCodeGeneratorStringTemplate.elseif_return elseif() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.elseif_return retval = new AliaCodeGeneratorStringTemplate.elseif_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope stelseif1 =null;
		TreeRuleReturnScope stelseif2 =null;
		TreeRuleReturnScope elsestmnts =null;
		TreeRuleReturnScope stelse =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:77:8: ( ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= statements ) -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( ELSE stelse= statements ) -> elsemaybestmnt(statements=$stelse.st))
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSEIF) ) {
				alt6=1;
			}
			else if ( (LA6_0==ELSE) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:78:4: ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= statements )
					{
					match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif1516); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_elseif1520);
						stelseif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_elseif1533); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_elseif1539);
							stelseif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						pushFollow(FOLLOW_statements_in_elseif1554);
						elsestmnts=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 80:45: -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())
					{
						retval.st = templateLib.getInstanceOf("elseifstmnt",new STAttrMap().put("cond", (stelseif1!=null?((StringTemplate)stelseif1.getTemplate()):null)).put("statements", (stelseif2!=null?((StringTemplate)stelseif2.getTemplate()):null)).put("elseStmnts", elsestmnts).put("labelElse", newLabel()).put("labelNext", newLabel()));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:81:5: ^( ELSE stelse= statements )
					{
					match(input,ELSE,FOLLOW_ELSE_in_elseif1603); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_elseif1607);
						stelse=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 81:53: -> elsemaybestmnt(statements=$stelse.st)
					{
						retval.st = templateLib.getInstanceOf("elsemaybestmnt",new STAttrMap().put("statements", (stelse!=null?((StringTemplate)stelse.getTemplate()):null)));
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
	// $ANTLR end "elseif"


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:83:1: operand : (i= identifier -> statement(instruction=$i.st)|n= NUMBER -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))|c= CHAR_EXPR -> character(c=(int) c.toString().charAt(1))|b= ( TRUE | FALSE ) -> boolean(b=$b));
	public final AliaCodeGeneratorStringTemplate.operand_return operand() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.operand_return retval = new AliaCodeGeneratorStringTemplate.operand_return();
		retval.start = input.LT(1);

		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;
		TreeRuleReturnScope i =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:5: (i= identifier -> statement(instruction=$i.st)|n= NUMBER -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))|c= CHAR_EXPR -> character(c=(int) c.toString().charAt(1))|b= ( TRUE | FALSE ) -> boolean(b=$b))
			int alt8=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt8=1;
				}
				break;
			case NUMBER:
				{
				alt8=2;
				}
				break;
			case CHAR_EXPR:
				{
				alt8=3;
				}
				break;
			case FALSE:
			case TRUE:
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:9: i= identifier
					{
					pushFollow(FOLLOW_identifier_in_operand1663);
					i=identifier();
					state._fsp--;

					// TEMPLATE REWRITE
					// 84:25: -> statement(instruction=$i.st)
					{
						retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("instruction", (i!=null?((StringTemplate)i.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1687); 
					// TEMPLATE REWRITE
					// 85:34: -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))
					{
						retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", n.toString()).put("numberType", whatNumber(Integer.parseInt(n.toString()))));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:86:9: c= CHAR_EXPR
					{
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand1729); 
					// TEMPLATE REWRITE
					// 86:34: -> character(c=(int) c.toString().charAt(1))
					{
						retval.st = templateLib.getInstanceOf("character",new STAttrMap().put("c", (int) c.toString().charAt(1)));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:9: b= ( TRUE | FALSE )
					{
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:11: ( TRUE | FALSE )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==TRUE) ) {
						alt7=1;
					}
					else if ( (LA7_0==FALSE) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:12: TRUE
							{
							b=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_operand1764); 
							}
							break;
						case 2 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:19: FALSE
							{
							b=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_operand1768); 
							}
							break;

					}

					// TEMPLATE REWRITE
					// 87:34: -> boolean(b=$b)
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


	public static class exprPrint_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprPrint"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:90:1: exprPrint : exp= expr -> printexpr(statements=$exp.st);
	public final AliaCodeGeneratorStringTemplate.exprPrint_return exprPrint() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprPrint_return retval = new AliaCodeGeneratorStringTemplate.exprPrint_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:90:11: (exp= expr -> printexpr(statements=$exp.st))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:2: exp= expr
			{
			pushFollow(FOLLOW_expr_in_exprPrint1806);
			exp=expr();
			state._fsp--;

			// TEMPLATE REWRITE
			// 91:11: -> printexpr(statements=$exp.st)
			{
				retval.st = templateLib.getInstanceOf("printexpr",new STAttrMap().put("statements", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
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
	// $ANTLR end "exprPrint"


	public static class identifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identifier"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:94:1: identifier : ^(id= IDENTIFIER t= TYPE a= ID ) -> identifier(addr=$a);
	public final AliaCodeGeneratorStringTemplate.identifier_return identifier() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.identifier_return retval = new AliaCodeGeneratorStringTemplate.identifier_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree t=null;
		CommonTree a=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:3: ( ^(id= IDENTIFIER t= TYPE a= ID ) -> identifier(addr=$a))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:5: ^(id= IDENTIFIER t= TYPE a= ID )
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1830); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_identifier1834); 
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier1838); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 95:44: -> identifier(addr=$a)
			{
				retval.st = templateLib.getInstanceOf("identifier",new STAttrMap().put("addr", a));
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
	// $ANTLR end "identifier"


	public static class varlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "varlist"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:97:1: varlist :s+= identifier (s+= identifier )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.varlist_return varlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varlist_return retval = new AliaCodeGeneratorStringTemplate.varlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:98:3: (s+= identifier (s+= identifier )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:98:5: s+= identifier (s+= identifier )*
			{
			pushFollow(FOLLOW_identifier_in_varlist1872);
			s=identifier();
			state._fsp--;

			if (list_s==null) list_s=new ArrayList<Object>();
			list_s.add(s.getTemplate());
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:5: (s+= identifier )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==IDENTIFIER) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:6: s+= identifier
					{
					pushFollow(FOLLOW_identifier_in_varlist1881);
					s=identifier();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					break loop9;
				}
			}

			// TEMPLATE REWRITE
			// 100:5: -> statements(instructions=$s)
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
	// $ANTLR end "varlist"


	public static class exprlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprlist"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:104:1: exprlist :s+= expr (s+= expr )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.exprlist_return exprlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprlist_return retval = new AliaCodeGeneratorStringTemplate.exprlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:105:5: (s+= expr (s+= expr )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:105:7: s+= expr (s+= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist1913);
			s=expr();
			state._fsp--;

			if (list_s==null) list_s=new ArrayList<Object>();
			list_s.add(s.getTemplate());
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:106:5: (s+= expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= AND && LA10_0 <= BECOMES)||LA10_0==CHAR_EXPR||LA10_0==COMPOUND||LA10_0==DIV||LA10_0==EQ||LA10_0==FALSE||(LA10_0 >= GE && LA10_0 <= GT)||(LA10_0 >= IDENTIFIER && LA10_0 <= IF)||LA10_0==LE||(LA10_0 >= LT && LA10_0 <= MOD)||(LA10_0 >= NOT && LA10_0 <= PRINT)||LA10_0==READ||(LA10_0 >= TIMES && LA10_0 <= TRUE)||LA10_0==WHILE) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:106:6: s+= expr
					{
					pushFollow(FOLLOW_expr_in_exprlist1922);
					s=expr();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					break loop10;
				}
			}

			// TEMPLATE REWRITE
			// 107:5: -> statements(instructions=$s)
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
	// $ANTLR end "exprlist"


	public static class type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:110:1: type : ( INTEGER | CHAR | BOOL );
	public final AliaCodeGeneratorStringTemplate.type_return type() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.type_return retval = new AliaCodeGeneratorStringTemplate.type_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:111:5: ( INTEGER | CHAR | BOOL )
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



	public static final BitSet FOLLOW_expr_in_program161 = new BitSet(new long[]{0x4C27FBC4DA844472L});
	public static final BitSet FOLLOW_expr_in_statements203 = new BitSet(new long[]{0x4C27FBC4DA844472L});
	public static final BitSet FOLLOW_operand_in_expr251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_expr277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr281 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr285 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr336 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr374 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr421 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr425 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr467 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr471 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr514 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr518 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr561 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr565 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr608 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr612 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr616 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr655 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr659 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr702 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr706 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr749 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr753 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr757 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr796 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr800 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr804 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr843 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr847 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr886 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr890 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr894 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr937 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr941 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr945 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expr978 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr982 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr985 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr989 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_expr1025 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1029 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr1033 = new BitSet(new long[]{0x4C27FBC4DA844478L});
	public static final BitSet FOLLOW_exprPrint_in_expr1038 = new BitSet(new long[]{0x4C27FBC4DA844478L});
	public static final BitSet FOLLOW_READ_in_expr1081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1085 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_varlist_in_expr1089 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr1128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1132 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_OP_in_expr1179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1183 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1187 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_OP_in_expr1228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1232 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1236 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr1278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1290 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr1301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1305 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_elseif_in_expr1319 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr1413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1422 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_expr1426 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_expr1431 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr1461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1465 = new BitSet(new long[]{0x4C27FBC4DA844478L});
	public static final BitSet FOLLOW_statements_in_expr1469 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_elseif1516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1520 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_elseif1533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1539 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statements_in_elseif1554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_elseif1603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_operand1663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprPrint1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier1830 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_identifier1834 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_identifier1838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_varlist1872 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_identifier_in_varlist1881 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_expr_in_exprlist1913 = new BitSet(new long[]{0x4C27FBC4DA844472L});
	public static final BitSet FOLLOW_expr_in_exprlist1922 = new BitSet(new long[]{0x4C27FBC4DA844472L});
}
