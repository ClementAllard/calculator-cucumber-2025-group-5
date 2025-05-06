package helper;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.*;
import helper.antlr4.ExpressionBaseVisitor;
import helper.antlr4.ExpressionParser;
import helper.antlr4.ExpressionVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyExpressionVisitor extends ExpressionBaseVisitor<Expression> {

    @Override
    public Expression visitExpr(ExpressionParser.ExprContext ctx) {
        return visit(ctx.getChild(0)); // For have the Expression, not the EOF
    }

    @Override
    public Expression visitPrefixExpression(ExpressionParser.PrefixExpressionContext ctx) {
        try{

            List<Expression> expressions = new ArrayList<>();
            String symbol = ctx.getChild(0).getText();
            for (int i = 1; i < ctx.getChildCount(); i++) {
                ParseTree child = ctx.getChild(i);
                if (isPrefixExpression(child)) {
                    expressions.add(visit(child));
                }
            }

            return getExpression(expressions, symbol,Notation.PREFIX);

        }catch (IllegalConstruction e){
            throw new RuntimeException(e); //NOSONAR
        }
    }

    @Override
    public Expression visitPrefixNumber(ExpressionParser.PrefixNumberContext ctx) {
        return visitChildren(ctx);
    }

    private boolean isPrefixExpression(ParseTree tree) {
        return tree instanceof ExpressionParser.PrefixNumberContext ||
                tree instanceof ExpressionParser.PrefixExpressionContext;
    }

    @Override
    public Expression visitPostfixExpression(ExpressionParser.PostfixExpressionContext ctx) {
        try{

            List<Expression> expressions = new ArrayList<>();
            String symbol = ctx.getChild(ctx.getChildCount()-1).getText();
            for (int i = 0; i < ctx.getChildCount()-1; i++) {
                ParseTree child = ctx.getChild(i);
                if (isPostfixExpression(child)) {
                    expressions.add(visit(child));
                }
            }

            return getExpression(expressions, symbol,Notation.POSTFIX);

        }catch (IllegalConstruction e){
            throw new RuntimeException(e); //NOSONAR
        }
    }



    @Override
    public Expression visitPostfixNumber(ExpressionParser.PostfixNumberContext ctx) {
        return visitChildren(ctx);
    }

    private boolean isPostfixExpression(ParseTree tree) {
        return tree instanceof ExpressionParser.PostfixNumberContext ||
                tree instanceof ExpressionParser.PostfixExpressionContext;
    }

    private Expression getExpression(List<Expression> expressions, String symbol,Notation notation) throws IllegalConstruction {
        return switch (symbol) {
            case "+" -> new Plus(expressions, notation);
            case "-" -> new Minus(expressions, notation);
            case "*" -> new Times(expressions, notation);
            case "/" -> new Divides(expressions, notation);
            default -> null;
        };
    }

    @Override
    public Expression visitSingleTerm(ExpressionParser.SingleTermContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitInfixExpressionAddSub(ExpressionParser.InfixExpressionAddSubContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        try {
            if(ctx.getChild(1).getText().equals("+")) {
                return new Plus(Arrays.asList(left,right));
            }else{
                return new Minus(Arrays.asList(left,right));
            }
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    @Override
    public Expression visitInfixExpressionImplicitMul(ExpressionParser.InfixExpressionImplicitMulContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        try{
            return new Times(Arrays.asList(left,right));
        }catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }
    }

    @Override
    public Expression visitInfixExpressionMulDiv(ExpressionParser.InfixExpressionMulDivContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        try{
            if(ctx.getChild(1).getText().equals("*")) {
                return new Times(Arrays.asList(left,right));
            }else{
                return new Divides(Arrays.asList(left,right));
            }
        }catch (IllegalConstruction e) {
            throw new RuntimeException(e); // NOSONAR
        }

    }

    @Override
    public Expression visitSingleFactor(ExpressionParser.SingleFactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitImplicitMul(ExpressionParser.ImplicitMulContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitFactorNumber(ExpressionParser.FactorNumberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitInfixExpressionWithParenthesis(ExpressionParser.InfixExpressionWithParenthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitInfixExpressionNegate(ExpressionParser.InfixExpressionNegateContext ctx) {
        try {
            Expression expression = visit(ctx.getChild(2));
            expression = expression.negate();
            return expression;
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e); //NOSONAR
        }
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

    @Override
    public Expression visitNotComplex(ExpressionParser.NotComplexContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitRationalNumber(ExpressionParser.RationalNumberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitIntergerAtom(ExpressionParser.IntergerAtomContext ctx) {
        return new MyInteger(Integer.parseInt(ctx.getChild(0).getText()));
    }

    @Override
    public Expression visitRealAtom(ExpressionParser.RealAtomContext ctx) {
        return new MyReal(new BigDecimal(ctx.getChild(0).getText()));
    }

    @Override
    public Expression visitNegateAtom(ExpressionParser.NegateAtomContext ctx) {
        MyNumber number = (MyNumber) visit(ctx.getChild(1));
        return number.negate();
    }

    @Override
    public Expression visitRationalAtom(ExpressionParser.RationalAtomContext ctx) {
        int numerator = Integer.parseInt(ctx.getChild(0).getText());
        int denominator = Integer.parseInt(ctx.getChild(2).getText());

        return new MyRational(numerator,denominator);
    }

    @Override
    public Expression visitScientificAtom(ExpressionParser.ScientificAtomContext ctx) {
        MyNumber number = (MyNumber) visit(ctx.getChild(0));
        Expression exponent = visit(ctx.getChild(2));

        try {
            Expression exponentResult = new Exponent(Arrays.asList(new MyInteger(10),exponent));
            return new Times(Arrays.asList(number,exponentResult));
        } catch (IllegalConstruction e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Expression visitNotScientific(ExpressionParser.NotScientificContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitPositiveAtom(ExpressionParser.PositiveAtomContext ctx) {
        return visit(ctx.getChild(1));
    }

}

