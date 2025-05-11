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

    private BigDecimal pow(BigDecimal l, BigDecimal r) {
        return BigDecimal.valueOf(Math.pow(l.doubleValue(),r.doubleValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(pow(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return new MyReal(pow(l.getValue(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(pow(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        BigDecimal numerator = pow(l.getNumerator(),r.getValue());
        BigDecimal denominator = pow(l.getDenominator(),r.getValue());

        return new MyRational(numerator, denominator);
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return new MyReal(pow(l.getReal(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(pow(l.getReal(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_EXPONENT_ERROR);
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(pow(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return new MyReal(pow(l.getValue(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(pow(l.getValue(),r.getValue()));
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