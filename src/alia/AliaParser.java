// $ANTLR 3.5.2 src\\alia\\Alia.g 2014-06-18 14:59:07

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ALT", "BECOMES", "BOOL", 
		"CHAR", "COLON", "COMMA", "COMMENT", "DEF", "DIGIT", "DIV", "DO", "ELSE", 
		"ELSEIF", "END", "EQ", "EXPR_LIST", "FALSE", "FUNC", "GE", "GT", "IDENTIFIER", 
		"IF", "INT", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MOD", 
		"NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PRINT", "PROGRAM", 
		"READ", "RPAREN", "SEMICOLON", "STRING", "TIMES", "TRUE", "UPPER", "WHILE", 
		"WS"
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
	// src\\alia\\Alia.g:74:1: program : ( declaration | statement | NEWLINE !)* ;
	public final AliaParser.program_return program() throws RecognitionException {
		AliaParser.program_return retval = new AliaParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE3=null;
		ParserRuleReturnScope declaration1 =null;
		ParserRuleReturnScope statement2 =null;

		Object NEWLINE3_tree=null;

		try {
			// src\\alia\\Alia.g:74:9: ( ( declaration | statement | NEWLINE !)* )
			// src\\alia\\Alia.g:74:11: ( declaration | statement | NEWLINE !)*
			{
			root_0 = (Object)adaptor.nil();


			// src\\alia\\Alia.g:74:11: ( declaration | statement | NEWLINE !)*
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case DEF:
					{
					alt1=1;
					}
					break;
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
					// src\\alia\\Alia.g:74:12: declaration
					{
					pushFollow(FOLLOW_declaration_in_program1123);
					declaration1=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration1.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:74:26: statement
					{
					pushFollow(FOLLOW_statement_in_program1127);
					statement2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:74:38: NEWLINE !
					{
					NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program1131); if (state.failed) return retval;
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


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// src\\alia\\Alia.g:75:1: declaration : func_def ;
	public final AliaParser.declaration_return declaration() throws RecognitionException {
		AliaParser.declaration_return retval = new AliaParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope func_def4 =null;


		try {
			// src\\alia\\Alia.g:75:13: ( func_def )
			// src\\alia\\Alia.g:75:15: func_def
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_func_def_in_declaration1141);
			func_def4=func_def();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, func_def4.getTree());

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
	// $ANTLR end "declaration"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// src\\alia\\Alia.g:76:1: statements : ( statement | NEWLINE !)* ;
	public final AliaParser.statements_return statements() throws RecognitionException {
		AliaParser.statements_return retval = new AliaParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE6=null;
		ParserRuleReturnScope statement5 =null;

		Object NEWLINE6_tree=null;

		try {
			// src\\alia\\Alia.g:76:12: ( ( statement | NEWLINE !)* )
			// src\\alia\\Alia.g:76:14: ( statement | NEWLINE !)*
			{
			root_0 = (Object)adaptor.nil();


			// src\\alia\\Alia.g:76:14: ( statement | NEWLINE !)*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||LA2_0==NUMBER||(LA2_0 >= PLUS && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==WHILE) ) {
					alt2=1;
				}
				else if ( (LA2_0==NEWLINE) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\Alia.g:76:15: statement
					{
					pushFollow(FOLLOW_statement_in_statements1149);
					statement5=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement5.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:76:27: NEWLINE !
					{
					NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statements1153); if (state.failed) return retval;
					}
					break;

				default :
					break loop2;
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
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// src\\alia\\Alia.g:77:1: statement : ( expr_assignment ( COLON type )? end_statement | while_stmnt );
	public final AliaParser.statement_return statement() throws RecognitionException {
		AliaParser.statement_return retval = new AliaParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COLON8=null;
		ParserRuleReturnScope expr_assignment7 =null;
		ParserRuleReturnScope type9 =null;
		ParserRuleReturnScope end_statement10 =null;
		ParserRuleReturnScope while_stmnt11 =null;

		Object COLON8_tree=null;

		try {
			// src\\alia\\Alia.g:77:11: ( expr_assignment ( COLON type )? end_statement | while_stmnt )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==FALSE||(LA4_0 >= IDENTIFIER && LA4_0 <= IF)||LA4_0==LPAREN||LA4_0==MINUS||LA4_0==NOT||LA4_0==NUMBER||(LA4_0 >= PLUS && LA4_0 <= PRINT)||LA4_0==READ||LA4_0==TRUE) ) {
				alt4=1;
			}
			else if ( (LA4_0==WHILE) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src\\alia\\Alia.g:77:13: expr_assignment ( COLON type )? end_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_assignment_in_statement1163);
					expr_assignment7=expr_assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_assignment7.getTree());

					// src\\alia\\Alia.g:77:29: ( COLON type )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==COLON) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// src\\alia\\Alia.g:77:30: COLON type
							{
							COLON8=(Token)match(input,COLON,FOLLOW_COLON_in_statement1166); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COLON8_tree = (Object)adaptor.create(COLON8);
							adaptor.addChild(root_0, COLON8_tree);
							}

							pushFollow(FOLLOW_type_in_statement1168);
							type9=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

							}
							break;

					}

					pushFollow(FOLLOW_end_statement_in_statement1172);
					end_statement10=end_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, end_statement10.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:78:4: while_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_stmnt_in_statement1179);
					while_stmnt11=while_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_stmnt11.getTree());

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
	// src\\alia\\Alia.g:80:1: end_statement : ( NEWLINE !| SEMICOLON !| EOF !);
	public final AliaParser.end_statement_return end_statement() throws RecognitionException {
		AliaParser.end_statement_return retval = new AliaParser.end_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE12=null;
		Token SEMICOLON13=null;
		Token EOF14=null;

		Object NEWLINE12_tree=null;
		Object SEMICOLON13_tree=null;
		Object EOF14_tree=null;

		try {
			// src\\alia\\Alia.g:80:15: ( NEWLINE !| SEMICOLON !| EOF !)
			int alt5=3;
			switch ( input.LA(1) ) {
			case NEWLINE:
				{
				alt5=1;
				}
				break;
			case SEMICOLON:
				{
				alt5=2;
				}
				break;
			case EOF:
				{
				alt5=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src\\alia\\Alia.g:80:17: NEWLINE !
					{
					root_0 = (Object)adaptor.nil();


					NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_statement1190); if (state.failed) return retval;
					}
					break;
				case 2 :
					// src\\alia\\Alia.g:80:28: SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					SEMICOLON13=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_end_statement1195); if (state.failed) return retval;
					}
					break;
				case 3 :
					// src\\alia\\Alia.g:80:41: EOF !
					{
					root_0 = (Object)adaptor.nil();


					EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_end_statement1200); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:84:1: expr_assignment : ( ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment | expr );
	public final AliaParser.expr_assignment_return expr_assignment() throws RecognitionException {
		AliaParser.expr_assignment_return retval = new AliaParser.expr_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER15=null;
		Token BECOMES16=null;
		ParserRuleReturnScope expr_assignment17 =null;
		ParserRuleReturnScope expr18 =null;

		Object IDENTIFIER15_tree=null;
		Object BECOMES16_tree=null;

		try {
			// src\\alia\\Alia.g:84:17: ( ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment | expr )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENTIFIER) ) {
				int LA6_1 = input.LA(2);
				if ( (synpred1_Alia()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

			}
			else if ( (LA6_0==FALSE||LA6_0==IF||LA6_0==LPAREN||LA6_0==MINUS||LA6_0==NOT||LA6_0==NUMBER||(LA6_0 >= PLUS && LA6_0 <= PRINT)||LA6_0==READ||LA6_0==TRUE) ) {
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
					// src\\alia\\Alia.g:84:19: ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment
					{
					root_0 = (Object)adaptor.nil();


					// src\\alia\\Alia.g:84:43: ( IDENTIFIER BECOMES ^)
					// src\\alia\\Alia.g:84:44: IDENTIFIER BECOMES ^
					{
					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assignment1220); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER15_tree = (Object)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);
					}

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assignment1222); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BECOMES16_tree = (Object)adaptor.create(BECOMES16);
					root_0 = (Object)adaptor.becomeRoot(BECOMES16_tree, root_0);
					}

					}

					pushFollow(FOLLOW_expr_assignment_in_expr_assignment1226);
					expr_assignment17=expr_assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_assignment17.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:85:4: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expr_assignment1233);
					expr18=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr18.getTree());

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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// src\\alia\\Alia.g:87:1: expr : expr1 ( ( OR | OR_ALT ) ^ expr1 )* ;
	public final AliaParser.expr_return expr() throws RecognitionException {
		AliaParser.expr_return retval = new AliaParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;
		ParserRuleReturnScope expr119 =null;
		ParserRuleReturnScope expr121 =null;

		Object set20_tree=null;

		try {
			// src\\alia\\Alia.g:87:6: ( expr1 ( ( OR | OR_ALT ) ^ expr1 )* )
			// src\\alia\\Alia.g:87:8: expr1 ( ( OR | OR_ALT ) ^ expr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1_in_expr1242);
			expr119=expr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

			// src\\alia\\Alia.g:87:14: ( ( OR | OR_ALT ) ^ expr1 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= OR && LA7_0 <= OR_ALT)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src\\alia\\Alia.g:87:15: ( OR | OR_ALT ) ^ expr1
					{
					set20=input.LT(1);
					set20=input.LT(1);
					if ( (input.LA(1) >= OR && input.LA(1) <= OR_ALT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set20), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr1_in_expr1254);
					expr121=expr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr121.getTree());

					}
					break;

				default :
					break loop7;
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
	// src\\alia\\Alia.g:88:1: expr1 : expr2 ( ( AND | AND_ALT ) ^ expr2 )* ;
	public final AliaParser.expr1_return expr1() throws RecognitionException {
		AliaParser.expr1_return retval = new AliaParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set23=null;
		ParserRuleReturnScope expr222 =null;
		ParserRuleReturnScope expr224 =null;

		Object set23_tree=null;

		try {
			// src\\alia\\Alia.g:88:7: ( expr2 ( ( AND | AND_ALT ) ^ expr2 )* )
			// src\\alia\\Alia.g:88:9: expr2 ( ( AND | AND_ALT ) ^ expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr11263);
			expr222=expr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr222.getTree());

			// src\\alia\\Alia.g:88:15: ( ( AND | AND_ALT ) ^ expr2 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= AND && LA8_0 <= AND_ALT)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src\\alia\\Alia.g:88:16: ( AND | AND_ALT ) ^ expr2
					{
					set23=input.LT(1);
					set23=input.LT(1);
					if ( (input.LA(1) >= AND && input.LA(1) <= AND_ALT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set23), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr2_in_expr11275);
					expr224=expr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr224.getTree());

					}
					break;

				default :
					break loop8;
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
	// src\\alia\\Alia.g:89:1: expr2 : expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )* ;
	public final AliaParser.expr2_return expr2() throws RecognitionException {
		AliaParser.expr2_return retval = new AliaParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set26=null;
		ParserRuleReturnScope expr325 =null;
		ParserRuleReturnScope expr327 =null;

		Object set26_tree=null;

		try {
			// src\\alia\\Alia.g:89:7: ( expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )* )
			// src\\alia\\Alia.g:89:9: expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3_in_expr21284);
			expr325=expr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr325.getTree());

			// src\\alia\\Alia.g:89:15: ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GE && LA9_0 <= GT)||LA9_0==LE||LA9_0==LT||LA9_0==NQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src\\alia\\Alia.g:89:16: ( GT | GE | LT | LE | EQ | NQ ) ^ expr3
					{
					set26=input.LT(1);
					set26=input.LT(1);
					if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NQ ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set26), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr3_in_expr21312);
					expr327=expr3();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr327.getTree());

					}
					break;

				default :
					break loop9;
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
	// src\\alia\\Alia.g:90:1: expr3 : expr4 ( ( PLUS | MINUS ) ^ expr4 )* ;
	public final AliaParser.expr3_return expr3() throws RecognitionException {
		AliaParser.expr3_return retval = new AliaParser.expr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set29=null;
		ParserRuleReturnScope expr428 =null;
		ParserRuleReturnScope expr430 =null;

		Object set29_tree=null;

		try {
			// src\\alia\\Alia.g:90:7: ( expr4 ( ( PLUS | MINUS ) ^ expr4 )* )
			// src\\alia\\Alia.g:90:9: expr4 ( ( PLUS | MINUS ) ^ expr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr4_in_expr31321);
			expr428=expr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr428.getTree());

			// src\\alia\\Alia.g:90:15: ( ( PLUS | MINUS ) ^ expr4 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\alia\\Alia.g:90:16: ( PLUS | MINUS ) ^ expr4
					{
					set29=input.LT(1);
					set29=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set29), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr4_in_expr31333);
					expr430=expr4();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr430.getTree());

					}
					break;

				default :
					break loop10;
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
	// src\\alia\\Alia.g:91:1: expr4 : expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )* ;
	public final AliaParser.expr4_return expr4() throws RecognitionException {
		AliaParser.expr4_return retval = new AliaParser.expr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set32=null;
		ParserRuleReturnScope expr531 =null;
		ParserRuleReturnScope expr533 =null;

		Object set32_tree=null;

		try {
			// src\\alia\\Alia.g:91:7: ( expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )* )
			// src\\alia\\Alia.g:91:9: expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr5_in_expr41342);
			expr531=expr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr531.getTree());

			// src\\alia\\Alia.g:91:15: ( ( TIMES | DIV | MOD ) ^ expr5 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==DIV||LA11_0==MOD||LA11_0==TIMES) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src\\alia\\Alia.g:91:16: ( TIMES | DIV | MOD ) ^ expr5
					{
					set32=input.LT(1);
					set32=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==TIMES ) {
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
					pushFollow(FOLLOW_expr5_in_expr41358);
					expr533=expr5();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr533.getTree());

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
	// $ANTLR end "expr4"


	public static class expr5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr5"
	// src\\alia\\Alia.g:92:1: expr5 : ( ( NOT | PLUS | MINUS ) ^ operand | operand );
	public final AliaParser.expr5_return expr5() throws RecognitionException {
		AliaParser.expr5_return retval = new AliaParser.expr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set34=null;
		ParserRuleReturnScope operand35 =null;
		ParserRuleReturnScope operand36 =null;

		Object set34_tree=null;

		try {
			// src\\alia\\Alia.g:92:7: ( ( NOT | PLUS | MINUS ) ^ operand | operand )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==MINUS||LA12_0==NOT||LA12_0==PLUS) ) {
				alt12=1;
			}
			else if ( (LA12_0==FALSE||(LA12_0 >= IDENTIFIER && LA12_0 <= IF)||LA12_0==LPAREN||LA12_0==NUMBER||LA12_0==PRINT||LA12_0==READ||LA12_0==TRUE) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src\\alia\\Alia.g:92:9: ( NOT | PLUS | MINUS ) ^ operand
					{
					root_0 = (Object)adaptor.nil();


					set34=input.LT(1);
					set34=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==NOT||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set34), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_operand_in_expr51380);
					operand35=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand35.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:92:41: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_expr51384);
					operand36=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand36.getTree());

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


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src\\alia\\Alia.g:93:1: operand : ( read | print | if_stmnt | LPAREN ! expr RPAREN !| NUMBER | boolean_expr | func_identifier );
	public final AliaParser.operand_return operand() throws RecognitionException {
		AliaParser.operand_return retval = new AliaParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN40=null;
		Token RPAREN42=null;
		Token NUMBER43=null;
		ParserRuleReturnScope read37 =null;
		ParserRuleReturnScope print38 =null;
		ParserRuleReturnScope if_stmnt39 =null;
		ParserRuleReturnScope expr41 =null;
		ParserRuleReturnScope boolean_expr44 =null;
		ParserRuleReturnScope func_identifier45 =null;

		Object LPAREN40_tree=null;
		Object RPAREN42_tree=null;
		Object NUMBER43_tree=null;

		try {
			// src\\alia\\Alia.g:93:9: ( read | print | if_stmnt | LPAREN ! expr RPAREN !| NUMBER | boolean_expr | func_identifier )
			int alt13=7;
			switch ( input.LA(1) ) {
			case READ:
				{
				alt13=1;
				}
				break;
			case PRINT:
				{
				alt13=2;
				}
				break;
			case IF:
				{
				alt13=3;
				}
				break;
			case LPAREN:
				{
				alt13=4;
				}
				break;
			case NUMBER:
				{
				alt13=5;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt13=6;
				}
				break;
			case IDENTIFIER:
				{
				alt13=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src\\alia\\Alia.g:93:11: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_operand1391);
					read37=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read37.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:94:8: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_operand1402);
					print38=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print38.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:95:8: if_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmnt_in_operand1413);
					if_stmnt39=if_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stmnt39.getTree());

					}
					break;
				case 4 :
					// src\\alia\\Alia.g:96:8: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1424); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_operand1427);
					expr41=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr41.getTree());

					RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1429); if (state.failed) return retval;
					}
					break;
				case 5 :
					// src\\alia\\Alia.g:97:8: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER43=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1441); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER43_tree = (Object)adaptor.create(NUMBER43);
					adaptor.addChild(root_0, NUMBER43_tree);
					}

					}
					break;
				case 6 :
					// src\\alia\\Alia.g:98:8: boolean_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expr_in_operand1452);
					boolean_expr44=boolean_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expr44.getTree());

					}
					break;
				case 7 :
					// src\\alia\\Alia.g:99:8: func_identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_identifier_in_operand1463);
					func_identifier45=func_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_identifier45.getTree());

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


	public static class func_identifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_identifier"
	// src\\alia\\Alia.g:102:1: func_identifier : IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )? ;
	public final AliaParser.func_identifier_return func_identifier() throws RecognitionException {
		AliaParser.func_identifier_return retval = new AliaParser.func_identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER46=null;
		Token LPAREN47=null;
		Token RPAREN49=null;
		ParserRuleReturnScope exprlist48 =null;

		Object IDENTIFIER46_tree=null;
		Object LPAREN47_tree=null;
		Object RPAREN49_tree=null;

		try {
			// src\\alia\\Alia.g:102:17: ( IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )? )
			// src\\alia\\Alia.g:102:19: IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER46=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_identifier1472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER46_tree = (Object)adaptor.create(IDENTIFIER46);
			adaptor.addChild(root_0, IDENTIFIER46_tree);
			}

			// src\\alia\\Alia.g:103:5: ( LPAREN ^ ( exprlist )? RPAREN )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LPAREN) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// src\\alia\\Alia.g:103:6: LPAREN ^ ( exprlist )? RPAREN
					{
					LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_identifier1480); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN47_tree = (Object)adaptor.create(LPAREN47);
					root_0 = (Object)adaptor.becomeRoot(LPAREN47_tree, root_0);
					}

					// src\\alia\\Alia.g:103:14: ( exprlist )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==FALSE||(LA14_0 >= IDENTIFIER && LA14_0 <= IF)||LA14_0==LPAREN||LA14_0==MINUS||LA14_0==NOT||LA14_0==NUMBER||(LA14_0 >= PLUS && LA14_0 <= PRINT)||LA14_0==READ||LA14_0==TRUE) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// src\\alia\\Alia.g:103:14: exprlist
							{
							pushFollow(FOLLOW_exprlist_in_func_identifier1483);
							exprlist48=exprlist();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist48.getTree());

							}
							break;

					}

					RPAREN49=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_identifier1486); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN49_tree = (Object)adaptor.create(RPAREN49);
					adaptor.addChild(root_0, RPAREN49_tree);
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
	// src\\alia\\Alia.g:107:1: while_stmnt : WHILE ^ expr DO statements END ;
	public final AliaParser.while_stmnt_return while_stmnt() throws RecognitionException {
		AliaParser.while_stmnt_return retval = new AliaParser.while_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE50=null;
		Token DO52=null;
		Token END54=null;
		ParserRuleReturnScope expr51 =null;
		ParserRuleReturnScope statements53 =null;

		Object WHILE50_tree=null;
		Object DO52_tree=null;
		Object END54_tree=null;

		try {
			// src\\alia\\Alia.g:107:13: ( WHILE ^ expr DO statements END )
			// src\\alia\\Alia.g:107:15: WHILE ^ expr DO statements END
			{
			root_0 = (Object)adaptor.nil();


			WHILE50=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmnt1498); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE50_tree = (Object)adaptor.create(WHILE50);
			root_0 = (Object)adaptor.becomeRoot(WHILE50_tree, root_0);
			}

			pushFollow(FOLLOW_expr_in_while_stmnt1501);
			expr51=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr51.getTree());

			DO52=(Token)match(input,DO,FOLLOW_DO_in_while_stmnt1503); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DO52_tree = (Object)adaptor.create(DO52);
			adaptor.addChild(root_0, DO52_tree);
			}

			pushFollow(FOLLOW_statements_in_while_stmnt1505);
			statements53=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements53.getTree());

			END54=(Token)match(input,END,FOLLOW_END_in_while_stmnt1507); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END54_tree = (Object)adaptor.create(END54);
			adaptor.addChild(root_0, END54_tree);
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
	// src\\alia\\Alia.g:109:1: if_stmnt : IF ^ expr DO ! statements ( ELSEIF expr DO ! statements )* ( ELSE statements )? END !;
	public final AliaParser.if_stmnt_return if_stmnt() throws RecognitionException {
		AliaParser.if_stmnt_return retval = new AliaParser.if_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF55=null;
		Token DO57=null;
		Token ELSEIF59=null;
		Token DO61=null;
		Token ELSE63=null;
		Token END65=null;
		ParserRuleReturnScope expr56 =null;
		ParserRuleReturnScope statements58 =null;
		ParserRuleReturnScope expr60 =null;
		ParserRuleReturnScope statements62 =null;
		ParserRuleReturnScope statements64 =null;

		Object IF55_tree=null;
		Object DO57_tree=null;
		Object ELSEIF59_tree=null;
		Object DO61_tree=null;
		Object ELSE63_tree=null;
		Object END65_tree=null;

		try {
			// src\\alia\\Alia.g:109:10: ( IF ^ expr DO ! statements ( ELSEIF expr DO ! statements )* ( ELSE statements )? END !)
			// src\\alia\\Alia.g:109:12: IF ^ expr DO ! statements ( ELSEIF expr DO ! statements )* ( ELSE statements )? END !
			{
			root_0 = (Object)adaptor.nil();


			IF55=(Token)match(input,IF,FOLLOW_IF_in_if_stmnt1515); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF55_tree = (Object)adaptor.create(IF55);
			root_0 = (Object)adaptor.becomeRoot(IF55_tree, root_0);
			}

			pushFollow(FOLLOW_expr_in_if_stmnt1518);
			expr56=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr56.getTree());

			DO57=(Token)match(input,DO,FOLLOW_DO_in_if_stmnt1520); if (state.failed) return retval;
			pushFollow(FOLLOW_statements_in_if_stmnt1523);
			statements58=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements58.getTree());

			// src\\alia\\Alia.g:109:36: ( ELSEIF expr DO ! statements )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==ELSEIF) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// src\\alia\\Alia.g:109:37: ELSEIF expr DO ! statements
					{
					ELSEIF59=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_if_stmnt1526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSEIF59_tree = (Object)adaptor.create(ELSEIF59);
					adaptor.addChild(root_0, ELSEIF59_tree);
					}

					pushFollow(FOLLOW_expr_in_if_stmnt1528);
					expr60=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr60.getTree());

					DO61=(Token)match(input,DO,FOLLOW_DO_in_if_stmnt1530); if (state.failed) return retval;
					pushFollow(FOLLOW_statements_in_if_stmnt1533);
					statements62=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements62.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			// src\\alia\\Alia.g:109:66: ( ELSE statements )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ELSE) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// src\\alia\\Alia.g:109:67: ELSE statements
					{
					ELSE63=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_stmnt1538); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE63_tree = (Object)adaptor.create(ELSE63);
					adaptor.addChild(root_0, ELSE63_tree);
					}

					pushFollow(FOLLOW_statements_in_if_stmnt1540);
					statements64=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements64.getTree());

					}
					break;

			}

			END65=(Token)match(input,END,FOLLOW_END_in_if_stmnt1544); if (state.failed) return retval;
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


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// src\\alia\\Alia.g:111:1: print : PRINT ^ LPAREN ! exprlist RPAREN !;
	public final AliaParser.print_return print() throws RecognitionException {
		AliaParser.print_return retval = new AliaParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT66=null;
		Token LPAREN67=null;
		Token RPAREN69=null;
		ParserRuleReturnScope exprlist68 =null;

		Object PRINT66_tree=null;
		Object LPAREN67_tree=null;
		Object RPAREN69_tree=null;

		try {
			// src\\alia\\Alia.g:111:7: ( PRINT ^ LPAREN ! exprlist RPAREN !)
			// src\\alia\\Alia.g:111:9: PRINT ^ LPAREN ! exprlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT66=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1553); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT66_tree = (Object)adaptor.create(PRINT66);
			root_0 = (Object)adaptor.becomeRoot(PRINT66_tree, root_0);
			}

			LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1556); if (state.failed) return retval;
			pushFollow(FOLLOW_exprlist_in_print1559);
			exprlist68=exprlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist68.getTree());

			RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1561); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:112:1: read : READ ^ LPAREN ! varlist RPAREN !;
	public final AliaParser.read_return read() throws RecognitionException {
		AliaParser.read_return retval = new AliaParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ70=null;
		Token LPAREN71=null;
		Token RPAREN73=null;
		ParserRuleReturnScope varlist72 =null;

		Object READ70_tree=null;
		Object LPAREN71_tree=null;
		Object RPAREN73_tree=null;

		try {
			// src\\alia\\Alia.g:112:6: ( READ ^ LPAREN ! varlist RPAREN !)
			// src\\alia\\Alia.g:112:8: READ ^ LPAREN ! varlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ70=(Token)match(input,READ,FOLLOW_READ_in_read1569); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ70_tree = (Object)adaptor.create(READ70);
			root_0 = (Object)adaptor.becomeRoot(READ70_tree, root_0);
			}

			LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1572); if (state.failed) return retval;
			pushFollow(FOLLOW_varlist_in_read1575);
			varlist72=varlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist72.getTree());

			RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1577); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:114:1: varlist : IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final AliaParser.varlist_return varlist() throws RecognitionException {
		AliaParser.varlist_return retval = new AliaParser.varlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER74=null;
		Token COMMA75=null;
		Token IDENTIFIER76=null;

		Object IDENTIFIER74_tree=null;
		Object COMMA75_tree=null;
		Object IDENTIFIER76_tree=null;

		try {
			// src\\alia\\Alia.g:114:9: ( IDENTIFIER ( COMMA IDENTIFIER )* )
			// src\\alia\\Alia.g:114:11: IDENTIFIER ( COMMA IDENTIFIER )*
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1586); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER74_tree = (Object)adaptor.create(IDENTIFIER74);
			adaptor.addChild(root_0, IDENTIFIER74_tree);
			}

			// src\\alia\\Alia.g:114:22: ( COMMA IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// src\\alia\\Alia.g:114:23: COMMA IDENTIFIER
					{
					COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_varlist1589); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA75_tree = (Object)adaptor.create(COMMA75);
					adaptor.addChild(root_0, COMMA75_tree);
					}

					IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1591); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER76_tree = (Object)adaptor.create(IDENTIFIER76);
					adaptor.addChild(root_0, IDENTIFIER76_tree);
					}

					}
					break;

				default :
					break loop18;
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
	// src\\alia\\Alia.g:116:1: exprlist : expr ( COMMA expr )* ;
	public final AliaParser.exprlist_return exprlist() throws RecognitionException {
		AliaParser.exprlist_return retval = new AliaParser.exprlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA78=null;
		ParserRuleReturnScope expr77 =null;
		ParserRuleReturnScope expr79 =null;

		Object COMMA78_tree=null;

		try {
			// src\\alia\\Alia.g:116:10: ( expr ( COMMA expr )* )
			// src\\alia\\Alia.g:116:12: expr ( COMMA expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_exprlist1601);
			expr77=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr77.getTree());

			// src\\alia\\Alia.g:116:17: ( COMMA expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// src\\alia\\Alia.g:116:18: COMMA expr
					{
					COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist1604); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA78_tree = (Object)adaptor.create(COMMA78);
					adaptor.addChild(root_0, COMMA78_tree);
					}

					pushFollow(FOLLOW_expr_in_exprlist1606);
					expr79=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr79.getTree());

					}
					break;

				default :
					break loop19;
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
	// src\\alia\\Alia.g:118:1: func_def : DEF IDENTIFIER LPAREN ! RPAREN ! statements END ;
	public final AliaParser.func_def_return func_def() throws RecognitionException {
		AliaParser.func_def_return retval = new AliaParser.func_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DEF80=null;
		Token IDENTIFIER81=null;
		Token LPAREN82=null;
		Token RPAREN83=null;
		Token END85=null;
		ParserRuleReturnScope statements84 =null;

		Object DEF80_tree=null;
		Object IDENTIFIER81_tree=null;
		Object LPAREN82_tree=null;
		Object RPAREN83_tree=null;
		Object END85_tree=null;

		try {
			// src\\alia\\Alia.g:118:10: ( DEF IDENTIFIER LPAREN ! RPAREN ! statements END )
			// src\\alia\\Alia.g:118:12: DEF IDENTIFIER LPAREN ! RPAREN ! statements END
			{
			root_0 = (Object)adaptor.nil();


			DEF80=(Token)match(input,DEF,FOLLOW_DEF_in_func_def1616); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEF80_tree = (Object)adaptor.create(DEF80);
			adaptor.addChild(root_0, DEF80_tree);
			}

			IDENTIFIER81=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_def1618); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER81_tree = (Object)adaptor.create(IDENTIFIER81);
			adaptor.addChild(root_0, IDENTIFIER81_tree);
			}

			LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_def1620); if (state.failed) return retval;
			RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_def1624); if (state.failed) return retval;
			pushFollow(FOLLOW_statements_in_func_def1627);
			statements84=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements84.getTree());

			END85=(Token)match(input,END,FOLLOW_END_in_func_def1629); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END85_tree = (Object)adaptor.create(END85);
			adaptor.addChild(root_0, END85_tree);
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
	// src\\alia\\Alia.g:127:1: boolean_expr : ( TRUE | FALSE );
	public final AliaParser.boolean_expr_return boolean_expr() throws RecognitionException {
		AliaParser.boolean_expr_return retval = new AliaParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set86=null;

		Object set86_tree=null;

		try {
			// src\\alia\\Alia.g:127:14: ( TRUE | FALSE )
			// src\\alia\\Alia.g:
			{
			root_0 = (Object)adaptor.nil();


			set86=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set86));
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
	// src\\alia\\Alia.g:129:1: type : ( STRING | INT | BOOL );
	public final AliaParser.type_return type() throws RecognitionException {
		AliaParser.type_return retval = new AliaParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set87=null;

		Object set87_tree=null;

		try {
			// src\\alia\\Alia.g:129:6: ( STRING | INT | BOOL )
			// src\\alia\\Alia.g:
			{
			root_0 = (Object)adaptor.nil();


			set87=input.LT(1);
			if ( input.LA(1)==BOOL||input.LA(1)==INT||input.LA(1)==STRING ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set87));
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
		// src\\alia\\Alia.g:84:19: ( IDENTIFIER BECOMES )
		// src\\alia\\Alia.g:84:20: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Alia1212); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Alia1214); if (state.failed) return;

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



	public static final BitSet FOLLOW_declaration_in_program1123 = new BitSet(new long[]{0x000A165A86201002L});
	public static final BitSet FOLLOW_statement_in_program1127 = new BitSet(new long[]{0x000A165A86201002L});
	public static final BitSet FOLLOW_NEWLINE_in_program1131 = new BitSet(new long[]{0x000A165A86201002L});
	public static final BitSet FOLLOW_func_def_in_declaration1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1149 = new BitSet(new long[]{0x000A165A86200002L});
	public static final BitSet FOLLOW_NEWLINE_in_statements1153 = new BitSet(new long[]{0x000A165A86200002L});
	public static final BitSet FOLLOW_expr_assignment_in_statement1163 = new BitSet(new long[]{0x0000400800000200L});
	public static final BitSet FOLLOW_COLON_in_statement1166 = new BitSet(new long[]{0x0000800008000080L});
	public static final BitSet FOLLOW_type_in_statement1168 = new BitSet(new long[]{0x0000400800000000L});
	public static final BitSet FOLLOW_end_statement_in_statement1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stmnt_in_statement1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_end_statement1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_end_statement1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_end_statement1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assignment1220 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assignment1222 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr_assignment_in_expr_assignment1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_assignment1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_expr1242 = new BitSet(new long[]{0x0000018000000002L});
	public static final BitSet FOLLOW_set_in_expr1245 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr1_in_expr1254 = new BitSet(new long[]{0x0000018000000002L});
	public static final BitSet FOLLOW_expr2_in_expr11263 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_set_in_expr11266 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr2_in_expr11275 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_expr3_in_expr21284 = new BitSet(new long[]{0x0000002111880002L});
	public static final BitSet FOLLOW_set_in_expr21287 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr3_in_expr21312 = new BitSet(new long[]{0x0000002111880002L});
	public static final BitSet FOLLOW_expr4_in_expr31321 = new BitSet(new long[]{0x0000020200000002L});
	public static final BitSet FOLLOW_set_in_expr31324 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr4_in_expr31333 = new BitSet(new long[]{0x0000020200000002L});
	public static final BitSet FOLLOW_expr5_in_expr41342 = new BitSet(new long[]{0x0001000400004002L});
	public static final BitSet FOLLOW_set_in_expr41345 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr5_in_expr41358 = new BitSet(new long[]{0x0001000400004002L});
	public static final BitSet FOLLOW_set_in_expr51367 = new BitSet(new long[]{0x0002144086200000L});
	public static final BitSet FOLLOW_operand_in_expr51380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr51384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_operand1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_operand1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmnt_in_operand1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1424 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr_in_operand1427 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_operand1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_identifier_in_operand1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_func_identifier1472 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LPAREN_in_func_identifier1480 = new BitSet(new long[]{0x0002365286200000L});
	public static final BitSet FOLLOW_exprlist_in_func_identifier1483 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_func_identifier1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_stmnt1498 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr_in_while_stmnt1501 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_while_stmnt1503 = new BitSet(new long[]{0x000A165A86240000L});
	public static final BitSet FOLLOW_statements_in_while_stmnt1505 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_while_stmnt1507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmnt1515 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr_in_if_stmnt1518 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_if_stmnt1520 = new BitSet(new long[]{0x000A165A86270000L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1523 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_ELSEIF_in_if_stmnt1526 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr_in_if_stmnt1528 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_if_stmnt1530 = new BitSet(new long[]{0x000A165A86270000L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1533 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_ELSE_in_if_stmnt1538 = new BitSet(new long[]{0x000A165A86240000L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1540 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_if_stmnt1544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1553 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1556 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_exprlist_in_print1559 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1569 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1572 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_varlist_in_read1575 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1586 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_varlist1589 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1591 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expr_in_exprlist1601 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1604 = new BitSet(new long[]{0x0002165286200000L});
	public static final BitSet FOLLOW_expr_in_exprlist1606 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DEF_in_func_def1616 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_func_def1618 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_func_def1620 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RPAREN_in_func_def1624 = new BitSet(new long[]{0x000A165A86240000L});
	public static final BitSet FOLLOW_statements_in_func_def1627 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_func_def1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Alia1212 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Alia1214 = new BitSet(new long[]{0x0000000000000002L});
}
