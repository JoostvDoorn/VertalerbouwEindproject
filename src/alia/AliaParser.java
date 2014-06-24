// $ANTLR 3.5.2 src\\alia\\Alia.g 2014-06-24 15:09:35

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
		"IF", "INT", "LE", "LETTER", "LOWER", "LPAREN", "LT", "MINUS", "MINUS_OP", 
		"MOD", "NEWLINE", "NOT", "NQ", "NUMBER", "OR", "OR_ALT", "PLUS", "PLUS_OP", 
		"PRINT", "PROGRAM", "READ", "RPAREN", "SEMICOLON", "SQUOTE", "STRING", 
		"TIMES", "TRUE", "UPPER", "WHILE", "WS"
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
	public static final int MINUS_OP=34;
	public static final int MOD=35;
	public static final int NEWLINE=36;
	public static final int NOT=37;
	public static final int NQ=38;
	public static final int NUMBER=39;
	public static final int OR=40;
	public static final int OR_ALT=41;
	public static final int PLUS=42;
	public static final int PLUS_OP=43;
	public static final int PRINT=44;
	public static final int PROGRAM=45;
	public static final int READ=46;
	public static final int RPAREN=47;
	public static final int SEMICOLON=48;
	public static final int SQUOTE=49;
	public static final int STRING=50;
	public static final int TIMES=51;
	public static final int TRUE=52;
	public static final int UPPER=53;
	public static final int WHILE=54;
	public static final int WS=55;

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
	// src\\alia\\Alia.g:77:1: program : ( declaration | statement | NEWLINE !)* ;
	public final AliaParser.program_return program() throws RecognitionException {
		AliaParser.program_return retval = new AliaParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE3=null;
		ParserRuleReturnScope declaration1 =null;
		ParserRuleReturnScope statement2 =null;

		Object NEWLINE3_tree=null;

		try {
			// src\\alia\\Alia.g:77:9: ( ( declaration | statement | NEWLINE !)* )
			// src\\alia\\Alia.g:77:11: ( declaration | statement | NEWLINE !)*
			{
			root_0 = (Object)adaptor.nil();


			// src\\alia\\Alia.g:77:11: ( declaration | statement | NEWLINE !)*
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
				case SQUOTE:
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
					// src\\alia\\Alia.g:77:12: declaration
					{
					pushFollow(FOLLOW_declaration_in_program1189);
					declaration1=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration1.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:77:26: statement
					{
					pushFollow(FOLLOW_statement_in_program1193);
					statement2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:77:38: NEWLINE !
					{
					NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program1197); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:78:1: declaration : func_def ;
	public final AliaParser.declaration_return declaration() throws RecognitionException {
		AliaParser.declaration_return retval = new AliaParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope func_def4 =null;


		try {
			// src\\alia\\Alia.g:78:13: ( func_def )
			// src\\alia\\Alia.g:78:15: func_def
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_func_def_in_declaration1207);
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
	// src\\alia\\Alia.g:79:1: statements : ( statement | NEWLINE !)* ;
	public final AliaParser.statements_return statements() throws RecognitionException {
		AliaParser.statements_return retval = new AliaParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEWLINE6=null;
		ParserRuleReturnScope statement5 =null;

		Object NEWLINE6_tree=null;

		try {
			// src\\alia\\Alia.g:79:12: ( ( statement | NEWLINE !)* )
			// src\\alia\\Alia.g:79:14: ( statement | NEWLINE !)*
			{
			root_0 = (Object)adaptor.nil();


			// src\\alia\\Alia.g:79:14: ( statement | NEWLINE !)*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||LA2_0==NUMBER||LA2_0==PLUS||LA2_0==PRINT||LA2_0==READ||LA2_0==SQUOTE||LA2_0==TRUE||LA2_0==WHILE) ) {
					alt2=1;
				}
				else if ( (LA2_0==NEWLINE) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\Alia.g:79:15: statement
					{
					pushFollow(FOLLOW_statement_in_statements1215);
					statement5=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement5.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:79:27: NEWLINE !
					{
					NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_statements1219); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:80:1: statement : ( expr_assignment ( COLON type )? end_statement | while_stmnt );
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
			// src\\alia\\Alia.g:80:11: ( expr_assignment ( COLON type )? end_statement | while_stmnt )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==FALSE||(LA4_0 >= IDENTIFIER && LA4_0 <= IF)||LA4_0==LPAREN||LA4_0==MINUS||LA4_0==NOT||LA4_0==NUMBER||LA4_0==PLUS||LA4_0==PRINT||LA4_0==READ||LA4_0==SQUOTE||LA4_0==TRUE) ) {
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
					// src\\alia\\Alia.g:80:13: expr_assignment ( COLON type )? end_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_assignment_in_statement1229);
					expr_assignment7=expr_assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_assignment7.getTree());

					// src\\alia\\Alia.g:80:29: ( COLON type )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==COLON) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// src\\alia\\Alia.g:80:30: COLON type
							{
							COLON8=(Token)match(input,COLON,FOLLOW_COLON_in_statement1232); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COLON8_tree = (Object)adaptor.create(COLON8);
							adaptor.addChild(root_0, COLON8_tree);
							}

							pushFollow(FOLLOW_type_in_statement1234);
							type9=type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, type9.getTree());

							}
							break;

					}

					pushFollow(FOLLOW_end_statement_in_statement1238);
					end_statement10=end_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, end_statement10.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:81:4: while_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_stmnt_in_statement1245);
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
	// src\\alia\\Alia.g:83:1: end_statement : ( NEWLINE !| SEMICOLON !| EOF !);
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
			// src\\alia\\Alia.g:83:15: ( NEWLINE !| SEMICOLON !| EOF !)
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
					// src\\alia\\Alia.g:83:17: NEWLINE !
					{
					root_0 = (Object)adaptor.nil();


					NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_end_statement1256); if (state.failed) return retval;
					}
					break;
				case 2 :
					// src\\alia\\Alia.g:83:28: SEMICOLON !
					{
					root_0 = (Object)adaptor.nil();


					SEMICOLON13=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_end_statement1261); if (state.failed) return retval;
					}
					break;
				case 3 :
					// src\\alia\\Alia.g:83:41: EOF !
					{
					root_0 = (Object)adaptor.nil();


					EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_end_statement1266); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:87:1: expr_assignment : ( ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment | expr );
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
			// src\\alia\\Alia.g:87:17: ( ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment | expr )
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
			else if ( (LA6_0==FALSE||LA6_0==IF||LA6_0==LPAREN||LA6_0==MINUS||LA6_0==NOT||LA6_0==NUMBER||LA6_0==PLUS||LA6_0==PRINT||LA6_0==READ||LA6_0==SQUOTE||LA6_0==TRUE) ) {
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
					// src\\alia\\Alia.g:87:19: ( IDENTIFIER BECOMES )=> ( IDENTIFIER BECOMES ^) expr_assignment
					{
					root_0 = (Object)adaptor.nil();


					// src\\alia\\Alia.g:87:43: ( IDENTIFIER BECOMES ^)
					// src\\alia\\Alia.g:87:44: IDENTIFIER BECOMES ^
					{
					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assignment1286); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER15_tree = (Object)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);
					}

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assignment1288); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BECOMES16_tree = (Object)adaptor.create(BECOMES16);
					root_0 = (Object)adaptor.becomeRoot(BECOMES16_tree, root_0);
					}

					}

					pushFollow(FOLLOW_expr_assignment_in_expr_assignment1292);
					expr_assignment17=expr_assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_assignment17.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:88:4: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expr_assignment1299);
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
	// src\\alia\\Alia.g:90:1: expr : expr1 ( ( OR | OR_ALT ) ^ expr1 )* ;
	public final AliaParser.expr_return expr() throws RecognitionException {
		AliaParser.expr_return retval = new AliaParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;
		ParserRuleReturnScope expr119 =null;
		ParserRuleReturnScope expr121 =null;

		Object set20_tree=null;

		try {
			// src\\alia\\Alia.g:90:6: ( expr1 ( ( OR | OR_ALT ) ^ expr1 )* )
			// src\\alia\\Alia.g:90:8: expr1 ( ( OR | OR_ALT ) ^ expr1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1_in_expr1308);
			expr119=expr1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

			// src\\alia\\Alia.g:90:14: ( ( OR | OR_ALT ) ^ expr1 )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= OR && LA7_0 <= OR_ALT)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src\\alia\\Alia.g:90:15: ( OR | OR_ALT ) ^ expr1
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
					pushFollow(FOLLOW_expr1_in_expr1320);
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
	// src\\alia\\Alia.g:91:1: expr1 : expr2 ( ( AND | AND_ALT ) ^ expr2 )* ;
	public final AliaParser.expr1_return expr1() throws RecognitionException {
		AliaParser.expr1_return retval = new AliaParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set23=null;
		ParserRuleReturnScope expr222 =null;
		ParserRuleReturnScope expr224 =null;

		Object set23_tree=null;

		try {
			// src\\alia\\Alia.g:91:7: ( expr2 ( ( AND | AND_ALT ) ^ expr2 )* )
			// src\\alia\\Alia.g:91:9: expr2 ( ( AND | AND_ALT ) ^ expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr11329);
			expr222=expr2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr222.getTree());

			// src\\alia\\Alia.g:91:15: ( ( AND | AND_ALT ) ^ expr2 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= AND && LA8_0 <= AND_ALT)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src\\alia\\Alia.g:91:16: ( AND | AND_ALT ) ^ expr2
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
					pushFollow(FOLLOW_expr2_in_expr11341);
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
	// src\\alia\\Alia.g:92:1: expr2 : expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )* ;
	public final AliaParser.expr2_return expr2() throws RecognitionException {
		AliaParser.expr2_return retval = new AliaParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set26=null;
		ParserRuleReturnScope expr325 =null;
		ParserRuleReturnScope expr327 =null;

		Object set26_tree=null;

		try {
			// src\\alia\\Alia.g:92:7: ( expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )* )
			// src\\alia\\Alia.g:92:9: expr3 ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3_in_expr21350);
			expr325=expr3();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr325.getTree());

			// src\\alia\\Alia.g:92:15: ( ( GT | GE | LT | LE | EQ | NQ ) ^ expr3 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GE && LA9_0 <= GT)||LA9_0==LE||LA9_0==LT||LA9_0==NQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src\\alia\\Alia.g:92:16: ( GT | GE | LT | LE | EQ | NQ ) ^ expr3
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
					pushFollow(FOLLOW_expr3_in_expr21378);
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
	// src\\alia\\Alia.g:93:1: expr3 : expr4 ( ( PLUS | MINUS ) ^ expr4 )* ;
	public final AliaParser.expr3_return expr3() throws RecognitionException {
		AliaParser.expr3_return retval = new AliaParser.expr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set29=null;
		ParserRuleReturnScope expr428 =null;
		ParserRuleReturnScope expr430 =null;

		Object set29_tree=null;

		try {
			// src\\alia\\Alia.g:93:7: ( expr4 ( ( PLUS | MINUS ) ^ expr4 )* )
			// src\\alia\\Alia.g:93:9: expr4 ( ( PLUS | MINUS ) ^ expr4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr4_in_expr31387);
			expr428=expr4();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr428.getTree());

			// src\\alia\\Alia.g:93:15: ( ( PLUS | MINUS ) ^ expr4 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\alia\\Alia.g:93:16: ( PLUS | MINUS ) ^ expr4
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
					pushFollow(FOLLOW_expr4_in_expr31399);
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
	// src\\alia\\Alia.g:94:1: expr4 : expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )* ;
	public final AliaParser.expr4_return expr4() throws RecognitionException {
		AliaParser.expr4_return retval = new AliaParser.expr4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set32=null;
		ParserRuleReturnScope expr531 =null;
		ParserRuleReturnScope expr533 =null;

		Object set32_tree=null;

		try {
			// src\\alia\\Alia.g:94:7: ( expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )* )
			// src\\alia\\Alia.g:94:9: expr5 ( ( TIMES | DIV | MOD ) ^ expr5 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr5_in_expr41408);
			expr531=expr5();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr531.getTree());

			// src\\alia\\Alia.g:94:15: ( ( TIMES | DIV | MOD ) ^ expr5 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==DIV||LA11_0==MOD||LA11_0==TIMES) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src\\alia\\Alia.g:94:16: ( TIMES | DIV | MOD ) ^ expr5
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
					pushFollow(FOLLOW_expr5_in_expr41424);
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
	// src\\alia\\Alia.g:95:1: expr5 : ( NOT ^ operand | operand | expr_minus | expr_plus );
	public final AliaParser.expr5_return expr5() throws RecognitionException {
		AliaParser.expr5_return retval = new AliaParser.expr5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT34=null;
		ParserRuleReturnScope operand35 =null;
		ParserRuleReturnScope operand36 =null;
		ParserRuleReturnScope expr_minus37 =null;
		ParserRuleReturnScope expr_plus38 =null;

		Object NOT34_tree=null;

		try {
			// src\\alia\\Alia.g:95:7: ( NOT ^ operand | operand | expr_minus | expr_plus )
			int alt12=4;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt12=1;
				}
				break;
			case FALSE:
			case IDENTIFIER:
			case IF:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case READ:
			case SQUOTE:
			case TRUE:
				{
				alt12=2;
				}
				break;
			case MINUS:
				{
				alt12=3;
				}
				break;
			case PLUS:
				{
				alt12=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// src\\alia\\Alia.g:95:9: NOT ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NOT34=(Token)match(input,NOT,FOLLOW_NOT_in_expr51433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT34_tree = (Object)adaptor.create(NOT34);
					root_0 = (Object)adaptor.becomeRoot(NOT34_tree, root_0);
					}

					pushFollow(FOLLOW_operand_in_expr51436);
					operand35=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand35.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:95:24: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_expr51440);
					operand36=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operand36.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:95:34: expr_minus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_minus_in_expr51444);
					expr_minus37=expr_minus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_minus37.getTree());

					}
					break;
				case 4 :
					// src\\alia\\Alia.g:95:47: expr_plus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_plus_in_expr51448);
					expr_plus38=expr_plus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_plus38.getTree());

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
	// src\\alia\\Alia.g:96:1: expr_minus : MINUS operand -> ^( MINUS_OP operand ) ;
	public final AliaParser.expr_minus_return expr_minus() throws RecognitionException {
		AliaParser.expr_minus_return retval = new AliaParser.expr_minus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS39=null;
		ParserRuleReturnScope operand40 =null;

		Object MINUS39_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// src\\alia\\Alia.g:96:12: ( MINUS operand -> ^( MINUS_OP operand ) )
			// src\\alia\\Alia.g:96:14: MINUS operand
			{
			MINUS39=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_minus1455); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MINUS.add(MINUS39);

			pushFollow(FOLLOW_operand_in_expr_minus1457);
			operand40=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand40.getTree());
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
			// 96:28: -> ^( MINUS_OP operand )
			{
				// src\\alia\\Alia.g:96:31: ^( MINUS_OP operand )
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
	// src\\alia\\Alia.g:97:1: expr_plus : PLUS operand -> ^( PLUS_OP operand ) ;
	public final AliaParser.expr_plus_return expr_plus() throws RecognitionException {
		AliaParser.expr_plus_return retval = new AliaParser.expr_plus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS41=null;
		ParserRuleReturnScope operand42 =null;

		Object PLUS41_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// src\\alia\\Alia.g:97:11: ( PLUS operand -> ^( PLUS_OP operand ) )
			// src\\alia\\Alia.g:97:13: PLUS operand
			{
			PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus1472); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS.add(PLUS41);

			pushFollow(FOLLOW_operand_in_expr_plus1474);
			operand42=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand42.getTree());
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
			// 97:26: -> ^( PLUS_OP operand )
			{
				// src\\alia\\Alia.g:97:29: ^( PLUS_OP operand )
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
	// src\\alia\\Alia.g:98:1: operand : ( read | print | if_stmnt | LPAREN ! expr RPAREN !| NUMBER | char_expr | boolean_expr | func_identifier );
	public final AliaParser.operand_return operand() throws RecognitionException {
		AliaParser.operand_return retval = new AliaParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN46=null;
		Token RPAREN48=null;
		Token NUMBER49=null;
		ParserRuleReturnScope read43 =null;
		ParserRuleReturnScope print44 =null;
		ParserRuleReturnScope if_stmnt45 =null;
		ParserRuleReturnScope expr47 =null;
		ParserRuleReturnScope char_expr50 =null;
		ParserRuleReturnScope boolean_expr51 =null;
		ParserRuleReturnScope func_identifier52 =null;

		Object LPAREN46_tree=null;
		Object RPAREN48_tree=null;
		Object NUMBER49_tree=null;

		try {
			// src\\alia\\Alia.g:98:9: ( read | print | if_stmnt | LPAREN ! expr RPAREN !| NUMBER | char_expr | boolean_expr | func_identifier )
			int alt13=8;
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
			case SQUOTE:
				{
				alt13=6;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt13=7;
				}
				break;
			case IDENTIFIER:
				{
				alt13=8;
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
					// src\\alia\\Alia.g:98:11: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_operand1489);
					read43=read();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, read43.getTree());

					}
					break;
				case 2 :
					// src\\alia\\Alia.g:99:8: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_operand1500);
					print44=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print44.getTree());

					}
					break;
				case 3 :
					// src\\alia\\Alia.g:100:8: if_stmnt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmnt_in_operand1511);
					if_stmnt45=if_stmnt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stmnt45.getTree());

					}
					break;
				case 4 :
					// src\\alia\\Alia.g:101:8: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1522); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_operand1525);
					expr47=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr47.getTree());

					RPAREN48=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1527); if (state.failed) return retval;
					}
					break;
				case 5 :
					// src\\alia\\Alia.g:102:8: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER49=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1539); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER49_tree = (Object)adaptor.create(NUMBER49);
					adaptor.addChild(root_0, NUMBER49_tree);
					}

					}
					break;
				case 6 :
					// src\\alia\\Alia.g:103:8: char_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_char_expr_in_operand1550);
					char_expr50=char_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_expr50.getTree());

					}
					break;
				case 7 :
					// src\\alia\\Alia.g:104:8: boolean_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expr_in_operand1561);
					boolean_expr51=boolean_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expr51.getTree());

					}
					break;
				case 8 :
					// src\\alia\\Alia.g:105:8: func_identifier
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_identifier_in_operand1572);
					func_identifier52=func_identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_identifier52.getTree());

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


	public static class char_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "char_expr"
	// src\\alia\\Alia.g:107:1: char_expr : SQUOTE ! LETTER SQUOTE !;
	public final AliaParser.char_expr_return char_expr() throws RecognitionException {
		AliaParser.char_expr_return retval = new AliaParser.char_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SQUOTE53=null;
		Token LETTER54=null;
		Token SQUOTE55=null;

		Object SQUOTE53_tree=null;
		Object LETTER54_tree=null;
		Object SQUOTE55_tree=null;

		try {
			// src\\alia\\Alia.g:107:11: ( SQUOTE ! LETTER SQUOTE !)
			// src\\alia\\Alia.g:107:13: SQUOTE ! LETTER SQUOTE !
			{
			root_0 = (Object)adaptor.nil();


			SQUOTE53=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_char_expr1580); if (state.failed) return retval;
			LETTER54=(Token)match(input,LETTER,FOLLOW_LETTER_in_char_expr1583); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LETTER54_tree = (Object)adaptor.create(LETTER54);
			adaptor.addChild(root_0, LETTER54_tree);
			}

			SQUOTE55=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_char_expr1585); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:109:1: func_identifier : IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )? ;
	public final AliaParser.func_identifier_return func_identifier() throws RecognitionException {
		AliaParser.func_identifier_return retval = new AliaParser.func_identifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER56=null;
		Token LPAREN57=null;
		Token RPAREN59=null;
		ParserRuleReturnScope exprlist58 =null;

		Object IDENTIFIER56_tree=null;
		Object LPAREN57_tree=null;
		Object RPAREN59_tree=null;

		try {
			// src\\alia\\Alia.g:109:17: ( IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )? )
			// src\\alia\\Alia.g:109:19: IDENTIFIER ( LPAREN ^ ( exprlist )? RPAREN )?
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_identifier1594); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
			adaptor.addChild(root_0, IDENTIFIER56_tree);
			}

			// src\\alia\\Alia.g:110:5: ( LPAREN ^ ( exprlist )? RPAREN )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LPAREN) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// src\\alia\\Alia.g:110:6: LPAREN ^ ( exprlist )? RPAREN
					{
					LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_identifier1602); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN57_tree = (Object)adaptor.create(LPAREN57);
					root_0 = (Object)adaptor.becomeRoot(LPAREN57_tree, root_0);
					}

					// src\\alia\\Alia.g:110:14: ( exprlist )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==FALSE||(LA14_0 >= IDENTIFIER && LA14_0 <= IF)||LA14_0==LPAREN||LA14_0==MINUS||LA14_0==NOT||LA14_0==NUMBER||LA14_0==PLUS||LA14_0==PRINT||LA14_0==READ||LA14_0==SQUOTE||LA14_0==TRUE) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// src\\alia\\Alia.g:110:14: exprlist
							{
							pushFollow(FOLLOW_exprlist_in_func_identifier1605);
							exprlist58=exprlist();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist58.getTree());

							}
							break;

					}

					RPAREN59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_identifier1608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN59_tree = (Object)adaptor.create(RPAREN59);
					adaptor.addChild(root_0, RPAREN59_tree);
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
	// src\\alia\\Alia.g:114:1: while_stmnt : WHILE ^ expr DO statements END ;
	public final AliaParser.while_stmnt_return while_stmnt() throws RecognitionException {
		AliaParser.while_stmnt_return retval = new AliaParser.while_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE60=null;
		Token DO62=null;
		Token END64=null;
		ParserRuleReturnScope expr61 =null;
		ParserRuleReturnScope statements63 =null;

		Object WHILE60_tree=null;
		Object DO62_tree=null;
		Object END64_tree=null;

		try {
			// src\\alia\\Alia.g:114:13: ( WHILE ^ expr DO statements END )
			// src\\alia\\Alia.g:114:15: WHILE ^ expr DO statements END
			{
			root_0 = (Object)adaptor.nil();


			WHILE60=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmnt1620); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE60_tree = (Object)adaptor.create(WHILE60);
			root_0 = (Object)adaptor.becomeRoot(WHILE60_tree, root_0);
			}

			pushFollow(FOLLOW_expr_in_while_stmnt1623);
			expr61=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr61.getTree());

			DO62=(Token)match(input,DO,FOLLOW_DO_in_while_stmnt1625); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DO62_tree = (Object)adaptor.create(DO62);
			adaptor.addChild(root_0, DO62_tree);
			}

			pushFollow(FOLLOW_statements_in_while_stmnt1627);
			statements63=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements63.getTree());

			END64=(Token)match(input,END,FOLLOW_END_in_while_stmnt1629); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END64_tree = (Object)adaptor.create(END64);
			adaptor.addChild(root_0, END64_tree);
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
	// src\\alia\\Alia.g:116:1: if_stmnt : IF ^ expr DO ! statements ( ELSEIF expr DO ! statements )* ( ELSE statements )? END !;
	public final AliaParser.if_stmnt_return if_stmnt() throws RecognitionException {
		AliaParser.if_stmnt_return retval = new AliaParser.if_stmnt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF65=null;
		Token DO67=null;
		Token ELSEIF69=null;
		Token DO71=null;
		Token ELSE73=null;
		Token END75=null;
		ParserRuleReturnScope expr66 =null;
		ParserRuleReturnScope statements68 =null;
		ParserRuleReturnScope expr70 =null;
		ParserRuleReturnScope statements72 =null;
		ParserRuleReturnScope statements74 =null;

		Object IF65_tree=null;
		Object DO67_tree=null;
		Object ELSEIF69_tree=null;
		Object DO71_tree=null;
		Object ELSE73_tree=null;
		Object END75_tree=null;

		try {
			// src\\alia\\Alia.g:116:10: ( IF ^ expr DO ! statements ( ELSEIF expr DO ! statements )* ( ELSE statements )? END !)
			// src\\alia\\Alia.g:116:12: IF ^ expr DO ! statements ( ELSEIF expr DO ! statements )* ( ELSE statements )? END !
			{
			root_0 = (Object)adaptor.nil();


			IF65=(Token)match(input,IF,FOLLOW_IF_in_if_stmnt1637); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF65_tree = (Object)adaptor.create(IF65);
			root_0 = (Object)adaptor.becomeRoot(IF65_tree, root_0);
			}

			pushFollow(FOLLOW_expr_in_if_stmnt1640);
			expr66=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr66.getTree());

			DO67=(Token)match(input,DO,FOLLOW_DO_in_if_stmnt1642); if (state.failed) return retval;
			pushFollow(FOLLOW_statements_in_if_stmnt1645);
			statements68=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements68.getTree());

			// src\\alia\\Alia.g:116:36: ( ELSEIF expr DO ! statements )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==ELSEIF) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// src\\alia\\Alia.g:116:37: ELSEIF expr DO ! statements
					{
					ELSEIF69=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_if_stmnt1648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSEIF69_tree = (Object)adaptor.create(ELSEIF69);
					adaptor.addChild(root_0, ELSEIF69_tree);
					}

					pushFollow(FOLLOW_expr_in_if_stmnt1650);
					expr70=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr70.getTree());

					DO71=(Token)match(input,DO,FOLLOW_DO_in_if_stmnt1652); if (state.failed) return retval;
					pushFollow(FOLLOW_statements_in_if_stmnt1655);
					statements72=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements72.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			// src\\alia\\Alia.g:116:66: ( ELSE statements )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ELSE) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// src\\alia\\Alia.g:116:67: ELSE statements
					{
					ELSE73=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_stmnt1660); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE73_tree = (Object)adaptor.create(ELSE73);
					adaptor.addChild(root_0, ELSE73_tree);
					}

					pushFollow(FOLLOW_statements_in_if_stmnt1662);
					statements74=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements74.getTree());

					}
					break;

			}

			END75=(Token)match(input,END,FOLLOW_END_in_if_stmnt1666); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:118:1: print : PRINT ^ LPAREN ! exprlist RPAREN !;
	public final AliaParser.print_return print() throws RecognitionException {
		AliaParser.print_return retval = new AliaParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT76=null;
		Token LPAREN77=null;
		Token RPAREN79=null;
		ParserRuleReturnScope exprlist78 =null;

		Object PRINT76_tree=null;
		Object LPAREN77_tree=null;
		Object RPAREN79_tree=null;

		try {
			// src\\alia\\Alia.g:118:7: ( PRINT ^ LPAREN ! exprlist RPAREN !)
			// src\\alia\\Alia.g:118:9: PRINT ^ LPAREN ! exprlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT76=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1675); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRINT76_tree = (Object)adaptor.create(PRINT76);
			root_0 = (Object)adaptor.becomeRoot(PRINT76_tree, root_0);
			}

			LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1678); if (state.failed) return retval;
			pushFollow(FOLLOW_exprlist_in_print1681);
			exprlist78=exprlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist78.getTree());

			RPAREN79=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1683); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:119:1: read : READ ^ LPAREN ! varlist RPAREN !;
	public final AliaParser.read_return read() throws RecognitionException {
		AliaParser.read_return retval = new AliaParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ80=null;
		Token LPAREN81=null;
		Token RPAREN83=null;
		ParserRuleReturnScope varlist82 =null;

		Object READ80_tree=null;
		Object LPAREN81_tree=null;
		Object RPAREN83_tree=null;

		try {
			// src\\alia\\Alia.g:119:6: ( READ ^ LPAREN ! varlist RPAREN !)
			// src\\alia\\Alia.g:119:8: READ ^ LPAREN ! varlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ80=(Token)match(input,READ,FOLLOW_READ_in_read1691); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			READ80_tree = (Object)adaptor.create(READ80);
			root_0 = (Object)adaptor.becomeRoot(READ80_tree, root_0);
			}

			LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1694); if (state.failed) return retval;
			pushFollow(FOLLOW_varlist_in_read1697);
			varlist82=varlist();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist82.getTree());

			RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1699); if (state.failed) return retval;
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
	// src\\alia\\Alia.g:121:1: varlist : IDENTIFIER ( COMMA IDENTIFIER )* ;
	public final AliaParser.varlist_return varlist() throws RecognitionException {
		AliaParser.varlist_return retval = new AliaParser.varlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER84=null;
		Token COMMA85=null;
		Token IDENTIFIER86=null;

		Object IDENTIFIER84_tree=null;
		Object COMMA85_tree=null;
		Object IDENTIFIER86_tree=null;

		try {
			// src\\alia\\Alia.g:121:9: ( IDENTIFIER ( COMMA IDENTIFIER )* )
			// src\\alia\\Alia.g:121:11: IDENTIFIER ( COMMA IDENTIFIER )*
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER84=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1708); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER84_tree = (Object)adaptor.create(IDENTIFIER84);
			adaptor.addChild(root_0, IDENTIFIER84_tree);
			}

			// src\\alia\\Alia.g:121:22: ( COMMA IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// src\\alia\\Alia.g:121:23: COMMA IDENTIFIER
					{
					COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_varlist1711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA85_tree = (Object)adaptor.create(COMMA85);
					adaptor.addChild(root_0, COMMA85_tree);
					}

					IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER86_tree = (Object)adaptor.create(IDENTIFIER86);
					adaptor.addChild(root_0, IDENTIFIER86_tree);
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
	// src\\alia\\Alia.g:123:1: exprlist : expr ( COMMA expr )* ;
	public final AliaParser.exprlist_return exprlist() throws RecognitionException {
		AliaParser.exprlist_return retval = new AliaParser.exprlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA88=null;
		ParserRuleReturnScope expr87 =null;
		ParserRuleReturnScope expr89 =null;

		Object COMMA88_tree=null;

		try {
			// src\\alia\\Alia.g:123:10: ( expr ( COMMA expr )* )
			// src\\alia\\Alia.g:123:12: expr ( COMMA expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_exprlist1723);
			expr87=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr87.getTree());

			// src\\alia\\Alia.g:123:17: ( COMMA expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// src\\alia\\Alia.g:123:18: COMMA expr
					{
					COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist1726); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA88_tree = (Object)adaptor.create(COMMA88);
					adaptor.addChild(root_0, COMMA88_tree);
					}

					pushFollow(FOLLOW_expr_in_exprlist1728);
					expr89=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr89.getTree());

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
	// src\\alia\\Alia.g:125:1: func_def : DEF IDENTIFIER LPAREN ! RPAREN ! statements END ;
	public final AliaParser.func_def_return func_def() throws RecognitionException {
		AliaParser.func_def_return retval = new AliaParser.func_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DEF90=null;
		Token IDENTIFIER91=null;
		Token LPAREN92=null;
		Token RPAREN93=null;
		Token END95=null;
		ParserRuleReturnScope statements94 =null;

		Object DEF90_tree=null;
		Object IDENTIFIER91_tree=null;
		Object LPAREN92_tree=null;
		Object RPAREN93_tree=null;
		Object END95_tree=null;

		try {
			// src\\alia\\Alia.g:125:10: ( DEF IDENTIFIER LPAREN ! RPAREN ! statements END )
			// src\\alia\\Alia.g:125:12: DEF IDENTIFIER LPAREN ! RPAREN ! statements END
			{
			root_0 = (Object)adaptor.nil();


			DEF90=(Token)match(input,DEF,FOLLOW_DEF_in_func_def1738); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			DEF90_tree = (Object)adaptor.create(DEF90);
			adaptor.addChild(root_0, DEF90_tree);
			}

			IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_func_def1740); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER91_tree = (Object)adaptor.create(IDENTIFIER91);
			adaptor.addChild(root_0, IDENTIFIER91_tree);
			}

			LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func_def1742); if (state.failed) return retval;
			RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func_def1746); if (state.failed) return retval;
			pushFollow(FOLLOW_statements_in_func_def1749);
			statements94=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements94.getTree());

			END95=(Token)match(input,END,FOLLOW_END_in_func_def1751); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END95_tree = (Object)adaptor.create(END95);
			adaptor.addChild(root_0, END95_tree);
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
	// src\\alia\\Alia.g:134:1: boolean_expr : ( TRUE | FALSE );
	public final AliaParser.boolean_expr_return boolean_expr() throws RecognitionException {
		AliaParser.boolean_expr_return retval = new AliaParser.boolean_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set96=null;

		Object set96_tree=null;

		try {
			// src\\alia\\Alia.g:134:14: ( TRUE | FALSE )
			// src\\alia\\Alia.g:
			{
			root_0 = (Object)adaptor.nil();


			set96=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set96));
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
	// src\\alia\\Alia.g:136:1: type : ( CHAR | INT | BOOL );
	public final AliaParser.type_return type() throws RecognitionException {
		AliaParser.type_return retval = new AliaParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set97=null;

		Object set97_tree=null;

		try {
			// src\\alia\\Alia.g:136:6: ( CHAR | INT | BOOL )
			// src\\alia\\Alia.g:
			{
			root_0 = (Object)adaptor.nil();


			set97=input.LT(1);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set97));
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
		// src\\alia\\Alia.g:87:19: ( IDENTIFIER BECOMES )
		// src\\alia\\Alia.g:87:20: IDENTIFIER BECOMES
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred1_Alia1278); if (state.failed) return;

		match(input,BECOMES,FOLLOW_BECOMES_in_synpred1_Alia1280); if (state.failed) return;

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



	public static final BitSet FOLLOW_declaration_in_program1189 = new BitSet(new long[]{0x005254B286201002L});
	public static final BitSet FOLLOW_statement_in_program1193 = new BitSet(new long[]{0x005254B286201002L});
	public static final BitSet FOLLOW_NEWLINE_in_program1197 = new BitSet(new long[]{0x005254B286201002L});
	public static final BitSet FOLLOW_func_def_in_declaration1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1215 = new BitSet(new long[]{0x005254B286200002L});
	public static final BitSet FOLLOW_NEWLINE_in_statements1219 = new BitSet(new long[]{0x005254B286200002L});
	public static final BitSet FOLLOW_expr_assignment_in_statement1229 = new BitSet(new long[]{0x0001001000000200L});
	public static final BitSet FOLLOW_COLON_in_statement1232 = new BitSet(new long[]{0x0000000008000180L});
	public static final BitSet FOLLOW_type_in_statement1234 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_end_statement_in_statement1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stmnt_in_statement1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_end_statement1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_end_statement1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_end_statement1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assignment1286 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assignment1288 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr_assignment_in_expr_assignment1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_assignment1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_expr1308 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_set_in_expr1311 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr1_in_expr1320 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_expr2_in_expr11329 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_set_in_expr11332 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr2_in_expr11341 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_expr3_in_expr21350 = new BitSet(new long[]{0x0000004111880002L});
	public static final BitSet FOLLOW_set_in_expr21353 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr3_in_expr21378 = new BitSet(new long[]{0x0000004111880002L});
	public static final BitSet FOLLOW_expr4_in_expr31387 = new BitSet(new long[]{0x0000040200000002L});
	public static final BitSet FOLLOW_set_in_expr31390 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr4_in_expr31399 = new BitSet(new long[]{0x0000040200000002L});
	public static final BitSet FOLLOW_expr5_in_expr41408 = new BitSet(new long[]{0x0008000800004002L});
	public static final BitSet FOLLOW_set_in_expr41411 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr5_in_expr41424 = new BitSet(new long[]{0x0008000800004002L});
	public static final BitSet FOLLOW_NOT_in_expr51433 = new BitSet(new long[]{0x0012508086200000L});
	public static final BitSet FOLLOW_operand_in_expr51436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr51440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_minus_in_expr51444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr51448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_minus1455 = new BitSet(new long[]{0x0012508086200000L});
	public static final BitSet FOLLOW_operand_in_expr_minus1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus1472 = new BitSet(new long[]{0x0012508086200000L});
	public static final BitSet FOLLOW_operand_in_expr_plus1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_operand1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_operand1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmnt_in_operand1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1522 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr_in_operand1525 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_expr_in_operand1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expr_in_operand1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_identifier_in_operand1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUOTE_in_char_expr1580 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LETTER_in_char_expr1583 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SQUOTE_in_char_expr1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_func_identifier1594 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LPAREN_in_func_identifier1602 = new BitSet(new long[]{0x0012D4A286200000L});
	public static final BitSet FOLLOW_exprlist_in_func_identifier1605 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_func_identifier1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_stmnt1620 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr_in_while_stmnt1623 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_while_stmnt1625 = new BitSet(new long[]{0x005254B286240000L});
	public static final BitSet FOLLOW_statements_in_while_stmnt1627 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_while_stmnt1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmnt1637 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr_in_if_stmnt1640 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_if_stmnt1642 = new BitSet(new long[]{0x005254B286270000L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1645 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_ELSEIF_in_if_stmnt1648 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr_in_if_stmnt1650 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DO_in_if_stmnt1652 = new BitSet(new long[]{0x005254B286270000L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1655 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_ELSE_in_if_stmnt1660 = new BitSet(new long[]{0x005254B286240000L});
	public static final BitSet FOLLOW_statements_in_if_stmnt1662 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_if_stmnt1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1675 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1678 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_exprlist_in_print1681 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1691 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1694 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_varlist_in_read1697 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1708 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_varlist1711 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1713 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expr_in_exprlist1723 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1726 = new BitSet(new long[]{0x001254A286200000L});
	public static final BitSet FOLLOW_expr_in_exprlist1728 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_DEF_in_func_def1738 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_func_def1740 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LPAREN_in_func_def1742 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RPAREN_in_func_def1746 = new BitSet(new long[]{0x005254B286240000L});
	public static final BitSet FOLLOW_statements_in_func_def1749 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_END_in_func_def1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred1_Alia1278 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_synpred1_Alia1280 = new BitSet(new long[]{0x0000000000000002L});
}
