package calculator.expression.operator.basic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryOperation;

import java.math.BigDecimal;
import java.util.List;

public class Power extends BinaryOperation {
    static final String COMPLEX_BASE_ERROR = "Exponent with a complex base is undefined";
    static final String COMPLEX_EXPONENT_ERROR = "Exponent with a complex exponent is undefined";

    public Power(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
    }

    public Power(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    private BigDecimal power(BigDecimal l, BigDecimal r) {
        return BigDecimal.valueOf(Math.pow(l.doubleValue(),r.doubleValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(power(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return new MyReal(power(l.getValue(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(power(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        BigDecimal numerator = power(l.getNumerator(),r.getValue());
        BigDecimal denominator = power(l.getDenominator(),r.getValue());

        return new MyRational(numerator, denominator);
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return new MyReal(power(l.getReal(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(power(l.getReal(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(power(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return new MyReal(power(l.getValue(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(power(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }
}
