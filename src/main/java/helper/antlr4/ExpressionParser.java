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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, REAL=9, 
		INTEGER=10, WS=11, FUNCTION=12, PI=13, E=14;
	public static final int
		RULE_expr = 0, RULE_prefixExpr = 1, RULE_postfixExpr = 2, RULE_infixExpr = 3, 
		RULE_term = 4, RULE_factor = 5, RULE_complex = 6, RULE_number = 7, RULE_numberatom = 8, 
		RULE_rational = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "prefixExpr", "postfixExpr", "infixExpr", "term", "factor", "complex", 
			"number", "numberatom", "rational"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "','", "')'", "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "REAL", "INTEGER", 
			"WS", "FUNCTION", "PI", "E"
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
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(20);
				infixExpr(0);
				}
				break;
			case 2:
				{
				setState(21);
				prefixExpr();
				}
				break;
			case 3:
				{
				setState(22);
				postfixExpr(0);
				}
				break;
			}
			setState(25);
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
	public static class PrefixNumberContext extends PrefixExprContext {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public PrefixNumberContext(PrefixExprContext ctx) { copyFrom(ctx); }
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

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prefixExpr);
		int _la;
		try {
			int _alt;
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				match(T__4);
				setState(29);
				prefixExpr();
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(30);
						match(T__5);
						}
					}

					setState(33);
					prefixExpr();
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 26206L) != 0) );
				setState(38);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				prefixExpr();
				setState(43); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(42);
						prefixExpr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(45); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new PrefixNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				complex();
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
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixNumberContext extends PostfixExprContext {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public PostfixNumberContext(PostfixExprContext ctx) { copyFrom(ctx); }
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

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		return postfixExpr(0);
	}

	private PostfixExprContext postfixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, _parentState);
		PostfixExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new PostfixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(T__4);
				setState(52);
				postfixExpr(0);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(53);
						match(T__5);
						}
					}

					setState(56);
					postfixExpr(0);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 26214L) != 0) );
				setState(61);
				match(T__6);
				setState(62);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
			case T__1:
			case REAL:
			case INTEGER:
			case PI:
			case E:
				{
				_localctx = new PostfixNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				complex();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixExpressionContext(new PostfixExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
					setState(67);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(69); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(68);
							postfixExpr(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(71); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(73);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(79);
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
	public static class InfixExprContext extends ParserRuleContext {
		public InfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpr; }
	 
		public InfixExprContext() { }
		public void copyFrom(InfixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTermContext extends InfixExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SingleTermContext(InfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterSingleTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitSingleTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSingleTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionAddSubContext extends InfixExprContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public InfixExpressionAddSubContext(InfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpressionAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpressionAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpressionAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprContext infixExpr() throws RecognitionException {
		return infixExpr(0);
	}

	private InfixExprContext infixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprContext _localctx = new InfixExprContext(_ctx, _parentState);
		InfixExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_infixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(81);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExpressionAddSubContext(new InfixExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(85);
					term(0);
					}
					} 
				}
				setState(90);
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionImplicitMulContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public InfixExpressionImplicitMulContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpressionImplicitMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpressionImplicitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpressionImplicitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionMulDivContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public InfixExpressionMulDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpressionMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpressionMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpressionMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SingleFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterSingleFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitSingleFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSingleFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new SingleFactorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92);
				factor();
				}
				break;
			case 2:
				{
				_localctx = new InfixExpressionImplicitMulContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				factor();
				setState(94);
				factor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExpressionMulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(98);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(99);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(100);
					factor();
					}
					} 
				}
				setState(105);
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumberContext extends FactorContext {
		public ComplexContext complex() {
			return getRuleContext(ComplexContext.class,0);
		}
		public FactorNumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFactorNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFactorNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFactorNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryFunctionContext extends FactorContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public UnaryFunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterUnaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitUnaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitUnaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryFunctionContext extends FactorContext {
		public TerminalNode FUNCTION() { return getToken(ExpressionParser.FUNCTION, 0); }
		public List<InfixExprContext> infixExpr() {
			return getRuleContexts(InfixExprContext.class);
		}
		public InfixExprContext infixExpr(int i) {
			return getRuleContext(InfixExprContext.class,i);
		}
		public BinaryFunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBinaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBinaryFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBinaryFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionWithParenthesisContext extends FactorContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public InfixExpressionWithParenthesisContext(FactorContext ctx) { copyFrom(ctx); }
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
	public static class InfixExpressionNegateContext extends FactorContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public InfixExpressionNegateContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExpressionNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExpressionNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExpressionNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new InfixExpressionWithParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__4);
				setState(107);
				infixExpr(0);
				setState(108);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new InfixExpressionNegateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__1);
				setState(111);
				match(T__4);
				setState(112);
				infixExpr(0);
				setState(113);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new FactorNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				complex();
				}
				break;
			case 4:
				_localctx = new UnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(FUNCTION);
				setState(117);
				infixExpr(0);
				setState(118);
				match(T__6);
				}
				break;
			case 5:
				_localctx = new BinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(FUNCTION);
				setState(121);
				infixExpr(0);
				setState(122);
				match(T__5);
				setState(123);
				infixExpr(0);
				setState(124);
				match(T__6);
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
	public static class NotComplexContext extends ComplexContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NotComplexContext(ComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNotComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNotComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNotComplex(this);
			else return visitor.visitChildren(this);
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
		enterRule(_localctx, 12, RULE_complex);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ComplexAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				number();
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				number();
				setState(131);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new NotComplexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
	public static class SimpleAtomContext extends NumberContext {
		public NumberatomContext numberatom() {
			return getRuleContext(NumberatomContext.class,0);
		}
		public SimpleAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterSimpleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitSimpleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSimpleAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		int _la;
		try {
			_localctx = new SimpleAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(139);
			numberatom(0);
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
	public static class NumberatomContext extends ParserRuleContext {
		public NumberatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberatom; }
	 
		public NumberatomContext() { }
		public void copyFrom(NumberatomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntergerAtomContext extends NumberatomContext {
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
		public IntergerAtomContext(NumberatomContext ctx) { copyFrom(ctx); }
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
	public static class RealAtomContext extends NumberatomContext {
		public TerminalNode REAL() { return getToken(ExpressionParser.REAL, 0); }
		public RealAtomContext(NumberatomContext ctx) { copyFrom(ctx); }
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
	public static class ENumberContext extends NumberatomContext {
		public TerminalNode E() { return getToken(ExpressionParser.E, 0); }
		public ENumberContext(NumberatomContext ctx) { copyFrom(ctx); }
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
	public static class PiNumberContext extends NumberatomContext {
		public TerminalNode PI() { return getToken(ExpressionParser.PI, 0); }
		public PiNumberContext(NumberatomContext ctx) { copyFrom(ctx); }
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
	public static class ScientificAtomContext extends NumberatomContext {
		public NumberatomContext numberatom() {
			return getRuleContext(NumberatomContext.class,0);
		}
		public TerminalNode E() { return getToken(ExpressionParser.E, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ScientificAtomContext(NumberatomContext ctx) { copyFrom(ctx); }
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
	public static class RationalNumberContext extends NumberatomContext {
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public RationalNumberContext(NumberatomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRationalNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRationalNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitRationalNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberatomContext numberatom() throws RecognitionException {
		return numberatom(0);
	}

	private NumberatomContext numberatom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumberatomContext _localctx = new NumberatomContext(_ctx, _parentState);
		NumberatomContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_numberatom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new RationalNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				rational();
				}
				break;
			case 2:
				{
				_localctx = new IntergerAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(INTEGER);
				}
				break;
			case 3:
				{
				_localctx = new RealAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(REAL);
				}
				break;
			case 4:
				{
				_localctx = new PiNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(PI);
				}
				break;
			case 5:
				{
				_localctx = new ENumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(E);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ScientificAtomContext(new NumberatomContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_numberatom);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					match(E);
					setState(151);
					number();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class RationalContext extends ParserRuleContext {
		public RationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational; }
	 
		public RationalContext() { }
		public void copyFrom(RationalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RationalAtomContext extends RationalContext {
		public List<TerminalNode> INTEGER() { return getTokens(ExpressionParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ExpressionParser.INTEGER, i);
		}
		public RationalAtomContext(RationalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRationalAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRationalAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitRationalAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalContext rational() throws RecognitionException {
		RationalContext _localctx = new RationalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rational);
		try {
			_localctx = new RationalAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(INTEGER);
			setState(158);
			match(T__3);
			setState(159);
			match(INTEGER);
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
		case 2:
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
		case 3:
			return infixExpr_sempred((InfixExprContext)_localctx, predIndex);
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		case 8:
			return numberatom_sempred((NumberatomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpr_sempred(PostfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean infixExpr_sempred(InfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean numberatom_sempred(NumberatomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0018\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0004\u0001#\b\u0001"+
		"\u000b\u0001\f\u0001$\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001,\b\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0003"+
		"\u00011\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00027\b\u0002\u0001\u0002\u0004\u0002:\b\u0002\u000b\u0002\f\u0002;"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001"+
		"\u0002\u0001\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u007f\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006\u0001"+
		"\u0007\u0003\u0007\u008a\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0094\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0099\b\b\n\b\f\b\u009c\t\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0000\u0004\u0004\u0006\b\u0010\n\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u0001\u0004\u0001\u0000\u0001"+
		"\u0002\u0001\u0000\u0003\u0004\u00b1\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u00020\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000"+
		"\u0000\f\u0086\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000"+
		"\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000"+
		"\u0014\u0018\u0003\u0006\u0003\u0000\u0015\u0018\u0003\u0002\u0001\u0000"+
		"\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0014\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0000\u0000\u0001"+
		"\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000"+
		"\u001c\u001d\u0005\u0005\u0000\u0000\u001d\"\u0003\u0002\u0001\u0000\u001e"+
		" \u0005\u0006\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0003\u0002\u0001\u0000"+
		"\"\u001f\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0007\u0000\u0000\'1\u0001\u0000\u0000\u0000()\u0007\u0000\u0000\u0000"+
		")+\u0003\u0002\u0001\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/1\u0003\f\u0006\u00000\u001b\u0001"+
		"\u0000\u0000\u00000(\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"1\u0003\u0001\u0000\u0000\u000023\u0006\u0002\uffff\uffff\u000034\u0005"+
		"\u0005\u0000\u000049\u0003\u0004\u0002\u000057\u0005\u0006\u0000\u0000"+
		"65\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0003\u0004\u0002\u000096\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0007\u0000\u0000>?\u0007\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@B\u0003\f\u0006\u0000A2\u0001\u0000\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000BM\u0001\u0000\u0000\u0000CE\n\u0002\u0000\u0000"+
		"DF\u0003\u0004\u0002\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0007\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KC\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0006\u0003\uffff\uffff\u0000QR\u0003\b\u0004\u0000RX\u0001"+
		"\u0000\u0000\u0000ST\n\u0002\u0000\u0000TU\u0007\u0001\u0000\u0000UW\u0003"+
		"\b\u0004\u0000VS\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0006\u0004\uffff\uffff\u0000\\a\u0003"+
		"\n\u0005\u0000]^\u0003\n\u0005\u0000^_\u0003\n\u0005\u0000_a\u0001\u0000"+
		"\u0000\u0000`[\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ag\u0001"+
		"\u0000\u0000\u0000bc\n\u0003\u0000\u0000cd\u0007\u0002\u0000\u0000df\u0003"+
		"\n\u0005\u0000eb\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jk\u0005\u0005\u0000\u0000kl\u0003\u0006\u0003"+
		"\u0000lm\u0005\u0007\u0000\u0000m\u007f\u0001\u0000\u0000\u0000no\u0005"+
		"\u0002\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0003\u0006\u0003\u0000"+
		"qr\u0005\u0007\u0000\u0000r\u007f\u0001\u0000\u0000\u0000s\u007f\u0003"+
		"\f\u0006\u0000tu\u0005\f\u0000\u0000uv\u0003\u0006\u0003\u0000vw\u0005"+
		"\u0007\u0000\u0000w\u007f\u0001\u0000\u0000\u0000xy\u0005\f\u0000\u0000"+
		"yz\u0003\u0006\u0003\u0000z{\u0005\u0006\u0000\u0000{|\u0003\u0006\u0003"+
		"\u0000|}\u0005\u0007\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~j\u0001"+
		"\u0000\u0000\u0000~n\u0001\u0000\u0000\u0000~s\u0001\u0000\u0000\u0000"+
		"~t\u0001\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000\u007f\u000b\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081\u0082\u0007"+
		"\u0001\u0000\u0000\u0082\u0083\u0003\u000e\u0007\u0000\u0083\u0084\u0005"+
		"\b\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u000e"+
		"\u0007\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0001\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0010\b\u0000"+
		"\u008c\u000f\u0001\u0000\u0000\u0000\u008d\u008e\u0006\b\uffff\uffff\u0000"+
		"\u008e\u0094\u0003\u0012\t\u0000\u008f\u0094\u0005\n\u0000\u0000\u0090"+
		"\u0094\u0005\t\u0000\u0000\u0091\u0094\u0005\r\u0000\u0000\u0092\u0094"+
		"\u0005\u000e\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u008f"+
		"\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u009a"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\n\u0001\u0000\u0000\u0096\u0097\u0005"+
		"\u000e\u0000\u0000\u0097\u0099\u0003\u000e\u0007\u0000\u0098\u0095\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0011\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\n\u0000\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a0\u0005\n"+
		"\u0000\u0000\u00a0\u0013\u0001\u0000\u0000\u0000\u0012\u0017\u001f$-0"+
		"6;AGMX`g~\u0086\u0089\u0093\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}