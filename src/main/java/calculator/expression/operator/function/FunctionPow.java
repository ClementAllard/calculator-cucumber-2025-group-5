package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

public class FunctionPow extends FunctionBinary {
    static final String COMPLEX_BASE_ERROR = "Exponent with a complex base is undefined";
    static final String COMPLEX_EXPONENT_ERROR = "Exponent with a complex exponent is undefined";
    public FunctionPow(List<Expression> elist) throws IllegalConstruction {
        super(elist,"pow");
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue().doubleValue())));
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getReal().doubleValue())));
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue().doubleValue())));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        double numerator = Math.pow(l.getNumerator().doubleValue(), r.getValue().doubleValue());
        double denominator = Math.pow(l.getDenominator().doubleValue(),r.getValue().doubleValue());
        return new MyRational(BigDecimal.valueOf(numerator), BigDecimal.valueOf(denominator));
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
        return new MyReal(BigDecimal.valueOf(Math.pow(l.getValue().doubleValue(), r.getValue().doubleValue())));
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