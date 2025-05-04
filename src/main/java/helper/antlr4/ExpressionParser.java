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
		INTEGER=10, WS=11;
	public static final int
		RULE_expr = 0, RULE_prefixExpr = 1, RULE_postfixExpr = 2, RULE_infixExpr = 3, 
		RULE_term = 4, RULE_implicitMul = 5, RULE_factor = 6, RULE_complex = 7, 
		RULE_negatenumber = 8, RULE_number = 9, RULE_rational = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "prefixExpr", "postfixExpr", "infixExpr", "term", "implicitMul", 
			"factor", "complex", "negatenumber", "number", "rational"
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
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(22);
				infixExpr(0);
				}
				break;
			case 2:
				{
				setState(23);
				prefixExpr();
				}
				break;
			case 3:
				{
				setState(24);
				postfixExpr(0);
				}
				break;
			}
			setState(27);
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(30);
				match(T__4);
				setState(31);
				prefixExpr();
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(32);
						match(T__5);
						}
					}

					setState(35);
					prefixExpr();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1630L) != 0) );
				setState(40);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				prefixExpr();
				setState(45); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(44);
						prefixExpr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(47); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new PrefixNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new PostfixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(T__4);
				setState(54);
				postfixExpr(0);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(55);
						match(T__5);
						}
					}

					setState(58);
					postfixExpr(0);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1636L) != 0) );
				setState(63);
				match(T__6);
				setState(64);
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
			case T__1:
			case REAL:
			case INTEGER:
				{
				_localctx = new PostfixNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				complex();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
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
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(71); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(70);
							postfixExpr(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(73); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(75);
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
				setState(81);
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

			setState(83);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
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
					setState(85);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(86);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(87);
					term(0);
					}
					} 
				}
				setState(92);
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
		public ImplicitMulContext implicitMul() {
			return getRuleContext(ImplicitMulContext.class,0);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new SingleFactorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(94);
				factor();
				}
				break;
			case 2:
				{
				_localctx = new InfixExpressionImplicitMulContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				factor();
				setState(96);
				implicitMul();
				setState(97);
				factor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
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
					setState(101);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(102);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(103);
					factor();
					}
					} 
				}
				setState(108);
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
	public static class ImplicitMulContext extends ParserRuleContext {
		public ImplicitMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitMul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterImplicitMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitImplicitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitImplicitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitMulContext implicitMul() throws RecognitionException {
		ImplicitMulContext _localctx = new ImplicitMulContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_implicitMul);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new InfixExpressionWithParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__4);
				setState(112);
				infixExpr(0);
				setState(113);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new InfixExpressionNegateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__1);
				setState(116);
				match(T__4);
				setState(117);
				infixExpr(0);
				setState(118);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new FactorNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
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
		public NegatenumberContext negatenumber() {
			return getRuleContext(NegatenumberContext.class,0);
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
		public List<NegatenumberContext> negatenumber() {
			return getRuleContexts(NegatenumberContext.class);
		}
		public NegatenumberContext negatenumber(int i) {
			return getRuleContext(NegatenumberContext.class,i);
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
		enterRule(_localctx, 14, RULE_complex);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ComplexAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				negatenumber();
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				negatenumber();
				setState(126);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new NotComplexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				negatenumber();
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
	public static class NegatenumberContext extends ParserRuleContext {
		public NegatenumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatenumber; }
	 
		public NegatenumberContext() { }
		public void copyFrom(NegatenumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateAtomContext extends NegatenumberContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NegateAtomContext(NegatenumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNegateAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNegateAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNegateAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAtomContext extends NegatenumberContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SimpleAtomContext(NegatenumberContext ctx) { copyFrom(ctx); }
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

	public final NegatenumberContext negatenumber() throws RecognitionException {
		NegatenumberContext _localctx = new NegatenumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_negatenumber);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new NegateAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__1);
				setState(132);
				number();
				}
				break;
			case REAL:
			case INTEGER:
				_localctx = new SimpleAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				number();
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
	public static class RationalNumberContext extends NumberContext {
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public RationalNumberContext(NumberContext ctx) { copyFrom(ctx); }
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

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new RationalNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				rational();
				}
				break;
			case 2:
				_localctx = new IntergerAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(INTEGER);
				}
				break;
			case 3:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(REAL);
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
		enterRule(_localctx, 20, RULE_rational);
		try {
			_localctx = new RationalAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(INTEGER);
			setState(142);
			match(T__3);
			setState(143);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b\u0092\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001"+
		"\u0004\u0001%\b\u0001\u000b\u0001\f\u0001&\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001"+
		"/\u0001\u0001\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0004\u0002<\b\u0002\u000b"+
		"\u0002\f\u0002=\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002D\b\u0002\u0001\u0002\u0001\u0002\u0004\u0002H\b\u0002\u000b\u0002"+
		"\f\u0002I\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002"+
		"Q\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004i\b\u0004\n\u0004"+
		"\f\u0004l\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u008c"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0003\u0004\u0006\b"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003"+
		"\u0001\u0000\u0001\u0004\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004"+
		"\u009b\u0000\u0019\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000"+
		"\u0004C\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bc\u0001"+
		"\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000"+
		"\u000e\u0081\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000"+
		"\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000\u0000\u0000"+
		"\u0016\u001a\u0003\u0006\u0003\u0000\u0017\u001a\u0003\u0002\u0001\u0000"+
		"\u0018\u001a\u0003\u0004\u0002\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001"+
		"\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0007\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0005\u0000\u0000\u001f$\u0003\u0002\u0001\u0000 \""+
		"\u0005\u0006\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#%\u0003\u0002\u0001\u0000$!\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0007\u0000\u0000"+
		")3\u0001\u0000\u0000\u0000*+\u0007\u0000\u0000\u0000+-\u0003\u0002\u0001"+
		"\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u000013\u0003\u000e\u0007\u00002\u001d\u0001\u0000\u0000"+
		"\u00002*\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001"+
		"\u0000\u0000\u000045\u0006\u0002\uffff\uffff\u000056\u0005\u0005\u0000"+
		"\u00006;\u0003\u0004\u0002\u000079\u0005\u0006\u0000\u000087\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0003"+
		"\u0004\u0002\u0000;8\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0007\u0000\u0000@A\u0007\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000BD\u0003\u000e\u0007\u0000C4\u0001\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000DO\u0001\u0000\u0000\u0000EG\n\u0002\u0000\u0000FH\u0003"+
		"\u0004\u0002\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0007\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000ME\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0006\u0003\uffff\uffff\u0000ST\u0003\b\u0004\u0000TZ\u0001\u0000"+
		"\u0000\u0000UV\n\u0002\u0000\u0000VW\u0007\u0001\u0000\u0000WY\u0003\b"+
		"\u0004\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0007\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0006\u0004\uffff\uffff\u0000^d\u0003"+
		"\f\u0006\u0000_`\u0003\f\u0006\u0000`a\u0003\n\u0005\u0000ab\u0003\f\u0006"+
		"\u0000bd\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000c_\u0001\u0000"+
		"\u0000\u0000dj\u0001\u0000\u0000\u0000ef\n\u0003\u0000\u0000fg\u0007\u0002"+
		"\u0000\u0000gi\u0003\f\u0006\u0000he\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\t\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u000b\u0001\u0000\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0003\u0006"+
		"\u0003\u0000qr\u0005\u0007\u0000\u0000rz\u0001\u0000\u0000\u0000st\u0005"+
		"\u0002\u0000\u0000tu\u0005\u0005\u0000\u0000uv\u0003\u0006\u0003\u0000"+
		"vw\u0005\u0007\u0000\u0000wz\u0001\u0000\u0000\u0000xz\u0003\u000e\u0007"+
		"\u0000yo\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z\r\u0001\u0000\u0000\u0000{|\u0003\u0010\b\u0000|}\u0007"+
		"\u0001\u0000\u0000}~\u0003\u0010\b\u0000~\u007f\u0005\b\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0010\b\u0000\u0081{"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u000f"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u0087"+
		"\u0003\u0012\t\u0000\u0085\u0087\u0003\u0012\t\u0000\u0086\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0011\u0001"+
		"\u0000\u0000\u0000\u0088\u008c\u0003\u0014\n\u0000\u0089\u008c\u0005\n"+
		"\u0000\u0000\u008a\u008c\u0005\t\u0000\u0000\u008b\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000"+
		"\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0005\n\u0000\u0000\u0090"+
		"\u0015\u0001\u0000\u0000\u0000\u0011\u0019!&/28=CIOZcjy\u0081\u0086\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}