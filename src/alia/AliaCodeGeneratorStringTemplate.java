// $ANTLR 3.5.2 src\\alia\\AliaCodeGeneratorStringTemplate.g 2014-07-09 14:07:19

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
		"LE", "LETTER", "LOCALSIZE", "LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", 
		"MOD", "NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", 
		"PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "SQUOTE", 
		"STRING", "TIMES", "TRUE", "TYPE", "UPPER", "WHILE", "WS", "INTEGER"
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
	public static final int LOCALSIZE=36;
	public static final int LOWER=37;
	public static final int LPAREN=38;
	public static final int LT=39;
	public static final int MINUS=40;
	public static final int MINUS_OP=41;
	public static final int MOD=42;
	public static final int NEWLINE=43;
	public static final int NOT=44;
	public static final int NQ=45;
	public static final int NUMBER=46;
	public static final int OR=47;
	public static final int OR_ALT=48;
	public static final int PLUS=49;
	public static final int PLUS_OP=50;
	public static final int PRINT=51;
	public static final int PROGRAM=52;
	public static final int RCURLY=53;
	public static final int READ=54;
	public static final int RPAREN=55;
	public static final int SEMICOLON=56;
	public static final int SQUOTE=57;
	public static final int STRING=58;
	public static final int TIMES=59;
	public static final int TRUE=60;
	public static final int TYPE=61;
	public static final int UPPER=62;
	public static final int WHILE=63;
	public static final int WS=64;
	public static final int INTEGER=65;

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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:19:1: program : localSize= LOCALSIZE (s+= exprPop )+ -> file(instructions=$sstackMax=getStackMax()localSize=$localSizeclassname=getProgramClass());
	public final AliaCodeGeneratorStringTemplate.program_return program() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.program_return retval = new AliaCodeGeneratorStringTemplate.program_return();
		retval.start = input.LT(1);

		CommonTree localSize=null;
		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:20:5: (localSize= LOCALSIZE (s+= exprPop )+ -> file(instructions=$sstackMax=getStackMax()localSize=$localSizeclassname=getProgramClass()))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:21:7: localSize= LOCALSIZE (s+= exprPop )+
			{
			localSize=(CommonTree)match(input,LOCALSIZE,FOLLOW_LOCALSIZE_in_program146); 
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:21:27: (s+= exprPop )+
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:21:28: s+= exprPop
					{
					pushFollow(FOLLOW_exprPop_in_program151);
					s=exprPop();
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
			// 22:13: -> file(instructions=$sstackMax=getStackMax()localSize=$localSizeclassname=getProgramClass())
			{
				retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("instructions", list_s).put("stackMax", getStackMax()).put("localSize", localSize).put("classname", getProgramClass()));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:25:1: statements : (s+= exprPopInterleaved )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.statements_return statements() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.statements_return retval = new AliaCodeGeneratorStringTemplate.statements_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		 startExpression(); 
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:27:3: ( (s+= exprPopInterleaved )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:27:5: (s+= exprPopInterleaved )*
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:27:5: (s+= exprPopInterleaved )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= AND && LA2_0 <= BECOMES)||LA2_0==CHAR_EXPR||LA2_0==COMPOUND||LA2_0==DIV||LA2_0==EQ||LA2_0==FALSE||(LA2_0 >= GE && LA2_0 <= GT)||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LE||(LA2_0 >= LT && LA2_0 <= MOD)||(LA2_0 >= NOT && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:27:6: s+= exprPopInterleaved
					{
					pushFollow(FOLLOW_exprPopInterleaved_in_statements220);
					s=exprPopInterleaved();
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
			// 27:30: -> statements(instructions=$s)
			{
				retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", list_s));
			}



			}

			 endExpression(); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statementsPop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statementsPop"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:29:1: statementsPop : (s+= exprPop )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.statementsPop_return statementsPop() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.statementsPop_return retval = new AliaCodeGeneratorStringTemplate.statementsPop_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		 startExpression(); 
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:31:3: ( (s+= exprPop )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:31:5: (s+= exprPop )*
			{
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:31:5: (s+= exprPop )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= AND && LA3_0 <= BECOMES)||LA3_0==CHAR_EXPR||LA3_0==COMPOUND||LA3_0==DIV||LA3_0==EQ||LA3_0==FALSE||(LA3_0 >= GE && LA3_0 <= GT)||(LA3_0 >= IDENTIFIER && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= MOD)||(LA3_0 >= NOT && LA3_0 <= PRINT)||LA3_0==READ||(LA3_0 >= TIMES && LA3_0 <= TRUE)||LA3_0==WHILE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:31:6: s+= exprPop
					{
					pushFollow(FOLLOW_exprPop_in_statementsPop260);
					s=exprPop();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					break loop3;
				}
			}

			// TEMPLATE REWRITE
			// 31:19: -> statements(instructions=$s)
			{
				retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", list_s));
			}



			}

			 endExpression(); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statementsPop"


	public static class exprPopInterleaved_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprPopInterleaved"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:33:1: exprPopInterleaved :s= expr -> exprPopInterleaved(instruction=$s.stpop=pop);
	public final AliaCodeGeneratorStringTemplate.exprPopInterleaved_return exprPopInterleaved() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprPopInterleaved_return retval = new AliaCodeGeneratorStringTemplate.exprPopInterleaved_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;

		 String pop = ""; 
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:3: (s= expr -> exprPopInterleaved(instruction=$s.stpop=pop))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:34:5: s= expr
			{
			pop=pops(endExpression());startExpression();
			pushFollow(FOLLOW_expr_in_exprPopInterleaved306);
			s=expr();
			state._fsp--;

			// TEMPLATE REWRITE
			// 35:11: -> exprPopInterleaved(instruction=$s.stpop=pop)
			{
				retval.st = templateLib.getInstanceOf("exprPopInterleaved",new STAttrMap().put("instruction", (s!=null?((StringTemplate)s.getTemplate()):null)).put("pop", pop));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprPopInterleaved"


	public static class exprPop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprPop"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:37:1: exprPop :s= expr -> exprPop(instruction=$s.stpop=pop);
	public final AliaCodeGeneratorStringTemplate.exprPop_return exprPop() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprPop_return retval = new AliaCodeGeneratorStringTemplate.exprPop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;

		 String pop = ""; 
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:3: (s= expr -> exprPop(instruction=$s.stpop=pop))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:38:5: s= expr
			{
			startExpression();
			pushFollow(FOLLOW_expr_in_exprPop355);
			s=expr();
			state._fsp--;

			pop=pops(endExpression());
			// TEMPLATE REWRITE
			// 40:33: -> exprPop(instruction=$s.stpop=pop)
			{
				retval.st = templateLib.getInstanceOf("exprPop",new STAttrMap().put("instruction", (s!=null?((StringTemplate)s.getTemplate()):null)).put("pop", pop));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprPop"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:42:1: expr : (o= operand -> statement(instruction=$o.st)| ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= statements ^( DO t2= statementsPop ) ) -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())| ^( PRINT t= TYPE te= TYPE fexp= expr (exp+= exprPrint )* ) -> printstmt(firststatement=$fexp.ststatements=$exptype=getType($t.toString())t=getType($te.toString()).T)| ^( READ t= TYPE ^(id= IDENTIFIER t= TYPE a= ID ) (v+= varRead )* ) -> readstmt(statements=$vaddr=$atype=getType($t.toString())t=getType($t.toString()).Tvoid=$t.toString().equals(\"void\")classname=getProgramClass())| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? ) -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(instructions=$s.st));
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
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:44:5: (o= operand -> statement(instruction=$o.st)| ^( OR t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( OR_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")| ^( AND t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( AND_ALT t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")| ^( EQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")| ^( NQ t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")| ^( LE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")| ^( GE t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")| ^( GT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")| ^( LT t1= expr t2= expr t= TYPE ) -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")| ^( PLUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")| ^( MINUS t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")| ^( TIMES t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")| ^( DIV t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")| ^( MOD t1= expr t2= expr t= TYPE ) -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")| ^( WHILE cond= statements ^( DO t2= statementsPop ) ) -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())| ^( PRINT t= TYPE te= TYPE fexp= expr (exp+= exprPrint )* ) -> printstmt(firststatement=$fexp.ststatements=$exptype=getType($t.toString())t=getType($te.toString()).T)| ^( READ t= TYPE ^(id= IDENTIFIER t= TYPE a= ID ) (v+= varRead )* ) -> readstmt(statements=$vaddr=$atype=getType($t.toString())t=getType($t.toString()).Tvoid=$t.toString().equals(\"void\")classname=getProgramClass())| ^( NOT o= operand t= TYPE ) -> unarynot(x=$o.stinstr=\"not\")| ^( PLUS_OP o= operand t= TYPE ) -> unaryplus(x=$o.stinstr=\"plus\")| ^( MINUS_OP o= operand t= TYPE ) -> unarymin(x=$o.stinstr=\"neg\")| ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? ) -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr ) -> assign(var=$idaddr=$aexpr=$t1.st)| ^( COMPOUND t= TYPE s= statements ) -> statements(instructions=$s.st))
			int alt7=25;
			switch ( input.LA(1) ) {
			case CHAR_EXPR:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt7=1;
				}
				break;
			case OR:
				{
				alt7=2;
				}
				break;
			case OR_ALT:
				{
				alt7=3;
				}
				break;
			case AND:
				{
				alt7=4;
				}
				break;
			case AND_ALT:
				{
				alt7=5;
				}
				break;
			case EQ:
				{
				alt7=6;
				}
				break;
			case NQ:
				{
				alt7=7;
				}
				break;
			case LE:
				{
				alt7=8;
				}
				break;
			case GE:
				{
				alt7=9;
				}
				break;
			case GT:
				{
				alt7=10;
				}
				break;
			case LT:
				{
				alt7=11;
				}
				break;
			case PLUS:
				{
				alt7=12;
				}
				break;
			case MINUS:
				{
				alt7=13;
				}
				break;
			case TIMES:
				{
				alt7=14;
				}
				break;
			case DIV:
				{
				alt7=15;
				}
				break;
			case MOD:
				{
				alt7=16;
				}
				break;
			case WHILE:
				{
				alt7=17;
				}
				break;
			case PRINT:
				{
				alt7=18;
				}
				break;
			case READ:
				{
				alt7=19;
				}
				break;
			case NOT:
				{
				alt7=20;
				}
				break;
			case PLUS_OP:
				{
				alt7=21;
				}
				break;
			case MINUS_OP:
				{
				alt7=22;
				}
				break;
			case IF:
				{
				alt7=23;
				}
				break;
			case BECOMES:
				{
				alt7=24;
				}
				break;
			case COMPOUND:
				{
				alt7=25;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:44:9: o= operand
					{
					pushFollow(FOLLOW_operand_in_expr403);
					o=operand();
					state._fsp--;

					// TEMPLATE REWRITE
					// 44:25: -> statement(instruction=$o.st)
					{
						retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("instruction", (o!=null?((StringTemplate)o.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:45:9: ^( OR t1= expr t2= expr t= TYPE )
					{
					match(input,OR,FOLLOW_OR_in_expr429); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr433);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr437);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr441); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 45:56: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:46:9: ^( OR_ALT t1= expr t2= expr t= TYPE )
					{
					match(input,OR_ALT,FOLLOW_OR_ALT_in_expr478); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr482);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr486);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr490); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 46:59: -> binexpr(x=$t1.sty=$t2.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:47:9: ^( AND t1= expr t2= expr t= TYPE )
					{
					match(input,AND,FOLLOW_AND_in_expr526); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr530);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr534);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr538); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 47:57: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 5 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:48:9: ^( AND_ALT t1= expr t2= expr t= TYPE )
					{
					match(input,AND_ALT,FOLLOW_AND_ALT_in_expr575); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr579);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr583);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr587); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 48:60: -> binexpr(x=$t1.sty=$t2.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 6 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:49:9: ^( EQ t1= expr t2= expr t= TYPE )
					{
					match(input,EQ,FOLLOW_EQ_in_expr623); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr627);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr631);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr635); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 49:56: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"eq\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "eq"));
					}



					}
					break;
				case 7 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:50:9: ^( NQ t1= expr t2= expr t= TYPE )
					{
					match(input,NQ,FOLLOW_NQ_in_expr672); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr676);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr680);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr684); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 50:56: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ne\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ne"));
					}



					}
					break;
				case 8 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:51:9: ^( LE t1= expr t2= expr t= TYPE )
					{
					match(input,LE,FOLLOW_LE_in_expr721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr725);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr729);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr733); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 51:56: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"le\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "le"));
					}



					}
					break;
				case 9 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:52:9: ^( GE t1= expr t2= expr t= TYPE )
					{
					match(input,GE,FOLLOW_GE_in_expr770); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr774);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr778);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr782); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 52:56: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"ge\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "ge"));
					}



					}
					break;
				case 10 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:53:9: ^( GT t1= expr t2= expr t= TYPE )
					{
					match(input,GT,FOLLOW_GT_in_expr819); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr823);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr827);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr831); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 53:56: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"gt\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "gt"));
					}



					}
					break;
				case 11 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:54:9: ^( LT t1= expr t2= expr t= TYPE )
					{
					match(input,LT,FOLLOW_LT_in_expr868); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr872);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr876);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr880); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 54:56: -> binexprcomp(x=$t1.sty=$t2.stinstr=\"lt\")
					{
						retval.st = templateLib.getInstanceOf("binexprcomp",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "lt"));
					}



					}
					break;
				case 12 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:55:9: ^( PLUS t1= expr t2= expr t= TYPE )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr917); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr921);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr925);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr929); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 55:57: -> binexpr(x=$t1.sty=$t2.stinstr=\"add\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "add"));
					}



					}
					break;
				case 13 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:56:9: ^( MINUS t1= expr t2= expr t= TYPE )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr965); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr969);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr973);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr977); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 56:59: -> binexpr(x=$t1.sty=$t2.stinstr=\"sub\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "sub"));
					}



					}
					break;
				case 14 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:57:9: ^( TIMES t1= expr t2= expr t= TYPE )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr1014); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1018);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1022);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1026); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 57:59: -> binexpr(x=$t1.sty=$t2.stinstr=\"mul\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "mul"));
					}



					}
					break;
				case 15 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:58:9: ^( DIV t1= expr t2= expr t= TYPE )
					{
					match(input,DIV,FOLLOW_DIV_in_expr1063); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1067);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1071);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1075); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 58:57: -> binexpr(x=$t1.sty=$t2.stinstr=\"div\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "div"));
					}



					}
					break;
				case 16 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:59:9: ^( MOD t1= expr t2= expr t= TYPE )
					{
					match(input,MOD,FOLLOW_MOD_in_expr1112); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1116);
					t1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1120);
					t2=expr();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1124); 
					match(input, Token.UP, null); 

					decStack();
					// TEMPLATE REWRITE
					// 59:57: -> binexpr(x=$t1.sty=$t2.stinstr=\"rem\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (t1!=null?((StringTemplate)t1.getTemplate()):null)).put("y", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("instr", "rem"));
					}



					}
					break;
				case 17 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:60:7: ^( WHILE cond= statements ^( DO t2= statementsPop ) )
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr1159); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1163);
						cond=statements();
						state._fsp--;

						decStack();
						match(input,DO,FOLLOW_DO_in_expr1168); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statementsPop_in_expr1172);
							t2=statementsPop();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 60:70: -> whilestmt(expr=$cond.ststatement=$t2.stlabelCond=newLabel()labelWhile=newLabel())
					{
						retval.st = templateLib.getInstanceOf("whilestmt",new STAttrMap().put("expr", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("statement", (t2!=null?((StringTemplate)t2.getTemplate()):null)).put("labelCond", newLabel()).put("labelWhile", newLabel()));
					}



					}
					break;
				case 18 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:61:7: ^( PRINT t= TYPE te= TYPE fexp= expr (exp+= exprPrint )* )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expr1208); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1212); 
					te=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1216); 
					pushFollow(FOLLOW_expr_in_expr1220);
					fexp=expr();
					state._fsp--;

					// src\\alia\\AliaCodeGeneratorStringTemplate.g:61:40: (exp+= exprPrint )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==TYPE) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:61:41: exp+= exprPrint
							{
							pushFollow(FOLLOW_exprPrint_in_expr1225);
							exp=exprPrint();
							state._fsp--;

							if (list_exp==null) list_exp=new ArrayList<Object>();
							list_exp.add(exp.getTemplate());
							}
							break;

						default :
							break loop4;
						}
					}

					match(input, Token.UP, null); 

					decStackIfVoid(getType(t.toString()));
					// TEMPLATE REWRITE
					// 61:119: -> printstmt(firststatement=$fexp.ststatements=$exptype=getType($t.toString())t=getType($te.toString()).T)
					{
						retval.st = templateLib.getInstanceOf("printstmt",new STAttrMap().put("firststatement", (fexp!=null?((StringTemplate)fexp.getTemplate()):null)).put("statements", list_exp).put("type", getType(t.toString())).put("t", getType(te.toString()).T));
					}



					}
					break;
				case 19 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:62:7: ^( READ t= TYPE ^(id= IDENTIFIER t= TYPE a= ID ) (v+= varRead )* )
					{
					match(input,READ,FOLLOW_READ_in_expr1278); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1282); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1287); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1291); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1295); 
					match(input, Token.UP, null); 

					incStack();
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:62:64: (v+= varRead )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==IDENTIFIER) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:62:65: v+= varRead
							{
							pushFollow(FOLLOW_varRead_in_expr1303);
							v=varRead();
							state._fsp--;

							if (list_v==null) list_v=new ArrayList<Object>();
							list_v.add(v.getTemplate());
							}
							break;

						default :
							break loop5;
						}
					}

					match(input, Token.UP, null); 

					decStackIfVoid(getType(t.toString()));
					// TEMPLATE REWRITE
					// 62:141: -> readstmt(statements=$vaddr=$atype=getType($t.toString())t=getType($t.toString()).Tvoid=$t.toString().equals(\"void\")classname=getProgramClass())
					{
						retval.st = templateLib.getInstanceOf("readstmt",new STAttrMap().put("statements", list_v).put("addr", a).put("type", getType(t.toString())).put("t", getType(t.toString()).T).put("void", t.toString().equals("void")).put("classname", getProgramClass()));
					}



					}
					break;
				case 20 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:63:7: ^( NOT o= operand t= TYPE )
					{
					match(input,NOT,FOLLOW_NOT_in_expr1366); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1370);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1374); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:50: -> unarynot(x=$o.stinstr=\"not\")
					{
						retval.st = templateLib.getInstanceOf("unarynot",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "not"));
					}



					}
					break;
				case 21 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:64:7: ^( PLUS_OP o= operand t= TYPE )
					{
					match(input,PLUS_OP,FOLLOW_PLUS_OP_in_expr1417); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1421);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1425); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 64:52: -> unaryplus(x=$o.stinstr=\"plus\")
					{
						retval.st = templateLib.getInstanceOf("unaryplus",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "plus"));
					}



					}
					break;
				case 22 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:65:7: ^( MINUS_OP o= operand t= TYPE )
					{
					match(input,MINUS_OP,FOLLOW_MINUS_OP_in_expr1466); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_operand_in_expr1470);
					o=operand();
					state._fsp--;

					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1474); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 65:52: -> unarymin(x=$o.stinstr=\"neg\")
					{
						retval.st = templateLib.getInstanceOf("unarymin",new STAttrMap().put("x", (o!=null?((StringTemplate)o.getTemplate()):null)).put("instr", "neg"));
					}



					}
					break;
				case 23 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:66:9: ^( IF stif1= statements ^( DO stif2= statements ) (elsestmnts= elseif )? )
					{
					 startExpression(); 
					match(input,IF,FOLLOW_IF_in_expr1518); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_expr1530);
						stif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_expr1541); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_expr1545);
							stif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						// src\\alia\\AliaCodeGeneratorStringTemplate.g:69:9: (elsestmnts= elseif )?
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= ELSE && LA6_0 <= ELSEIF)) ) {
							alt6=1;
						}
						switch (alt6) {
							case 1 :
								// src\\alia\\AliaCodeGeneratorStringTemplate.g:69:10: elsestmnts= elseif
								{
								pushFollow(FOLLOW_elseif_in_expr1559);
								elsestmnts=elseif();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					 decStack();endExpression(); 
					// TEMPLATE REWRITE
					// 70:85: -> ifstmnt(cond=$stif1.ststatements=$stif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())
					{
						retval.st = templateLib.getInstanceOf("ifstmnt",new STAttrMap().put("cond", (stif1!=null?((StringTemplate)stif1.getTemplate()):null)).put("statements", (stif2!=null?((StringTemplate)stif2.getTemplate()):null)).put("elseStmnts", elsestmnts).put("labelElse", newLabel()).put("labelNext", newLabel()));
					}



					}
					break;
				case 24 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:71:9: ^( BECOMES ^(id= IDENTIFIER t= TYPE a= ID ) t1= expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr1655); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr1660); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1664); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1668); 
					match(input, Token.UP, null); 

					incStack();
					pushFollow(FOLLOW_expr_in_expr1675);
					t1=expr();
					state._fsp--;

					decStack();
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 71:85: -> assign(var=$idaddr=$aexpr=$t1.st)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("var", id).put("addr", a).put("expr", (t1!=null?((StringTemplate)t1.getTemplate()):null)));
					}



					}
					break;
				case 25 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:72:9: ^( COMPOUND t= TYPE s= statements )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr1707); 
					match(input, Token.DOWN, null); 
					t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_expr1711); 
					pushFollow(FOLLOW_statements_in_expr1715);
					s=statements();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 72:57: -> statements(instructions=$s.st)
					{
						retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", (s!=null?((StringTemplate)s.getTemplate()):null)));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:74:1: elseif : ( ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= elseif ) -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( ELSE stelse= statements ) -> elsemaybestmnt(statements=$stelse.st));
	public final AliaCodeGeneratorStringTemplate.elseif_return elseif() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.elseif_return retval = new AliaCodeGeneratorStringTemplate.elseif_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope stelseif1 =null;
		TreeRuleReturnScope stelseif2 =null;
		TreeRuleReturnScope elsestmnts =null;
		TreeRuleReturnScope stelse =null;

		 decStack(); 
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:75:4: ( ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= elseif ) -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())| ^( ELSE stelse= statements ) -> elsemaybestmnt(statements=$stelse.st))
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ELSEIF) ) {
				alt8=1;
			}
			else if ( (LA8_0==ELSE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:76:4: ^( ELSEIF stelseif1= statements ^( DO stelseif2= statements ) elsestmnts= elseif )
					{
					match(input,ELSEIF,FOLLOW_ELSEIF_in_elseif1765); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_elseif1769);
						stelseif1=statements();
						state._fsp--;

						match(input,DO,FOLLOW_DO_in_elseif1782); 
						if ( input.LA(1)==Token.DOWN ) {
							match(input, Token.DOWN, null); 
							pushFollow(FOLLOW_statements_in_elseif1788);
							stelseif2=statements();
							state._fsp--;

							match(input, Token.UP, null); 
						}

						decStack();
						pushFollow(FOLLOW_elseif_in_elseif1806);
						elsestmnts=elseif();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 78:41: -> elseifstmnt(cond=$stelseif1.ststatements=$stelseif2.stelseStmnts=elsestmntslabelElse=newLabel()labelNext=newLabel())
					{
						retval.st = templateLib.getInstanceOf("elseifstmnt",new STAttrMap().put("cond", (stelseif1!=null?((StringTemplate)stelseif1.getTemplate()):null)).put("statements", (stelseif2!=null?((StringTemplate)stelseif2.getTemplate()):null)).put("elseStmnts", elsestmnts).put("labelElse", newLabel()).put("labelNext", newLabel()));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:79:5: ^( ELSE stelse= statements )
					{
					match(input,ELSE,FOLLOW_ELSE_in_elseif1855); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_statements_in_elseif1859);
						stelse=statements();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 79:53: -> elsemaybestmnt(statements=$stelse.st)
					{
						retval.st = templateLib.getInstanceOf("elsemaybestmnt",new STAttrMap().put("statements", (stelse!=null?((StringTemplate)stelse.getTemplate()):null)));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:81:1: operand : (i= identifier -> statement(instruction=$i.st)|n= NUMBER -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))|c= CHAR_EXPR -> character(c=(int) c.toString().charAt(1))|b= ( TRUE | FALSE ) -> boolean(b=$b.toString().equals(\"true\")));
	public final AliaCodeGeneratorStringTemplate.operand_return operand() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.operand_return retval = new AliaCodeGeneratorStringTemplate.operand_return();
		retval.start = input.LT(1);

		CommonTree n=null;
		CommonTree c=null;
		CommonTree b=null;
		TreeRuleReturnScope i =null;

		incStack();
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:82:5: (i= identifier -> statement(instruction=$i.st)|n= NUMBER -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))|c= CHAR_EXPR -> character(c=(int) c.toString().charAt(1))|b= ( TRUE | FALSE ) -> boolean(b=$b.toString().equals(\"true\")))
			int alt10=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt10=1;
				}
				break;
			case NUMBER:
				{
				alt10=2;
				}
				break;
			case CHAR_EXPR:
				{
				alt10=3;
				}
				break;
			case FALSE:
			case TRUE:
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
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:82:9: i= identifier
					{
					pushFollow(FOLLOW_identifier_in_operand1920);
					i=identifier();
					state._fsp--;

					// TEMPLATE REWRITE
					// 82:25: -> statement(instruction=$i.st)
					{
						retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("instruction", (i!=null?((StringTemplate)i.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:83:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1944); 
					// TEMPLATE REWRITE
					// 83:34: -> number(n=$n.toString()numberType=whatNumber(Integer.parseInt($n.toString())))
					{
						retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("n", n.toString()).put("numberType", whatNumber(Integer.parseInt(n.toString()))));
					}



					}
					break;
				case 3 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:84:9: c= CHAR_EXPR
					{
					c=(CommonTree)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_operand1986); 
					// TEMPLATE REWRITE
					// 84:34: -> character(c=(int) c.toString().charAt(1))
					{
						retval.st = templateLib.getInstanceOf("character",new STAttrMap().put("c", (int) c.toString().charAt(1)));
					}



					}
					break;
				case 4 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:9: b= ( TRUE | FALSE )
					{
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:11: ( TRUE | FALSE )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==TRUE) ) {
						alt9=1;
					}
					else if ( (LA9_0==FALSE) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:12: TRUE
							{
							b=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_operand2021); 
							}
							break;
						case 2 :
							// src\\alia\\AliaCodeGeneratorStringTemplate.g:85:19: FALSE
							{
							b=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_operand2025); 
							}
							break;

					}

					// TEMPLATE REWRITE
					// 85:33: -> boolean(b=$b.toString().equals(\"true\"))
					{
						retval.st = templateLib.getInstanceOf("boolean",new STAttrMap().put("b", b.toString().equals("true")));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:1: exprPrint : t= TYPE exp= expr -> printexpr(statements=$exp.stt=getType($t.toString()).T);
	public final AliaCodeGeneratorStringTemplate.exprPrint_return exprPrint() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprPrint_return retval = new AliaCodeGeneratorStringTemplate.exprPrint_return();
		retval.start = input.LT(1);

		CommonTree t=null;
		TreeRuleReturnScope exp =null;

		decStack();
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:88:31: (t= TYPE exp= expr -> printexpr(statements=$exp.stt=getType($t.toString()).T))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:89:2: t= TYPE exp= expr
			{
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_exprPrint2067); 
			pushFollow(FOLLOW_expr_in_exprPrint2071);
			exp=expr();
			state._fsp--;

			// TEMPLATE REWRITE
			// 89:18: -> printexpr(statements=$exp.stt=getType($t.toString()).T)
			{
				retval.st = templateLib.getInstanceOf("printexpr",new STAttrMap().put("statements", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("t", getType(t.toString()).T));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:1: varRead : ^(id= IDENTIFIER t= TYPE a= ID ) -> readvar(var=$idaddr=$atype=getType($t.toString())classname=getProgramClass());
	public final AliaCodeGeneratorStringTemplate.varRead_return varRead() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varRead_return retval = new AliaCodeGeneratorStringTemplate.varRead_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree t=null;
		CommonTree a=null;

		incStack();decStack();
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:92:40: ( ^(id= IDENTIFIER t= TYPE a= ID ) -> readvar(var=$idaddr=$atype=getType($t.toString())classname=getProgramClass()))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:93:2: ^(id= IDENTIFIER t= TYPE a= ID )
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varRead2104); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varRead2108); 
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_varRead2112); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 93:31: -> readvar(var=$idaddr=$atype=getType($t.toString())classname=getProgramClass())
			{
				retval.st = templateLib.getInstanceOf("readvar",new STAttrMap().put("var", id).put("addr", a).put("type", getType(t.toString())).put("classname", getProgramClass()));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:96:1: identifier : ^(id= IDENTIFIER t= TYPE a= ID ) -> identifier(addr=$a);
	public final AliaCodeGeneratorStringTemplate.identifier_return identifier() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.identifier_return retval = new AliaCodeGeneratorStringTemplate.identifier_return();
		retval.start = input.LT(1);

		CommonTree id=null;
		CommonTree t=null;
		CommonTree a=null;

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:97:3: ( ^(id= IDENTIFIER t= TYPE a= ID ) -> identifier(addr=$a))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:97:5: ^(id= IDENTIFIER t= TYPE a= ID )
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier2149); 
			match(input, Token.DOWN, null); 
			t=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_identifier2153); 
			a=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier2157); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 97:44: -> identifier(addr=$a)
			{
				retval.st = templateLib.getInstanceOf("identifier",new STAttrMap().put("addr", a));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:100:1: varlist :s+= identifier (s+= identifier )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.varlist_return varlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.varlist_return retval = new AliaCodeGeneratorStringTemplate.varlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:101:3: (s+= identifier (s+= identifier )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:101:5: s+= identifier (s+= identifier )*
			{
			pushFollow(FOLLOW_identifier_in_varlist2192);
			s=identifier();
			state._fsp--;

			if (list_s==null) list_s=new ArrayList<Object>();
			list_s.add(s.getTemplate());
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:102:5: (s+= identifier )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENTIFIER) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:102:6: s+= identifier
					{
					pushFollow(FOLLOW_identifier_in_varlist2201);
					s=identifier();
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
			// 103:5: -> statements(instructions=$s)
			{
				retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", list_s));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:105:1: exprlist :s+= expr (s+= expr )* -> statements(instructions=$s);
	public final AliaCodeGeneratorStringTemplate.exprlist_return exprlist() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.exprlist_return retval = new AliaCodeGeneratorStringTemplate.exprlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:106:5: (s+= expr (s+= expr )* -> statements(instructions=$s))
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:106:7: s+= expr (s+= expr )*
			{
			pushFollow(FOLLOW_expr_in_exprlist2231);
			s=expr();
			state._fsp--;

			if (list_s==null) list_s=new ArrayList<Object>();
			list_s.add(s.getTemplate());
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:107:5: (s+= expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= AND && LA12_0 <= BECOMES)||LA12_0==CHAR_EXPR||LA12_0==COMPOUND||LA12_0==DIV||LA12_0==EQ||LA12_0==FALSE||(LA12_0 >= GE && LA12_0 <= GT)||(LA12_0 >= IDENTIFIER && LA12_0 <= IF)||LA12_0==LE||(LA12_0 >= LT && LA12_0 <= MOD)||(LA12_0 >= NOT && LA12_0 <= PRINT)||LA12_0==READ||(LA12_0 >= TIMES && LA12_0 <= TRUE)||LA12_0==WHILE) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src\\alia\\AliaCodeGeneratorStringTemplate.g:107:6: s+= expr
					{
					pushFollow(FOLLOW_expr_in_exprlist2240);
					s=expr();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					break loop12;
				}
			}

			// TEMPLATE REWRITE
			// 108:5: -> statements(instructions=$s)
			{
				retval.st = templateLib.getInstanceOf("statements",new STAttrMap().put("instructions", list_s));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
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
	// src\\alia\\AliaCodeGeneratorStringTemplate.g:111:1: type : ( INTEGER | CHAR | BOOL );
	public final AliaCodeGeneratorStringTemplate.type_return type() throws RecognitionException {
		AliaCodeGeneratorStringTemplate.type_return retval = new AliaCodeGeneratorStringTemplate.type_return();
		retval.start = input.LT(1);

		try {
			// src\\alia\\AliaCodeGeneratorStringTemplate.g:112:5: ( INTEGER | CHAR | BOOL )
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_LOCALSIZE_in_program146 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_exprPop_in_program151 = new BitSet(new long[]{0x984FF784DA844472L});
	public static final BitSet FOLLOW_exprPopInterleaved_in_statements220 = new BitSet(new long[]{0x984FF784DA844472L});
	public static final BitSet FOLLOW_exprPop_in_statementsPop260 = new BitSet(new long[]{0x984FF784DA844472L});
	public static final BitSet FOLLOW_expr_in_exprPopInterleaved306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprPop355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_expr429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr433 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr437 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ALT_in_expr478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr482 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr486 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr490 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr530 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr534 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ALT_in_expr575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr579 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr583 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr627 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr631 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NQ_in_expr672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr676 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr680 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expr721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr725 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr729 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expr770 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr774 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr778 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr823 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr827 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr872 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr876 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr880 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr917 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr921 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr925 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr929 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr969 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr973 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr977 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr1014 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1018 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr1022 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1026 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr1063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1067 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr1071 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1075 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr1112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1116 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr1120 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1124 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expr1159 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1163 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr1168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statementsPop_in_expr1172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_expr1208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1212 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1216 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_expr1220 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_exprPrint_in_expr1225 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr1278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1282 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1291 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_expr1295 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_varRead_in_expr1303 = new BitSet(new long[]{0x0000000040000008L});
	public static final BitSet FOLLOW_NOT_in_expr1366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1370 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_OP_in_expr1417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1421 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_OP_in_expr1466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_expr1470 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_TYPE_in_expr1474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr1518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1530 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_expr1541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_expr1545 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_elseif_in_expr1559 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr1655 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr1660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1664 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_expr1668 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_expr1675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr1707 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_expr1711 = new BitSet(new long[]{0x984FF784DA844478L});
	public static final BitSet FOLLOW_statements_in_expr1715 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_in_elseif1765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1769 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_elseif1782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_elseif_in_elseif1806 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_elseif1855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_elseif1859 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_operand1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_operand1986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand2021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand2025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_exprPrint2067 = new BitSet(new long[]{0x984FF784DA844470L});
	public static final BitSet FOLLOW_expr_in_exprPrint2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varRead2104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_varRead2108 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_varRead2112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier2149 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_identifier2153 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_identifier2157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_identifier_in_varlist2192 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_identifier_in_varlist2201 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_expr_in_exprlist2231 = new BitSet(new long[]{0x984FF784DA844472L});
	public static final BitSet FOLLOW_expr_in_exprlist2240 = new BitSet(new long[]{0x984FF784DA844472L});
}
