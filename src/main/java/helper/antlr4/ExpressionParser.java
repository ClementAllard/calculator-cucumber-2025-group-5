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
		T__17=18, T__18=19, T__19=20, REAL=21, INTEGER=22, FUNCTION=23, PI=24, 
		E=25, NOT=26, AND=27, NAND=28, NOR=29, XOR=30, OR=31, BOOL=32, BASE_INTEGER=33, 
		CONST=34, WS=35;
	public static final int
		RULE_expr = 0, RULE_prefixExpr = 1, RULE_prefixNumber = 2, RULE_prefixfonction = 3, 
		RULE_postfixExpr = 4, RULE_postfixNumber = 5, RULE_postfixfonction = 6, 
		RULE_infixExpr = 7, RULE_infixExprBitwisePrio1 = 8, RULE_infixExprBitwisePrio2 = 9, 
		RULE_infixExprBitwisePrio3 = 10, RULE_infixExprLogicPrio1 = 11, RULE_infixExprLogicPrio2 = 12, 
		RULE_infixExprPrio1 = 13, RULE_infixExprPrio2 = 14, RULE_infixExprPrio3 = 15, 
		RULE_infixExprPrio4 = 16, RULE_infixfunction = 17, RULE_complex = 18, 
		RULE_number = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "prefixExpr", "prefixNumber", "prefixfonction", "postfixExpr", 
			"postfixNumber", "postfixfonction", "infixExpr", "infixExprBitwisePrio1", 
			"infixExprBitwisePrio2", "infixExprBitwisePrio3", "infixExprLogicPrio1", 
			"infixExprLogicPrio2", "infixExprPrio1", "infixExprPrio2", "infixExprPrio3", 
			"infixExprPrio4", "infixfunction", "complex", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "','", "')'", "'&'", 
			"'~&'", "'~|'", "'^^'", "'|'", "'~'", "'<<'", "'>>'", "'=>'", "'<=>'", 
			"'i'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "REAL", "INTEGER", 
			"FUNCTION", "PI", "E", "NOT", "AND", "NAND", "NOR", "XOR", "OR", "BOOL", 
			"BASE_INTEGER", "CONST", "WS"
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(40);
				infixExpr();
				}
				break;
			case 2:
				{
				setState(41);
				prefixExpr();
				}
				break;
			case 3:
				{
				setState(42);
				postfixExpr();
				}
				break;
			}
			setState(45);
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
			setState(59);
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
				setState(47);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				match(T__5);
				setState(49);
				prefixExpr();
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(50);
					match(T__6);
					setState(51);
					prefixExpr();
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(56);
				match(T__7);
				}
				break;
			case REAL:
			case INTEGER:
			case FUNCTION:
			case PI:
			case E:
			case BOOL:
			case BASE_INTEGER:
			case CONST:
				_localctx = new PrefixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				prefixfonction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrefixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(FUNCTION);
				setState(67);
				prefixExpr();
				setState(68);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PrefixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(FUNCTION);
				setState(71);
				prefixExpr();
				setState(72);
				match(T__6);
				setState(73);
				prefixExpr();
				setState(74);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new PostfixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__5);
				setState(79);
				postfixExpr();
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					match(T__6);
					setState(81);
					postfixExpr();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(86);
				match(T__7);
				setState(87);
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
			case BASE_INTEGER:
			case CONST:
				_localctx = new PostfixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				prefixfonction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				complex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PostfixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(FUNCTION);
				setState(98);
				postfixfonction();
				setState(99);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PostfixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(FUNCTION);
				setState(102);
				postfixfonction();
				setState(103);
				match(T__6);
				setState(104);
				postfixfonction();
				setState(105);
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
		public InfixExprBitwisePrio1Context infixExprBitwisePrio1() {
			return getRuleContext(InfixExprBitwisePrio1Context.class,0);
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
			setState(109);
			infixExprBitwisePrio1(0);
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
	public static class InfixExprBitwisePrio1Context extends ParserRuleContext {
		public InfixExprBitwisePrio2Context infixExprBitwisePrio2() {
			return getRuleContext(InfixExprBitwisePrio2Context.class,0);
		}
		public InfixExprBitwisePrio1Context infixExprBitwisePrio1() {
			return getRuleContext(InfixExprBitwisePrio1Context.class,0);
		}
		public InfixExprBitwisePrio1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprBitwisePrio1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprBitwisePrio1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprBitwisePrio1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprBitwisePrio1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprBitwisePrio1Context infixExprBitwisePrio1() throws RecognitionException {
		return infixExprBitwisePrio1(0);
	}

	private InfixExprBitwisePrio1Context infixExprBitwisePrio1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprBitwisePrio1Context _localctx = new InfixExprBitwisePrio1Context(_ctx, _parentState);
		InfixExprBitwisePrio1Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_infixExprBitwisePrio1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			infixExprBitwisePrio2();
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprBitwisePrio1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprBitwisePrio1);
					setState(114);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(115);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15872L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(116);
					infixExprBitwisePrio2();
					}
					} 
				}
				setState(121);
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
	public static class InfixExprBitwisePrio2Context extends ParserRuleContext {
		public InfixExprBitwisePrio3Context infixExprBitwisePrio3() {
			return getRuleContext(InfixExprBitwisePrio3Context.class,0);
		}
		public InfixExprBitwisePrio2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprBitwisePrio2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprBitwisePrio2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprBitwisePrio2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprBitwisePrio2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprBitwisePrio2Context infixExprBitwisePrio2() throws RecognitionException {
		InfixExprBitwisePrio2Context _localctx = new InfixExprBitwisePrio2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_infixExprBitwisePrio2);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(122);
				match(T__13);
				}
				setState(123);
				infixExprBitwisePrio3();
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__14:
			case T__15:
			case REAL:
			case INTEGER:
			case FUNCTION:
			case PI:
			case E:
			case NOT:
			case BOOL:
			case BASE_INTEGER:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				infixExprBitwisePrio3();
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
	public static class InfixExprBitwisePrio3Context extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
		public InfixExprLogicPrio1Context infixExprLogicPrio1() {
			return getRuleContext(InfixExprLogicPrio1Context.class,0);
		}
		public InfixExprBitwisePrio3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExprBitwisePrio3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterInfixExprBitwisePrio3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitInfixExprBitwisePrio3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInfixExprBitwisePrio3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixExprBitwisePrio3Context infixExprBitwisePrio3() throws RecognitionException {
		InfixExprBitwisePrio3Context _localctx = new InfixExprBitwisePrio3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_infixExprBitwisePrio3);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				match(INTEGER);
				setState(129);
				infixExprLogicPrio1(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				infixExprLogicPrio1(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				infixExprLogicPrio1(0);
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
	public static class InfixExprLogicPrio1Context extends ParserRuleContext {
		public InfixExprLogicPrio2Context infixExprLogicPrio2() {
			return getRuleContext(InfixExprLogicPrio2Context.class,0);
		}
		public InfixExprLogicPrio1Context infixExprLogicPrio1() {
			return getRuleContext(InfixExprLogicPrio1Context.class,0);
		}
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode NAND() { return getToken(ExpressionParser.NAND, 0); }
		public TerminalNode NOR() { return getToken(ExpressionParser.NOR, 0); }
		public TerminalNode XOR() { return getToken(ExpressionParser.XOR, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_infixExprLogicPrio1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			infixExprLogicPrio2();
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprLogicPrio1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprLogicPrio1);
					setState(138);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(139);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4161142784L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(140);
					infixExprLogicPrio2();
					}
					} 
				}
				setState(145);
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
	public static class InfixExprLogicPrio2Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
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
		enterRule(_localctx, 24, RULE_infixExprLogicPrio2);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(NOT);
				setState(147);
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
			case BASE_INTEGER:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_infixExprPrio1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			infixExprPrio2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio1);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(156);
					infixExprPrio2(0);
					}
					} 
				}
				setState(161);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_infixExprPrio2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(163);
				infixExprPrio3(0);
				}
				break;
			case 2:
				{
				setState(164);
				infixExprPrio3(0);
				setState(165);
				infixExprPrio3(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio2);
					setState(169);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(170);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(171);
					infixExprPrio3(0);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_infixExprPrio3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			infixExprPrio4();
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprPrio3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExprPrio3);
					setState(180);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(181);
					match(T__4);
					}
					setState(182);
					infixExprPrio4();
					}
					} 
				}
				setState(187);
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
		enterRule(_localctx, 32, RULE_infixExprPrio4);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new InfixExpressionSignedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
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
				infixExprPrio4();
				}
				break;
			case 2:
				_localctx = new InfixExpressionWithParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__5);
				setState(191);
				infixExpr();
				setState(192);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new InfixFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				infixfunction();
				}
				break;
			case 4:
				_localctx = new ComplexNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				complex();
				}
				break;
			case 5:
				_localctx = new InfixSimpleNumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
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
		enterRule(_localctx, 34, RULE_infixfunction);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new InfixUnaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(FUNCTION);
				setState(200);
				infixExpr();
				setState(201);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new InfixBinaryFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(FUNCTION);
				setState(204);
				infixExpr();
				setState(205);
				match(T__6);
				setState(206);
				infixExpr();
				setState(207);
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
	public static class PercentageContext extends ComplexContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PercentageContext(ComplexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPercentage(this);
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
		enterRule(_localctx, 36, RULE_complex);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ComplexAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				number();
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				number();
				setState(214);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new PercentageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				number();
				setState(217);
				match(T__19);
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
	public static class IntegerAtomContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
		public IntegerAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterIntegerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitIntegerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIntegerAtom(this);
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
	public static class BaseIntegerAtomContext extends NumberContext {
		public TerminalNode BASE_INTEGER() { return getToken(ExpressionParser.BASE_INTEGER, 0); }
		public BaseIntegerAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBaseIntegerAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBaseIntegerAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBaseIntegerAtom(this);
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
	public static class ConstantAtomContext extends NumberContext {
		public TerminalNode CONST() { return getToken(ExpressionParser.CONST, 0); }
		public ConstantAtomContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterConstantAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitConstantAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitConstantAtom(this);
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

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ScientificAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				match(E);
				setState(223);
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
				_localctx = new IntegerAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(INTEGER);
				}
				break;
			case 3:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(REAL);
				}
				break;
			case 4:
				_localctx = new PiNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(PI);
				}
				break;
			case 5:
				_localctx = new ENumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(E);
				}
				break;
			case 6:
				_localctx = new ConstantAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(CONST);
				}
				break;
			case 7:
				_localctx = new BoolAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(BOOL);
				}
				break;
			case 8:
				_localctx = new BaseIntegerAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				match(BASE_INTEGER);
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
			return infixExprBitwisePrio1_sempred((InfixExprBitwisePrio1Context)_localctx, predIndex);
		case 11:
			return infixExprLogicPrio1_sempred((InfixExprLogicPrio1Context)_localctx, predIndex);
		case 13:
			return infixExprPrio1_sempred((InfixExprPrio1Context)_localctx, predIndex);
		case 14:
			return infixExprPrio2_sempred((InfixExprPrio2Context)_localctx, predIndex);
		case 15:
			return infixExprPrio3_sempred((InfixExprPrio3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean infixExprBitwisePrio1_sempred(InfixExprBitwisePrio1Context _localctx, int predIndex) {
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
		"\u0004\u0001#\u00ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		",\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u00015\b\u0001\u000b\u0001\f\u00016\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004S\b\u0004\u000b\u0004\f\u0004T\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bv\b\b\n\b\f\b"+
		"y\t\b\u0001\t\u0001\t\u0001\t\u0003\t~\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008e\b\u000b\n\u000b"+
		"\f\u000b\u0091\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0096\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009e\b\r\n\r\f\r\u00a1"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ad"+
		"\b\u000e\n\u000e\f\u000e\u00b0\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b8\b\u000f\n\u000f"+
		"\f\u000f\u00bb\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00c6\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00d2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00dc\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0013"+
		"\u0000\u0005\u0010\u0016\u001a\u001c\u001e\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0007\u0001\u0000\u0001\u0005\u0001\u0000\t\r\u0001\u0000\u000f\u0010"+
		"\u0002\u0000\u0011\u0012\u001b\u001f\u0001\u0000\u0001\u0002\u0001\u0000"+
		"\u0003\u0004\u0001\u0000\u0015\u0016\u00f8\u0000+\u0001\u0000\u0000\u0000"+
		"\u0002;\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000"+
		"\u0000\fk\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010"+
		"o\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0085\u0001"+
		"\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u0095\u0001"+
		"\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u00a7\u0001"+
		"\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00c5\u0001\u0000"+
		"\u0000\u0000\"\u00d1\u0001\u0000\u0000\u0000$\u00db\u0001\u0000\u0000"+
		"\u0000&\u00e7\u0001\u0000\u0000\u0000(,\u0003\u000e\u0007\u0000),\u0003"+
		"\u0002\u0001\u0000*,\u0003\b\u0004\u0000+(\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000\u0000\u0000/0\u0007\u0000"+
		"\u0000\u000001\u0005\u0006\u0000\u000014\u0003\u0002\u0001\u000023\u0005"+
		"\u0007\u0000\u000035\u0003\u0002\u0001\u000042\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0005\b\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:<\u0003\u0004\u0002\u0000;/\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=A\u0003\u0006\u0003\u0000"+
		">A\u0003$\u0012\u0000?A\u0003&\u0013\u0000@=\u0001\u0000\u0000\u0000@"+
		">\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0005\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0017\u0000\u0000CD\u0003\u0002\u0001\u0000DE\u0005"+
		"\b\u0000\u0000EM\u0001\u0000\u0000\u0000FG\u0005\u0017\u0000\u0000GH\u0003"+
		"\u0002\u0001\u0000HI\u0005\u0007\u0000\u0000IJ\u0003\u0002\u0001\u0000"+
		"JK\u0005\b\u0000\u0000KM\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000"+
		"LF\u0001\u0000\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0005\u0006"+
		"\u0000\u0000OR\u0003\b\u0004\u0000PQ\u0005\u0007\u0000\u0000QS\u0003\b"+
		"\u0004\u0000RP\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0005\b\u0000\u0000WX\u0007\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"Y[\u0003\n\u0005\u0000ZN\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\t\u0001\u0000\u0000\u0000\\`\u0003\u0006\u0003\u0000]`\u0003$\u0012"+
		"\u0000^`\u0003&\u0013\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0017\u0000\u0000bc\u0003\f\u0006\u0000cd\u0005\b\u0000\u0000dl\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0017\u0000\u0000fg\u0003\f\u0006\u0000gh\u0005"+
		"\u0007\u0000\u0000hi\u0003\f\u0006\u0000ij\u0005\b\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000ka\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000"+
		"l\r\u0001\u0000\u0000\u0000mn\u0003\u0010\b\u0000n\u000f\u0001\u0000\u0000"+
		"\u0000op\u0006\b\uffff\uffff\u0000pq\u0003\u0012\t\u0000qw\u0001\u0000"+
		"\u0000\u0000rs\n\u0002\u0000\u0000st\u0007\u0001\u0000\u0000tv\u0003\u0012"+
		"\t\u0000ur\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0011\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z{\u0005\u000e\u0000\u0000{~\u0003\u0014\n\u0000"+
		"|~\u0003\u0014\n\u0000}z\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0013\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0002\u0000\u0000\u0080"+
		"\u0081\u0005\u0016\u0000\u0000\u0081\u0086\u0003\u0016\u000b\u0000\u0082"+
		"\u0083\u0007\u0002\u0000\u0000\u0083\u0086\u0003\u0016\u000b\u0000\u0084"+
		"\u0086\u0003\u0016\u000b\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u000b\uffff\uffff\u0000"+
		"\u0088\u0089\u0003\u0018\f\u0000\u0089\u008f\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\n\u0002\u0000\u0000\u008b\u008c\u0007\u0003\u0000\u0000\u008c\u008e"+
		"\u0003\u0018\f\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u001a\u0000\u0000\u0093\u0096\u0003"+
		"\u001a\r\u0000\u0094\u0096\u0003\u001a\r\u0000\u0095\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0019\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0006\r\uffff\uffff\u0000\u0098\u0099\u0003\u001c"+
		"\u000e\u0000\u0099\u009f\u0001\u0000\u0000\u0000\u009a\u009b\n\u0002\u0000"+
		"\u0000\u009b\u009c\u0007\u0004\u0000\u0000\u009c\u009e\u0003\u001c\u000e"+
		"\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0006\u000e\uffff\uffff\u0000\u00a3\u00a8\u0003\u001e"+
		"\u000f\u0000\u00a4\u00a5\u0003\u001e\u000f\u0000\u00a5\u00a6\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8\u00ae\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\n\u0003\u0000\u0000\u00aa\u00ab\u0007\u0005\u0000"+
		"\u0000\u00ab\u00ad\u0003\u001e\u000f\u0000\u00ac\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u001d\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u000f\uffff"+
		"\uffff\u0000\u00b2\u00b3\u0003 \u0010\u0000\u00b3\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\n\u0002\u0000\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000"+
		"\u00b6\u00b8\u0003 \u0010\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0007\u0004\u0000\u0000\u00bd"+
		"\u00c6\u0003 \u0010\u0000\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c0"+
		"\u0003\u000e\u0007\u0000\u00c0\u00c1\u0005\b\u0000\u0000\u00c1\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c6\u0003\"\u0011\u0000\u00c3\u00c6\u0003$"+
		"\u0012\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c5\u00be\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6!\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0017\u0000\u0000"+
		"\u00c8\u00c9\u0003\u000e\u0007\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca"+
		"\u00d2\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc"+
		"\u00cd\u0003\u000e\u0007\u0000\u00cd\u00ce\u0005\u0007\u0000\u0000\u00ce"+
		"\u00cf\u0003\u000e\u0007\u0000\u00cf\u00d0\u0005\b\u0000\u0000\u00d0\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c7\u0001\u0000\u0000\u0000\u00d1\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003"+
		"&\u0013\u0000\u00d4\u00d5\u0007\u0004\u0000\u0000\u00d5\u00d6\u0003&\u0013"+
		"\u0000\u00d6\u00d7\u0005\u0013\u0000\u0000\u00d7\u00dc\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0003&\u0013\u0000\u00d9\u00da\u0005\u0014\u0000\u0000"+
		"\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000"+
		"\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc%\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0007\u0006\u0000\u0000\u00de\u00df\u0005\u0019\u0000\u0000\u00df"+
		"\u00e8\u0007\u0006\u0000\u0000\u00e0\u00e8\u0005\u0016\u0000\u0000\u00e1"+
		"\u00e8\u0005\u0015\u0000\u0000\u00e2\u00e8\u0005\u0018\u0000\u0000\u00e3"+
		"\u00e8\u0005\u0019\u0000\u0000\u00e4\u00e8\u0005\"\u0000\u0000\u00e5\u00e8"+
		"\u0005 \u0000\u0000\u00e6\u00e8\u0005!\u0000\u0000\u00e7\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\'\u0001\u0000\u0000"+
		"\u0000\u0016+6;@LTZ_kw}\u0085\u008f\u0095\u009f\u00a7\u00ae\u00b9\u00c5"+
		"\u00d1\u00db\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}