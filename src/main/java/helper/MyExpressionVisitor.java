package helper;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.basic.*;
import calculator.expression.operator.bitwise.*;
import calculator.expression.operator.function.*;
import calculator.expression.operator.function.FunctionAcos;
import calculator.expression.operator.random.*;
import calculator.expression.operator.logic.*;
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
    public Expression visitInfixExprBitwisePrio1(ExpressionParser.InfixExprBitwisePrio1Context ctx) {
        if(ctx.getChildCount() == 3) {
            Expression left = visit(ctx.getChild(0));
            String operator = ctx.getChild(1).getText();
            Expression right = visit(ctx.getChild(2));
            return getExpression(Arrays.asList(left,right), operator, Notation.INFIX);
        } else {
            return visitChildren(ctx);
        }
    }

    @Override
    public Expression visitInfixExprBitwisePrio2(ExpressionParser.InfixExprBitwisePrio2Context ctx) {
        if (ctx.getChildCount() == 2) {
            try {
                return new BitwiseNot(visit(ctx.getChild(1)));
            } catch (IllegalConstruction e) {
                throw new RuntimeException(e); // NOSONAR
            }
        } else {
            return visitChildren(ctx);
        }
    }

    @Override
    public Expression visitInfixExprBitwisePrio3(ExpressionParser.InfixExprBitwisePrio3Context ctx) {
        int childCount = ctx.getChildCount();
        String operator = ctx.getChild(0).getText();
        try {
            switch (childCount) {
                case 2 -> {
                    Expression expression = visit(ctx.getChild(1));
                    return "<<".equals(operator)
                            ? new BitwiseLeft(expression)
                            : new BitwiseRight(expression);
                }
                case 3 -> {
                    String number = ctx.getChild(1).getText();
                    Expression expression = visit(ctx.getChild(2));
                    return "<<".equals(operator)
                            ? new BitwiseLeft(expression, number)
                            : new BitwiseRight(expression, number);
                }
                default -> {
                    return visitChildren(ctx);
                }
            }
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    @Override
    public Expression visitInfixExprLogicPrio1(ExpressionParser.InfixExprLogicPrio1Context ctx) {
        if (ctx.getChildCount() == 1) {
            return visitChildren(ctx);
        } else {
            Expression left = visit(ctx.getChild(0));
            String operator = ctx.getChild(1).getText().toUpperCase();
            Expression right = visit(ctx.getChild(2));
            return getExpression(Arrays.asList(left, right), operator, Notation.INFIX);
        }
    }

    @Override
    public Expression visitInfixExprLogicPrio2(ExpressionParser.InfixExprLogicPrio2Context ctx) {
        if (ctx.getChildCount() == 2) {
            try {
                return new LogicalNot(visit(ctx.getChild(1)));
            } catch (IllegalConstruction e) {
                throw new RuntimeException(e); //NOSONAR
            }
        } else return visitChildren(ctx);
    }

    @Override
    public Expression visitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitInfixExpressionSigned(ExpressionParser.InfixExpressionSignedContext ctx) {
        if("-".equals(ctx.getChild(0).getText())) {
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
                case "&" -> new BitwiseAnd(expressions, notation);
                case "~&" -> new BitwiseNand(expressions, notation);
                case "~|" -> new BitwiseNor(expressions, notation);
                case "^^" -> new BitwiseXor(expressions, notation);
                case "|" -> new BitwiseOr(expressions, notation);
                case "AND" -> new LogicalAnd(expressions, notation);
                case "NAND" -> new LogicalNand(expressions, notation);
                case "NOR" -> new LogicalNor(expressions, notation);
                case "XOR" -> new LogicalXor(expressions, notation);
                case "OR" -> new LogicalOr(expressions, notation);
                case "=>" -> new Implication(expressions, notation);
                case "<=>" -> new Equivalence(expressions, notation);
                default -> null;
            };
        }catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    // ATOM

    @Override
    public Expression visitIntegerAtom(ExpressionParser.IntegerAtomContext ctx) {
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
    public Expression visitPercentage(ExpressionParser.PercentageContext ctx) {
        try{
            return new Divides(Arrays.asList(visit(ctx.getChild(0)), new MyInteger(100)), Notation.INFIX);
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); //NOSONAR
        }
    }

    @Override
    public Expression visitBoolAtom(ExpressionParser.BoolAtomContext ctx) {
        String value = ctx.getText();
        if ("T".equals(value) || "1".equals(value)) {
            return new MyInteger(new BigDecimal(1));
        } else {
            return new MyInteger(new BigDecimal(0));
        }
    }

    @Override
    public Expression visitBaseIntegerAtom(ExpressionParser.BaseIntegerAtomContext ctx) {
        String baseInteger = ctx.getText();
        String[] parts = baseInteger.split("b", 2);
        int base = Integer.parseInt(parts[0]);
        String value = parts[1];
        return new MyInteger(value, base);
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

        if("-".equals(ctx.getChild(1).getText())) {
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
                case "sqrt" -> new FunctionSqrt(Arrays.asList(new MyInteger(2), arg));
                case "rinteger", "rint" -> new RandomInteger(arg);
                case "rrational", "rrat" -> new RandomRational(arg);
                case "rreal" -> new RandomReal(arg);
                case "rcomplex", "rcom" -> new RandomComplex(arg);
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
                case "rinteger" ,"rint" -> new RandomIntegerSeed(args);
                case "rrational", "rrat" -> new RandomRationalSeed(args);
                default -> throw new IllegalArgumentException("Unknown function " + funcName+ " of arity 2");
            };

        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    @Override
    public Expression visitConstantAtom(ExpressionParser.ConstantAtomContext ctx){
        String constantKey = null;

        try {
            constantKey = ctx.getChild(0).getText();
            // remove the first and last $
            constantKey = constantKey.substring(1, constantKey.length()-1);
            String valueString = Constant.readConstant(constantKey);
            if (valueString == null) {
                String msg = String.format("The constant %s does not exists or the file %s could not be read.",
                        constantKey, Constant.FILE_PATH);
                throw new IllegalArgumentException(msg);
            }
            // remove all $ to avoid DOS (infinite loop)
            valueString = valueString.replace("$", "");
            return Constant.parseExpression(valueString);
        } catch (IllegalSyntax e) {
            // This error only raise if constantKey is initialised.
            String msg = String.format("The constant %s does not follow the grammar",
                    constantKey);
            throw new IllegalArgumentException(msg);
        }
    }
}