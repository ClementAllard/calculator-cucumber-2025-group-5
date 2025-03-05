package helper;

import calculator.Expression;
import calculator.IllegalConstruction; // Ensure IllegalConstruction is imported properly
import helper.antlr4.*;
import org.antlr.v4.runtime.*;

public class MyExpressionParser {

    public static Expression parseExpression(String input) throws IllegalConstruction {
        ExpressionLexer lexer = new ExpressionLexer(CharStreams.fromString(input));

        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyExpressionErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ExpressionParser parser = new ExpressionParser(tokens);

        // Add custom error listener to parser
        parser.removeErrorListeners();  // Remove default error listeners
        parser.addErrorListener(new MyExpressionErrorListener());

        MyExpressionListener listener = new MyExpressionListener();
        parser.addParseListener(listener);

        try {
            parser.expr();  // This is where parsing happens
        } catch (RuntimeException e) {
            // Throw the custom IllegalConstruction exception if a RuntimeException is caught
            throw new IllegalConstruction();
        }

        return listener.getResult();  // Return the result from the listener if parsing was successful
    }
}
