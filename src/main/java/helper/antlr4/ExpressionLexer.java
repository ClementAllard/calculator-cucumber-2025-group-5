// Generated from Expression.g4 by ANTLR 4.13.2
package helper.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, REAL=11, INTEGER=12, FUNCTION=13, PI=14, E=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "REAL", "INTEGER", "FUNCTION", "PI", "E", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "','", "')'", "'i'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "REAL", 
			"INTEGER", "FUNCTION", "PI", "E", "WS"
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n7\b\n\u000b\n\f\n8\u0001\n\u0001"+
		"\n\u0004\n=\b\n\u000b\n\f\n>\u0001\u000b\u0004\u000bB\b\u000b\u000b\u000b"+
		"\f\u000bC\u0001\f\u0001\f\u0005\fH\b\f\n\f\f\fK\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\rS\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0004\u000fX\b\u000f\u000b\u000f\f\u000fY\u0001\u000f\u0001\u000f"+
		"\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0001\u00000"+
		"9\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000EEee\u0003\u0000\t"+
		"\n\r\r  b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%"+
		"\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t)\u0001\u0000"+
		"\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001\u0000\u0000\u0000"+
		"\u000f/\u0001\u0000\u0000\u0000\u00111\u0001\u0000\u0000\u0000\u00133"+
		"\u0001\u0000\u0000\u0000\u00156\u0001\u0000\u0000\u0000\u0017A\u0001\u0000"+
		"\u0000\u0000\u0019E\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000\u0000"+
		"\u001dT\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000!\"\u0005"+
		"+\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005-\u0000\u0000$\u0004"+
		"\u0001\u0000\u0000\u0000%&\u0005*\u0000\u0000&\u0006\u0001\u0000\u0000"+
		"\u0000\'(\u0005/\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005^\u0000"+
		"\u0000*\n\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\f\u0001\u0000"+
		"\u0000\u0000-.\u0005,\u0000\u0000.\u000e\u0001\u0000\u0000\u0000/0\u0005"+
		")\u0000\u00000\u0010\u0001\u0000\u0000\u000012\u0005i\u0000\u00002\u0012"+
		"\u0001\u0000\u0000\u000034\u0005%\u0000\u00004\u0014\u0001\u0000\u0000"+
		"\u000057\u0007\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0005.\u0000\u0000;=\u0007\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?\u0016\u0001\u0000\u0000\u0000@B\u0007\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0018\u0001\u0000\u0000"+
		"\u0000EI\u0007\u0001\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0005(\u0000\u0000M\u001a\u0001\u0000\u0000\u0000NO\u0005p\u0000\u0000"+
		"OS\u0005i\u0000\u0000PQ\u0005P\u0000\u0000QS\u0005I\u0000\u0000RN\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u001c\u0001\u0000\u0000"+
		"\u0000TU\u0007\u0003\u0000\u0000U\u001e\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0004\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0006\u000f\u0000\u0000\\ \u0001\u0000\u0000\u0000\u0007\u0000"+
		"8>CIRY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}