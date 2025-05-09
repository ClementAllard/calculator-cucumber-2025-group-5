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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BOOL=7, BINARY=8, OCTAL=9, 
		HEXA=10, NUMBER=11, AND=12, OR=13, NOT=14, XOR=15, IMPLIES=16, EQUIV=17, 
		SHIFT_LEFT=18, SHIFT_RIGHT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BOOL", "BINARY", "OCTAL", 
			"HEXA", "NUMBER", "AND", "OR", "NOT", "XOR", "IMPLIES", "EQUIV", "SHIFT_LEFT", 
			"SHIFT_RIGHT", "BIT_AND", "BIT_OR", "BIT_XOR", "WS"
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
		"\u0004\u0000\u0017\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007B\b\u0007"+
		"\u000b\u0007\f\u0007C\u0001\b\u0001\b\u0001\b\u0001\b\u0004\bJ\b\b\u000b"+
		"\b\f\bK\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tR\b\t\u000b\t\f\tS\u0001"+
		"\n\u0004\nW\b\n\u000b\n\f\nX\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016"+
		"~\b\u0016\u000b\u0016\f\u0016\u007f\u0001\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"\u0001\u0000\u0006\u0003\u000001FFTT\u0001\u000001\u0001\u000007\u0003"+
		"\u000009AFaf\u0001\u000009\u0004\u0000\t\n\r\r  ,,\u0087\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000"+
		"\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075"+
		"\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000"+
		"\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000"+
		"\u0011E\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015V"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019^\u0001\u0000"+
		"\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001de\u0001\u0000\u0000\u0000"+
		"\u001fi\u0001\u0000\u0000\u0000!l\u0001\u0000\u0000\u0000#p\u0001\u0000"+
		"\u0000\u0000%s\u0001\u0000\u0000\u0000\'v\u0001\u0000\u0000\u0000)x\u0001"+
		"\u0000\u0000\u0000+z\u0001\u0000\u0000\u0000-}\u0001\u0000\u0000\u0000"+
		"/0\u0005+\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005-\u0000\u0000"+
		"2\u0004\u0001\u0000\u0000\u000034\u0005*\u0000\u00004\u0006\u0001\u0000"+
		"\u0000\u000056\u0005/\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005("+
		"\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\f\u0001"+
		"\u0000\u0000\u0000;<\u0007\u0000\u0000\u0000<\u000e\u0001\u0000\u0000"+
		"\u0000=>\u00050\u0000\u0000>?\u0005b\u0000\u0000?A\u0001\u0000\u0000\u0000"+
		"@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0010\u0001"+
		"\u0000\u0000\u0000EF\u00050\u0000\u0000FG\u0005o\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HJ\u0007\u0002\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"L\u0012\u0001\u0000\u0000\u0000MN\u00050\u0000\u0000NO\u0005x\u0000\u0000"+
		"OQ\u0001\u0000\u0000\u0000PR\u0007\u0003\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UW\u0007\u0004\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005"+
		"a\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005d\u0000\u0000]\u0018\u0001"+
		"\u0000\u0000\u0000^_\u0005o\u0000\u0000_`\u0005r\u0000\u0000`\u001a\u0001"+
		"\u0000\u0000\u0000ab\u0005n\u0000\u0000bc\u0005o\u0000\u0000cd\u0005t"+
		"\u0000\u0000d\u001c\u0001\u0000\u0000\u0000ef\u0005x\u0000\u0000fg\u0005"+
		"o\u0000\u0000gh\u0005r\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ij\u0005"+
		"=\u0000\u0000jk\u0005>\u0000\u0000k \u0001\u0000\u0000\u0000lm\u0005<"+
		"\u0000\u0000mn\u0005=\u0000\u0000no\u0005>\u0000\u0000o\"\u0001\u0000"+
		"\u0000\u0000pq\u0005<\u0000\u0000qr\u0005<\u0000\u0000r$\u0001\u0000\u0000"+
		"\u0000st\u0005>\u0000\u0000tu\u0005>\u0000\u0000u&\u0001\u0000\u0000\u0000"+
		"vw\u0005&\u0000\u0000w(\u0001\u0000\u0000\u0000xy\u0005|\u0000\u0000y"+
		"*\u0001\u0000\u0000\u0000z{\u0005^\u0000\u0000{,\u0001\u0000\u0000\u0000"+
		"|~\u0007\u0005\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006\u0016\u0000"+
		"\u0000\u0082.\u0001\u0000\u0000\u0000\u0006\u0000CKSX\u007f\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}