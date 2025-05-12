// Generated from Expression.g4 by ANTLR 4.13.2
package helper.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, REAL=23, INTEGER=24, 
		FUNCTION=25, PI=26, E=27, BOOL=28, BINARY=29, OCTAL=30, HEXA=31, WS=32;
	public static final int
		RULE_expr = 0, RULE_prefixExpr = 1, RULE_prefixNumber = 2, RULE_prefixfonction = 3, 
		RULE_postfixExpr = 4, RULE_postfixNumber = 5, RULE_postfixfonction = 6, 
		RULE_infixExpr = 7, RULE_infixExprLogic = 8, RULE_infixExprBitwise = 9, 
		RULE_infixExprPrio1 = 10, RULE_infixExprPrio2 = 11, RULE_infixExprPrio3 = 12, 
		RULE_infixExprPrio4 = 13, RULE_infixfunction = 14, RULE_complex = 15, 
		RULE_number = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "prefixExpr", "prefixNumber", "prefixfonction", "postfixExpr", 
			"postfixNumber", "postfixfonction", "infixExpr", "infixExprLogic", "infixExprBitwise", 
			"infixExprPrio1", "infixExprPrio2", "infixExprPrio3", "infixExprPrio4", 
			"infixfunction", "complex", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "','", "')'", "'not'", 
			"'and'", "'or'", "'xor'", "'=>'", "'<=>'", "'<<'", "'>>'", "'~'", "'&'", 
			"'|'", "'^^'", "'i'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "REAL", 
			"INTEGER", "FUNCTION", "PI", "E", "BOOL", "BINARY", "OCTAL", "HEXA", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(34);
				infixExpr();
				}
				break;
			case 2:
				{
				setState(35);
				prefixExpr();
				}
				break;
			case 3:
				{
				setState(36);
				postfixExpr();
				}
				break;
			}
			setState(39);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExprContext extends ParserRuleContext {
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
	 
		public PrefixExprContext() { }
		public void copyFrom(PrefixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExpressionContext extends PrefixExprContext {
		public List<PrefixExprContext> prefixExpr() {
			return getRuleContexts(PrefixExprContext.class);
		}
		public PrefixExprContext prefixExpr(int i) {
			return getRuleContext(PrefixExprContext.class,i);
		}
		public PrefixExpressionContext(PrefixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixSimpleNumberContext extends PrefixExprContext {
		public PrefixNumberContext prefixNumber() {
			return getRuleContext(PrefixNumberContext.class,0);
		}
		public PrefixSimpleNumberContext(PrefixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixSimpleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixSimpleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrefixSimpleNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prefixExpr);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				match(T__5);
				setState(43);
				prefixExpr();
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					match(T__6);
					setState(45);
					prefixExpr();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(50);
				match(T__7);
				}
				break;
			case REAL:
			case INTEGER:
			case FUNCTION:
			case PI:
			case E:
			case BOOL:
				_localctx = new PrefixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				prefixNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixNumberContext extends ParserRuleContext {
		public PrefixfonctionContext prefixfonction() {
			return getRuleContext(PrefixfonctionContext.class,0);
		}
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrefixNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrefixNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixNumberContext prefixNumber() throws RecognitionException {
		PrefixNumberContext _localctx = new PrefixNumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prefixNumber);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				prefixfonction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixfonctionContext extends ParserRuleContext {
		public PrefixfonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixfonction; }
	 
		public PrefixfonctionContext() { }
		public void copyFrom(PrefixfonctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnaryFunctionContext extends PrefixfonctionContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public PrefixUnaryFunctionContext(PrefixfonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixUnaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixUnaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrefixUnaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixBinaryFunctionContext extends PrefixfonctionContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public List<PrefixExprContext> prefixExpr() {
			return getRuleContexts(PrefixExprContext.class);
		}
		public PrefixExprContext prefixExpr(int i) {
			return getRuleContext(PrefixExprContext.class,i);
		}
		public PrefixBinaryFunctionContext(PrefixfonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixBinaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixBinaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPrefixBinaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixfonctionContext prefixfonction() throws RecognitionException {
		PrefixfonctionContext _localctx = new PrefixfonctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefixfonction);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrefixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(FUNCTION);
				setState(61);
				prefixExpr();
				setState(62);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PrefixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(FUNCTION);
				setState(65);
				prefixExpr();
				setState(66);
				match(T__6);
				setState(67);
				prefixExpr();
				setState(68);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends ParserRuleContext {
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	 
		public PostfixExprContext() { }
		public void copyFrom(PostfixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixSimpleNumberContext extends PostfixExprContext {
		public PostfixNumberContext postfixNumber() {
			return getRuleContext(PostfixNumberContext.class,0);
		}
		public PostfixSimpleNumberContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixSimpleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixSimpleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPostfixSimpleNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends PostfixExprContext {
		public List<PostfixExprContext> postfixExpr() {
			return getRuleContexts(PostfixExprContext.class);
		}
		public PostfixExprContext postfixExpr(int i) {
			return getRuleContext(PostfixExprContext.class,i);
		}
		public PostfixExpressionContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfixExpr);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new PostfixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__5);
				setState(73);
				postfixExpr();
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					match(T__6);
					setState(75);
					postfixExpr();
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(80);
				match(T__7);
				setState(81);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case REAL:
			case INTEGER:
			case FUNCTION:
			case PI:
			case E:
			case BOOL:
				_localctx = new PostfixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				postfixNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixNumberContext extends ParserRuleContext {
		public PrefixfonctionContext prefixfonction() {
			return getRuleContext(PrefixfonctionContext.class,0);
		}
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PostfixNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPostfixNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixNumberContext postfixNumber() throws RecognitionException {
		PostfixNumberContext _localctx = new PostfixNumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postfixNumber);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				prefixfonction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixfonctionContext extends ParserRuleContext {
		public PostfixfonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixfonction; }
	 
		public PostfixfonctionContext() { }
		public void copyFrom(PostfixfonctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixBinaryFunctionContext extends PostfixfonctionContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public List<PostfixfonctionContext> postfixfonction() {
			return getRuleContexts(PostfixfonctionContext.class);
		}
		public PostfixfonctionContext postfixfonction(int i) {
			return getRuleContext(PostfixfonctionContext.class,i);
		}
		public PostfixBinaryFunctionContext(PostfixfonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixBinaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixBinaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPostfixBinaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixUnaryFunctionContext extends PostfixfonctionContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public PostfixfonctionContext postfixfonction() {
			return getRuleContext(PostfixfonctionContext.class,0);
		}
		public PostfixUnaryFunctionContext(PostfixfonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixUnaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixUnaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPostfixUnaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixfonctionContext postfixfonction() throws RecognitionException {
		PostfixfonctionContext _localctx = new PostfixfonctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_postfixfonction);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PostfixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(FUNCTION);
				setState(92);
				postfixfonction();
				setState(93);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PostfixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(FUNCTION);
				setState(96);
				postfixfonction();
				setState(97);
				match(T__6);
				setState(98);
				postfixfonction();
				setState(99);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprContext extends ParserRuleContext {
		public InfixExprLogicContext infixExprLogic() {
			return getRuleContext(InfixExprLogicContext.class,0);
		}
		public InfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprContext infixExpr() throws RecognitionException {
		InfixExprContext _localctx = new InfixExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_infixExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			infixExprLogic(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprLogicContext extends ParserRuleContext {
		public InfixExprBitwiseContext infixExprBitwise() {
			return getRuleContext(InfixExprBitwiseContext.class,0);
		}
		public InfixExprLogicContext infixExprLogic() {
			return getRuleContext(InfixExprLogicContext.class,0);
		}
		public InfixExprLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprLogicContext infixExprLogic() throws RecognitionException {
		return infixExprLogic(0);
	}

	private InfixExprLogicContext infixExprLogic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprLogicContext _localctx = new InfixExprLogicContext(_ctx, _parentState);
		InfixExprLogicContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_infixExprLogic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			infixExprBitwise(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprLogicContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprLogic);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					infixExprBitwise(0);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprBitwiseContext extends ParserRuleContext {
		public InfixExprPrio1Context infixExprPrio1() {
			return getRuleContext(InfixExprPrio1Context.class,0);
		}
		public InfixExprBitwiseContext infixExprBitwise() {
			return getRuleContext(InfixExprBitwiseContext.class,0);
		}
		public InfixExprBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprBitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprBitwiseContext infixExprBitwise() throws RecognitionException {
		return infixExprBitwise(0);
	}

	private InfixExprBitwiseContext infixExprBitwise(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprBitwiseContext _localctx = new InfixExprBitwiseContext(_ctx, _parentState);
		InfixExprBitwiseContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_infixExprBitwise, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			infixExprPrio1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprBitwiseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprBitwise);
					setState(119);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(120);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(121);
					infixExprPrio1(0);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprPrio1Context extends ParserRuleContext {
		public InfixExprPrio2Context infixExprPrio2() {
			return getRuleContext(InfixExprPrio2Context.class,0);
		}
		public InfixExprPrio1Context infixExprPrio1() {
			return getRuleContext(InfixExprPrio1Context.class,0);
		}
		public InfixExprPrio1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprPrio1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprPrio1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprPrio1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprPrio1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprPrio1Context infixExprPrio1() throws RecognitionException {
		return infixExprPrio1(0);
	}

	private InfixExprPrio1Context infixExprPrio1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprPrio1Context _localctx = new InfixExprPrio1Context(_ctx, _parentState);
		InfixExprPrio1Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_infixExprPrio1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			infixExprPrio2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio1);
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(132);
					infixExprPrio2(0);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprPrio2Context extends ParserRuleContext {
		public List<InfixExprPrio3Context> infixExprPrio3() {
			return getRuleContexts(InfixExprPrio3Context.class);
		}
		public InfixExprPrio3Context infixExprPrio3(int i) {
			return getRuleContext(InfixExprPrio3Context.class,i);
		}
		public InfixExprPrio2Context infixExprPrio2() {
			return getRuleContext(InfixExprPrio2Context.class,0);
		}
		public InfixExprPrio2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprPrio2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprPrio2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprPrio2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprPrio2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprPrio2Context infixExprPrio2() throws RecognitionException {
		return infixExprPrio2(0);
	}

	private InfixExprPrio2Context infixExprPrio2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprPrio2Context _localctx = new InfixExprPrio2Context(_ctx, _parentState);
		InfixExprPrio2Context _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_infixExprPrio2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(139);
				infixExprPrio3(0);
				}
				break;
			case 2:
				{
				setState(140);
				infixExprPrio3(0);
				setState(141);
				infixExprPrio3(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio2);
					setState(145);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(146);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(147);
					infixExprPrio3(0);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprPrio3Context extends ParserRuleContext {
		public InfixExprPrio4Context infixExprPrio4() {
			return getRuleContext(InfixExprPrio4Context.class,0);
		}
		public InfixExprPrio3Context infixExprPrio3() {
			return getRuleContext(InfixExprPrio3Context.class,0);
		}
		public InfixExprPrio3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprPrio3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprPrio3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprPrio3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprPrio3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprPrio3Context infixExprPrio3() throws RecognitionException {
		return infixExprPrio3(0);
	}

	private InfixExprPrio3Context infixExprPrio3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprPrio3Context _localctx = new InfixExprPrio3Context(_ctx, _parentState);
		InfixExprPrio3Context _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_infixExprPrio3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(154);
			infixExprPrio4();
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio3);
					setState(156);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(157);
					match(T__4);
					}
					setState(158);
					infixExprPrio4();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixExprPrio4Context extends ParserRuleContext {
		public InfixExprPrio4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprPrio4; }
	 
		public InfixExprPrio4Context() { }
		public void copyFrom(InfixExprPrio4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixSimpleNumberContext extends InfixExprPrio4Context {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public InfixSimpleNumberContext(InfixExprPrio4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixSimpleNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixSimpleNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixSimpleNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionWithParenthesisContext extends InfixExprPrio4Context {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public InfixExpressionWithParenthesisContext(InfixExprPrio4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpressionWithParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpressionWithParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpressionWithParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexNumberContext extends InfixExprPrio4Context {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public ComplexNumberContext(InfixExprPrio4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterComplexNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitComplexNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitComplexNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionSignedContext extends InfixExprPrio4Context {
		public InfixExprPrio4Context infixExprPrio4() {
			return getRuleContext(InfixExprPrio4Context.class,0);
		}
		public InfixExpressionSignedContext(InfixExprPrio4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpressionSigned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpressionSigned(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpressionSigned(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixFuncContext extends InfixExprPrio4Context {
		public InfixfunctionContext infixfunction() {
			return getRuleContext(InfixfunctionContext.class,0);
		}
		public InfixFuncContext(InfixExprPrio4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprPrio4Context infixExprPrio4() throws RecognitionException {
		InfixExprPrio4Context _localctx = new InfixExprPrio4Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_infixExprPrio4);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new InfixExpressionSignedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				infixExprPrio4();
				}
				break;
			case 2:
				_localctx = new InfixExpressionWithParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__5);
				setState(167);
				infixExpr();
				setState(168);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new InfixFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				infixfunction();
				}
				break;
			case 4:
				_localctx = new ComplexNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				complex();
				}
				break;
			case 5:
				_localctx = new InfixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixfunctionContext extends ParserRuleContext {
		public InfixfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixfunction; }
	 
		public InfixfunctionContext() { }
		public void copyFrom(InfixfunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixUnaryFunctionContext extends InfixfunctionContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public InfixUnaryFunctionContext(InfixfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixUnaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixUnaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixUnaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixBinaryFunctionContext extends InfixfunctionContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public List<InfixExprContext> infixExpr() {
			return getRuleContexts(InfixExprContext.class);
		}
		public InfixExprContext infixExpr(int i) {
			return getRuleContext(InfixExprContext.class,i);
		}
		public InfixBinaryFunctionContext(InfixfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixBinaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixBinaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixBinaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixfunctionContext infixfunction() throws RecognitionException {
		InfixfunctionContext _localctx = new InfixfunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_infixfunction);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new InfixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(FUNCTION);
				setState(176);
				infixExpr();
				setState(177);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new InfixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(FUNCTION);
				setState(180);
				infixExpr();
				setState(181);
				match(T__6);
				setState(182);
				infixExpr();
				setState(183);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexContext extends ParserRuleContext {
		public ComplexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex; }
	 
		public ComplexContext() { }
		public void copyFrom(ComplexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexAtomContext extends ComplexContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ComplexAtomContext(ComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterComplexAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitComplexAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitComplexAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexContext complex() throws RecognitionException {
		ComplexContext _localctx = new ComplexContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_complex);
		int _la;
		try {
			_localctx = new ComplexAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			number();
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			number();
			setState(190);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntergerAtomContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
		public IntergerAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterIntergerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitIntergerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIntergerAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealAtomContext extends NumberContext {
		public TerminalNode REAL() { return getToken(ExpressionParser.REAL, 0); }
		public RealAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRealAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRealAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitRealAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ENumberContext extends NumberContext {
		public TerminalNode E() { return getToken(ExpressionParser.E, 0); }
		public ENumberContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterENumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitENumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitENumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolAtomContext extends NumberContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public BoolAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBoolAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBoolAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBoolAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScientificAtomContext extends NumberContext {
		public TerminalNode E() { return getToken(ExpressionParser.E, 0); }
		public List<TerminalNode> REAL() { return getTokens(ExpressionParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(ExpressionParser.REAL, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(ExpressionParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ExpressionParser.INTEGER, i);
		}
		public ScientificAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterScientificAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitScientificAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitScientificAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PiNumberContext extends NumberContext {
		public TerminalNode PI() { return getToken(ExpressionParser.PI, 0); }
		public PiNumberContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPiNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPiNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPiNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentageAtomContext extends NumberContext {
		public TerminalNode REAL() { return getToken(ExpressionParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
		public PercentageAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPercentageAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPercentageAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPercentageAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ScientificAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				match(E);
				setState(194);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new IntergerAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(INTEGER);
				}
				break;
			case 3:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(REAL);
				}
				break;
			case 4:
				_localctx = new PiNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(PI);
				}
				break;
			case 5:
				_localctx = new ENumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(E);
				}
				break;
			case 6:
				_localctx = new PercentageAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				match(T__21);
				}
				break;
			case 7:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				match(BOOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return infixExprLogic_sempred((InfixExprLogicContext)_localctx, predIndex);
		case 9:
			return infixExprBitwise_sempred((InfixExprBitwiseContext)_localctx, predIndex);
		case 10:
			return infixExprPrio1_sempred((InfixExprPrio1Context)_localctx, predIndex);
		case 11:
			return infixExprPrio2_sempred((InfixExprPrio2Context)_localctx, predIndex);
		case 12:
			return infixExprPrio3_sempred((InfixExprPrio3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean infixExprLogic_sempred(InfixExprLogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixExprBitwise_sempred(InfixExprBitwiseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixExprPrio1_sempred(InfixExprPrio1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixExprPrio2_sempred(InfixExprPrio2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean infixExprPrio3_sempred(InfixExprPrio3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001/\b\u0001\u000b\u0001\f\u00010\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004M\b\u0004\u000b\u0004\f\u0004N\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005Z\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bp\b\b\n\b\f\b"+
		"s\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t{\b\t\n\t"+
		"\f\t~\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0086"+
		"\b\n\n\n\f\n\u0089\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0095\b\u000b\n\u000b\f\u000b\u0098\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a0\b\f\n\f\f\f\u00a3\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ae\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ba\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cb"+
		"\b\u0010\u0001\u0010\u0000\u0005\u0010\u0012\u0014\u0016\u0018\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0006\u0001\u0000\u0001\u0005\u0001\u0000\t\u000e\u0001"+
		"\u0000\u000f\u0014\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0001"+
		"\u0000\u0017\u0018\u00d8\u0000%\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000"+
		"\bT\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\fe\u0001\u0000"+
		"\u0000\u0000\u000eg\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000"+
		"\u0012t\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016"+
		"\u008f\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a"+
		"\u00ad\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000\u0000\u001e"+
		"\u00bb\u0001\u0000\u0000\u0000 \u00ca\u0001\u0000\u0000\u0000\"&\u0003"+
		"\u000e\u0007\u0000#&\u0003\u0002\u0001\u0000$&\u0003\b\u0004\u0000%\""+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001\u0001"+
		"\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000*+\u0005\u0006\u0000\u0000"+
		"+.\u0003\u0002\u0001\u0000,-\u0005\u0007\u0000\u0000-/\u0003\u0002\u0001"+
		"\u0000.,\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0005"+
		"\b\u0000\u000036\u0001\u0000\u0000\u000046\u0003\u0004\u0002\u00005)\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000"+
		"\u00007;\u0003\u0006\u0003\u00008;\u0003\u001e\u000f\u00009;\u0003 \u0010"+
		"\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005\u0019\u0000\u0000"+
		"=>\u0003\u0002\u0001\u0000>?\u0005\b\u0000\u0000?G\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0019\u0000\u0000AB\u0003\u0002\u0001\u0000BC\u0005\u0007\u0000"+
		"\u0000CD\u0003\u0002\u0001\u0000DE\u0005\b\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000F<\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IL\u0003\b\u0004\u0000JK\u0005"+
		"\u0007\u0000\u0000KM\u0003\b\u0004\u0000LJ\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0007\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SU\u0003\n\u0005\u0000TH\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VZ\u0003\u0006\u0003"+
		"\u0000WZ\u0003\u001e\u000f\u0000XZ\u0003 \u0010\u0000YV\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u000b\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0019\u0000\u0000\\]\u0003\f\u0006\u0000]"+
		"^\u0005\b\u0000\u0000^f\u0001\u0000\u0000\u0000_`\u0005\u0019\u0000\u0000"+
		"`a\u0003\f\u0006\u0000ab\u0005\u0007\u0000\u0000bc\u0003\f\u0006\u0000"+
		"cd\u0005\b\u0000\u0000df\u0001\u0000\u0000\u0000e[\u0001\u0000\u0000\u0000"+
		"e_\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0003\u0010\b"+
		"\u0000h\u000f\u0001\u0000\u0000\u0000ij\u0006\b\uffff\uffff\u0000jk\u0003"+
		"\u0012\t\u0000kq\u0001\u0000\u0000\u0000lm\n\u0002\u0000\u0000mn\u0007"+
		"\u0001\u0000\u0000np\u0003\u0012\t\u0000ol\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r\u0011\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0006\t\uffff"+
		"\uffff\u0000uv\u0003\u0014\n\u0000v|\u0001\u0000\u0000\u0000wx\n\u0002"+
		"\u0000\u0000xy\u0007\u0002\u0000\u0000y{\u0003\u0014\n\u0000zw\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0013\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\n\uffff\uffff\u0000\u0080\u0081\u0003\u0016\u000b"+
		"\u0000\u0081\u0087\u0001\u0000\u0000\u0000\u0082\u0083\n\u0002\u0000\u0000"+
		"\u0083\u0084\u0007\u0003\u0000\u0000\u0084\u0086\u0003\u0016\u000b\u0000"+
		"\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0006\u000b\uffff\uffff\u0000\u008b\u0090\u0003\u0018\f\u0000"+
		"\u008c\u008d\u0003\u0018\f\u0000\u008d\u008e\u0003\u0018\f\u0000\u008e"+
		"\u0090\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u008f"+
		"\u008c\u0001\u0000\u0000\u0000\u0090\u0096\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\n\u0003\u0000\u0000\u0092\u0093\u0007\u0004\u0000\u0000\u0093\u0095"+
		"\u0003\u0018\f\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0006\f\uffff\uffff\u0000\u009a\u009b\u0003"+
		"\u001a\r\u0000\u009b\u00a1\u0001\u0000\u0000\u0000\u009c\u009d\n\u0002"+
		"\u0000\u0000\u009d\u009e\u0005\u0005\u0000\u0000\u009e\u00a0\u0003\u001a"+
		"\r\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0007\u0003\u0000\u0000\u00a5\u00ae\u0003\u001a\r\u0000"+
		"\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000"+
		"\u00a8\u00a9\u0005\b\u0000\u0000\u00a9\u00ae\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ae\u0003\u001c\u000e\u0000\u00ab\u00ae\u0003\u001e\u000f\u0000\u00ac"+
		"\u00ae\u0003 \u0010\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u001b"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0019\u0000\u0000\u00b0\u00b1"+
		"\u0003\u000e\u0007\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0019\u0000\u0000\u00b4\u00b5\u0003"+
		"\u000e\u0007\u0000\u00b5\u00b6\u0005\u0007\u0000\u0000\u00b6\u00b7\u0003"+
		"\u000e\u0007\u0000\u00b7\u00b8\u0005\b\u0000\u0000\u00b8\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b9\u00af\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000"+
		"\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003 \u0010"+
		"\u0000\u00bc\u00bd\u0007\u0003\u0000\u0000\u00bd\u00be\u0003 \u0010\u0000"+
		"\u00be\u00bf\u0005\u0015\u0000\u0000\u00bf\u001f\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0007\u0005\u0000\u0000\u00c1\u00c2\u0005\u001b\u0000\u0000"+
		"\u00c2\u00cb\u0007\u0005\u0000\u0000\u00c3\u00cb\u0005\u0018\u0000\u0000"+
		"\u00c4\u00cb\u0005\u0017\u0000\u0000\u00c5\u00cb\u0005\u001a\u0000\u0000"+
		"\u00c6\u00cb\u0005\u001b\u0000\u0000\u00c7\u00c8\u0007\u0005\u0000\u0000"+
		"\u00c8\u00cb\u0005\u0016\u0000\u0000\u00c9\u00cb\u0005\u001c\u0000\u0000"+
		"\u00ca\u00c0\u0001\u0000\u0000\u0000\u00ca\u00c3\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000\u0012"+
		"%05:FNTYeq|\u0087\u008f\u0096\u00a1\u00ad\u00b9\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}