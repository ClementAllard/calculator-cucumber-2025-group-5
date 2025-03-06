package helper;

import calculator.Expression;
import calculator.IllegalConstruction;
import helper.antlr4.*;
import org.antlr.v4.runtime.*;

public class MyExpressionParser {

    private MyExpressionParser() {}

    /**
     * Parse an expression and return the corresponding Expression object
     * @param input the expression to parse
     * @return the corresponding Expression object
     * @throws IllegalConstruction if the expression is not valid
     */
    public static Expression parseExpression(String input) throws IllegalConstruction {
        ExpressionLexer lexer = new ExpressionLexer(CharStreams.fromString(input));

        // listener for the error of the lexer
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyExpressionErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);

        // listener for the error of the parser
        parser.removeErrorListeners();
        parser.addErrorListener(new MyExpressionErrorListener());

        // listener to the parser to build Expression object
        MyExpressionListener listener = new MyExpressionListener();
        parser.addParseListener(listener);

        try {
            parser.expr();
            // To show the parse tree generated by the parser
                //ParseTree tree = parser.expr();
                //System.out.println(tree.toStringTree(parser));
        } catch (RuntimeException e) {
            throw new IllegalConstruction();
        }

        // Return the result of the parsing
        return listener.getResult();
    }
}
