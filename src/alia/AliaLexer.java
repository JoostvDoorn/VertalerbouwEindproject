// $ANTLR 3.5.2 src\\alia\\Alia.g 2014-06-25 10:36:14

package alia;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AliaLexer extends Lexer {
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

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AliaLexer() {} 
	public AliaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AliaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src\\alia\\Alia.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:11:5: ( 'and' )
			// src\\alia\\Alia.g:11:7: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "AND_ALT"
	public final void mAND_ALT() throws RecognitionException {
		try {
			int _type = AND_ALT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:12:9: ( '&&' )
			// src\\alia\\Alia.g:12:11: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_ALT"

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:13:9: ( '=' )
			// src\\alia\\Alia.g:13:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:14:7: ( 'begin' )
			// src\\alia\\Alia.g:14:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:15:6: ( 'boolean' )
			// src\\alia\\Alia.g:15:8: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:16:6: ( 'char' )
			// src\\alia\\Alia.g:16:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:17:7: ( ':' )
			// src\\alia\\Alia.g:17:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:18:7: ( ',' )
			// src\\alia\\Alia.g:18:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COMPOUND"
	public final void mCOMPOUND() throws RecognitionException {
		try {
			int _type = COMPOUND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:19:10: ( 'compound' )
			// src\\alia\\Alia.g:19:12: 'compound'
			{
			match("compound"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPOUND"

	// $ANTLR start "DEF"
	public final void mDEF() throws RecognitionException {
		try {
			int _type = DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:20:5: ( 'def' )
			// src\\alia\\Alia.g:20:7: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEF"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:21:5: ( '/' )
			// src\\alia\\Alia.g:21:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:22:4: ( 'do' )
			// src\\alia\\Alia.g:22:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:23:6: ( 'else' )
			// src\\alia\\Alia.g:23:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ELSEIF"
	public final void mELSEIF() throws RecognitionException {
		try {
			int _type = ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:24:8: ( 'elseif' )
			// src\\alia\\Alia.g:24:10: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:25:5: ( 'end' )
			// src\\alia\\Alia.g:25:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:26:4: ( '==' )
			// src\\alia\\Alia.g:26:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "EXPR_LIST"
	public final void mEXPR_LIST() throws RecognitionException {
		try {
			int _type = EXPR_LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:27:11: ( 'exprlist' )
			// src\\alia\\Alia.g:27:13: 'exprlist'
			{
			match("exprlist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPR_LIST"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:28:7: ( 'false' )
			// src\\alia\\Alia.g:28:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FUNC"
	public final void mFUNC() throws RecognitionException {
		try {
			int _type = FUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:29:6: ( 'func' )
			// src\\alia\\Alia.g:29:8: 'func'
			{
			match("func"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNC"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:30:4: ( '>=' )
			// src\\alia\\Alia.g:30:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:31:4: ( '>' )
			// src\\alia\\Alia.g:31:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:32:4: ( 'if' )
			// src\\alia\\Alia.g:32:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:33:5: ( 'int' )
			// src\\alia\\Alia.g:33:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:34:4: ( '<=' )
			// src\\alia\\Alia.g:34:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:35:8: ( '(' )
			// src\\alia\\Alia.g:35:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:36:4: ( '<' )
			// src\\alia\\Alia.g:36:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:37:7: ( '-' )
			// src\\alia\\Alia.g:37:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MINUS_OP"
	public final void mMINUS_OP() throws RecognitionException {
		try {
			int _type = MINUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:38:10: ( 'minop' )
			// src\\alia\\Alia.g:38:12: 'minop'
			{
			match("minop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_OP"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:39:5: ( '%' )
			// src\\alia\\Alia.g:39:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:40:9: ( '\\n' )
			// src\\alia\\Alia.g:40:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:41:5: ( '!' )
			// src\\alia\\Alia.g:41:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NQ"
	public final void mNQ() throws RecognitionException {
		try {
			int _type = NQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:42:4: ( '!=' )
			// src\\alia\\Alia.g:42:6: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NQ"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:43:4: ( 'or' )
			// src\\alia\\Alia.g:43:6: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "OR_ALT"
	public final void mOR_ALT() throws RecognitionException {
		try {
			int _type = OR_ALT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:44:8: ( '||' )
			// src\\alia\\Alia.g:44:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_ALT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:45:6: ( '+' )
			// src\\alia\\Alia.g:45:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PLUS_OP"
	public final void mPLUS_OP() throws RecognitionException {
		try {
			int _type = PLUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:46:9: ( 'plusop' )
			// src\\alia\\Alia.g:46:11: 'plusop'
			{
			match("plusop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_OP"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:47:7: ( 'print' )
			// src\\alia\\Alia.g:47:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:48:9: ( 'program' )
			// src\\alia\\Alia.g:48:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:49:6: ( 'read' )
			// src\\alia\\Alia.g:49:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:50:8: ( ')' )
			// src\\alia\\Alia.g:50:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:51:11: ( ';' )
			// src\\alia\\Alia.g:51:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "SQUOTE"
	public final void mSQUOTE() throws RecognitionException {
		try {
			int _type = SQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:52:8: ( '\\'' )
			// src\\alia\\Alia.g:52:10: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUOTE"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:53:8: ( 'string' )
			// src\\alia\\Alia.g:53:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:54:7: ( '*' )
			// src\\alia\\Alia.g:54:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:55:6: ( 'true' )
			// src\\alia\\Alia.g:55:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:56:7: ( 'while' )
			// src\\alia\\Alia.g:56:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "CHAR_EXPR"
	public final void mCHAR_EXPR() throws RecognitionException {
		try {
			int _type = CHAR_EXPR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:146:11: ( SQUOTE LETTER SQUOTE )
			// src\\alia\\Alia.g:146:13: SQUOTE LETTER SQUOTE
			{
			mSQUOTE(); 

			mLETTER(); 

			mSQUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_EXPR"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:149:5: ( LETTER ( LETTER | DIGIT )* )
			// src\\alia\\Alia.g:149:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// src\\alia\\Alia.g:149:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\alia\\Alia.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:153:5: ( ( DIGIT )+ )
			// src\\alia\\Alia.g:153:9: ( DIGIT )+
			{
			// src\\alia\\Alia.g:153:9: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\alia\\Alia.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:158:5: ( ( '//' ( . )* '\\n' | '/*' ( . )* '*/' ) )
			// src\\alia\\Alia.g:158:9: ( '//' ( . )* '\\n' | '/*' ( . )* '*/' )
			{
			// src\\alia\\Alia.g:158:9: ( '//' ( . )* '\\n' | '/*' ( . )* '*/' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='/') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='/') ) {
					alt5=1;
				}
				else if ( (LA5_1=='*') ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src\\alia\\Alia.g:158:10: '//' ( . )* '\\n'
					{
					match("//"); 

					// src\\alia\\Alia.g:158:15: ( . )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0=='\n') ) {
							alt3=2;
						}
						else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src\\alia\\Alia.g:158:15: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop3;
						}
					}

					match('\n'); 
					}
					break;
				case 2 :
					// src\\alia\\Alia.g:158:25: '/*' ( . )* '*/'
					{
					match("/*"); 

					// src\\alia\\Alia.g:158:30: ( . )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='*') ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1=='/') ) {
								alt4=2;
							}
							else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
								alt4=1;
							}

						}
						else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// src\\alia\\Alia.g:158:30: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop4;
						}
					}

					match("*/"); 

					}
					break;

			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:164:5: ( ( ' ' | '\\t' | '\\f' | '\\r' )+ )
			// src\\alia\\Alia.g:164:9: ( ' ' | '\\t' | '\\f' | '\\r' )+
			{
			// src\\alia\\Alia.g:164:9: ( ' ' | '\\t' | '\\f' | '\\r' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\t'||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src\\alia\\Alia.g:
					{
					if ( input.LA(1)=='\t'||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// src\\alia\\Alia.g:168:17: ( LOWER | UPPER )
			// src\\alia\\Alia.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// src\\alia\\Alia.g:169:17: ( ( '0' .. '9' ) )
			// src\\alia\\Alia.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// src\\alia\\Alia.g:170:17: ( ( 'a' .. 'z' ) )
			// src\\alia\\Alia.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// src\\alia\\Alia.g:171:17: ( ( 'A' .. 'Z' ) )
			// src\\alia\\Alia.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	@Override
	public void mTokens() throws RecognitionException {
		// src\\alia\\Alia.g:1:8: ( AND | AND_ALT | BECOMES | BEGIN | BOOL | CHAR | COLON | COMMA | COMPOUND | DEF | DIV | DO | ELSE | ELSEIF | END | EQ | EXPR_LIST | FALSE | FUNC | GE | GT | IF | INT | LE | LPAREN | LT | MINUS | MINUS_OP | MOD | NEWLINE | NOT | NQ | OR | OR_ALT | PLUS | PLUS_OP | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | SQUOTE | STRING | TIMES | TRUE | WHILE | CHAR_EXPR | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt7=51;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// src\\alia\\Alia.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// src\\alia\\Alia.g:1:14: AND_ALT
				{
				mAND_ALT(); 

				}
				break;
			case 3 :
				// src\\alia\\Alia.g:1:22: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 4 :
				// src\\alia\\Alia.g:1:30: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 5 :
				// src\\alia\\Alia.g:1:36: BOOL
				{
				mBOOL(); 

				}
				break;
			case 6 :
				// src\\alia\\Alia.g:1:41: CHAR
				{
				mCHAR(); 

				}
				break;
			case 7 :
				// src\\alia\\Alia.g:1:46: COLON
				{
				mCOLON(); 

				}
				break;
			case 8 :
				// src\\alia\\Alia.g:1:52: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 9 :
				// src\\alia\\Alia.g:1:58: COMPOUND
				{
				mCOMPOUND(); 

				}
				break;
			case 10 :
				// src\\alia\\Alia.g:1:67: DEF
				{
				mDEF(); 

				}
				break;
			case 11 :
				// src\\alia\\Alia.g:1:71: DIV
				{
				mDIV(); 

				}
				break;
			case 12 :
				// src\\alia\\Alia.g:1:75: DO
				{
				mDO(); 

				}
				break;
			case 13 :
				// src\\alia\\Alia.g:1:78: ELSE
				{
				mELSE(); 

				}
				break;
			case 14 :
				// src\\alia\\Alia.g:1:83: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 15 :
				// src\\alia\\Alia.g:1:90: END
				{
				mEND(); 

				}
				break;
			case 16 :
				// src\\alia\\Alia.g:1:94: EQ
				{
				mEQ(); 

				}
				break;
			case 17 :
				// src\\alia\\Alia.g:1:97: EXPR_LIST
				{
				mEXPR_LIST(); 

				}
				break;
			case 18 :
				// src\\alia\\Alia.g:1:107: FALSE
				{
				mFALSE(); 

				}
				break;
			case 19 :
				// src\\alia\\Alia.g:1:113: FUNC
				{
				mFUNC(); 

				}
				break;
			case 20 :
				// src\\alia\\Alia.g:1:118: GE
				{
				mGE(); 

				}
				break;
			case 21 :
				// src\\alia\\Alia.g:1:121: GT
				{
				mGT(); 

				}
				break;
			case 22 :
				// src\\alia\\Alia.g:1:124: IF
				{
				mIF(); 

				}
				break;
			case 23 :
				// src\\alia\\Alia.g:1:127: INT
				{
				mINT(); 

				}
				break;
			case 24 :
				// src\\alia\\Alia.g:1:131: LE
				{
				mLE(); 

				}
				break;
			case 25 :
				// src\\alia\\Alia.g:1:134: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 26 :
				// src\\alia\\Alia.g:1:141: LT
				{
				mLT(); 

				}
				break;
			case 27 :
				// src\\alia\\Alia.g:1:144: MINUS
				{
				mMINUS(); 

				}
				break;
			case 28 :
				// src\\alia\\Alia.g:1:150: MINUS_OP
				{
				mMINUS_OP(); 

				}
				break;
			case 29 :
				// src\\alia\\Alia.g:1:159: MOD
				{
				mMOD(); 

				}
				break;
			case 30 :
				// src\\alia\\Alia.g:1:163: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 31 :
				// src\\alia\\Alia.g:1:171: NOT
				{
				mNOT(); 

				}
				break;
			case 32 :
				// src\\alia\\Alia.g:1:175: NQ
				{
				mNQ(); 

				}
				break;
			case 33 :
				// src\\alia\\Alia.g:1:178: OR
				{
				mOR(); 

				}
				break;
			case 34 :
				// src\\alia\\Alia.g:1:181: OR_ALT
				{
				mOR_ALT(); 

				}
				break;
			case 35 :
				// src\\alia\\Alia.g:1:188: PLUS
				{
				mPLUS(); 

				}
				break;
			case 36 :
				// src\\alia\\Alia.g:1:193: PLUS_OP
				{
				mPLUS_OP(); 

				}
				break;
			case 37 :
				// src\\alia\\Alia.g:1:201: PRINT
				{
				mPRINT(); 

				}
				break;
			case 38 :
				// src\\alia\\Alia.g:1:207: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 39 :
				// src\\alia\\Alia.g:1:215: READ
				{
				mREAD(); 

				}
				break;
			case 40 :
				// src\\alia\\Alia.g:1:220: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 41 :
				// src\\alia\\Alia.g:1:227: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 42 :
				// src\\alia\\Alia.g:1:237: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 43 :
				// src\\alia\\Alia.g:1:244: STRING
				{
				mSTRING(); 

				}
				break;
			case 44 :
				// src\\alia\\Alia.g:1:251: TIMES
				{
				mTIMES(); 

				}
				break;
			case 45 :
				// src\\alia\\Alia.g:1:257: TRUE
				{
				mTRUE(); 

				}
				break;
			case 46 :
				// src\\alia\\Alia.g:1:262: WHILE
				{
				mWHILE(); 

				}
				break;
			case 47 :
				// src\\alia\\Alia.g:1:268: CHAR_EXPR
				{
				mCHAR_EXPR(); 

				}
				break;
			case 48 :
				// src\\alia\\Alia.g:1:278: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 49 :
				// src\\alia\\Alia.g:1:289: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 50 :
				// src\\alia\\Alia.g:1:296: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 51 :
				// src\\alia\\Alia.g:1:304: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\1\41\1\uffff\1\46\2\41\2\uffff\1\41\1\56\2\41\1\65\1\41\1\71"+
		"\2\uffff\1\41\2\uffff\1\74\1\41\2\uffff\2\41\2\uffff\1\101\1\41\1\uffff"+
		"\2\41\3\uffff\1\41\2\uffff\5\41\1\114\2\uffff\5\41\2\uffff\1\122\1\41"+
		"\2\uffff\1\41\2\uffff\1\125\3\41\2\uffff\3\41\1\135\4\41\1\142\1\uffff"+
		"\1\41\1\144\3\41\1\uffff\1\150\1\41\1\uffff\7\41\1\uffff\2\41\1\163\1"+
		"\41\1\uffff\1\166\1\uffff\2\41\1\171\1\uffff\4\41\1\176\1\41\1\u0080\1"+
		"\41\1\u0082\1\41\1\uffff\2\41\1\uffff\1\41\1\u0087\1\uffff\1\u0088\1\41"+
		"\1\u008a\1\41\1\uffff\1\41\1\uffff\1\u008d\1\uffff\2\41\1\u0090\1\41\2"+
		"\uffff\1\u0092\1\uffff\1\41\1\u0094\1\uffff\1\u0095\1\41\1\uffff\1\41"+
		"\1\uffff\1\u0098\2\uffff\1\u0099\1\u009a\3\uffff";
	static final String DFA7_eofS =
		"\u009b\uffff";
	static final String DFA7_minS =
		"\1\11\1\156\1\uffff\1\75\1\145\1\150\2\uffff\1\145\1\52\1\154\1\141\1"+
		"\75\1\146\1\75\2\uffff\1\151\2\uffff\1\75\1\162\2\uffff\1\154\1\145\2"+
		"\uffff\1\101\1\164\1\uffff\1\162\1\150\3\uffff\1\144\2\uffff\1\147\1\157"+
		"\1\141\1\155\1\146\1\60\2\uffff\1\163\1\144\1\160\1\154\1\156\2\uffff"+
		"\1\60\1\164\2\uffff\1\156\2\uffff\1\60\1\165\1\151\1\141\2\uffff\1\162"+
		"\1\165\1\151\1\60\1\151\1\154\1\162\1\160\1\60\1\uffff\1\145\1\60\1\162"+
		"\1\163\1\143\1\uffff\1\60\1\157\1\uffff\1\163\1\156\1\147\1\144\1\151"+
		"\1\145\1\154\1\uffff\1\156\1\145\1\60\1\157\1\uffff\1\60\1\uffff\1\154"+
		"\1\145\1\60\1\uffff\1\160\1\157\1\164\1\162\1\60\1\156\1\60\1\145\1\60"+
		"\1\141\1\uffff\1\165\1\146\1\uffff\1\151\1\60\1\uffff\1\60\1\160\1\60"+
		"\1\141\1\uffff\1\147\1\uffff\1\60\1\uffff\2\156\1\60\1\163\2\uffff\1\60"+
		"\1\uffff\1\155\1\60\1\uffff\1\60\1\144\1\uffff\1\164\1\uffff\1\60\2\uffff"+
		"\2\60\3\uffff";
	static final String DFA7_maxS =
		"\1\174\1\156\1\uffff\1\75\2\157\2\uffff\1\157\1\57\1\170\1\165\1\75\1"+
		"\156\1\75\2\uffff\1\151\2\uffff\1\75\1\162\2\uffff\1\162\1\145\2\uffff"+
		"\1\172\1\164\1\uffff\1\162\1\150\3\uffff\1\144\2\uffff\1\147\1\157\1\141"+
		"\1\155\1\146\1\172\2\uffff\1\163\1\144\1\160\1\154\1\156\2\uffff\1\172"+
		"\1\164\2\uffff\1\156\2\uffff\1\172\1\165\1\157\1\141\2\uffff\1\162\1\165"+
		"\1\151\1\172\1\151\1\154\1\162\1\160\1\172\1\uffff\1\145\1\172\1\162\1"+
		"\163\1\143\1\uffff\1\172\1\157\1\uffff\1\163\1\156\1\147\1\144\1\151\1"+
		"\145\1\154\1\uffff\1\156\1\145\1\172\1\157\1\uffff\1\172\1\uffff\1\154"+
		"\1\145\1\172\1\uffff\1\160\1\157\1\164\1\162\1\172\1\156\1\172\1\145\1"+
		"\172\1\141\1\uffff\1\165\1\146\1\uffff\1\151\1\172\1\uffff\1\172\1\160"+
		"\1\172\1\141\1\uffff\1\147\1\uffff\1\172\1\uffff\2\156\1\172\1\163\2\uffff"+
		"\1\172\1\uffff\1\155\1\172\1\uffff\1\172\1\144\1\uffff\1\164\1\uffff\1"+
		"\172\2\uffff\2\172\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\3\uffff\1\7\1\10\7\uffff\1\31\1\33\1\uffff\1\35\1\36\2\uffff"+
		"\1\42\1\43\2\uffff\1\50\1\51\2\uffff\1\54\2\uffff\1\60\1\61\1\63\1\uffff"+
		"\1\20\1\3\6\uffff\1\62\1\13\5\uffff\1\24\1\25\2\uffff\1\30\1\32\1\uffff"+
		"\1\40\1\37\4\uffff\1\52\1\57\11\uffff\1\14\5\uffff\1\26\2\uffff\1\41\7"+
		"\uffff\1\1\4\uffff\1\12\1\uffff\1\17\3\uffff\1\27\12\uffff\1\6\2\uffff"+
		"\1\15\2\uffff\1\23\4\uffff\1\47\1\uffff\1\55\1\uffff\1\4\4\uffff\1\22"+
		"\1\34\1\uffff\1\45\2\uffff\1\56\2\uffff\1\16\1\uffff\1\44\1\uffff\1\53"+
		"\1\5\2\uffff\1\46\1\11\1\21";
	static final String DFA7_specialS =
		"\u009b\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\43\1\23\1\uffff\2\43\22\uffff\1\43\1\24\3\uffff\1\22\1\2\1\34\1\17"+
			"\1\32\1\36\1\27\1\7\1\20\1\uffff\1\11\12\42\1\6\1\33\1\16\1\3\1\14\2"+
			"\uffff\32\41\6\uffff\1\1\1\4\1\5\1\10\1\12\1\13\2\41\1\15\3\41\1\21\1"+
			"\41\1\25\1\30\1\41\1\31\1\35\1\37\2\41\1\40\3\41\1\uffff\1\26",
			"\1\44",
			"",
			"\1\45",
			"\1\47\11\uffff\1\50",
			"\1\51\6\uffff\1\52",
			"",
			"",
			"\1\53\11\uffff\1\54",
			"\1\55\4\uffff\1\55",
			"\1\57\1\uffff\1\60\11\uffff\1\61",
			"\1\62\23\uffff\1\63",
			"\1\64",
			"\1\66\7\uffff\1\67",
			"\1\70",
			"",
			"",
			"\1\72",
			"",
			"",
			"\1\73",
			"\1\75",
			"",
			"",
			"\1\76\5\uffff\1\77",
			"\1\100",
			"",
			"",
			"\32\102\6\uffff\32\102",
			"\1\103",
			"",
			"\1\104",
			"\1\105",
			"",
			"",
			"",
			"\1\106",
			"",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\123",
			"",
			"",
			"\1\124",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\126",
			"\1\127\5\uffff\1\130",
			"\1\131",
			"",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\143",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\151",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"",
			"\1\161",
			"\1\162",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\164",
			"",
			"\12\41\7\uffff\32\41\6\uffff\10\41\1\165\21\41",
			"",
			"\1\167",
			"\1\170",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\177",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0081",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0083",
			"",
			"\1\u0084",
			"\1\u0085",
			"",
			"\1\u0086",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0089",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u008b",
			"",
			"\1\u008c",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\u008e",
			"\1\u008f",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0091",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\u0093",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0096",
			"",
			"\1\u0097",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | AND_ALT | BECOMES | BEGIN | BOOL | CHAR | COLON | COMMA | COMPOUND | DEF | DIV | DO | ELSE | ELSEIF | END | EQ | EXPR_LIST | FALSE | FUNC | GE | GT | IF | INT | LE | LPAREN | LT | MINUS | MINUS_OP | MOD | NEWLINE | NOT | NQ | OR | OR_ALT | PLUS | PLUS_OP | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | SQUOTE | STRING | TIMES | TRUE | WHILE | CHAR_EXPR | IDENTIFIER | NUMBER | COMMENT | WS );";
		}
	}

}
