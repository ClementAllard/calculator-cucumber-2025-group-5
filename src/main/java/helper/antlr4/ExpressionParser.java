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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BOOL=7, BINARY=8, OCTAL=9, 
		HEXA=10, NUMBER=11, AND=12, OR=13, NOT=14, XOR=15, IMPLIES=16, EQUIV=17, 
		SHIFT_LEFT=18, SHIFT_RIGHT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, WS=23;
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
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, null, null, null, 
			null, "'and'", "'or'", "'not'", "'xor'", "'=>'", "'<=>'", "'<<'", "'>>'", 
			"'&'", "'|'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BOOL", "BINARY", "OCTAL", 
			"HEXA", "NUMBER", "AND", "OR", "NOT", "XOR", "IMPLIES", "EQUIV", "SHIFT_LEFT", 
			"SHIFT_RIGHT", "BIT_AND", "BIT_OR", "BIT_XOR", "WS"
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
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ExpressionParser.XOR, 0); }
		public TerminalNode IMPLIES() { return getToken(ExpressionParser.IMPLIES, 0); }
		public TerminalNode EQUIV() { return getToken(ExpressionParser.EQUIV, 0); }
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
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
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ExpressionParser.XOR, 0); }
		public TerminalNode IMPLIES() { return getToken(ExpressionParser.IMPLIES, 0); }
		public TerminalNode EQUIV() { return getToken(ExpressionParser.EQUIV, 0); }
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258078L) != 0)) ) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 261918L) != 0) );
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258078L) != 0)) ) {
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
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ExpressionParser.XOR, 0); }
		public TerminalNode IMPLIES() { return getToken(ExpressionParser.IMPLIES, 0); }
		public TerminalNode EQUIV() { return getToken(ExpressionParser.EQUIV, 0); }
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
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
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ExpressionParser.XOR, 0); }
		public TerminalNode IMPLIES() { return getToken(ExpressionParser.IMPLIES, 0); }
		public TerminalNode EQUIV() { return getToken(ExpressionParser.EQUIV, 0); }
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3876L) != 0) );
				setState(51);
				match(T__5);
				setState(52);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258078L) != 0)) ) {
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
			case BINARY:
			case OCTAL:
			case HEXA:
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
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258078L) != 0)) ) {
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
	public static class BitwiseOpContext extends InfixExprContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(ExpressionParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(ExpressionParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(ExpressionParser.BIT_XOR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(ExpressionParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(ExpressionParser.SHIFT_RIGHT, 0); }
		public BitwiseOpContext(InfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBitwiseOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBitwiseOp(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOpContext extends InfixExprContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ExpressionParser.XOR, 0); }
		public TerminalNode IMPLIES() { return getToken(ExpressionParser.IMPLIES, 0); }
		public TerminalNode EQUIV() { return getToken(ExpressionParser.EQUIV, 0); }
		public LogicalOpContext(InfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitLogicalOp(this);
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
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubContext(new InfixExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
						setState(73);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
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
						break;
					case 2:
						{
						_localctx = new LogicalOpContext(new InfixExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
						setState(76);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(77);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 241664L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new BitwiseOpContext(new InfixExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
						setState(79);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(80);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						term(0);
						}
						break;
					}
					} 
				}
				setState(86);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new SingleFactorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				factor();
				}
				break;
			case 2:
				{
				_localctx = new ImplicitMultiplicationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				factor();
				setState(90);
				implicitMul();
				setState(91);
				factor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(95);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(97);
					factor();
					}
					} 
				}
				setState(102);
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
	public static class NotFactorContext extends FactorContext {
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NotFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterNotFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitNotFactor(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFactorContext extends FactorContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public BoolFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBoolFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBoolFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NOT);
				setState(106);
				factor();
				}
				break;
			case T__1:
			case BINARY:
			case OCTAL:
			case HEXA:
			case NUMBER:
				_localctx = new NumberFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				number();
				}
				break;
			case BOOL:
				_localctx = new BoolFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(BOOL);
				}
				break;
			case T__4:
				_localctx = new ParenthesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(T__4);
				setState(110);
				infixExpr(0);
				setState(111);
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
	public static class BinaryNumberContext extends NumberContext {
		public TerminalNode BINARY() { return getToken(ExpressionParser.BINARY, 0); }
		public BinaryNumberContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBinaryNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBinaryNumber(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class OctalNumberContext extends NumberContext {
		public TerminalNode OCTAL() { return getToken(ExpressionParser.OCTAL, 0); }
		public OctalNumberContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterOctalNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitOctalNumber(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalNumberContext extends NumberContext {
		public TerminalNode HEXA() { return getToken(ExpressionParser.HEXA, 0); }
		public HexadecimalNumberContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterHexadecimalNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitHexadecimalNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case NUMBER:
				_localctx = new SignedNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(115);
					match(T__1);
					}
				}

				setState(118);
				match(NUMBER);
				}
				break;
			case BINARY:
				_localctx = new BinaryNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(BINARY);
				}
				break;
			case OCTAL:
				_localctx = new OctalNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(OCTAL);
				}
				break;
			case HEXA:
				_localctx = new HexadecimalNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(HEXA);
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
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003S\b\u0003\n\u0003"+
		"\f\u0003V\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004c\b\u0004\n\u0004\f\u0004f\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006r\b\u0006\u0001\u0007\u0003"+
		"\u0007u\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007{\b\u0007\u0001\u0007\u0000\u0003\u0004\u0006\b\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0005\u0002\u0000\u0001\u0004\f\u0011\u0001\u0000"+
		"\u0001\u0002\u0002\u0000\f\r\u000f\u0011\u0001\u0000\u0012\u0016\u0001"+
		"\u0000\u0003\u0004\u008a\u0000\u0013\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000"+
		"\u0000\b]\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fq\u0001"+
		"\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u0014\u0003\u0002"+
		"\u0001\u0000\u0011\u0014\u0003\u0004\u0002\u0000\u0012\u0014\u0003\u0006"+
		"\u0003\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0019\u0005\u0005"+
		"\u0000\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u001c\u0003\u0002"+
		"\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0006\u0000"+
		"\u0000 *\u0001\u0000\u0000\u0000!\"\u0007\u0000\u0000\u0000\"$\u0003\u0002"+
		"\u0001\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(*\u0003\u000e\u0007\u0000)\u0017\u0001\u0000"+
		"\u0000\u0000)!\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003"+
		"\u0001\u0000\u0000\u0000+,\u0006\u0002\uffff\uffff\u0000,-\u0005\u0005"+
		"\u0000\u0000-/\u0003\u0004\u0002\u0000.0\u0003\u0004\u0002\u0000/.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0006\u0000"+
		"\u000045\u0007\u0000\u0000\u000058\u0001\u0000\u0000\u000068\u0003\u000e"+
		"\u0007\u00007+\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008C\u0001"+
		"\u0000\u0000\u00009;\n\u0002\u0000\u0000:<\u0003\u0004\u0002\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0007\u0000\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000\u0000BE\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005"+
		"\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0006\u0003\uffff"+
		"\uffff\u0000GH\u0003\b\u0004\u0000HT\u0001\u0000\u0000\u0000IJ\n\u0004"+
		"\u0000\u0000JK\u0007\u0001\u0000\u0000KS\u0003\b\u0004\u0000LM\n\u0003"+
		"\u0000\u0000MN\u0007\u0002\u0000\u0000NS\u0003\b\u0004\u0000OP\n\u0002"+
		"\u0000\u0000PQ\u0007\u0003\u0000\u0000QS\u0003\b\u0004\u0000RI\u0001\u0000"+
		"\u0000\u0000RL\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000SV\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"U\u0007\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0006\u0004"+
		"\uffff\uffff\u0000X^\u0003\f\u0006\u0000YZ\u0003\f\u0006\u0000Z[\u0003"+
		"\n\u0005\u0000[\\\u0003\f\u0006\u0000\\^\u0001\u0000\u0000\u0000]W\u0001"+
		"\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000^d\u0001\u0000\u0000\u0000"+
		"_`\n\u0003\u0000\u0000`a\u0007\u0004\u0000\u0000ac\u0003\f\u0006\u0000"+
		"b_\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u000b\u0001\u0000\u0000\u0000"+
		"ij\u0005\u000e\u0000\u0000jr\u0003\f\u0006\u0000kr\u0003\u000e\u0007\u0000"+
		"lr\u0005\u0007\u0000\u0000mn\u0005\u0005\u0000\u0000no\u0003\u0006\u0003"+
		"\u0000op\u0005\u0006\u0000\u0000pr\u0001\u0000\u0000\u0000qi\u0001\u0000"+
		"\u0000\u0000qk\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000qm\u0001"+
		"\u0000\u0000\u0000r\r\u0001\u0000\u0000\u0000su\u0005\u0002\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v{\u0005\u000b\u0000\u0000w{\u0005\b\u0000\u0000x{\u0005\t\u0000"+
		"\u0000y{\u0005\n\u0000\u0000zt\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u000f\u0001"+
		"\u0000\u0000\u0000\u000f\u0013\u001d&)17=CRT]dqtz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}