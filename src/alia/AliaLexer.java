// $ANTLR 3.5.2 src\\alia\\Alia.g 2014-06-24 14:53:48

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

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:14:6: ( 'boolean' )
			// src\\alia\\Alia.g:14:8: 'boolean'
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
			// src\\alia\\Alia.g:15:6: ( 'char' )
			// src\\alia\\Alia.g:15:8: 'char'
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
			// src\\alia\\Alia.g:16:7: ( ':' )
			// src\\alia\\Alia.g:16:9: ':'
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
			// src\\alia\\Alia.g:17:7: ( ',' )
			// src\\alia\\Alia.g:17:9: ','
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

	// $ANTLR start "DEF"
	public final void mDEF() throws RecognitionException {
		try {
			int _type = DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:18:5: ( 'def' )
			// src\\alia\\Alia.g:18:7: 'def'
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
			// src\\alia\\Alia.g:19:5: ( '/' )
			// src\\alia\\Alia.g:19:7: '/'
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
			// src\\alia\\Alia.g:20:4: ( 'do' )
			// src\\alia\\Alia.g:20:6: 'do'
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
			// src\\alia\\Alia.g:21:6: ( 'else' )
			// src\\alia\\Alia.g:21:8: 'else'
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
			// src\\alia\\Alia.g:22:8: ( 'elseif' )
			// src\\alia\\Alia.g:22:10: 'elseif'
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
			// src\\alia\\Alia.g:23:5: ( 'end' )
			// src\\alia\\Alia.g:23:7: 'end'
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
			// src\\alia\\Alia.g:24:4: ( '==' )
			// src\\alia\\Alia.g:24:6: '=='
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
			// src\\alia\\Alia.g:25:11: ( 'exprlist' )
			// src\\alia\\Alia.g:25:13: 'exprlist'
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
			// src\\alia\\Alia.g:26:7: ( 'false' )
			// src\\alia\\Alia.g:26:9: 'false'
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
			// src\\alia\\Alia.g:27:6: ( 'func' )
			// src\\alia\\Alia.g:27:8: 'func'
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
			// src\\alia\\Alia.g:28:4: ( '>=' )
			// src\\alia\\Alia.g:28:6: '>='
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
			// src\\alia\\Alia.g:29:4: ( '>' )
			// src\\alia\\Alia.g:29:6: '>'
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
			// src\\alia\\Alia.g:30:4: ( 'if' )
			// src\\alia\\Alia.g:30:6: 'if'
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
			// src\\alia\\Alia.g:31:5: ( 'int' )
			// src\\alia\\Alia.g:31:7: 'int'
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
			// src\\alia\\Alia.g:32:4: ( '<=' )
			// src\\alia\\Alia.g:32:6: '<='
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
			// src\\alia\\Alia.g:33:8: ( '(' )
			// src\\alia\\Alia.g:33:10: '('
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
			// src\\alia\\Alia.g:34:4: ( '<' )
			// src\\alia\\Alia.g:34:6: '<'
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
			// src\\alia\\Alia.g:35:7: ( '-' )
			// src\\alia\\Alia.g:35:9: '-'
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
			// src\\alia\\Alia.g:36:10: ( 'minop' )
			// src\\alia\\Alia.g:36:12: 'minop'
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
			// src\\alia\\Alia.g:37:5: ( '%' )
			// src\\alia\\Alia.g:37:7: '%'
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
			// src\\alia\\Alia.g:38:9: ( '\\n' )
			// src\\alia\\Alia.g:38:11: '\\n'
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
			// src\\alia\\Alia.g:39:5: ( '!' )
			// src\\alia\\Alia.g:39:7: '!'
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
			// src\\alia\\Alia.g:40:4: ( '!=' )
			// src\\alia\\Alia.g:40:6: '!='
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
			// src\\alia\\Alia.g:41:4: ( 'or' )
			// src\\alia\\Alia.g:41:6: 'or'
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
			// src\\alia\\Alia.g:42:8: ( '||' )
			// src\\alia\\Alia.g:42:10: '||'
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
			// src\\alia\\Alia.g:43:6: ( '+' )
			// src\\alia\\Alia.g:43:8: '+'
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
			// src\\alia\\Alia.g:44:9: ( 'plusop' )
			// src\\alia\\Alia.g:44:11: 'plusop'
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
			// src\\alia\\Alia.g:45:7: ( 'print' )
			// src\\alia\\Alia.g:45:9: 'print'
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
			// src\\alia\\Alia.g:46:9: ( 'program' )
			// src\\alia\\Alia.g:46:11: 'program'
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
			// src\\alia\\Alia.g:47:6: ( 'read' )
			// src\\alia\\Alia.g:47:8: 'read'
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
			// src\\alia\\Alia.g:48:8: ( ')' )
			// src\\alia\\Alia.g:48:10: ')'
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
			// src\\alia\\Alia.g:49:11: ( ';' )
			// src\\alia\\Alia.g:49:13: ';'
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
			// src\\alia\\Alia.g:50:8: ( '\\'' )
			// src\\alia\\Alia.g:50:10: '\\''
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
			// src\\alia\\Alia.g:51:8: ( 'string' )
			// src\\alia\\Alia.g:51:10: 'string'
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
			// src\\alia\\Alia.g:52:7: ( '*' )
			// src\\alia\\Alia.g:52:9: '*'
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
			// src\\alia\\Alia.g:53:6: ( 'true' )
			// src\\alia\\Alia.g:53:8: 'true'
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
			// src\\alia\\Alia.g:54:7: ( 'while' )
			// src\\alia\\Alia.g:54:9: 'while'
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

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\alia\\Alia.g:140:5: ( LETTER ( LETTER | DIGIT )* )
			// src\\alia\\Alia.g:140:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// src\\alia\\Alia.g:140:16: ( LETTER | DIGIT )*
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
			// src\\alia\\Alia.g:144:5: ( ( DIGIT )+ )
			// src\\alia\\Alia.g:144:9: ( DIGIT )+
			{
			// src\\alia\\Alia.g:144:9: ( DIGIT )+
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
			// src\\alia\\Alia.g:149:5: ( ( '//' ( . )* '\\n' | '/*' ( . )* '*/' ) )
			// src\\alia\\Alia.g:149:9: ( '//' ( . )* '\\n' | '/*' ( . )* '*/' )
			{
			// src\\alia\\Alia.g:149:9: ( '//' ( . )* '\\n' | '/*' ( . )* '*/' )
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
					// src\\alia\\Alia.g:149:10: '//' ( . )* '\\n'
					{
					match("//"); 

					// src\\alia\\Alia.g:149:15: ( . )*
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
							// src\\alia\\Alia.g:149:15: .
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
					// src\\alia\\Alia.g:149:25: '/*' ( . )* '*/'
					{
					match("/*"); 

					// src\\alia\\Alia.g:149:30: ( . )*
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
							// src\\alia\\Alia.g:149:30: .
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
			// src\\alia\\Alia.g:155:5: ( ( ' ' | '\\t' | '\\f' | '\\r' )+ )
			// src\\alia\\Alia.g:155:9: ( ' ' | '\\t' | '\\f' | '\\r' )+
			{
			// src\\alia\\Alia.g:155:9: ( ' ' | '\\t' | '\\f' | '\\r' )+
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// src\\alia\\Alia.g:159:17: ( ( '0' .. '9' ) )
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
			// src\\alia\\Alia.g:160:17: ( ( 'a' .. 'z' ) )
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
			// src\\alia\\Alia.g:161:17: ( ( 'A' .. 'Z' ) )
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// src\\alia\\Alia.g:162:17: ( LOWER | UPPER )
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

	@Override
	public void mTokens() throws RecognitionException {
		// src\\alia\\Alia.g:1:8: ( AND | AND_ALT | BECOMES | BOOL | CHAR | COLON | COMMA | DEF | DIV | DO | ELSE | ELSEIF | END | EQ | EXPR_LIST | FALSE | FUNC | GE | GT | IF | INT | LE | LPAREN | LT | MINUS | MINUS_OP | MOD | NEWLINE | NOT | NQ | OR | OR_ALT | PLUS | PLUS_OP | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | SQUOTE | STRING | TIMES | TRUE | WHILE | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt7=48;
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
				// src\\alia\\Alia.g:1:30: BOOL
				{
				mBOOL(); 

				}
				break;
			case 5 :
				// src\\alia\\Alia.g:1:35: CHAR
				{
				mCHAR(); 

				}
				break;
			case 6 :
				// src\\alia\\Alia.g:1:40: COLON
				{
				mCOLON(); 

				}
				break;
			case 7 :
				// src\\alia\\Alia.g:1:46: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 8 :
				// src\\alia\\Alia.g:1:52: DEF
				{
				mDEF(); 

				}
				break;
			case 9 :
				// src\\alia\\Alia.g:1:56: DIV
				{
				mDIV(); 

				}
				break;
			case 10 :
				// src\\alia\\Alia.g:1:60: DO
				{
				mDO(); 

				}
				break;
			case 11 :
				// src\\alia\\Alia.g:1:63: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// src\\alia\\Alia.g:1:68: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 13 :
				// src\\alia\\Alia.g:1:75: END
				{
				mEND(); 

				}
				break;
			case 14 :
				// src\\alia\\Alia.g:1:79: EQ
				{
				mEQ(); 

				}
				break;
			case 15 :
				// src\\alia\\Alia.g:1:82: EXPR_LIST
				{
				mEXPR_LIST(); 

				}
				break;
			case 16 :
				// src\\alia\\Alia.g:1:92: FALSE
				{
				mFALSE(); 

				}
				break;
			case 17 :
				// src\\alia\\Alia.g:1:98: FUNC
				{
				mFUNC(); 

				}
				break;
			case 18 :
				// src\\alia\\Alia.g:1:103: GE
				{
				mGE(); 

				}
				break;
			case 19 :
				// src\\alia\\Alia.g:1:106: GT
				{
				mGT(); 

				}
				break;
			case 20 :
				// src\\alia\\Alia.g:1:109: IF
				{
				mIF(); 

				}
				break;
			case 21 :
				// src\\alia\\Alia.g:1:112: INT
				{
				mINT(); 

				}
				break;
			case 22 :
				// src\\alia\\Alia.g:1:116: LE
				{
				mLE(); 

				}
				break;
			case 23 :
				// src\\alia\\Alia.g:1:119: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 24 :
				// src\\alia\\Alia.g:1:126: LT
				{
				mLT(); 

				}
				break;
			case 25 :
				// src\\alia\\Alia.g:1:129: MINUS
				{
				mMINUS(); 

				}
				break;
			case 26 :
				// src\\alia\\Alia.g:1:135: MINUS_OP
				{
				mMINUS_OP(); 

				}
				break;
			case 27 :
				// src\\alia\\Alia.g:1:144: MOD
				{
				mMOD(); 

				}
				break;
			case 28 :
				// src\\alia\\Alia.g:1:148: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 29 :
				// src\\alia\\Alia.g:1:156: NOT
				{
				mNOT(); 

				}
				break;
			case 30 :
				// src\\alia\\Alia.g:1:160: NQ
				{
				mNQ(); 

				}
				break;
			case 31 :
				// src\\alia\\Alia.g:1:163: OR
				{
				mOR(); 

				}
				break;
			case 32 :
				// src\\alia\\Alia.g:1:166: OR_ALT
				{
				mOR_ALT(); 

				}
				break;
			case 33 :
				// src\\alia\\Alia.g:1:173: PLUS
				{
				mPLUS(); 

				}
				break;
			case 34 :
				// src\\alia\\Alia.g:1:178: PLUS_OP
				{
				mPLUS_OP(); 

				}
				break;
			case 35 :
				// src\\alia\\Alia.g:1:186: PRINT
				{
				mPRINT(); 

				}
				break;
			case 36 :
				// src\\alia\\Alia.g:1:192: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 37 :
				// src\\alia\\Alia.g:1:200: READ
				{
				mREAD(); 

				}
				break;
			case 38 :
				// src\\alia\\Alia.g:1:205: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 39 :
				// src\\alia\\Alia.g:1:212: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 40 :
				// src\\alia\\Alia.g:1:222: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 41 :
				// src\\alia\\Alia.g:1:229: STRING
				{
				mSTRING(); 

				}
				break;
			case 42 :
				// src\\alia\\Alia.g:1:236: TIMES
				{
				mTIMES(); 

				}
				break;
			case 43 :
				// src\\alia\\Alia.g:1:242: TRUE
				{
				mTRUE(); 

				}
				break;
			case 44 :
				// src\\alia\\Alia.g:1:247: WHILE
				{
				mWHILE(); 

				}
				break;
			case 45 :
				// src\\alia\\Alia.g:1:253: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 46 :
				// src\\alia\\Alia.g:1:264: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 47 :
				// src\\alia\\Alia.g:1:271: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 48 :
				// src\\alia\\Alia.g:1:279: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\1\41\1\uffff\1\46\2\41\2\uffff\1\41\1\54\2\41\1\63\1\41\1\67"+
		"\2\uffff\1\41\2\uffff\1\72\1\41\2\uffff\2\41\3\uffff\1\41\1\uffff\2\41"+
		"\3\uffff\1\41\2\uffff\3\41\1\106\2\uffff\5\41\2\uffff\1\114\1\41\2\uffff"+
		"\1\41\2\uffff\1\117\6\41\1\127\2\41\1\132\1\uffff\1\41\1\134\3\41\1\uffff"+
		"\1\140\1\41\1\uffff\7\41\1\uffff\1\41\1\152\1\uffff\1\154\1\uffff\2\41"+
		"\1\157\1\uffff\4\41\1\164\1\41\1\166\2\41\1\uffff\1\41\1\uffff\1\41\1"+
		"\173\1\uffff\1\174\1\41\1\176\1\41\1\uffff\1\41\1\uffff\1\u0081\1\41\1"+
		"\u0083\1\41\2\uffff\1\u0085\1\uffff\1\41\1\u0087\1\uffff\1\u0088\1\uffff"+
		"\1\41\1\uffff\1\u008a\2\uffff\1\u008b\2\uffff";
	static final String DFA7_eofS =
		"\u008c\uffff";
	static final String DFA7_minS =
		"\1\11\1\156\1\uffff\1\75\1\157\1\150\2\uffff\1\145\1\52\1\154\1\141\1"+
		"\75\1\146\1\75\2\uffff\1\151\2\uffff\1\75\1\162\2\uffff\1\154\1\145\3"+
		"\uffff\1\164\1\uffff\1\162\1\150\3\uffff\1\144\2\uffff\1\157\1\141\1\146"+
		"\1\60\2\uffff\1\163\1\144\1\160\1\154\1\156\2\uffff\1\60\1\164\2\uffff"+
		"\1\156\2\uffff\1\60\1\165\1\151\1\141\1\162\1\165\1\151\1\60\1\154\1\162"+
		"\1\60\1\uffff\1\145\1\60\1\162\1\163\1\143\1\uffff\1\60\1\157\1\uffff"+
		"\1\163\1\156\1\147\1\144\1\151\1\145\1\154\1\uffff\1\145\1\60\1\uffff"+
		"\1\60\1\uffff\1\154\1\145\1\60\1\uffff\1\160\1\157\1\164\1\162\1\60\1"+
		"\156\1\60\1\145\1\141\1\uffff\1\146\1\uffff\1\151\1\60\1\uffff\1\60\1"+
		"\160\1\60\1\141\1\uffff\1\147\1\uffff\1\60\1\156\1\60\1\163\2\uffff\1"+
		"\60\1\uffff\1\155\1\60\1\uffff\1\60\1\uffff\1\164\1\uffff\1\60\2\uffff"+
		"\1\60\2\uffff";
	static final String DFA7_maxS =
		"\1\174\1\156\1\uffff\1\75\1\157\1\150\2\uffff\1\157\1\57\1\170\1\165\1"+
		"\75\1\156\1\75\2\uffff\1\151\2\uffff\1\75\1\162\2\uffff\1\162\1\145\3"+
		"\uffff\1\164\1\uffff\1\162\1\150\3\uffff\1\144\2\uffff\1\157\1\141\1\146"+
		"\1\172\2\uffff\1\163\1\144\1\160\1\154\1\156\2\uffff\1\172\1\164\2\uffff"+
		"\1\156\2\uffff\1\172\1\165\1\157\1\141\1\162\1\165\1\151\1\172\1\154\1"+
		"\162\1\172\1\uffff\1\145\1\172\1\162\1\163\1\143\1\uffff\1\172\1\157\1"+
		"\uffff\1\163\1\156\1\147\1\144\1\151\1\145\1\154\1\uffff\1\145\1\172\1"+
		"\uffff\1\172\1\uffff\1\154\1\145\1\172\1\uffff\1\160\1\157\1\164\1\162"+
		"\1\172\1\156\1\172\1\145\1\141\1\uffff\1\146\1\uffff\1\151\1\172\1\uffff"+
		"\1\172\1\160\1\172\1\141\1\uffff\1\147\1\uffff\1\172\1\156\1\172\1\163"+
		"\2\uffff\1\172\1\uffff\1\155\1\172\1\uffff\1\172\1\uffff\1\164\1\uffff"+
		"\1\172\2\uffff\1\172\2\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\3\uffff\1\6\1\7\7\uffff\1\27\1\31\1\uffff\1\33\1\34\2\uffff"+
		"\1\40\1\41\2\uffff\1\46\1\47\1\50\1\uffff\1\52\2\uffff\1\55\1\56\1\60"+
		"\1\uffff\1\16\1\3\4\uffff\1\57\1\11\5\uffff\1\22\1\23\2\uffff\1\26\1\30"+
		"\1\uffff\1\36\1\35\13\uffff\1\12\5\uffff\1\24\2\uffff\1\37\7\uffff\1\1"+
		"\2\uffff\1\10\1\uffff\1\15\3\uffff\1\25\11\uffff\1\5\1\uffff\1\13\2\uffff"+
		"\1\21\4\uffff\1\45\1\uffff\1\53\4\uffff\1\20\1\32\1\uffff\1\43\2\uffff"+
		"\1\54\1\uffff\1\14\1\uffff\1\42\1\uffff\1\51\1\4\1\uffff\1\44\1\17";
	static final String DFA7_specialS =
		"\u008c\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\43\1\23\1\uffff\2\43\22\uffff\1\43\1\24\3\uffff\1\22\1\2\1\34\1\17"+
			"\1\32\1\36\1\27\1\7\1\20\1\uffff\1\11\12\42\1\6\1\33\1\16\1\3\1\14\2"+
			"\uffff\32\41\6\uffff\1\1\1\4\1\5\1\10\1\12\1\13\2\41\1\15\3\41\1\21\1"+
			"\41\1\25\1\30\1\41\1\31\1\35\1\37\2\41\1\40\3\41\1\uffff\1\26",
			"\1\44",
			"",
			"\1\45",
			"\1\47",
			"\1\50",
			"",
			"",
			"\1\51\11\uffff\1\52",
			"\1\53\4\uffff\1\53",
			"\1\55\1\uffff\1\56\11\uffff\1\57",
			"\1\60\23\uffff\1\61",
			"\1\62",
			"\1\64\7\uffff\1\65",
			"\1\66",
			"",
			"",
			"\1\70",
			"",
			"",
			"\1\71",
			"\1\73",
			"",
			"",
			"\1\74\5\uffff\1\75",
			"\1\76",
			"",
			"",
			"",
			"\1\77",
			"",
			"\1\100",
			"\1\101",
			"",
			"",
			"",
			"\1\102",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\115",
			"",
			"",
			"\1\116",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\120",
			"\1\121\5\uffff\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\130",
			"\1\131",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\133",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\141",
			"",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"",
			"\1\151",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\6\uffff\10\41\1\153\21\41",
			"",
			"\1\155",
			"\1\156",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\165",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"",
			"\1\172",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\175",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\177",
			"",
			"\1\u0080",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0082",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"\1\u0084",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\u0086",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\u0089",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
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
			return "1:1: Tokens : ( AND | AND_ALT | BECOMES | BOOL | CHAR | COLON | COMMA | DEF | DIV | DO | ELSE | ELSEIF | END | EQ | EXPR_LIST | FALSE | FUNC | GE | GT | IF | INT | LE | LPAREN | LT | MINUS | MINUS_OP | MOD | NEWLINE | NOT | NQ | OR | OR_ALT | PLUS | PLUS_OP | PRINT | PROGRAM | READ | RPAREN | SEMICOLON | SQUOTE | STRING | TIMES | TRUE | WHILE | IDENTIFIER | NUMBER | COMMENT | WS );";
		}
	}

}
