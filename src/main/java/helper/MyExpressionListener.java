package helper;

import calculator.*;
import helper.antlr4.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MyExpressionListener extends ExpressionBaseListener {

    private static Stack<Expression> stack = new Stack<>();
    int stackCurrentOp = 0;

    public Expression getResult() {
        Expression result = stack.isEmpty() ? null : stack.peek();
        stack.clear();
        return result;
    }

    // Number
    // ex : 5 ou -5
    @Override
    public void exitSignedNumber(ExpressionParser.SignedNumberContext ctx) {
        int number = Integer.parseInt(ctx.getText());
        stack.push(new MyNumber(number));
    }

    // prefix

    @Override public void exitPrefixOperationWithParenthesis(ExpressionParser.PrefixOperationWithParenthesisContext ctx) {
        String operator = ctx.getChild(0).getText();
        stackCurrentOp = ctx.children.size() - 3;
        makeOperation(operator,Notation.PREFIX);
    }

    @Override public void exitPrefixOperation(ExpressionParser.PrefixOperationContext ctx) {
        String operator = ctx.getChild(0).getText();
        stackCurrentOp = ctx.children.size() - 1;
        makeOperation(operator,Notation.PREFIX);
    }

    //postfix

    @Override public void exitPostfixOperationWithParenthesis(ExpressionParser.PostfixOperationWithParenthesisContext ctx) {
        String operator = ctx.getChild(ctx.children.size() - 1).getText();
        stackCurrentOp = ctx.children.size() - 3;
        makeOperation(operator,Notation.POSTFIX);
    }

    @Override public void exitPostfixOperation(ExpressionParser.PostfixOperationContext ctx) {
        String operator = ctx.getChild(ctx.children.size() - 1).getText();
        stackCurrentOp = ctx.children.size() - 1;
        makeOperation(operator,Notation.POSTFIX);
    }



    // Operator Infix
    @Override public void exitAddSub(ExpressionParser.AddSubContext ctx) {
        String operator = ctx.getChild(1).getText();
        stackCurrentOp = ctx.children.size() / 2 + 1;
        makeOperation(operator,Notation.INFIX);
    }

    @Override public void exitMulDiv(ExpressionParser.MulDivContext ctx) {
        String operator = ctx.getChild(1).getText();
        stackCurrentOp = ctx.children.size() / 2 + 1;
        makeOperation(operator,Notation.INFIX);
    }

    @Override public void exitImplicitMultiplication(ExpressionParser.ImplicitMultiplicationContext ctx) {
        String operator = "*";
        stackCurrentOp = ctx.children.size() / 2 + 1;
        makeOperation(operator,Notation.INFIX);
    }

    private void makeOperation(String op, Notation notation) {
        try {
            List<Expression> args = new ArrayList<>();

            // Ensure we correctly group sub-expressions before adding them
            while (stackCurrentOp > 0) {
                args.add(stack.pop()); // Collect operands
                stackCurrentOp--;
            }

            // Reverse args to maintain correct prefix order
            Collections.reverse(args);

            stack.push(createOperation(op, args, notation));
    } catch (Exception e) { // TEMPORARY // Impossible d'être ici SI LE PARSER A BIEN ETE CONFIGURER
            e.printStackTrace();
        }
    }

    private Expression createOperation(String op, List<Expression> args, Notation notation) throws IllegalConstruction {
        return switch (op) {
            case "+" -> new Plus(args, notation);
            case "-" -> new Minus(args, notation);
            case "*" -> new Times(args, notation);
            case "/" -> new Divides(args, notation);
            default -> throw new IllegalConstruction(); // Impossible d'être ici SI LE PARSER A BIEN ETE CONFIGURER
        };
    }
}
