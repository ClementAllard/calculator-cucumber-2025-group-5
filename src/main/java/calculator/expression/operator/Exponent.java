package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

public final class Exponent extends BinaryOperation {

    /**
     * Class constructor specifying a number of Expressions to exponentiate.
     *
     * @param elist The list of Expressions to exponentiate
     * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
     * @see #Exponent(List< Expression >, Notation )
     */
    public Exponent(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to exponentiate,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to exponentiate
     * @param n The Notation to be used to represent the operation
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Exponent(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Exponent(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
        neutral = 1;
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getValue(), r.getValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getValue(), r.getReal().doubleValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getValue(), r.getValue().doubleValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return null;
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getReal().doubleValue(), r.getValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getReal().doubleValue(), r.getReal().doubleValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getReal().doubleValue(), r.getValue().doubleValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return null;
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getReal().doubleValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        BigDecimal bd = BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue().doubleValue()));
        return new MyReal(bd);
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return null;
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        return null;
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        return null;
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        return null;
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        return null;
    }
}
