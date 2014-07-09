// $ANTLR 3.5.2 src\\alia\\Alia.g 2014-07-09 14:07:13

package alia;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AliaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ALT", "BECOMES", "BEGIN", 
		"BOOL", "CHAR", "CHAR_EXPR", "COLON", "COMMA", "COMMENT", "COMPOUND", 
		"CONST", "DEF", "DIGIT", "DIV", "DO", "ELSE", "ELSEIF", "END", "EQ", "EXPR_LIST", 
		"FALSE", "FUNC", "GE", "GT", "ID", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LE", "LETTER", "LOCALSIZE", "LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", 
		"MOD", "NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", 
		"PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "SQUOTE", 
		"STRING", "TIMES", "TRUE", "TYPE", "UPPER", "WHILE", "WS"
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AliaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AliaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AliaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\alia\\Alia.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src\\alia\\Alia.g:84:1: program : ( func_def | ( statement end_statement ) | NEWLINE !)* ;
	public final AliaParser.program_return program() throws RecognitionException {
		AliaParser.program_return retval = new AliaParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE4=null;
		ParserRuleReturnScope func_def1 =null;
		ParserRuleReturnScope statement2 =null;
		ParserRuleReturnScope end_statement3 =null;

		Object NEWLINE4_tree=null;

		try {
			// src\\alia\\Alia.g:84:9: ( ( func_def | ( statement end_statement ) | NEWLINE !)* )
			// src\\alia\\Alia.g:84:11: ( func_def | ( statement end_statement ) | NEWLINE !)*
			{
			root_0 = (Object)adaptor.nil();


			// src\\alia\\Alia.g:84:11: ( func_def | ( statement end_statement ) | NEWLINE !)*
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case DEF:
					{
					alt1=1;
					}
					break;
				case BEGIN:
				case CHAR_EXPR:
				case CONST:
				case FALSE:
				case IDENTIFIER:
				case IF:
				case LPAREN:
				case MINUS:
				case NOT:
				case NUMBER:
				case PLUS:
				case PRINT:
				case READ:
				case TRUE:
				case WHILE:
					{
					alt1=2;
					}
					break;
				case NEWLINE:
					{
					alt1=3;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// src\\alia\\Alia.g:84:12: func_def
					{
					pushFollow(FOLLOW_func_def_in_program1301);
					func_def1=func_def();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_def1.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:84:23: ( statement end_statement )
					{
					// src\\alia\\Alia.g:84:23: ( statement end_statement )
					// src\\alia\\Alia.g:84:24: statement end_statement
					{
					pushFollow(FOLLOW_statement_in_program1306);
					statement2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

					pushFollow(FOLLOW_end_statement_in_program1308);
					end_statement3=end_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, end_statement3.getTree());

					}

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:84:51: NEWLINE !
					{
					NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program1313); if (state.failed) return retval;
					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// src\\alia\\Alia.g:86:1: statements : ( statement ( end_statement statements )? | NEWLINE ! statements )? ;
	public final AliaParser.statements_return statements() throws RecognitionException {
		AliaParser.statements_return retval = new AliaParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE8=null;
		ParserRuleReturnScope statement5 =null;
		ParserRuleReturnScope end_statement6 =null;
		ParserRuleReturnScope statements7 =null;
		ParserRuleReturnScope statements9 =null;

		Object NEWLINE8_tree=null;

		try {
			// src\\alia\\Alia.g:86:12: ( ( statement ( end_statement statements )? | NEWLINE ! statements )? )
			// src\\alia\\Alia.g:86:14: ( statement ( end_statement statements )? | NEWLINE ! statements )?
			{
			root_0 = (Object)adaptor.nil();


			// src\\alia\\Alia.g:86:14: ( statement ( end_statement statements )? | NEWLINE ! statements )?
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BEGIN||LA3_0==CHAR_EXPR||LA3_0==CONST||LA3_0==FALSE||(LA3_0 >= IDENTIFIER && LA3_0 <= IF)||LA3_0==LPAREN||LA3_0==MINUS||LA3_0==NOT||LA3_0==NUMBER||LA3_0==PLUS||LA3_0==PRINT||LA3_0==READ||LA3_0==TRUE||LA3_0==WHILE) ) {
				alt3=1;
			}
			else if ( (LA3_0==NEWLINE) ) {
				alt3=2;
			}
			switch (alt3) {
				case 1 :
					// src\\alia\\Alia.g:86:15: statement ( end_statement statements )?
					{
					pushFollow(FOLLOW_statement_in_statements1325);
					statement5=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement5.getTree());

					// src\\alia\\Alia.g:86:25: ( end_statement statements )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==EOF||LA2_0==NEWLINE||LA2_0==SEMICOLON) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// src\\alia\\Alia.g:86:26: end_statement statements
							{
							pushFollow(FOLLOW_end_statement_in_statements1328);
							end_statement6=end_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, end_statement6.getTree());

							pushFollow(FOLLOW_statements_in_statements1330);
							statements7=statements();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statements7.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:86:55: NEWLINE ! statements
					{
					NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statements1336); if (state.failed) return retval;
					pushFollow(FOLLOW_statements_in_statements1339);
					statements9=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements9.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statements_cond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements_cond"
	// src\\alia\\Alia.g:87:1: statements_cond : ( statement ( end_statement statements )? | NEWLINE ! statements_cond );
	public final AliaParser.statements_cond_return statements_cond() throws RecognitionException {
		AliaParser.statements_cond_return retval = new AliaParser.statements_cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE13=null;
		ParserRuleReturnScope statement10 =null;
		ParserRuleReturnScope end_statement11 =null;
		ParserRuleReturnScope statements12 =null;
		ParserRuleReturnScope statements_cond14 =null;

		Object NEWLINE13_tree=null;

		try {
			// src\\alia\\Alia.g:87:17: ( statement ( end_statement statements )? | NEWLINE ! statements_cond )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==BEGIN||LA5_0==CHAR_EXPR||LA5_0==CONST||LA5_0==FALSE||(LA5_0 >= IDENTIFIER && LA5_0 <= IF)||LA5_0==LPAREN||LA5_0==MINUS||LA5_0==NOT||LA5_0==NUMBER||LA5_0==PLUS||LA5_0==PRINT||LA5_0==READ||LA5_0==TRUE||LA5_0==WHILE) ) {
				alt5=1;
			}
			else if ( (LA5_0==NEWLINE) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src\\alia\\Alia.g:87:19: statement ( end_statement statements )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statement_in_statements_cond1348);
					statement10=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement10.getTree());

					// src\\alia\\Alia.g:87:29: ( end_statement statements )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==EOF||LA4_0==NEWLINE||LA4_0==SEMICOLON) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// src\\alia\\Alia.g:87:30: end_statement statements
							{
							pushFollow(FOLLOW_end_statement_in_statements_cond1351);
							end_statement11=end_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, end_statement11.getTree());

							pushFollow(FOLLOW_statements_in_statements_cond1353);
							statements12=statements();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, statements12.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:87:59: NEWLINE ! statements_cond
					{
					root_0 = (Object)adaptor.nil();


					NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statements_cond1359); if (state.failed) return retval;
					pushFollow(FOLLOW_statements_cond_in_statements_cond1362);
					statements_cond14=statements_cond();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements_cond14.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements_cond"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// src\\alia\\Alia.g:88:1: statement : ( ( expr_assignment | const_assignment ) ( COLON ^ type )? | while_stmnt );
	public final AliaParser.statement_return statement() throws RecognitionException {
		AliaParser.statement_return retval = new AliaParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COLON17=null;
		ParserRuleReturnScope expr_assignment15 =null;
		ParserRuleReturnScope const_assignment16 =null;
		ParserRuleReturnScope type18 =null;
		ParserRuleReturnScope while_stmnt19 =null;

		Object COLON17_tree=null;

		try {
			// src\\alia\\Alia.g:88:11: ( ( expr_assignment | const_assignment ) ( COLON ^ type )? | while_stmnt )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BEGIN||LA8_0==CHAR_EXPR||LA8_0==CONST||LA8_0==FALSE||(LA8_0 >= IDENTIFIER && LA8_0 <= IF)||LA8_0==LPAREN||LA8_0==MINUS||LA8_0==NOT||LA8_0==NUMBER||LA8_0==PLUS||LA8_0==PRINT||LA8_0==READ||LA8_0==TRUE) ) {
				alt8=1;
			}
			else if ( (LA8_0==WHILE) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src\\alia\\Alia.g:88:13: ( expr_assignment | const_assignment ) ( COLON ^ type )?
					{
					root_0 = (Object)adaptor.nil();


					// src\\alia\\Alia.g:88:13: ( expr_assignment | const_assignment )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==BEGIN||LA6_0==CHAR_EXPR||LA6_0==FALSE||(LA6_0 >= IDENTIFIER && LA6_0 <= IF)||LA6_0==LPAREN||LA6_0==MINUS||LA6_0==NOT||LA6_0==NUMBER||LA6_0==PLUS||LA6_0==PRINT||LA6_0==READ||LA6_0==TRUE) ) {
						alt6=1;
					}
					else if ( (LA6_0==CONST) ) {
						alt6=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// src\\alia\\Alia.g:88:14: expr_assignment
							{
							pushFollow(FOLLOW_expr_assignment_in_statement1370);
							expr_assignment15=expr_assignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_assignment15.getTree());

							}
							break;
						case 2 :
							// src\\alia\\Alia.g:88:32: const_assignment
							{
							pushFollow(FOLLOW_const_assignment_in_statement1374);
							const_assignment16=const_assignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, const_assignment16.getTree());

							}
							break;

					}

					// src\\alia\\Alia.g:88:50: ( COLON ^ type )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src\\alia\\Alia.g:88:51: COLON ^ type
							{
							COLON17=(Token)match(input,COLON,FOLLOW_COLON_in_statement1378); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COLON17_tree = (Object)adaptor.create(COLON17);
							root_0 = (Object)adaptor.becomeRoot(COLON17_tree, root_0);
							}

							pushFollow(FOLLOW_type_in_statement1381);
							type18=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type18.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:89:6: while_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_stmnt_in_statement1390);
					while_stmnt19=while_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_stmnt19.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class end_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "end_statement"
	// src\\alia\\Alia.g:90:1: end_statement : ( NEWLINE !| SEMICOLON !| EOF !);
	public final AliaParser.end_statement_return end_statement() throws RecognitionException {
		AliaParser.end_statement_return retval = new AliaParser.end_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE20=null;
		Token SEMICOLON21=null;
		Token EOF22=null;

		Object NEWLINE20_tree=null;
		Object SEMICOLON21_tree=null;
		Object EOF22_tree=null;

		try {
			// src\\alia\\Alia.g:90:15: ( NEWLINE !| SEMICOLON !| EOF !)
			int alt9=3;
			switch ( input.LA(1) ) {
			case NEWLINE:
				{
				alt9=1;
				}
				break;
			case SEMICOLON:
				{
				alt9=2;
				}
				break;
			case EOF:
				{
				alt9=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src\\alia\\Alia.g:90:17: NEWLINE !
					{
					root_0 = (Object)adaptor.nil();


					NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_statement1397); if (state.failed) return retval;
					}
					break;
				case 2 :
					// src\\alia\\Alia.g:90:28: SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_end_statement1402); if (state.failed) return retval;
					}
					break;
				case 3 :
					// src\\alia\\Alia.g:90:41: EOF !
					{
					root_0 = (Object)adaptor.nil();


					EOF22=(Token)match(input,EOF,FOLLOW_EOF_in_end_statement1407); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "end_statement"


	public static class expr_assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_assignment"
	// src\\alia\\Alia.g:94:1: expr_assignment : ( ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment | expr );
	public final AliaParser.expr_assignment_return expr_assignment() throws RecognitionException {
		AliaParser.expr_assignment_return retval = new AliaParser.expr_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER23=null;
		Token BECOMES24=null;
		ParserRuleReturnScope expr_assignment25 =null;
		ParserRuleReturnScope expr26 =null;

		Object IDENTIFIER23_tree=null;
		Object BECOMES24_tree=null;

		try {
			// src\\alia\\Alia.g:94:17: ( ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment | expr )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==IDENTIFIER) ) {
				int LA10_1 = input.LA(2);
				if ( (synpred1_Alia()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

			}
			else if ( (LA10_0==BEGIN||LA10_0==CHAR_EXPR||LA10_0==FALSE||LA10_0==IF||LA10_0==LPAREN||LA10_0==MINUS||LA10_0==NOT||LA10_0==NUMBER||LA10_0==PLUS||LA10_0==PRINT||LA10_0==READ||LA10_0==TRUE) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src\\alia\\Alia.g:94:19: ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment
					{
					root_0 = (Object)adaptor.nil();


					// src\\alia\\Alia.g:94:43: ( IDENTIFIER BECOMES ^)
					// src\\alia\\Alia.g:94:44: IDENTIFIER BECOMES ^
					{
					IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assignment1427); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER23_tree = (Object)adaptor.create(IDENTIFIER23);
					adaptor.addChild(root_0, IDENTIFIER23_tree);
					}

					BECOMES24=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assignment1429); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BECOMES24_tree = (Object)adaptor.create(BECOMES24);
					root_0 = (Object)adaptor.becomeRoot(BECOMES24_tree, root_0);
					}

					}

					pushFollow(FOLLOW_expr_assignment_in_expr_assignment1433);
					expr_assignment25=expr_assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_assignment25.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:95:4: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expr_assignment1440);
					expr26=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr26.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_assignment"


	public static class const_assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "const_assignment"
	// src\\alia\\Alia.g:97:1: const_assignment : CONST ^ IDENTIFIER BECOMES primitive ;
	public final AliaParser.const_assignment_return const_assignment() throws RecognitionException {
		AliaParser.const_assignment_return retval = new AliaParser.const_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONST27=null;
		Token IDENTIFIER28=null;
		Token BECOMES29=null;
		ParserRuleReturnScope primitive30 =null;

		Object CONST27_tree=null;
		Object IDENTIFIER28_tree=null;
		Object BECOMES29_tree=null;

		try {
			// src\\alia\\Alia.g:97:18: ( CONST ^ IDENTIFIER BECOMES primitive )
			// src\\alia\\Alia.g:97:20: CONST ^ IDENTIFIER BECOMES primitive
			{
			root_0 = (Object)adaptor.nil();


			CONST27=(Token)match(input,CONST,FOLLOW_CONST_in_const_assignment1452); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CONST27_tree = (Object)adaptor.create(CONST27);
			root_0 = (Object)adaptor.becomeRoot(CONST27_tree, root_0);
			}

			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_assignment1455); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);
			}

			BECOMES29=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_const_assignment1457); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BECOMES29_tree = (Object)adaptor.create(BECOMES29);
			adaptor.addChild(root_0, BECOMES29_tree);
			}

			pushFollow(FOLLOW_primitive_in_const_assignment1459);
			primitive30=primitive();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primitive30.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_assignment"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// src\\alia\\Alia.g:99:1: expr : expr1 ( ( OR | OR_ALT ) ^ expr1 )* ;
	public final AliaParser.expr_return expr() throws RecognitionException {
		AliaParser.expr_return retval = new AliaParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set32=null;
		ParserRuleReturnScope expr131 =null;
		ParserRuleReturnScope expr133 =null;

		Object set32_tree=null;

		try {
			// src\\alia\\Alia.g:99:6: ( expr1 ( ( OR | OR_ALT ) ^ expr1 )* )
			// src\\alia\\Alia.g:99:8: expr1 ( ( OR | OR_ALT ) ^ expr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1_in_expr1467);
			expr131=expr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());

			// src\\alia\\Alia.g:99:14: ( ( OR | OR_ALT ) ^ expr1 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= OR && LA11_0 <= OR_ALT)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src\\alia\\Alia.g:99:15: ( OR | OR_ALT ) ^ expr1
					{
					set32=input.LT(1);
					set32=input.LT(1);
					if ( (input.LA(1) >= OR && input.LA(1) <= OR_ALT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set32), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr1_in_expr1479);
					expr133=expr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr133.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1"
	// src\\alia\\Alia.g:100:1: expr1 : expr2 ( ( AND | AND_ALT ) ^ expr2 )* ;
	public final AliaParser.expr1_return expr1() throws RecognitionException {
		AliaParser.expr1_return retval = new AliaParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set35=null;
		ParserRuleReturnScope expr234 =null;
		ParserRuleReturnScope expr236 =null;

		Object set35_tree=null;

		try {
			// src\\alia\\Alia.g:100:7: ( expr2 ( ( AND | AND_ALT ) ^ expr2 )* )
			// src\\alia\\Alia.g:100:9: expr2 ( ( AND | AND_ALT ) ^ expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr11488);
			expr234=expr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr234.getTree());

			// src\\alia\\Alia.g:100:15: ( ( AND | AND_ALT ) ^ expr2 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= AND && LA12_0 <= AND_ALT)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src\\alia\\Alia.g:100:16: ( AND | AND_ALT ) ^ expr2
					{
					set35=input.LT(1);
					set35=input.LT(1);
					if ( (input.LA(1) >= AND && input.LA(1) <= AND_ALT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set35), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr2_in_expr11500);
					expr236=expr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr236.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr1"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// src\\alia\\Alia.g:101:1: expr2 : expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )* ;
	public final AliaParser.expr2_return expr2() throws RecognitionException {
		AliaParser.expr2_return retval = new AliaParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set38=null;
		ParserRuleReturnScope expr337 =null;
		ParserRuleReturnScope expr339 =null;

		Object set38_tree=null;

		try {
			// src\\alia\\Alia.g:101:7: ( expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )* )
			// src\\alia\\Alia.g:101:9: expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3_in_expr21509);
			expr337=expr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr337.getTree());

			// src\\alia\\Alia.g:101:15: ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==EQ||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||LA13_0==LT||LA13_0==NQ) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src\\alia\\Alia.g:101:16: ( GT | GE | LT | LE | EQ | NQ ) ^ expr3
					{
					set38=input.LT(1);
					set38=input.LT(1);
					if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NQ ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set38), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr3_in_expr21537);
					expr339=expr3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr339.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr2"


	public static class expr3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr3"
	// src\\alia\\Alia.g:102:1: expr3 : expr4 ( ( PLUS | MINUS ) ^ expr4 )* ;
	public final AliaParser.expr3_return expr3() throws RecognitionException {
		AliaParser.expr3_return retval = new AliaParser.expr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set41=null;
		ParserRuleReturnScope expr440 =null;
		ParserRuleReturnScope expr442 =null;

		Object set41_tree=null;

		try {
			// src\\alia\\Alia.g:102:7: ( expr4 ( ( PLUS | MINUS ) ^ expr4 )* )
			// src\\alia\\Alia.g:102:9: expr4 ( ( PLUS | MINUS ) ^ expr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr4_in_expr31546);
			expr440=expr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr440.getTree());

			// src\\alia\\Alia.g:102:15: ( ( PLUS | MINUS ) ^ expr4 )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MINUS||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src\\alia\\Alia.g:102:16: ( PLUS | MINUS ) ^ expr4
					{
					set41=input.LT(1);
					set41=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set41), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr4_in_expr31558);
					expr442=expr4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr442.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr3"


	public static class expr4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr4"
	// src\\alia\\Alia.g:103:1: expr4 : expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )* ;
	public final AliaParser.expr4_return expr4() throws RecognitionException {
		AliaParser.expr4_return retval = new AliaParser.expr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set44=null;
		ParserRuleReturnScope expr543 =null;
		ParserRuleReturnScope expr545 =null;

		Object set44_tree=null;

		try {
			// src\\alia\\Alia.g:103:7: ( expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )* )
			// src\\alia\\Alia.g:103:9: expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr5_in_expr41567);
			expr543=expr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr543.getTree());

			// src\\alia\\Alia.g:103:15: ( ( TIMES | DIV | MOD ) ^ expr5 )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==MOD||LA15_0==TIMES) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src\\alia\\Alia.g:103:16: ( TIMES | DIV | MOD ) ^ expr5
					{
					set44=input.LT(1);
					set44=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==TIMES ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set44), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr5_in_expr41583);
					expr545=expr5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr545.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr4"


	public static class expr5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr5"
	// src\\alia\\Alia.g:104:1: expr5 : ( NOT ^ operand | operand | expr_minus | expr_plus );
	public final AliaParser.expr5_return expr5() throws RecognitionException {
		AliaParser.expr5_return retval = new AliaParser.expr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT46=null;
		ParserRuleReturnScope operand47 =null;
		ParserRuleReturnScope operand48 =null;
		ParserRuleReturnScope expr_minus49 =null;
		ParserRuleReturnScope expr_plus50 =null;

		Object NOT46_tree=null;

		try {
			// src\\alia\\Alia.g:104:7: ( NOT ^ operand | operand | expr_minus | expr_plus )
			int alt16=4;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt16=1;
				}
				break;
			case BEGIN:
			case CHAR_EXPR:
			case FALSE:
			case IDENTIFIER:
			case IF:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case READ:
			case TRUE:
				{
				alt16=2;
				}
				break;
			case MINUS:
				{
				alt16=3;
				}
				break;
			case PLUS:
				{
				alt16=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// src\\alia\\Alia.g:104:9: NOT ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NOT46=(Token)match(input,NOT,FOLLOW_NOT_in_expr51592); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT46_tree = (Object)adaptor.create(NOT46);
					root_0 = (Object)adaptor.becomeRoot(NOT46_tree, root_0);
					}

					pushFollow(FOLLOW_operand_in_expr51595);
					operand47=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand47.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:104:24: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_expr51599);
					operand48=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand48.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:104:34: expr_minus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_minus_in_expr51603);
					expr_minus49=expr_minus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_minus49.getTree());

					}
					break;
				case 4 :
					// src\\alia\\Alia.g:104:47: expr_plus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_plus_in_expr51607);
					expr_plus50=expr_plus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_plus50.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr5"


	public static class expr_minus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_minus"
	// src\\alia\\Alia.g:105:1: expr_minus : MINUS operand -> ^( MINUS_OP operand ) ;
	public final AliaParser.expr_minus_return expr_minus() throws RecognitionException {
		AliaParser.expr_minus_return retval = new AliaParser.expr_minus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS51=null;
		ParserRuleReturnScope operand52 =null;

		Object MINUS51_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// src\\alia\\Alia.g:105:12: ( MINUS operand -> ^( MINUS_OP operand ) )
			// src\\alia\\Alia.g:105:14: MINUS operand
			{
			MINUS51=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_minus1614); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MINUS.add(MINUS51);

			pushFollow(FOLLOW_operand_in_expr_minus1616);
			operand52=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand52.getTree());
			// AST REWRITE
			// elements: operand
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:28: -> ^( MINUS_OP operand )
			{
				// src\\alia\\Alia.g:105:31: ^( MINUS_OP operand )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUS_OP, "MINUS_OP"), root_1);
				adaptor.addChild(root_1, stream_operand.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_minus"


	public static class expr_plus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_plus"
	// src\\alia\\Alia.g:106:1: expr_plus : PLUS operand -> ^( PLUS_OP operand ) ;
	public final AliaParser.expr_plus_return expr_plus() throws RecognitionException {
		AliaParser.expr_plus_return retval = new AliaParser.expr_plus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS53=null;
		ParserRuleReturnScope operand54 =null;

		Object PLUS53_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// src\\alia\\Alia.g:106:11: ( PLUS operand -> ^( PLUS_OP operand ) )
			// src\\alia\\Alia.g:106:13: PLUS operand
			{
			PLUS53=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus1631); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS.add(PLUS53);

			pushFollow(FOLLOW_operand_in_expr_plus1633);
			operand54=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand54.getTree());
			// AST REWRITE
			// elements: operand
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:26: -> ^( PLUS_OP operand )
			{
				// src\\alia\\Alia.g:106:29: ^( PLUS_OP operand )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS_OP, "PLUS_OP"), root_1);
				adaptor.addChild(root_1, stream_operand.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_plus"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src\\alia\\Alia.g:107:1: operand : ( read | print | if_stmnt | LPAREN ! expr RPAREN !| compound_stmnt | primitive | func_identifier );
	public final AliaParser.operand_return operand() throws RecognitionException {
		AliaParser.operand_return retval = new AliaParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN58=null;
		Token RPAREN60=null;
		ParserRuleReturnScope read55 =null;
		ParserRuleReturnScope print56 =null;
		ParserRuleReturnScope if_stmnt57 =null;
		ParserRuleReturnScope expr59 =null;
		ParserRuleReturnScope compound_stmnt61 =null;
		ParserRuleReturnScope primitive62 =null;
		ParserRuleReturnScope func_identifier63 =null;

		Object LPAREN58_tree=null;
		Object RPAREN60_tree=null;

		try {
			// src\\alia\\Alia.g:107:9: ( read | print | if_stmnt | LPAREN ! expr RPAREN !| compound_stmnt | primitive | func_identifier )
			int alt17=7;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt17=1;
				}
				break;
			case PRINT:
				{
				alt17=2;
				}
				break;
			case IF:
				{
				alt17=3;
				}
				break;
			case LPAREN:
				{
				alt17=4;
				}
				break;
			case BEGIN:
				{
				alt17=5;
				}
				break;
			case CHAR_EXPR:
			case FALSE:
			case NUMBER:
			case TRUE:
				{
				alt17=6;
				}
				break;
			case IDENTIFIER:
				{
				alt17=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// src\\alia\\Alia.g:107:11: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_operand1648);
					read55=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read55.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:108:8: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_operand1659);
					print56=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print56.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:109:8: if_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmnt_in_operand1670);
					if_stmnt57=if_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stmnt57.getTree());

					}
					break;
				case 4 :
					// src\\alia\\Alia.g:110:8: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1681); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_operand1684);
					expr59=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr59.getTree());

					RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1686); if (state.failed) return retval;
					}
					break;
				case 5 :
					// src\\alia\\Alia.g:111:8: compound_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compound_stmnt_in_operand1698);
					compound_stmnt61=compound_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_stmnt61.getTree());

					}
					break;
				case 6 :
					// src\\alia\\Alia.g:112:8: primitive
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitive_in_operand1709);
					primitive62=primitive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primitive62.getTree());

					}
					break;
				case 7 :
					// src\\alia\\Alia.g:113:8: func_identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_identifier_in_operand1720);
					func_identifier63=func_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_identifier63.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class compound_stmnt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compound_stmnt"
	// src\\alia\\Alia.g:115:1: compound_stmnt : BEGIN statements END -> ^( COMPOUND statements ) ;
	public final AliaParser.compound_stmnt_return compound_stmnt() throws RecognitionException {
		AliaParser.compound_stmnt_return retval = new AliaParser.compound_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN64=null;
		Token END66=null;
		ParserRuleReturnScope statements65 =null;

		Object BEGIN64_tree=null;
		Object END66_tree=null;
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");

		try {
			// src\\alia\\Alia.g:115:16: ( BEGIN statements END -> ^( COMPOUND statements ) )
			// src\\alia\\Alia.g:115:18: BEGIN statements END
			{
			BEGIN64=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_compound_stmnt1728); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN64);

			pushFollow(FOLLOW_statements_in_compound_stmnt1730);
			statements65=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statements.add(statements65.getTree());
			END66=(Token)match(input,END,FOLLOW_END_in_compound_stmnt1732); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END66);

			// AST REWRITE
			// elements: statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 115:39: -> ^( COMPOUND statements )
			{
				// src\\alia\\Alia.g:115:42: ^( COMPOUND statements )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPOUND, "COMPOUND"), root_1);
				adaptor.addChild(root_1, stream_statements.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_stmnt"


	public static class primitive_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitive"
	// src\\alia\\Alia.g:117:1: primitive : ( NUMBER | CHAR_EXPR | boolean_expr );
	public final AliaParser.primitive_return primitive() throws RecognitionException {
		AliaParser.primitive_return retval = new AliaParser.primitive_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER67=null;
		Token CHAR_EXPR68=null;
		ParserRuleReturnScope boolean_expr69 =null;

		Object NUMBER67_tree=null;
		Object CHAR_EXPR68_tree=null;

		try {
			// src\\alia\\Alia.g:117:11: ( NUMBER | CHAR_EXPR | boolean_expr )
			int alt18=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt18=1;
				}
				break;
			case CHAR_EXPR:
				{
				alt18=2;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// src\\alia\\Alia.g:117:13: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER67=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_primitive1748); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER67_tree = (Object)adaptor.create(NUMBER67);
					adaptor.addChild(root_0, NUMBER67_tree);
					}

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:117:22: CHAR_EXPR
					{
					root_0 = (Object)adaptor.nil();


					CHAR_EXPR68=(Token)match(input,CHAR_EXPR,FOLLOW_CHAR_EXPR_in_primitive1752); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_EXPR68_tree = (Object)adaptor.create(CHAR_EXPR68);
					adaptor.addChild(root_0, CHAR_EXPR68_tree);
					}

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:117:34: boolean_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expr_in_primitive1756);
					boolean_expr69=boolean_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expr69.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitive"


	public static class char_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "char_expr"
	// src\\alia\\Alia.g:119:1: char_expr : SQUOTE ! LETTER SQUOTE !;
	public final AliaParser.char_expr_return char_expr() throws RecognitionException {
		AliaParser.char_expr_return retval = new AliaParser.char_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SQUOTE70=null;
		Token LETTER71=null;
		Token SQUOTE72=null;

		Object SQUOTE70_tree=null;
		Object LETTER71_tree=null;
		Object SQUOTE72_tree=null;

		try {
			// src\\alia\\Alia.g:119:11: ( SQUOTE ! LETTER SQUOTE !)
			// src\\alia\\Alia.g:119:13: SQUOTE ! LETTER SQUOTE !
			{
			root_0 = (Object)adaptor.nil();


			SQUOTE70=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_char_expr1764); if (state.failed) return retval;
			LETTER71=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_expr1767); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LETTER71_tree = (Object)adaptor.create(LETTER71);
			adaptor.addChild(root_0, LETTER71_tree);
			}

			SQUOTE72=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_char_expr1769); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "char_expr"


	public static class func_identifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_identifier"
	// src\\alia\\Alia.g:121:1: func_identifier : IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )? ;
	public final AliaParser.func_identifier_return func_identifier() throws RecognitionException {
		AliaParser.func_identifier_return retval = new AliaParser.func_identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER73=null;
		Token LPAREN74=null;
		Token RPAREN76=null;
		ParserRuleReturnScope exprlist75 =null;

		Object IDENTIFIER73_tree=null;
		Object LPAREN74_tree=null;
		Object RPAREN76_tree=null;

		try {
			// src\\alia\\Alia.g:121:17: ( IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )? )
			// src\\alia\\Alia.g:121:19: IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_identifier1778); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER73_tree = (Object)adaptor.create(IDENTIFIER73);
			adaptor.addChild(root_0, IDENTIFIER73_tree);
			}

			// src\\alia\\Alia.g:122:5: ( LPAREN ^ ( exprlist )? RPAREN )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LPAREN) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// src\\alia\\Alia.g:122:6: LPAREN ^ ( exprlist )? RPAREN
					{
					LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_identifier1786); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN74_tree = (Object)adaptor.create(LPAREN74);
					root_0 = (Object)adaptor.becomeRoot(LPAREN74_tree, root_0);
					}

					// src\\alia\\Alia.g:122:14: ( exprlist )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==BEGIN||LA19_0==CHAR_EXPR||LA19_0==FALSE||(LA19_0 >= IDENTIFIER && LA19_0 <= IF)||LA19_0==LPAREN||LA19_0==MINUS||LA19_0==NOT||LA19_0==NUMBER||LA19_0==PLUS||LA19_0==PRINT||LA19_0==READ||LA19_0==TRUE) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// src\\alia\\Alia.g:122:14: exprlist
							{
							pushFollow(FOLLOW_exprlist_in_func_identifier1789);
							exprlist75=exprlist();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist75.getTree());

							}
							break;

					}

					RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_identifier1792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN76_tree = (Object)adaptor.create(RPAREN76);
					adaptor.addChild(root_0, RPAREN76_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_identifier"


	public static class while_stmnt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_stmnt"
	// src\\alia\\Alia.g:124:1: while_stmnt : WHILE statements_cond DO statements END -> ^( WHILE statements_cond ^( DO statements ) ) ;
	public final AliaParser.while_stmnt_return while_stmnt() throws RecognitionException {
		AliaParser.while_stmnt_return retval = new AliaParser.while_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE77=null;
		Token DO79=null;
		Token END81=null;
		ParserRuleReturnScope statements_cond78 =null;
		ParserRuleReturnScope statements80 =null;

		Object WHILE77_tree=null;
		Object DO79_tree=null;
		Object END81_tree=null;
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_statements_cond=new RewriteRuleSubtreeStream(adaptor,"rule statements_cond");

		try {
			// src\\alia\\Alia.g:124:13: ( WHILE statements_cond DO statements END -> ^( WHILE statements_cond ^( DO statements ) ) )
			// src\\alia\\Alia.g:124:15: WHILE statements_cond DO statements END
			{
			WHILE77=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmnt1802); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE77);

			pushFollow(FOLLOW_statements_cond_in_while_stmnt1804);
			statements_cond78=statements_cond();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statements_cond.add(statements_cond78.getTree());
			DO79=(Token)match(input,DO,FOLLOW_DO_in_while_stmnt1806); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DO.add(DO79);

			pushFollow(FOLLOW_statements_in_while_stmnt1808);
			statements80=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statements.add(statements80.getTree());
			END81=(Token)match(input,END,FOLLOW_END_in_while_stmnt1810); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END81);

			// AST REWRITE
			// elements: statements_cond, statements, DO, WHILE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:55: -> ^( WHILE statements_cond ^( DO statements ) )
			{
				// src\\alia\\Alia.g:124:58: ^( WHILE statements_cond ^( DO statements ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_statements_cond.nextTree());
				// src\\alia\\Alia.g:124:82: ^( DO statements )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_2);
				adaptor.addChild(root_2, stream_statements.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_stmnt"


	public static class if_stmnt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_stmnt"
	// src\\alia\\Alia.g:126:1: if_stmnt : IF statements_cond DO statements ( else_stmnt )? END -> ^( IF statements_cond ^( DO ( statements )? ) ( else_stmnt )? ) ;
	public final AliaParser.if_stmnt_return if_stmnt() throws RecognitionException {
		AliaParser.if_stmnt_return retval = new AliaParser.if_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF82=null;
		Token DO84=null;
		Token END87=null;
		ParserRuleReturnScope statements_cond83 =null;
		ParserRuleReturnScope statements85 =null;
		ParserRuleReturnScope else_stmnt86 =null;

		Object IF82_tree=null;
		Object DO84_tree=null;
		Object END87_tree=null;
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_else_stmnt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmnt");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_statements_cond=new RewriteRuleSubtreeStream(adaptor,"rule statements_cond");

		try {
			// src\\alia\\Alia.g:126:10: ( IF statements_cond DO statements ( else_stmnt )? END -> ^( IF statements_cond ^( DO ( statements )? ) ( else_stmnt )? ) )
			// src\\alia\\Alia.g:126:12: IF statements_cond DO statements ( else_stmnt )? END
			{
			IF82=(Token)match(input,IF,FOLLOW_IF_in_if_stmnt1832); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(IF82);

			pushFollow(FOLLOW_statements_cond_in_if_stmnt1834);
			statements_cond83=statements_cond();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statements_cond.add(statements_cond83.getTree());
			DO84=(Token)match(input,DO,FOLLOW_DO_in_if_stmnt1836); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DO.add(DO84);

			pushFollow(FOLLOW_statements_in_if_stmnt1838);
			statements85=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statements.add(statements85.getTree());
			// src\\alia\\Alia.g:126:45: ( else_stmnt )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= ELSE && LA21_0 <= ELSEIF)) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// src\\alia\\Alia.g:126:45: else_stmnt
					{
					pushFollow(FOLLOW_else_stmnt_in_if_stmnt1840);
					else_stmnt86=else_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_else_stmnt.add(else_stmnt86.getTree());
					}
					break;

			}

			END87=(Token)match(input,END,FOLLOW_END_in_if_stmnt1843); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END87);

			// AST REWRITE
			// elements: IF, else_stmnt, statements, DO, statements_cond
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:61: -> ^( IF statements_cond ^( DO ( statements )? ) ( else_stmnt )? )
			{
				// src\\alia\\Alia.g:127:4: ^( IF statements_cond ^( DO ( statements )? ) ( else_stmnt )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_statements_cond.nextTree());
				// src\\alia\\Alia.g:127:25: ^( DO ( statements )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_2);
				// src\\alia\\Alia.g:127:30: ( statements )?
				if ( stream_statements.hasNext() ) {
					adaptor.addChild(root_2, stream_statements.nextTree());
				}
				stream_statements.reset();

				adaptor.addChild(root_1, root_2);
				}

				// src\\alia\\Alia.g:127:43: ( else_stmnt )?
				if ( stream_else_stmnt.hasNext() ) {
					adaptor.addChild(root_1, stream_else_stmnt.nextTree());
				}
				stream_else_stmnt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_stmnt"


	public static class else_stmnt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "else_stmnt"
	// src\\alia\\Alia.g:129:1: else_stmnt : ( ELSEIF statements_cond DO statements ( else_stmnt )? -> ^( ELSEIF statements_cond ^( DO ( statements )? ) ( else_stmnt )? ) | ( ELSE ^ statements ) );
	public final AliaParser.else_stmnt_return else_stmnt() throws RecognitionException {
		AliaParser.else_stmnt_return retval = new AliaParser.else_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSEIF88=null;
		Token DO90=null;
		Token ELSE93=null;
		ParserRuleReturnScope statements_cond89 =null;
		ParserRuleReturnScope statements91 =null;
		ParserRuleReturnScope else_stmnt92 =null;
		ParserRuleReturnScope statements94 =null;

		Object ELSEIF88_tree=null;
		Object DO90_tree=null;
		Object ELSE93_tree=null;
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_ELSEIF=new RewriteRuleTokenStream(adaptor,"token ELSEIF");
		RewriteRuleSubtreeStream stream_else_stmnt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmnt");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_statements_cond=new RewriteRuleSubtreeStream(adaptor,"rule statements_cond");

		try {
			// src\\alia\\Alia.g:130:5: ( ELSEIF statements_cond DO statements ( else_stmnt )? -> ^( ELSEIF statements_cond ^( DO ( statements )? ) ( else_stmnt )? ) | ( ELSE ^ statements ) )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ELSEIF) ) {
				alt23=1;
			}
			else if ( (LA23_0==ELSE) ) {
				alt23=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// src\\alia\\Alia.g:130:7: ELSEIF statements_cond DO statements ( else_stmnt )?
					{
					ELSEIF88=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_else_stmnt1876); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSEIF.add(ELSEIF88);

					pushFollow(FOLLOW_statements_cond_in_else_stmnt1878);
					statements_cond89=statements_cond();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statements_cond.add(statements_cond89.getTree());
					DO90=(Token)match(input,DO,FOLLOW_DO_in_else_stmnt1880); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO.add(DO90);

					pushFollow(FOLLOW_statements_in_else_stmnt1882);
					statements91=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statements.add(statements91.getTree());
					// src\\alia\\Alia.g:130:44: ( else_stmnt )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= ELSE && LA22_0 <= ELSEIF)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// src\\alia\\Alia.g:130:44: else_stmnt
							{
							pushFollow(FOLLOW_else_stmnt_in_else_stmnt1884);
							else_stmnt92=else_stmnt();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_else_stmnt.add(else_stmnt92.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: statements, statements_cond, else_stmnt, DO, ELSEIF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 130:56: -> ^( ELSEIF statements_cond ^( DO ( statements )? ) ( else_stmnt )? )
					{
						// src\\alia\\Alia.g:131:6: ^( ELSEIF statements_cond ^( DO ( statements )? ) ( else_stmnt )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ELSEIF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_statements_cond.nextTree());
						// src\\alia\\Alia.g:131:31: ^( DO ( statements )? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_2);
						// src\\alia\\Alia.g:131:36: ( statements )?
						if ( stream_statements.hasNext() ) {
							adaptor.addChild(root_2, stream_statements.nextTree());
						}
						stream_statements.reset();

						adaptor.addChild(root_1, root_2);
						}

						// src\\alia\\Alia.g:131:49: ( else_stmnt )?
						if ( stream_else_stmnt.hasNext() ) {
							adaptor.addChild(root_1, stream_else_stmnt.nextTree());
						}
						stream_else_stmnt.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:132:4: ( ELSE ^ statements )
					{
					root_0 = (Object)adaptor.nil();


					// src\\alia\\Alia.g:132:4: ( ELSE ^ statements )
					// src\\alia\\Alia.g:132:5: ELSE ^ statements
					{
					ELSE93=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmnt1914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE93_tree = (Object)adaptor.create(ELSE93);
					root_0 = (Object)adaptor.becomeRoot(ELSE93_tree, root_0);
					}

					pushFollow(FOLLOW_statements_in_else_stmnt1917);
					statements94=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements94.getTree());

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "else_stmnt"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// src\\alia\\Alia.g:135:1: print : PRINT ^ LPAREN ! exprlist RPAREN !;
	public final AliaParser.print_return print() throws RecognitionException {
		AliaParser.print_return retval = new AliaParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT95=null;
		Token LPAREN96=null;
		Token RPAREN98=null;
		ParserRuleReturnScope exprlist97 =null;

		Object PRINT95_tree=null;
		Object LPAREN96_tree=null;
		Object RPAREN98_tree=null;

		try {
			// src\\alia\\Alia.g:135:7: ( PRINT ^ LPAREN ! exprlist RPAREN !)
			// src\\alia\\Alia.g:135:9: PRINT ^ LPAREN ! exprlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT95=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1930); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT95_tree = (Object)adaptor.create(PRINT95);
			root_0 = (Object)adaptor.becomeRoot(PRINT95_tree, root_0);
			}

			LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1933); if (state.failed) return retval;
			pushFollow(FOLLOW_exprlist_in_print1936);
			exprlist97=exprlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist97.getTree());

			RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1938); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class read_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read"
	// src\\alia\\Alia.g:136:1: read : READ ^ LPAREN ! varlist RPAREN !;
	public final AliaParser.read_return read() throws RecognitionException {
		AliaParser.read_return retval = new AliaParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ99=null;
		Token LPAREN100=null;
		Token RPAREN102=null;
		ParserRuleReturnScope varlist101 =null;

		Object READ99_tree=null;
		Object LPAREN100_tree=null;
		Object RPAREN102_tree=null;

		try {
			// src\\alia\\Alia.g:136:6: ( READ ^ LPAREN ! varlist RPAREN !)
			// src\\alia\\Alia.g:136:8: READ ^ LPAREN ! varlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ99=(Token)match(input,READ,FOLLOW_READ_in_read1946); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ99_tree = (Object)adaptor.create(READ99);
			root_0 = (Object)adaptor.becomeRoot(READ99_tree, root_0);
			}

			LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1949); if (state.failed) return retval;
			pushFollow(FOLLOW_varlist_in_read1952);
			varlist101=varlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist101.getTree());

			RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1954); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class varlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varlist"
	// src\\alia\\Alia.g:138:1: varlist : IDENTIFIER ( COMMA ! IDENTIFIER )* ;
	public final AliaParser.varlist_return varlist() throws RecognitionException {
		AliaParser.varlist_return retval = new AliaParser.varlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER103=null;
		Token COMMA104=null;
		Token IDENTIFIER105=null;

		Object IDENTIFIER103_tree=null;
		Object COMMA104_tree=null;
		Object IDENTIFIER105_tree=null;

		try {
			// src\\alia\\Alia.g:138:9: ( IDENTIFIER ( COMMA ! IDENTIFIER )* )
			// src\\alia\\Alia.g:138:11: IDENTIFIER ( COMMA ! IDENTIFIER )*
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER103=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1963); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER103_tree = (Object)adaptor.create(IDENTIFIER103);
			adaptor.addChild(root_0, IDENTIFIER103_tree);
			}

			// src\\alia\\Alia.g:138:22: ( COMMA ! IDENTIFIER )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// src\\alia\\Alia.g:138:23: COMMA ! IDENTIFIER
					{
					COMMA104=(Token)match(input,COMMA,FOLLOW_COMMA_in_varlist1966); if (state.failed) return retval;
					IDENTIFIER105=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1969); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER105_tree = (Object)adaptor.create(IDENTIFIER105);
					adaptor.addChild(root_0, IDENTIFIER105_tree);
					}

					}
					break;

				default :
					break loop24;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varlist"


	public static class exprlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprlist"
	// src\\alia\\Alia.g:139:1: exprlist : expr ( COMMA ! expr )* ;
	public final AliaParser.exprlist_return exprlist() throws RecognitionException {
		AliaParser.exprlist_return retval = new AliaParser.exprlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA107=null;
		ParserRuleReturnScope expr106 =null;
		ParserRuleReturnScope expr108 =null;

		Object COMMA107_tree=null;

		try {
			// src\\alia\\Alia.g:139:10: ( expr ( COMMA ! expr )* )
			// src\\alia\\Alia.g:139:12: expr ( COMMA ! expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_exprlist1978);
			expr106=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr106.getTree());

			// src\\alia\\Alia.g:139:17: ( COMMA ! expr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// src\\alia\\Alia.g:139:18: COMMA ! expr
					{
					COMMA107=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist1981); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_exprlist1984);
					expr108=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr108.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprlist"


	public static class func_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_def"
	// src\\alia\\Alia.g:141:1: func_def : DEF IDENTIFIER LPAREN ! varlist RPAREN ! statements END ;
	public final AliaParser.func_def_return func_def() throws RecognitionException {
		AliaParser.func_def_return retval = new AliaParser.func_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DEF109=null;
		Token IDENTIFIER110=null;
		Token LPAREN111=null;
		Token RPAREN113=null;
		Token END115=null;
		ParserRuleReturnScope varlist112 =null;
		ParserRuleReturnScope statements114 =null;

		Object DEF109_tree=null;
		Object IDENTIFIER110_tree=null;
		Object LPAREN111_tree=null;
		Object RPAREN113_tree=null;
		Object END115_tree=null;

		try {
			// src\\alia\\Alia.g:141:10: ( DEF IDENTIFIER LPAREN ! varlist RPAREN ! statements END )
			// src\\alia\\Alia.g:141:12: DEF IDENTIFIER LPAREN ! varlist RPAREN ! statements END
			{
			root_0 = (Object)adaptor.nil();


			DEF109=(Token)match(input,DEF,FOLLOW_DEF_in_func_def1994); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEF109_tree = (Object)adaptor.create(DEF109);
			adaptor.addChild(root_0, DEF109_tree);
			}

			IDENTIFIER110=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_def1996); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER110_tree = (Object)adaptor.create(IDENTIFIER110);
			adaptor.addChild(root_0, IDENTIFIER110_tree);
			}

			LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_def1998); if (state.failed) return retval;
			pushFollow(FOLLOW_varlist_in_func_def2001);
			varlist112=varlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist112.getTree());

			RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_def2003); if (state.failed) return retval;
			pushFollow(FOLLOW_statements_in_func_def2006);
			statements114=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements114.getTree());

			END115=(Token)match(input,END,FOLLOW_END_in_func_def2008); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END115_tree = (Object)adaptor.create(END115);
			adaptor.addChild(root_0, END115_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_def"


	public static class boolean_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expr"
	// src\\alia\\Alia.g:145:1: boolean_expr : ( TRUE | FALSE );
	public final AliaParser.boolean_expr_return boolean_expr() throws RecognitionException {
		AliaParser.boolean_expr_return retval = new AliaParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set116=null;

		Object set116_tree=null;

		try {
			// src\\alia\\Alia.g:145:14: ( TRUE | FALSE )
			// src\\alia\\Alia.g:
			{
			root_0 = (Object)adaptor.nil();


			set116=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set116));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_expr"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// src\\alia\\Alia.g:147:1: type : ( CHAR | INT | BOOL );
	public final AliaParser.type_return type() throws RecognitionException {
		AliaParser.type_return retval = new AliaParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set117=null;

		Object set117_tree=null;

		try {
			// src\\alia\\Alia.g:147:6: ( CHAR | INT | BOOL )
			// src\\alia\\Alia.g:
			{
			root_0 = (Object)adaptor.nil();


			set117=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set117));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// $ANTLR start synpred1_Alia
	public final void synpred1_Alia_fragment() throws RecognitionException {
		// src\\alia\\Alia.g:94:19: ( IDENTIFIER BECOMES )
		// src\\alia\\Alia.g:94:20: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Alia1419); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Alia1421); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Alia

	// Delegated rules

	public final boolean synpred1_Alia() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Alia_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_func_def_in_program1301 = new BitSet(new long[]{0x904A5940C2018482L});
	public static final BitSet FOLLOW_statement_in_program1306 = new BitSet(new long[]{0x0100080000000000L});
	public static final BitSet FOLLOW_end_statement_in_program1308 = new BitSet(new long[]{0x904A5940C2018482L});
	public static final BitSet FOLLOW_NEWLINE_in_program1313 = new BitSet(new long[]{0x904A5940C2018482L});
	public static final BitSet FOLLOW_statement_in_statements1325 = new BitSet(new long[]{0x0100080000000002L});
	public static final BitSet FOLLOW_end_statement_in_statements1328 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_in_statements1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_statements1336 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_in_statements1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements_cond1348 = new BitSet(new long[]{0x0100080000000002L});
	public static final BitSet FOLLOW_end_statement_in_statements_cond1351 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_in_statements_cond1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_statements_cond1359 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_cond_in_statements_cond1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assignment_in_statement1370 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_const_assignment_in_statement1374 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COLON_in_statement1378 = new BitSet(new long[]{0x0000000100000300L});
	public static final BitSet FOLLOW_type_in_statement1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stmnt_in_statement1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_end_statement1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_end_statement1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_end_statement1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assignment1427 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assignment1429 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr_assignment_in_expr_assignment1433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_assignment1440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_const_assignment1452 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_assignment1455 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_const_assignment1457 = new BitSet(new long[]{0x1000400002000400L});
	public static final BitSet FOLLOW_primitive_in_const_assignment1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_expr1467 = new BitSet(new long[]{0x0001800000000002L});
	public static final BitSet FOLLOW_set_in_expr1470 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr1_in_expr1479 = new BitSet(new long[]{0x0001800000000002L});
	public static final BitSet FOLLOW_expr2_in_expr11488 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_set_in_expr11491 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr2_in_expr11500 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_expr3_in_expr21509 = new BitSet(new long[]{0x0000208418800002L});
	public static final BitSet FOLLOW_set_in_expr21512 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr3_in_expr21537 = new BitSet(new long[]{0x0000208418800002L});
	public static final BitSet FOLLOW_expr4_in_expr31546 = new BitSet(new long[]{0x0002010000000002L});
	public static final BitSet FOLLOW_set_in_expr31549 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr4_in_expr31558 = new BitSet(new long[]{0x0002010000000002L});
	public static final BitSet FOLLOW_expr5_in_expr41567 = new BitSet(new long[]{0x0800040000040002L});
	public static final BitSet FOLLOW_set_in_expr41570 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr5_in_expr41583 = new BitSet(new long[]{0x0800040000040002L});
	public static final BitSet FOLLOW_NOT_in_expr51592 = new BitSet(new long[]{0x10484040C2000480L});
	public static final BitSet FOLLOW_operand_in_expr51595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr51599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_minus_in_expr51603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr51607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_minus1614 = new BitSet(new long[]{0x10484040C2000480L});
	public static final BitSet FOLLOW_operand_in_expr_minus1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus1631 = new BitSet(new long[]{0x10484040C2000480L});
	public static final BitSet FOLLOW_operand_in_expr_plus1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_operand1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_operand1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmnt_in_operand1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1681 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr_in_operand1684 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_stmnt_in_operand1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitive_in_operand1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_identifier_in_operand1720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_compound_stmnt1728 = new BitSet(new long[]{0x904A5940C2408480L});
	public static final BitSet FOLLOW_statements_in_compound_stmnt1730 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_END_in_compound_stmnt1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_primitive1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_EXPR_in_primitive1752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_primitive1756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUOTE_in_char_expr1764 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LETTER_in_char_expr1767 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SQUOTE_in_char_expr1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_func_identifier1778 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_LPAREN_in_func_identifier1786 = new BitSet(new long[]{0x10CA5140C2000480L});
	public static final BitSet FOLLOW_exprlist_in_func_identifier1789 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_func_identifier1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_stmnt1802 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_cond_in_while_stmnt1804 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_while_stmnt1806 = new BitSet(new long[]{0x904A5940C2408480L});
	public static final BitSet FOLLOW_statements_in_while_stmnt1808 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_END_in_while_stmnt1810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmnt1832 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_cond_in_if_stmnt1834 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_if_stmnt1836 = new BitSet(new long[]{0x904A5940C2708480L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1838 = new BitSet(new long[]{0x0000000000700000L});
	public static final BitSet FOLLOW_else_stmnt_in_if_stmnt1840 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_END_in_if_stmnt1843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSEIF_in_else_stmnt1876 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_cond_in_else_stmnt1878 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DO_in_else_stmnt1880 = new BitSet(new long[]{0x904A5940C2308480L});
	public static final BitSet FOLLOW_statements_in_else_stmnt1882 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_else_stmnt_in_else_stmnt1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_stmnt1914 = new BitSet(new long[]{0x904A5940C2008480L});
	public static final BitSet FOLLOW_statements_in_else_stmnt1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1930 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1933 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_exprlist_in_print1936 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1946 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1949 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_varlist_in_read1952 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1963 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_varlist1966 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1969 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_expr_in_exprlist1978 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1981 = new BitSet(new long[]{0x104A5140C2000480L});
	public static final BitSet FOLLOW_expr_in_exprlist1984 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_DEF_in_func_def1994 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_func_def1996 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_func_def1998 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_varlist_in_func_def2001 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_func_def2003 = new BitSet(new long[]{0x904A5940C2408480L});
	public static final BitSet FOLLOW_statements_in_func_def2006 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_END_in_func_def2008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Alia1419 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Alia1421 = new BitSet(new long[]{0x0000000000000002L});
}
