package helper;

import calculator.*;
import calculator.expression.*;
import calculator.expression.operator.*;
import helper.antlr4.*;

import java.util.*;

public class MyExpressionListener extends ExpressionBaseListener {

    private static final Deque<Expression> stack = new ArrayDeque<>();

    /**
     * Get the result of the parsing
     * @return the result of the parsing
     */
    public Expression getResult() {
        Expression result = stack.peek();
        stack.clear();
        return result;
    }

    // ---------------------- Number ----------------------

    /**
     * Insert the number in the stack
     * @param ctx the parse tree
     */
    @Override
    public void exitSignedNumber(ExpressionParser.SignedNumberContext ctx) {
        int number = Integer.parseInt(ctx.getText());
        stack.push(new MyNumber(number));
    }

    // ---------------------- prefix ----------------------

    /**
     * Create the operation with them args for the prefix expression with parenthesis
     * @param ctx the parse tree
     */
    @Override
    public void exitPrefixOperationWithParenthesis(ExpressionParser.PrefixOperationWithParenthesisContext ctx) {
        String operator = ctx.getChild(0).getText();
        int nbOfArgs = ctx.children.size() - 3;
        makeOperation(operator,Notation.PREFIX, nbOfArgs);
    }

    /**
     * Create the operation with them args for the prefix expression
     * @param ctx the parse tree
     */
    @Override
    public void exitPrefixOperation(ExpressionParser.PrefixOperationContext ctx) {
        String operator = ctx.getChild(0).getText();
        int nbOfArgs = ctx.children.size() - 1;
        makeOperation(operator,Notation.PREFIX, nbOfArgs);
    }

    // ---------------------- postfix ----------------------

    /**
     * Create the operation with them args for the postfix expression with parenthesis
     * @param ctx the parse tree
     */
    @Override public void exitPostfixOperationWithParenthesis(ExpressionParser.PostfixOperationWithParenthesisContext ctx) {
        String operator = ctx.getChild(ctx.children.size() - 1).getText();
        int nbOfArgs = ctx.children.size() - 3;
        makeOperation(operator,Notation.POSTFIX, nbOfArgs);
    }

    /**
     * Create the operation with them args for the postfix expression
     * @param ctx the parse tree
     */
    @Override public void exitPostfixOperation(ExpressionParser.PostfixOperationContext ctx) {
        String operator = ctx.getChild(ctx.children.size() - 1).getText();
        int nbOfArgs = ctx.children.size() - 1;
        makeOperation(operator,Notation.POSTFIX, nbOfArgs);
    }



    // ---------------------- Infix ----------------------

    /**
     * Create the operation with them args for the infix expression for addition and subtraction
     * @param ctx the parse tree
     */
    @Override
    public void exitAddSub(ExpressionParser.AddSubContext ctx) {
        String operator = ctx.getChild(1).getText();
        int nbOfArgs = ctx.children.size() / 2 + 1;
        makeOperation(operator,Notation.INFIX, nbOfArgs);
    }

    /**
     * Create the operation with them args for the infix expression for multiplication and division
     * @param ctx the parse tree
     */
    @Override
    public void exitMulDiv(ExpressionParser.MulDivContext ctx) {
        String operator = ctx.getChild(1).getText();
        int nbOfArgs = ctx.children.size() / 2 + 1;
        makeOperation(operator,Notation.INFIX, nbOfArgs);
    }

    /**
     * Create the operation with them args for the infix expression for implicit multiplication
     * @param ctx the parse tree
     */
    @Override
    public void exitImplicitMultiplication(ExpressionParser.ImplicitMultiplicationContext ctx) {
        String operator = "*";
        int nbOfArgs = ctx.children.size() / 2 + 1;
        makeOperation(operator,Notation.INFIX, nbOfArgs);
    }

    // ---------------------- helper methods ----------------------

    /**
     * Create the operation with them args for the infix expression for single term
     * @param op
     * @param notation
     */
    private void makeOperation(String op, Notation notation, int stackCurrentOp) {
        try {
            List<Expression> args = new ArrayList<>();

            // Collect operands
            while (stackCurrentOp > 0) {
                args.add(stack.pop()); // Collect operands
                stackCurrentOp--;
            }

            // Reverse args to maintain correct prefix order
            Collections.reverse(args);

            stack.push(createOperation(op, args, notation));
        } catch (Exception e) {
            // throw a runtime exception because I don't want to modify the code generated each time I modify the parser
            throw new RuntimeException(); //NOSONAR
        }
    }

    /**
     * Create the operation with them args for the infix expression
     * @param op the symbol of the operation
     * @param args their arguments
     * @param notation the notation of the operation
     * @return the operation
     * @throws IllegalConstruction if the operation is not valid
     */
    private Expression createOperation(String op, List<Expression> args, Notation notation) throws IllegalConstruction {
        return switch (op) {
            case "+" -> new Plus(args, notation);
            case "-" -> new Minus(args, notation);
            case "*" -> new Times(args, notation);
            case "/" -> new Divides(args, notation);
            default -> throw new IllegalConstruction(); // Impossible to be here IF THE PARSER HAS BEEN CONFIGURED WELL
        };
    }
}
