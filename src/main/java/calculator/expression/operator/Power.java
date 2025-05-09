package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

public class Power extends BinaryOperation {
    static final String COMPLEX_BASE_ERROR = "Exponent with a complex base is undefined";
    static final String COMPLEX_EXPONENT_ERROR = "Exponent with a complex exponent is undefined";

    public Power(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyReal( BigDecimal.valueOf(Math.pow(l.getValue(), r.getValue())));
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        double numerator = Math.pow(l.getValue(), r.getNumerator());
        double denominator = Math.pow(l.getValue(), (double) 1 / r.getDenominator());
        return new MyReal(BigDecimal.valueOf(numerator*denominator));
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue(), r.getValue().doubleValue())));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getReal().doubleValue(), r.getValue())));
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getReal().doubleValue(), r.getReal().doubleValue())));
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getReal().doubleValue(), r.getValue().doubleValue())));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue())));
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getReal().doubleValue())));
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue().doubleValue())));
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
