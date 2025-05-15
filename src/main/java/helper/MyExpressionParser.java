package helper;

import calculator.expression.Expression;
import helper.antlr4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public final class MyExpressionParser {

    private MyExpressionParser() {}

    /**
     * Parse an expression and return the corresponding Expression object
     * @param input the expression to parse
     * @return the corresponding Expression object
     * @throws IllegalSyntax if the expression is not valid
     */
    public static Expression parseExpression(String input) throws IllegalSyntax {

        ExpressionLexer lexer = new ExpressionLexer(CharStreams.fromString(input));

        // listener for the error of the lexer
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyExpressionErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);

        // listener for the error of the parser
        parser.removeErrorListeners();
        parser.addErrorListener(new MyExpressionErrorListener());

        // visitor to the parser to build Expression object
        MyExpressionVisitor myExpressionVisitor = new MyExpressionVisitor();

        ParseTree tree;
        try{
            tree = parser.expr();
        }catch (RuntimeException _){
            throw new IllegalSyntax();
        }

        return myExpressionVisitor.visit(tree);

    }
}
