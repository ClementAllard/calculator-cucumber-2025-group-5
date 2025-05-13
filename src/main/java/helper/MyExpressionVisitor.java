package helper;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.basic.*;
import calculator.expression.operator.function.*;
import calculator.expression.operator.function.FunctionAcos;
import calculator.expression.operator.random.RandomInteger;
import calculator.expression.operator.random.RandomIntegerSeed;
import calculator.expression.operator.random.RandomRational;
import calculator.expression.operator.random.RandomRationalSeed;
import helper.antlr4.ExpressionBaseVisitor;
import helper.antlr4.ExpressionParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyExpressionVisitor extends ExpressionBaseVisitor<Expression> {

    @Override
    public Expression visitExpr(ExpressionParser.ExprContext ctx) {
        return visit(ctx.getChild(0)); // For have the Expression, not the EOF
    }

    // PREFIX EXPRESSION

    @Override
    public Expression visitPrefixExpression(ExpressionParser.PrefixExpressionContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        String symbol = ctx.getChild(0).getText();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (isPrefixExpression(child)) {
                expressions.add(visit(child));
            }
        }

        return getExpression(expressions, symbol,Notation.PREFIX);
    }

    private boolean isPrefixExpression(ParseTree tree) {
        return tree instanceof ExpressionParser.PrefixSimpleNumberContext ||
                tree instanceof ExpressionParser.PrefixExpressionContext;
    }

    // POSTFIX EXPRESSION

    @Override
    public Expression visitPostfixExpression(ExpressionParser.PostfixExpressionContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        String symbol = ctx.getChild(ctx.getChildCount()-1).getText();
        for (int i = 0; i < ctx.getChildCount()-1; i++) {
            ParseTree child = ctx.getChild(i);
            if (isPostfixExpression(child)) {
                expressions.add(visit(child));
            }
        }

        return getExpression(expressions, symbol,Notation.POSTFIX);
    }

    private boolean isPostfixExpression(ParseTree tree) {
        return tree instanceof ExpressionParser.PostfixSimpleNumberContext ||
                tree instanceof ExpressionParser.PostfixExpressionContext;
    }

    // INFIX EXPRESSION

    @Override
    public Expression visitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitInfixExpressionSigned(ExpressionParser.InfixExpressionSignedContext ctx) {
        if(ctx.getChild(0).getText().equals("-")) {
            try {
                return new Negate(visit(ctx.getChild(1)));
            } catch (IllegalConstruction e) {
                throw new RuntimeException(e); // NOSONAR
            }
        }else{
            return visit(ctx.getChild(1));
        }
    }

    @Override
    public Expression visitInfixExprPrio1(ExpressionParser.InfixExprPrio1Context ctx) {
        if(ctx.getChildCount() == 1) { return visitChildren(ctx); }

        Expression left = visit(ctx.getChild(0));
        String operator = ctx.getChild(1).getText();
        Expression right = visit(ctx.getChild(2));

        return getExpression(Arrays.asList(left,right), operator, Notation.INFIX);
    }

    @Override
    public Expression visitInfixExprPrio2(ExpressionParser.InfixExprPrio2Context ctx) {
        Expression left;
        Expression right;
        String operator;

        switch (ctx.getChildCount()){
            case 1:
                return visitChildren(ctx);
            case 2:
                left = visit(ctx.getChild(0));
                right = visit(ctx.getChild(1));
                operator = "*";
                break;
            default:
                left = visit(ctx.getChild(0));
                operator = ctx.getChild(1).getText();
                right = visit(ctx.getChild(2));
                break;
        }

        return getExpression(Arrays.asList(left,right), operator, Notation.INFIX);
    }

    @Override
    public Expression visitInfixExprPrio3(ExpressionParser.InfixExprPrio3Context ctx) {
        if(ctx.getChildCount() == 1) { return visitChildren(ctx); }

        Expression left = visit(ctx.getChild(0));
        String operator = ctx.getChild(1).getText();
        Expression right = visit(ctx.getChild(2));

        return getExpression(Arrays.asList(left,right), operator, Notation.INFIX);
    }

    private Expression getExpression(List<Expression> expressions, String symbol,Notation notation) {
        try{
            return switch (symbol) {
                case "+" -> new Plus(expressions, notation);
                case "-" -> new Minus(expressions, notation);
                case "*" -> new Times(expressions, notation);
                case "/" -> new Divides(expressions, notation);
                case "^" -> new Power(expressions, notation);
                default -> null;
            };
        }catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    // ATOM

    @Override
    public Expression visitIntergerAtom(ExpressionParser.IntergerAtomContext ctx) {
        return new MyInteger(Integer.parseInt(ctx.getChild(0).getText()));
    }

    @Override
    public Expression visitRealAtom(ExpressionParser.RealAtomContext ctx) {
        return new MyReal(new BigDecimal(ctx.getChild(0).getText()));
    }

    @Override
    public Expression visitPiNumber(ExpressionParser.PiNumberContext ctx){
        return new MyReal(BigDecimal.valueOf(Math.PI).setScale(BigDecimalUtil.getScale(),BigDecimalUtil.getRounding()));
    }

    @Override
    public Expression visitENumber(ExpressionParser.ENumberContext ctx) {
        return new MyReal(BigDecimal.valueOf(Math.E).setScale(BigDecimalUtil.getScale(),BigDecimalUtil.getRounding()));
    }

    @Override
    public Expression visitPercentageAtom(ExpressionParser.PercentageAtomContext ctx) {
        try{
            return new MyRational(Integer.parseInt(ctx.getChild(0).getText()), 100);
        } catch (NumberFormatException e) {
            return new MyReal(BigDecimalUtil.divide(BigDecimal.valueOf(
                            Double.parseDouble(ctx.getChild(0).getText())),
                    BigDecimal.valueOf(100)));
        }
    }

    @Override
    public Expression visitScientificAtom(ExpressionParser.ScientificAtomContext ctx) {
        Expression number = new MyReal(new BigDecimal(ctx.getChild(0).getText()));
        Expression exponent = new MyReal(new BigDecimal(ctx.getChild(2).getText()));

        Expression exponentResult = getExpression(Arrays.asList(new MyInteger(10),exponent),"^",Notation.INFIX);
        return getExpression(Arrays.asList(number,exponentResult),"*",Notation.INFIX);
    }

    @Override
    public Expression visitComplexAtom(ExpressionParser.ComplexAtomContext ctx) {
        BigDecimal real = new BigDecimal(ctx.getChild(0).getText());
        BigDecimal imaginary = new BigDecimal(ctx.getChild(2).getText());

        if(ctx.getChild(1).getText().equals("-")) {
            imaginary = imaginary.negate();
        }

        return new MyComplex(real,imaginary);
    }

    // UNARY FUNCTION

    @Override
    public Expression visitPostfixUnaryFunction(ExpressionParser.PostfixUnaryFunctionContext ctx) {
        return unaryFunction(ctx);
    }

    @Override
    public Expression visitInfixUnaryFunction(ExpressionParser.InfixUnaryFunctionContext ctx) {
        return unaryFunction(ctx);
    }

    @Override
    public Expression visitPrefixUnaryFunction(ExpressionParser.PrefixUnaryFunctionContext ctx) {
        return unaryFunction(ctx);
    }

    private Expression unaryFunction(ParseTree tree){
        String functionName = tree.getChild(0).getText().substring(0, tree.getChild(0).getText().length()-1);
        Expression arg = visit(tree.getChild(1));

        try {
            return switch (functionName.toLowerCase()) {
                case "rad" -> new FunctionRad(arg);
                case "degree", "deg" -> new FunctionDegree(arg);
                case "inv" -> new FunctionInverse(arg);
                case "log" -> new FunctionLog(arg);
                case "ln" -> new FunctionLn(arg);
                case "sin" -> new FunctionSin(arg);
                case "cos" -> new FunctionCos(arg);
                case "tan" -> new FunctionTan(arg);
                case "asin" -> new FunctionAsin(arg);
                case "acos" -> new FunctionAcos(arg);
                case "atan" -> new FunctionAtan(arg);
                case "sinh" -> new FunctionSinh(arg);
                case "cosh" -> new FunctionCosh(arg);
                case "tanh" -> new FunctionTanh(arg);
                case "rint" -> new RandomInteger(arg);
                case "sqrt" -> new FunctionSqrt(Arrays.asList(new MyInteger(2), arg));
                case "rrational", "rrat" -> new RandomRational(arg);
                default -> throw new IllegalArgumentException("Unknown function " + functionName+ " of arity 1");
            };

        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    // BINARY FUNCTION

    @Override
    public Expression visitPostfixBinaryFunction(ExpressionParser.PostfixBinaryFunctionContext ctx) {
        return binaryFunction(ctx);
    }

    @Override
    public Expression visitInfixBinaryFunction(ExpressionParser.InfixBinaryFunctionContext ctx) {
        return binaryFunction(ctx);
    }

    @Override
    public Expression visitPrefixBinaryFunction(ExpressionParser.PrefixBinaryFunctionContext ctx) {
        return binaryFunction(ctx);
    }

    private Expression binaryFunction(ParseTree tree){
        String funcName = tree.getChild(0).getText().substring(0, tree.getChild(0).getText().length()-1);
        List<Expression> args = Arrays.asList(visit(tree.getChild(1)),visit(tree.getChild(3)));

        try {
            return switch (funcName.toLowerCase()) {
                case "log" -> new FunctionLogBinary(args);
                case "pow" -> new FunctionPow(args);
                case "sqrt", "root" -> new FunctionSqrt(args);
                case "rint" -> new RandomIntegerSeed(args);
                case "rrational", "rrat" -> new RandomRationalSeed(args);
                default -> throw new IllegalArgumentException("Unknown function " + funcName+ " of arity 2");
            };

        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }
}