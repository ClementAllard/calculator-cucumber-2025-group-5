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
		FUNCTION=25, PI=26, E=27, BOOL=28, BINARY=29, OCTAL=30, HEXADECIMAL=31, 
		WS=32;
	public static final int
		RULE_expr = 0, RULE_prefixExpr = 1, RULE_prefixNumber = 2, RULE_prefixfonction = 3, 
		RULE_postfixExpr = 4, RULE_postfixNumber = 5, RULE_postfixfonction = 6, 
		RULE_infixExpr = 7, RULE_infixExprBitwise = 8, RULE_infixExprLogicPrio1 = 9, 
		RULE_infixExprLogicPrio2 = 10, RULE_infixExprPrio1 = 11, RULE_infixExprPrio2 = 12, 
		RULE_infixExprPrio3 = 13, RULE_infixExprPrio4 = 14, RULE_infixfunction = 15, 
		RULE_complex = 16, RULE_number = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "prefixExpr", "prefixNumber", "prefixfonction", "postfixExpr", 
			"postfixNumber", "postfixfonction", "infixExpr", "infixExprBitwise", 
			"infixExprLogicPrio1", "infixExprLogicPrio2", "infixExprPrio1", "infixExprPrio2", 
			"infixExprPrio3", "infixExprPrio4", "infixfunction", "complex", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "','", "')'", "'<<'", 
			"'>>'", "'~'", "'&'", "'|'", "'^^'", "'and'", "'xor'", "'or'", "'=>'", 
			"'<=>'", "'not'", "'i'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "REAL", 
			"INTEGER", "FUNCTION", "PI", "E", "BOOL", "BINARY", "OCTAL", "HEXADECIMAL", 
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(36);
				infixExpr();
				}
				break;
			case 2:
				{
				setState(37);
				prefixExpr();
				}
				break;
			case 3:
				{
				setState(38);
				postfixExpr();
				}
				break;
			}
			setState(41);
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
			setState(55);
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
				setState(43);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				match(T__5);
				setState(45);
				prefixExpr();
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					match(T__6);
					setState(47);
					prefixExpr();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(52);
				match(T__7);
				}
				break;
			case REAL:
			case INTEGER:
			case FUNCTION:
			case PI:
			case E:
			case BOOL:
			case BINARY:
			case OCTAL:
			case HEXADECIMAL:
				_localctx = new PrefixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				prefixfonction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrefixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(FUNCTION);
				setState(63);
				prefixExpr();
				setState(64);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PrefixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(FUNCTION);
				setState(67);
				prefixExpr();
				setState(68);
				match(T__6);
				setState(69);
				prefixExpr();
				setState(70);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new PostfixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__5);
				setState(75);
				postfixExpr();
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					match(T__6);
					setState(77);
					postfixExpr();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(82);
				match(T__7);
				setState(83);
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
			case BINARY:
			case OCTAL:
			case HEXADECIMAL:
				_localctx = new PostfixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
		public PostfixfonctionContext postfixfonction() {
			return getRuleContext(PostfixfonctionContext.class,0);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				postfixfonction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PostfixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(FUNCTION);
				setState(94);
				postfixfonction();
				setState(95);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PostfixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(FUNCTION);
				setState(98);
				postfixfonction();
				setState(99);
				match(T__6);
				setState(100);
				postfixfonction();
				setState(101);
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
		public InfixExprLogicPrio1Context infixExprLogicPrio1() {
			return getRuleContext(InfixExprLogicPrio1Context.class,0);
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
			setState(105);
			infixExprLogicPrio1(0);
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
	public static class InfixExprBitwiseContext extends ParserRuleContext {
		public InfixExprLogicPrio1Context infixExprLogicPrio1() {
			return getRuleContext(InfixExprLogicPrio1Context.class,0);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_infixExprBitwise, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			infixExprLogicPrio1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprBitwiseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprBitwise);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(112);
					infixExprLogicPrio1(0);
					}
					} 
				}
				setState(117);
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
	public static class InfixExprLogicPrio1Context extends ParserRuleContext {
		public InfixExprLogicPrio2Context infixExprLogicPrio2() {
			return getRuleContext(InfixExprLogicPrio2Context.class,0);
		}
		public InfixExprLogicPrio1Context infixExprLogicPrio1() {
			return getRuleContext(InfixExprLogicPrio1Context.class,0);
		}
		public InfixExprLogicPrio1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprLogicPrio1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprLogicPrio1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprLogicPrio1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprLogicPrio1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprLogicPrio1Context infixExprLogicPrio1() throws RecognitionException {
		return infixExprLogicPrio1(0);
	}

	private InfixExprLogicPrio1Context infixExprLogicPrio1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprLogicPrio1Context _localctx = new InfixExprLogicPrio1Context(_ctx, _parentState);
		InfixExprLogicPrio1Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_infixExprLogicPrio1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			infixExprLogicPrio2();
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprLogicPrio1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprLogicPrio1);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(123);
					infixExprLogicPrio2();
					}
					} 
				}
				setState(128);
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
	public static class InfixExprLogicPrio2Context extends ParserRuleContext {
		public InfixExprPrio1Context infixExprPrio1() {
			return getRuleContext(InfixExprPrio1Context.class,0);
		}
		public InfixExprLogicPrio2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprLogicPrio2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprLogicPrio2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprLogicPrio2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprLogicPrio2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprLogicPrio2Context infixExprLogicPrio2() throws RecognitionException {
		InfixExprLogicPrio2Context _localctx = new InfixExprLogicPrio2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_infixExprLogicPrio2);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__19);
				setState(130);
				infixExprPrio1(0);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case REAL:
			case INTEGER:
			case FUNCTION:
			case PI:
			case E:
			case BOOL:
			case BINARY:
			case OCTAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				infixExprPrio1(0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_infixExprPrio1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			infixExprPrio2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio1);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(139);
					infixExprPrio2(0);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_infixExprPrio2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(146);
				infixExprPrio3(0);
				}
				break;
			case 2:
				{
				setState(147);
				infixExprPrio3(0);
				setState(148);
				infixExprPrio3(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio2);
					setState(152);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(154);
					infixExprPrio3(0);
					}
					} 
				}
				setState(159);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_infixExprPrio3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			infixExprPrio4();
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio3);
					setState(163);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(164);
					match(T__4);
					}
					setState(165);
					infixExprPrio4();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 28, RULE_infixExprPrio4);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new InfixExpressionSignedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				infixExprPrio4();
				}
				break;
			case 2:
				_localctx = new InfixExpressionWithParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__5);
				setState(174);
				infixExpr();
				setState(175);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new InfixFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				infixfunction();
				}
				break;
			case 4:
				_localctx = new ComplexNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				complex();
				}
				break;
			case 5:
				_localctx = new InfixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
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
		enterRule(_localctx, 30, RULE_infixfunction);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new InfixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(FUNCTION);
				setState(183);
				infixExpr();
				setState(184);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new InfixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(FUNCTION);
				setState(187);
				infixExpr();
				setState(188);
				match(T__6);
				setState(189);
				infixExpr();
				setState(190);
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
		enterRule(_localctx, 32, RULE_complex);
		int _la;
		try {
			_localctx = new ComplexAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			number();
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			number();
			setState(197);
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
	public static class OctalAtomContext extends NumberContext {
		public TerminalNode OCTAL() { return getToken(ExpressionParser.OCTAL, 0); }
		public OctalAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterOctalAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitOctalAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitOctalAtom(this);
			else return visitor.visitChildren(this);
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
	public static class BinaryAtomContext extends NumberContext {
		public TerminalNode BINARY() { return getToken(ExpressionParser.BINARY, 0); }
		public BinaryAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBinaryAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBinaryAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBinaryAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalAtomContext extends NumberContext {
		public TerminalNode HEXADECIMAL() { return getToken(ExpressionParser.HEXADECIMAL, 0); }
		public HexadecimalAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterHexadecimalAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitHexadecimalAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitHexadecimalAtom(this);
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
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ScientificAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
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
				match(E);
				setState(201);
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
				setState(202);
				match(INTEGER);
				}
				break;
			case 3:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(REAL);
				}
				break;
			case 4:
				_localctx = new PiNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(PI);
				}
				break;
			case 5:
				_localctx = new ENumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(E);
				}
				break;
			case 6:
				_localctx = new PercentageAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				match(T__21);
				}
				break;
			case 7:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(BOOL);
				}
				break;
			case 8:
				_localctx = new BinaryAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(BINARY);
				}
				break;
			case 9:
				_localctx = new OctalAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				match(OCTAL);
				}
				break;
			case 10:
				_localctx = new HexadecimalAtomContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				match(HEXADECIMAL);
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
			return infixExprBitwise_sempred((InfixExprBitwiseContext)_localctx, predIndex);
		case 9:
			return infixExprLogicPrio1_sempred((InfixExprLogicPrio1Context)_localctx, predIndex);
		case 11:
			return infixExprPrio1_sempred((InfixExprPrio1Context)_localctx, predIndex);
		case 12:
			return infixExprPrio2_sempred((InfixExprPrio2Context)_localctx, predIndex);
		case 13:
			return infixExprPrio3_sempred((InfixExprPrio3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean infixExprBitwise_sempred(InfixExprBitwiseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixExprLogicPrio1_sempred(InfixExprLogicPrio1Context _localctx, int predIndex) {
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
		"\u0004\u0001 \u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00011\b\u0001"+
		"\u000b\u0001\f\u00012\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004O\b\u0004\u000b"+
		"\u0004\f\u0004P\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\br\b\b\n\b\f\bu\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t}\b\t\n\t\f\t\u0080\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u0085"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u008d\b\u000b\n\u000b\f\u000b\u0090\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u009c\b\f\n\f\f\f\u009f\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00a7\b\r\n\r\f\r\u00aa\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c1\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d5\b\u0011\u0001"+
		"\u0011\u0000\u0005\u0010\u0012\u0016\u0018\u001a\u0012\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"\u0000\u0006\u0001\u0000\u0001\u0005\u0001\u0000\t\u000e\u0001\u0000\u000f"+
		"\u0013\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0017"+
		"\u0018\u00e5\u0000\'\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"V\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000"+
		"\u0000\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012"+
		"v\u0001\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u0086"+
		"\u0001\u0000\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u00a0"+
		"\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00c0"+
		"\u0001\u0000\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00d4\u0001"+
		"\u0000\u0000\u0000$(\u0003\u000e\u0007\u0000%(\u0003\u0002\u0001\u0000"+
		"&(\u0003\b\u0004\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0000"+
		"\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000"+
		",-\u0005\u0006\u0000\u0000-0\u0003\u0002\u0001\u0000./\u0005\u0007\u0000"+
		"\u0000/1\u0003\u0002\u0001\u00000.\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0005\b\u0000\u000058\u0001\u0000\u0000\u000068\u0003"+
		"\u0004\u0002\u00007+\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u0000"+
		"8\u0003\u0001\u0000\u0000\u00009=\u0003\u0006\u0003\u0000:=\u0003 \u0010"+
		"\u0000;=\u0003\"\u0011\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<;\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0019\u0000\u0000?@\u0003\u0002\u0001\u0000@A\u0005\b\u0000\u0000AI\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0019\u0000\u0000CD\u0003\u0002\u0001\u0000"+
		"DE\u0005\u0007\u0000\u0000EF\u0003\u0002\u0001\u0000FG\u0005\b\u0000\u0000"+
		"GI\u0001\u0000\u0000\u0000H>\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000"+
		"\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KN\u0003"+
		"\b\u0004\u0000LM\u0005\u0007\u0000\u0000MO\u0003\b\u0004\u0000NL\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000"+
		"ST\u0007\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000UW\u0003\n\u0005\u0000"+
		"VJ\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\t\u0001\u0000\u0000"+
		"\u0000X\\\u0003\f\u0006\u0000Y\\\u0003 \u0010\u0000Z\\\u0003\"\u0011\u0000"+
		"[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u0019\u0000\u0000^_\u0003"+
		"\f\u0006\u0000_`\u0005\b\u0000\u0000`h\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0019\u0000\u0000bc\u0003\f\u0006\u0000cd\u0005\u0007\u0000\u0000de\u0003"+
		"\f\u0006\u0000ef\u0005\b\u0000\u0000fh\u0001\u0000\u0000\u0000g]\u0001"+
		"\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000\u0000"+
		"ij\u0003\u0012\t\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0006\b\uffff"+
		"\uffff\u0000lm\u0003\u0012\t\u0000ms\u0001\u0000\u0000\u0000no\n\u0002"+
		"\u0000\u0000op\u0007\u0001\u0000\u0000pr\u0003\u0012\t\u0000qn\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000t\u0011\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0006\t\uffff\uffff\u0000wx\u0003\u0014\n\u0000x~\u0001\u0000"+
		"\u0000\u0000yz\n\u0002\u0000\u0000z{\u0007\u0002\u0000\u0000{}\u0003\u0014"+
		"\n\u0000|y\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0013\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0014\u0000"+
		"\u0000\u0082\u0085\u0003\u0016\u000b\u0000\u0083\u0085\u0003\u0016\u000b"+
		"\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u000b\uffff"+
		"\uffff\u0000\u0087\u0088\u0003\u0018\f\u0000\u0088\u008e\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\n\u0002\u0000\u0000\u008a\u008b\u0007\u0003\u0000\u0000"+
		"\u008b\u008d\u0003\u0018\f\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0006\f\uffff\uffff\u0000\u0092"+
		"\u0097\u0003\u001a\r\u0000\u0093\u0094\u0003\u001a\r\u0000\u0094\u0095"+
		"\u0003\u001a\r\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0091\u0001"+
		"\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u009d\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\n\u0003\u0000\u0000\u0099\u009a\u0007\u0004"+
		"\u0000\u0000\u009a\u009c\u0003\u001a\r\u0000\u009b\u0098\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0019\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\r\uffff\uffff"+
		"\u0000\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\n\u0002\u0000\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000"+
		"\u00a5\u00a7\u0003\u001c\u000e\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u001b\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0007\u0003\u0000\u0000"+
		"\u00ac\u00b5\u0003\u001c\u000e\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000"+
		"\u00ae\u00af\u0003\u000e\u0007\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b1\u00b5\u0003\u001e\u000f\u0000\u00b2"+
		"\u00b5\u0003 \u0010\u0000\u00b3\u00b5\u0003\"\u0011\u0000\u00b4\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0019\u0000\u0000\u00b7\u00b8\u0003\u000e\u0007\u0000\u00b8\u00b9"+
		"\u0005\b\u0000\u0000\u00b9\u00c1\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0019\u0000\u0000\u00bb\u00bc\u0003\u000e\u0007\u0000\u00bc\u00bd\u0005"+
		"\u0007\u0000\u0000\u00bd\u00be\u0003\u000e\u0007\u0000\u00be\u00bf\u0005"+
		"\b\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000"+
		"\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c1\u001f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00c4\u0007\u0003\u0000"+
		"\u0000\u00c4\u00c5\u0003\"\u0011\u0000\u00c5\u00c6\u0005\u0015\u0000\u0000"+
		"\u00c6!\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007\u0005\u0000\u0000\u00c8"+
		"\u00c9\u0005\u001b\u0000\u0000\u00c9\u00d5\u0007\u0005\u0000\u0000\u00ca"+
		"\u00d5\u0005\u0018\u0000\u0000\u00cb\u00d5\u0005\u0017\u0000\u0000\u00cc"+
		"\u00d5\u0005\u001a\u0000\u0000\u00cd\u00d5\u0005\u001b\u0000\u0000\u00ce"+
		"\u00cf\u0007\u0005\u0000\u0000\u00cf\u00d5\u0005\u0016\u0000\u0000\u00d0"+
		"\u00d5\u0005\u001c\u0000\u0000\u00d1\u00d5\u0005\u001d\u0000\u0000\u00d2"+
		"\u00d5\u0005\u001e\u0000\u0000\u00d3\u00d5\u0005\u001f\u0000\u0000\u00d4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"#\u0001\u0000\u0000\u0000\u0013\'27<HPV[gs~\u0084\u008e\u0096\u009d\u00a8"+
		"\u00b4\u00c0\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}