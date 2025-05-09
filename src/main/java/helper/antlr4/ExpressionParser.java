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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7, WS=8;
	public static final int
		RULE_expr = 0, RULE_prefixExpr = 1, RULE_postfixExpr = 2, RULE_infixExpr = 3, 
		RULE_term = 4, RULE_implicitMul = 5, RULE_factor = 6, RULE_number = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "prefixExpr", "postfixExpr", "infixExpr", "term", "implicitMul", 
			"factor", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUMBER", "WS"
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
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(16);
				prefixExpr();
				}
				break;
			case 2:
				{
				setState(17);
				postfixExpr(0);
				}
				break;
			case 3:
				{
				setState(18);
				infixExpr(0);
				}
				break;
			}
			setState(21);
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
	public static class PrefixOperationWithParenthesisContext extends PrefixExprContext {
		public List<PrefixExprContext> prefixExpr() {
			return getRuleContexts(PrefixExprContext.class);
		}
		public PrefixExprContext prefixExpr(int i) {
			return getRuleContext(PrefixExprContext.class,i);
		}
		public PrefixOperationWithParenthesisContext(PrefixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixOperationWithParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixOperationWithParenthesis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixOperationContext extends PrefixExprContext {
		public List<PrefixExprContext> prefixExpr() {
			return getRuleContexts(PrefixExprContext.class);
		}
		public PrefixExprContext prefixExpr(int i) {
			return getRuleContext(PrefixExprContext.class,i);
		}
		public PrefixOperationContext(PrefixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrefixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrefixOperation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixNumberContext extends PrefixExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prefixExpr);
		int _la;
		try {
			int _alt;
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PrefixOperationWithParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(24);
				match(T__4);
				setState(25);
				prefixExpr();
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26);
					prefixExpr();
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 158L) != 0) );
				setState(31);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new PrefixOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				prefixExpr();
				setState(36); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(35);
						prefixExpr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(38); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new PrefixNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
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
	public static class PostfixOperationContext extends PostfixExprContext {
		public List<PostfixExprContext> postfixExpr() {
			return getRuleContexts(PostfixExprContext.class);
		}
		public PostfixExprContext postfixExpr(int i) {
			return getRuleContext(PostfixExprContext.class,i);
		}
		public PostfixOperationContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixOperation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixNumberContext extends PostfixExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixOperationWithParenthesisContext extends PostfixExprContext {
		public List<PostfixExprContext> postfixExpr() {
			return getRuleContexts(PostfixExprContext.class);
		}
		public PostfixExprContext postfixExpr(int i) {
			return getRuleContext(PostfixExprContext.class,i);
		}
		public PostfixOperationWithParenthesisContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPostfixOperationWithParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPostfixOperationWithParenthesis(this);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new PostfixOperationWithParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(T__4);
				setState(45);
				postfixExpr(0);
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					postfixExpr(0);
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 164L) != 0) );
				setState(51);
				match(T__5);
				setState(52);
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
			case NUMBER:
				{
				_localctx = new PostfixNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixOperationContext(new PostfixExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
					setState(57);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(59); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(58);
							postfixExpr(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(61); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(63);
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
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends InfixExprContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddSubContext(InfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAddSub(this);
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

			setState(71);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new InfixExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(75);
					term(0);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class MulDivContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMulDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImplicitMultiplicationContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public ImplicitMulContext implicitMul() {
			return getRuleContext(ImplicitMulContext.class,0);
		}
		public ImplicitMultiplicationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterImplicitMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitImplicitMultiplication(this);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new SingleFactorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				factor();
				}
				break;
			case 2:
				{
				_localctx = new ImplicitMultiplicationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				factor();
				setState(84);
				implicitMul();
				setState(85);
				factor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(89);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(90);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(91);
					factor();
					}
					} 
				}
				setState(96);
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
	public static class ParenthesizedExpressionContext extends FactorContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public ParenthesizedExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitParenthesizedExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberFactorContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNumberFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNumberFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case NUMBER:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				number();
				}
				break;
			case T__4:
				_localctx = new ParenthesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__4);
				setState(101);
				infixExpr(0);
				setState(102);
				match(T__5);
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
	public static class SignedNumberContext extends NumberContext {
		public TerminalNode NUMBER() { return getToken(ExpressionParser.NUMBER, 0); }
		public SignedNumberContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitSignedNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		int _la;
		try {
			_localctx = new SignedNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(106);
				match(T__1);
				}
			}

			setState(109);
			match(NUMBER);
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
		"\u0004\u0001\bp\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001c"+
		"\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001%\b\u0001\u000b\u0001\f\u0001&\u0001"+
		"\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u00020\b\u0002\u000b\u0002\f\u00021\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002<\b\u0002\u000b\u0002\f\u0002=\u0001\u0002\u0001\u0002\u0005"+
		"\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003"+
		"\f\u0003P\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004]\b\u0004\n\u0004\f\u0004`\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006i\b\u0006\u0001\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0000\u0003\u0004\u0006\b\b\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0000\u0003\u0001\u0000\u0001\u0004\u0001\u0000\u0001\u0002\u0001"+
		"\u0000\u0003\u0004v\u0000\u0013\u0001\u0000\u0000\u0000\u0002)\u0001\u0000"+
		"\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000"+
		"\bW\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fh\u0001\u0000"+
		"\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010\u0014\u0003\u0002\u0001"+
		"\u0000\u0011\u0014\u0003\u0004\u0002\u0000\u0012\u0014\u0003\u0006\u0003"+
		"\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0019\u0005\u0005\u0000"+
		"\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u001c\u0003\u0002\u0001"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0006\u0000\u0000"+
		" *\u0001\u0000\u0000\u0000!\"\u0007\u0000\u0000\u0000\"$\u0003\u0002\u0001"+
		"\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'*\u0001"+
		"\u0000\u0000\u0000(*\u0003\u000e\u0007\u0000)\u0017\u0001\u0000\u0000"+
		"\u0000)!\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+,\u0006\u0002\uffff\uffff\u0000,-\u0005\u0005\u0000"+
		"\u0000-/\u0003\u0004\u0002\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0006\u0000\u0000"+
		"45\u0007\u0000\u0000\u000058\u0001\u0000\u0000\u000068\u0003\u000e\u0007"+
		"\u00007+\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008C\u0001\u0000"+
		"\u0000\u00009;\n\u0002\u0000\u0000:<\u0003\u0004\u0002\u0000;:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0007\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0006\u0003\uffff\uffff"+
		"\u0000GH\u0003\b\u0004\u0000HN\u0001\u0000\u0000\u0000IJ\n\u0002\u0000"+
		"\u0000JK\u0007\u0001\u0000\u0000KM\u0003\b\u0004\u0000LI\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QR\u0006\u0004\uffff\uffff\u0000RX\u0003\f\u0006\u0000ST\u0003\f\u0006"+
		"\u0000TU\u0003\n\u0005\u0000UV\u0003\f\u0006\u0000VX\u0001\u0000\u0000"+
		"\u0000WQ\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000X^\u0001\u0000"+
		"\u0000\u0000YZ\n\u0003\u0000\u0000Z[\u0007\u0002\u0000\u0000[]\u0003\f"+
		"\u0006\u0000\\Y\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\t\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000b\u0001\u0000"+
		"\u0000\u0000ci\u0003\u000e\u0007\u0000de\u0005\u0005\u0000\u0000ef\u0003"+
		"\u0006\u0003\u0000fg\u0005\u0006\u0000\u0000gi\u0001\u0000\u0000\u0000"+
		"hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000i\r\u0001\u0000\u0000"+
		"\u0000jl\u0005\u0002\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u0007\u0000\u0000n\u000f"+
		"\u0001\u0000\u0000\u0000\r\u0013\u001d&)17=CNW^hk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}