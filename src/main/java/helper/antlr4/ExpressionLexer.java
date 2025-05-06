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
		T__9=10, T__10=11, REAL=12, INTEGER=13, WS=14, FUNCTION=15, PI=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "REAL", "INTEGER", "WS", "FUNCTION", "PI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "','", "')'", "';'", "'i'", 
			"'e'", "'E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"REAL", "INTEGER", "WS", "FUNCTION", "PI"
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
		"\u0004\u0000\u0010c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000b9\b"+
		"\u000b\u000b\u000b\f\u000b:\u0001\u000b\u0001\u000b\u0004\u000b?\b\u000b"+
		"\u000b\u000b\f\u000b@\u0001\f\u0004\fD\b\f\u000b\f\f\fE\u0001\r\u0004"+
		"\rI\b\r\u000b\r\f\rJ\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"Q\b\u000e\n\u000e\f\u000eT\t\u000e\u0001\u000e\u0005\u000eW\b\u000e\n"+
		"\u000e\f\u000eZ\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000fb\b\u000f\u0000\u0000\u0010\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010\u0001\u0000\u0004\u0001\u000009\u0004\u0000\t\n\r\r"+
		"  ,,\u0003\u0000AZ__az\u0004\u000009AZ__azi\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001"+
		"\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000"+
		"\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000"+
		"\r-\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u00111\u0001"+
		"\u0000\u0000\u0000\u00133\u0001\u0000\u0000\u0000\u00155\u0001\u0000\u0000"+
		"\u0000\u00178\u0001\u0000\u0000\u0000\u0019C\u0001\u0000\u0000\u0000\u001b"+
		"H\u0001\u0000\u0000\u0000\u001dN\u0001\u0000\u0000\u0000\u001fa\u0001"+
		"\u0000\u0000\u0000!\"\u0005+\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000"+
		"#$\u0005-\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005*\u0000\u0000"+
		"&\u0006\u0001\u0000\u0000\u0000\'(\u0005/\u0000\u0000(\b\u0001\u0000\u0000"+
		"\u0000)*\u0005(\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005,\u0000"+
		"\u0000,\f\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u000e\u0001\u0000"+
		"\u0000\u0000/0\u0005;\u0000\u00000\u0010\u0001\u0000\u0000\u000012\u0005"+
		"i\u0000\u00002\u0012\u0001\u0000\u0000\u000034\u0005e\u0000\u00004\u0014"+
		"\u0001\u0000\u0000\u000056\u0005E\u0000\u00006\u0016\u0001\u0000\u0000"+
		"\u000079\u0007\u0000\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0005.\u0000\u0000=?\u0007\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\u0018\u0001\u0000\u0000\u0000BD\u0007\u0000"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u001a\u0001\u0000\u0000"+
		"\u0000GI\u0007\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0006\r\u0000\u0000M\u001c\u0001\u0000\u0000\u0000"+
		"NR\u0007\u0002\u0000\u0000OQ\u0007\u0003\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SX\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0005"+
		" \u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0005(\u0000\u0000\\\u001e\u0001\u0000\u0000"+
		"\u0000]^\u0005p\u0000\u0000^b\u0005i\u0000\u0000_`\u0005P\u0000\u0000"+
		"`b\u0005I\u0000\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"b \u0001\u0000\u0000\u0000\b\u0000:@EJRXa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}