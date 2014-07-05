// $ANTLR 3.5.2 src\\alia\\AliaCodeGeneratorStringTemplate.g 2014-07-05 08:30:15

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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:1: expr : (o= operand -> statement(instruction=$o.st)| ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= expr ^( DO t2= statements ) ) -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())| ^( PRINT t= TYPE te= TYPE fexp= expr (exp+= exprPrint )* ) -> printstmt(firststatement=$fexp.ststatements=$exptype=getType($t.toString())t=getType($te.toString()).T)| ^( READ t= TYPE ^(id= IDENTIFIER t= TYPE a= ID ) (v+= varRead )* ) -> readstmt(statements=$vaddr=$atype=getType($t.toString())t=getType($t.toString()).Tvoid=$t.toString().equals(\"void\"))| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? ) -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(instructions=$s.st));
	public final AliaCodeGeneratorStringTemplate.expr_return expr() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.expr_return retval = new AliaCodeGeneratorStringTemplate.expr_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		CommonTree te=null;
		CommonTree id=null;
		CommonTree a=null;
		List<Object> list_exp=null;
		List<Object> list_v=null;
		TreeRuleReturnScope o =null;
		TreeRuleReturnScope t1 =null;
		TreeRuleReturnScope t2 =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope fexp =null;
		TreeRuleReturnScope stif1 =null;
		TreeRuleReturnScope stif2 =null;
		TreeRuleReturnScope elsestmnts =null;
		TreeRuleReturnScope s =null;
		RuleReturnScope exp = null;
		RuleReturnScope v = null;
		 
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:5: (o= operand -> statement(instruction=$o.st)| ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= expr ^( DO t2= statements ) ) -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())| ^( PRINT t= TYPE te= TYPE fexp= expr (exp+= exprPrint )* ) -> printstmt(firststatement=$fexp.ststatements=$exptype=getType($t.toString())t=getType($te.toString()).T)| ^( READ t= TYPE ^(id= IDENTIFIER t= TYPE a= ID ) (v+= varRead )* ) -> readstmt(statements=$vaddr=$atype=getType($t.toString())t=getType($t.toString()).Tvoid=$t.toString().equals(\"void\"))| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? ) -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(instructions=$s.st))
			int alt6=25;
			switch ( input.LA(1) ) {
			case CHAR_EXPR:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt6=1;
				}
				break;
			case OR:
				{
				alt6=2;
				}
				break;
			case OR_ALT:
				{
				alt6=3;
				}
				break;
			case AND:
				{
				alt6=4;
				}
				break;
			case AND_ALT:
				{
				alt6=5;
				}
				break;
			case EQ:
				{
				alt6=6;
				}
				break;
			case NQ:
				{
				alt6=7;
				}
				break;
			case LE:
				{
				alt6=8;
				}
				break;
			case GE:
				{
				alt6=9;
				}
				break;
			case GT:
				{
				alt6=10;
				}
				break;
			case LT:
				{
				alt6=11;
				}
				break;
			case PLUS:
				{
				alt6=12;
				}
				break;
			case MINUS:
				{
				alt6=13;
				}
				break;
			case TIMES:
				{
				alt6=14;
				}
				break;
			case DIV:
				{
				alt6=15;
				}
				break;
			case MOD:
				{
				alt6=16;
				}
				break;
			case WHILE:
				{
				alt6=17;
				}
				break;
			case PRINT:
				{
				alt6=18;
				}
				break;
			case READ:
				{
				alt6=19;
				}
				break;
			case NOT:
				{
				alt6=20;
				}
				break;
			case PLUS_OP:
				{
				alt6=21;
				}
				break;
			case MINUS_OP:
				{
				alt6=22;
				}
				break;
			case IF:
				{
				alt6=23;
				}
				break;
			case BECOMES:
				{
				alt6=24;
				}
				break;
			case COMPOUND:
				{
				alt6=25;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_expr263);
					o=operand();
					state._fsp--;

					// TEMPLATE REWRITE
					// 47:25: -> statement(instruction=$o.st)
					{
						retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("instruction", (o!=null?((StringTemplate)o.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:48:9: ^( OR t1= expr t2= expr t= TYPE )
					{
					match(input,OR,FOLLOW_OR_in_expr289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr293);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr297);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr301); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 48:42: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:49:9: ^( OR_ALT t1= expr t2= expr t= TYPE )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr336); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr340);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr344);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr348); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 49:45: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:50:9: ^( AND t1= expr t2= expr t= TYPE )
					{
					match(input,AND,FOLLOW_AND_in_expr382); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr386);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr390);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr394); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 50:43: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 5 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:51:9: ^( AND_ALT t1= expr t2= expr t= TYPE )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr429); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr433);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr437);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr441); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 51:46: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 6 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:52:9: ^( EQ t1= expr t2= expr t= TYPE )
					{
					match(input,EQ,FOLLOW_EQ_in_expr475); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr479);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr483);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr487); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 52:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "eq"));
					}



					}
					break;
				case 7 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:53:9: ^( NQ t1= expr t2= expr t= TYPE )
					{
					match(input,NQ,FOLLOW_NQ_in_expr522); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr526);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr530);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr534); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 53:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ne"));
					}



					}
					break;
				case 8 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:54:9: ^( LE t1= expr t2= expr t= TYPE )
					{
					 startExpression(); 
					match(input,LE,FOLLOW_LE_in_expr570); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr574);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr578);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr582); 
					match(input, Token.UP, null); 

					 decStack();endExpression(); 
					// TEMPLATE REWRITE
					// 54:95: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "le"));
					}



					}
					break;
				case 9 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:55:9: ^( GE t1= expr t2= expr t= TYPE )
					{
					match(input,GE,FOLLOW_GE_in_expr618); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr622);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr626);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr630); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 55:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ge"));
					}



					}
					break;
				case 10 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:56:9: ^( GT t1= expr t2= expr t= TYPE )
					{
					match(input,GT,FOLLOW_GT_in_expr665); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr669);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr673);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr677); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 56:42: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "gt"));
					}



					}
					break;
				case 11 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:57:9: ^( LT t1= expr t2= expr t= TYPE )
					{
					 startExpression(); 
					match(input,LT,FOLLOW_LT_in_expr713); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr717);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr721);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr725); 
					match(input, Token.UP, null); 

					 decStack();endExpression(); 
					// TEMPLATE REWRITE
					// 57:95: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "lt"));
					}



					}
					break;
				case 12 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:58:9: ^( PLUS t1= expr t2= expr t= TYPE )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr761); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr765);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr769);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr773); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 58:44: -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "add"));
					}



					}
					break;
				case 13 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:59:9: ^( MINUS t1= expr t2= expr t= TYPE )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr808); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr812);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr816);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr820); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 59:45: -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "sub"));
					}



					}
					break;
				case 14 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:60:9: ^( TIMES t1= expr t2= expr t= TYPE )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr855); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr859);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr863);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr867); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 60:45: -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "mul"));
					}



					}
					break;
				case 15 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:61:9: ^( DIV t1= expr t2= expr t= TYPE )
					{
					match(input,DIV,FOLLOW_DIV_in_expr902); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr906);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr910);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr914); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 61:43: -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "div"));
					}



					}
					break;
				case 16 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:62:9: ^( MOD t1= expr t2= expr t= TYPE )
					{
					match(input,MOD,FOLLOW_MOD_in_expr949); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr953);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr957);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr961); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 62:43: -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "rem"));
					}



					}
					break;
				case 17 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:7: ^( WHILE cond= expr ^( DO t2= statements ) )
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr994); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr998);
					cond=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr1001); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1005);
						t2=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:47: -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())
					{
						retval.st = templateLib.getInstanceOf("whilestmt",new STAttrMap().put("expr", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("statement", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("labelCond", newLabel()).put("labelWhile", newLabel()));
					}



					}
					break;
				case 18 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:7: ^( PRINT t= TYPE te= TYPE fexp= expr (exp+= exprPrint )* )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expr1041); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1045); 
					te=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1049); 
					pushFollow(FOLLOW_expr_in_expr1053);
					fexp=expr();
					state._fsp--;

					// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:40: (exp+= exprPrint )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==TYPE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:41: exp+= exprPrint
							{
							pushFollow(FOLLOW_exprPrint_in_expr1058);
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
					// 64:77: -> printstmt(firststatement=$fexp.ststatements=$exptype=getType($t.toString())t=getType($te.toString()).T)
					{
						retval.st = templateLib.getInstanceOf("printstmt",new STAttrMap().put("firststatement", (fexp!=null?((StringTemplate)fexp.getTemplate()):null)).put("statements", list_exp).put("type", getType(t.toString())).put("t", getType(te.toString()).T));
					}



					}
					break;
				case 19 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:7: ^( READ t= TYPE ^(id= IDENTIFIER t= TYPE a= ID ) (v+= varRead )* )
					{
					match(input,READ,FOLLOW_READ_in_expr1109); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1113); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1118); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1122); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1126); 
					match(input, Token.UP, null); 

					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:50: (v+= varRead )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==IDENTIFIER) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:51: v+= varRead
							{
							pushFollow(FOLLOW_varRead_in_expr1132);
							v=varRead();
							state._fsp--;

							if (list_v==null) list_v=new ArrayList<Object>();
							list_v.add(v.getTemplate());
							}
							break;

						default :
							break loop4;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 65:85: -> readstmt(statements=$vaddr=$atype=getType($t.toString())t=getType($t.toString()).Tvoid=$t.toString().equals(\"void\"))
					{
						retval.st = templateLib.getInstanceOf("readstmt",new STAttrMap().put("statements", list_v).put("addr", a).put("type", getType(t.toString())).put("t", getType(t.toString()).T).put("void", t.toString().equals("void")));
					}



					}
					break;
				case 20 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:66:7: ^( NOT o= operand t= TYPE )
					{
					match(input,NOT,FOLLOW_NOT_in_expr1189); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1193);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1197); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 66:50: -> unarynot(x=$o.stinstr=\"not\")
					{
						retval.st = templateLib.getInstanceOf("unarynot",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "not"));
					}



					}
					break;
				case 21 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:67:7: ^( PLUS_OP o= operand t= TYPE )
					{
					match(input,PLUS_OP,FOLLOW_PLUS_OP_in_expr1240); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1244);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1248); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 67:52: -> unaryplus(x=$o.stinstr=\"plus\")
					{
						retval.st = templateLib.getInstanceOf("unaryplus",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "plus"));
					}



					}
					break;
				case 22 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:68:7: ^( MINUS_OP o= operand t= TYPE )
					{
					match(input,MINUS_OP,FOLLOW_MINUS_OP_in_expr1289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1293);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1297); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 68:52: -> unarymin(x=$o.stinstr=\"neg\")
					{
						retval.st = templateLib.getInstanceOf("unarymin",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "neg"));
					}



					}
					break;
				case 23 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:69:9: ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? )
					{
					 startExpression(); 
					match(input,IF,FOLLOW_IF_in_expr1341); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1353);
						stif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_expr1364); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_expr1368);
							stif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:72:9: (elsestmnts= elseif )?
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= ELSE && LA5_0 <= ELSEIF)) ) {
							alt5=1;
						}
						switch (alt5) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:72:10: elsestmnts= elseif
								{
								pushFollow(FOLLOW_elseif_in_expr1382);
								elsestmnts=elseif();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					 decStack();endExpression(); 
					// TEMPLATE REWRITE
					// 73:85: -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())
					{
						retval.st = templateLib.getInstanceOf("ifstmnt",new STAttrMap().put("cond", (stif1!=null?((StringTemplate)stif1.getTemplate()):null)).put("statements", (stif2!=null?((StringTemplate)stif2.getTemplate()):null)).put("elseStmnts", elsestmnts).put("labelElse", newLabel()).put("labelNext", newLabel()));
					}



					}
					break;
				case 24 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:74:9: ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr )
					{
					 startExpression(); 
					match(input,BECOMES,FOLLOW_BECOMES_in_expr1479); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1484); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1488); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1492); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_expr_in_expr1497);
					t1=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 decStack();endExpression(); 
					// TEMPLATE REWRITE
					// 74:110: -> assign(var=$idaddr=$aexpr=$t1.st)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("var", id).put("addr", a).put("expr", (t1!=null?((StringTemplate)t1.getTemplate()):null)));
					}



					}
					break;
				case 25 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:75:9: ^( COMPOUND t= TYPE s= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr1528); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1532); 
					pushFollow(FOLLOW_statements_in_expr1536);
					s=statements();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 75:57: -> statements(instructions=$s.st)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:78:1: elseif : ( ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= statements ) -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( ELSE stelse= statements ) -> elsemaybestmnt(statements=$stelse.st));
	public final AliaCodeGeneratorStringTemplate.elseif_return elseif() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.elseif_return retval = new AliaCodeGeneratorStringTemplate.elseif_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope stelseif1 =null;
		TreeRuleReturnScope stelseif2 =null;
		TreeRuleReturnScope elsestmnts =null;
		TreeRuleReturnScope stelse =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:78:8: ( ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= statements ) -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( ELSE stelse= statements ) -> elsemaybestmnt(statements=$stelse.st))
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ELSEIF) ) {
				alt7=1;
			}
			else if ( (LA7_0==ELSE) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:79:4: ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= statements )
					{
					match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif1583); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_elseif1587);
						stelseif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_elseif1600); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_elseif1606);
							stelseif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						pushFollow(FOLLOW_statements_in_elseif1621);
						elsestmnts=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 81:45: -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())
					{
						retval.st = templateLib.getInstanceOf("elseifstmnt",new STAttrMap().put("cond", (stelseif1!=null?((StringTemplate)stelseif1.getTemplate()):null)).put("statements", (stelseif2!=null?((StringTemplate)stelseif2.getTemplate()):null)).put("elseStmnts", elsestmnts).put("labelElse", newLabel()).put("labelNext", newLabel()));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:82:5: ^( ELSE stelse= statements )
					{
					match(input,ELSE,FOLLOW_ELSE_in_elseif1670); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_elseif1674);
						stelse=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 82:53: -> elsemaybestmnt(statements=$stelse.st)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:1: operand : (i= identifier -> statement(instruction=$i.st)|n= NUMBER -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))|c= CHAR_EXPR -> character(c=(int) c.toString().charAt(1))|b= ( TRUE | FALSE ) -> boolean(b=$b));
	public final AliaCodeGeneratorStringTemplate.operand_return operand() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.operand_return retval = new AliaCodeGeneratorStringTemplate.operand_return();
		retval.start = input.LT(1);

		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;
		TreeRuleReturnScope i =null;

		incStack();
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:5: (i= identifier -> statement(instruction=$i.st)|n= NUMBER -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))|c= CHAR_EXPR -> character(c=(int) c.toString().charAt(1))|b= ( TRUE | FALSE ) -> boolean(b=$b))
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:9: i= identifier
					{
					pushFollow(FOLLOW_identifier_in_operand1735);
					i=identifier();
					state._fsp--;

					// TEMPLATE REWRITE
					// 85:25: -> statement(instruction=$i.st)
					{
						retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("instruction", (i!=null?((StringTemplate)i.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:86:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1759); 
					// TEMPLATE REWRITE
					// 86:34: -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))
					{
						retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", n.toString()).put("numberType", whatNumber(Integer.parseInt(n.toString()))));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:87:9: c= CHAR_EXPR
					{
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand1801); 
					// TEMPLATE REWRITE
					// 87:34: -> character(c=(int) c.toString().charAt(1))
					{
						retval.st = templateLib.getInstanceOf("character",new STAttrMap().put("c", (int) c.toString().charAt(1)));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:9: b= ( TRUE | FALSE )
					{
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:11: ( TRUE | FALSE )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==TRUE) ) {
						alt8=1;
					}
					else if ( (LA8_0==FALSE) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:12: TRUE
							{
							b=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_operand1836); 
							}
							break;
						case 2 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:19: FALSE
							{
							b=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_operand1840); 
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


	public static class exprPrint_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprPrint"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:1: exprPrint : t= TYPE exp= expr -> printexpr(statements=$exp.stt=getType($t.toString()).T);
	public final AliaCodeGeneratorStringTemplate.exprPrint_return exprPrint() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprPrint_return retval = new AliaCodeGeneratorStringTemplate.exprPrint_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		TreeRuleReturnScope exp =null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:91:11: (t= TYPE exp= expr -> printexpr(statements=$exp.stt=getType($t.toString()).T))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:2: t= TYPE exp= expr
			{
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_exprPrint1878); 
			pushFollow(FOLLOW_expr_in_exprPrint1882);
			exp=expr();
			state._fsp--;

			// TEMPLATE REWRITE
			// 92:18: -> printexpr(statements=$exp.stt=getType($t.toString()).T)
			{
				retval.st = templateLib.getInstanceOf("printexpr",new STAttrMap().put("statements", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("t", getType(t.toString()).T));
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


	public static class varRead_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "varRead"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:1: varRead : ^(id= IDENTIFIER t= TYPE a= ID ) -> readvar(var=$idaddr=$a);
	public final AliaCodeGeneratorStringTemplate.varRead_return varRead() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varRead_return retval = new AliaCodeGeneratorStringTemplate.varRead_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree t=null;
		CommonTree a=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:95:9: ( ^(id= IDENTIFIER t= TYPE a= ID ) -> readvar(var=$idaddr=$a))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:96:2: ^(id= IDENTIFIER t= TYPE a= ID )
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varRead1910); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varRead1914); 
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_varRead1918); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 96:31: -> readvar(var=$idaddr=$a)
			{
				retval.st = templateLib.getInstanceOf("readvar",new STAttrMap().put("var", id).put("addr", a));
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
	// $ANTLR end "varRead"


	public static class identifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identifier"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:99:1: identifier : ^(id= IDENTIFIER t= TYPE a= ID ) -> identifier(addr=$a);
	public final AliaCodeGeneratorStringTemplate.identifier_return identifier() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.identifier_return retval = new AliaCodeGeneratorStringTemplate.identifier_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree t=null;
		CommonTree a=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:3: ( ^(id= IDENTIFIER t= TYPE a= ID ) -> identifier(addr=$a))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:5: ^(id= IDENTIFIER t= TYPE a= ID )
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1947); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_identifier1951); 
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier1955); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 100:44: -> identifier(addr=$a)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:103:1: varlist :s+= identifier (s+= identifier )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.varlist_return varlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varlist_return retval = new AliaCodeGeneratorStringTemplate.varlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:104:3: (s+= identifier (s+= identifier )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:104:5: s+= identifier (s+= identifier )*
			{
			pushFollow(FOLLOW_identifier_in_varlist1990);
			s=identifier();
			state._fsp--;

			if (list_s==null) list_s=new ArrayList<Object>();
			list_s.add(s.getTemplate());
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:105:5: (s+= identifier )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENTIFIER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:105:6: s+= identifier
					{
					pushFollow(FOLLOW_identifier_in_varlist1999);
					s=identifier();
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
			// 106:5: -> statements(instructions=$s)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:108:1: exprlist :s+= expr (s+= expr )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.exprlist_return exprlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprlist_return retval = new AliaCodeGeneratorStringTemplate.exprlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:109:5: (s+= expr (s+= expr )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:109:7: s+= expr (s+= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist2029);
			s=expr();
			state._fsp--;

			if (list_s==null) list_s=new ArrayList<Object>();
			list_s.add(s.getTemplate());
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:110:5: (s+= expr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= AND && LA11_0 <= BECOMES)||LA11_0==CHAR_EXPR||LA11_0==COMPOUND||LA11_0==DIV||LA11_0==EQ||LA11_0==FALSE||(LA11_0 >= GE && LA11_0 <= GT)||(LA11_0 >= IDENTIFIER && LA11_0 <= IF)||LA11_0==LE||(LA11_0 >= LT && LA11_0 <= MOD)||(LA11_0 >= NOT && LA11_0 <= PRINT)||LA11_0==READ||(LA11_0 >= TIMES && LA11_0 <= TRUE)||LA11_0==WHILE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:110:6: s+= expr
					{
					pushFollow(FOLLOW_expr_in_exprlist2038);
					s=expr();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					break loop11;
				}
			}

			// TEMPLATE REWRITE
			// 111:5: -> statements(instructions=$s)
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:114:1: type : ( INTEGER | CHAR | BOOL );
	public final AliaCodeGeneratorStringTemplate.type_return type() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.type_return retval = new AliaCodeGeneratorStringTemplate.type_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:115:5: ( INTEGER | CHAR | BOOL )
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
	public static final BitSet FOLLOW_operand_in_expr263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_expr289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr293 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr297 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr301 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr340 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr344 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr348 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr386 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr390 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr394 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr433 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr437 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr475 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr479 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr483 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr526 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr530 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr534 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr570 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr574 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr578 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr618 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr622 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr626 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr665 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr669 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr673 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr717 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr721 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr765 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr769 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr773 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr808 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr812 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr816 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr859 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr863 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr867 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr906 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr910 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr914 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr953 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr957 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr961 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expr994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr998 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr1001 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1005 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_expr1041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1045 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1049 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_expr1053 = new BitSet(new long[]{0x1000000000000008L});
	public static final BitSet FOLLOW_exprPrint_in_expr1058 = new BitSet(new long[]{0x1000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr1109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1113 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1122 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_expr1126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_varRead_in_expr1132 = new BitSet(new long[]{0x0000000040000008L});
	public static final BitSet FOLLOW_NOT_in_expr1189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1193 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_OP_in_expr1240 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1244 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1248 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_OP_in_expr1289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1293 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr1341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1353 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr1364 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_elseif_in_expr1382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr1479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1488 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_expr1492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_expr1497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr1528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1532 = new BitSet(new long[]{0x4C27FBC4DA844478L});
	public static final BitSet FOLLOW_statements_in_expr1536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_elseif1583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1587 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_elseif1600 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1606 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statements_in_elseif1621 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_elseif1670 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_operand1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_exprPrint1878 = new BitSet(new long[]{0x4C27FBC4DA844470L});
	public static final BitSet FOLLOW_expr_in_exprPrint1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varRead1910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_varRead1914 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_varRead1918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier1947 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_identifier1951 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_identifier1955 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_varlist1990 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_identifier_in_varlist1999 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_expr_in_exprlist2029 = new BitSet(new long[]{0x4C27FBC4DA844472L});
	public static final BitSet FOLLOW_expr_in_exprlist2038 = new BitSet(new long[]{0x4C27FBC4DA844472L});
}
