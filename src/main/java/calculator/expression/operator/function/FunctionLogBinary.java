package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

public class FunctionLogBinary extends FunctionBinary {
    static final String COMPLEX_NUMBER_ERROR = "Invalid argument: The logarithm of a complex number is undefined.";
    static final String COMPLEX_BASE_ERROR = "Invalid argument: The logarithm with a complex base is undefined.";
    static final String NEGATIVE_BASE_ERROR = "Invalid argument: The logarithm with a negative base or zero is undefined.";
    static final String NEGATIVE_NUMBER_ERROR = "Invalid argument: The logarithm with a negative number or zero is undefined.";
    static final String BASE_ERROR = "Invalid argument: The logarithm with a base 1 is undefined.";
    public FunctionLogBinary(List<Expression> elist) throws IllegalConstruction {
        super(elist, "log");
    }

    protected MyNumber op(BigDecimal base, BigDecimal number) {
        if (base.equals(BigDecimal.ONE)) {throw new IllegalArgumentException(BASE_ERROR);}
        if (base.compareTo(BigDecimal.ZERO) <= 0) {throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);}
        if (number.compareTo(BigDecimal.ZERO) <= 0) {throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);}
        return new MyReal(BigDecimal.valueOf(Math.log(number.doubleValue()) / Math.log(base.doubleValue())));
    }

    @Override
    protected MyNumber op(MyInteger base, MyInteger number) {
        return op(base.getValue(), number.getValue());
    }

    @Override
    protected MyNumber op(MyInteger base, MyRational number) {
        return op(base.getValue(), number.getReal());
    }

    @Override
    protected MyNumber op(MyInteger base, MyReal number) {
        return op(base.getValue(), number.getValue());
    }

    @Override
    protected MyNumber op(MyInteger base, MyComplex number) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyRational base, MyInteger number) {
        return op(base.getReal(), number.getValue());
    }

    @Override
    protected MyNumber op(MyRational base, MyRational number) {
        return op(base.getReal(), number.getReal());
    }

    @Override
    protected MyNumber op(MyRational base, MyReal number) {
        return op(base.getReal(), number.getValue());
    }

    @Override
    protected MyNumber op(MyRational base, MyComplex number) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyReal base, MyInteger number) {
        return op(base.getValue(), number.getValue());
    }

    @Override
    protected MyNumber op(MyReal base, MyRational number) {
        return op(base.getValue(), number.getReal());
    }

    @Override
    protected MyNumber op(MyReal base, MyReal number) {
        return op(base.getValue(), number.getValue());
    }

    @Override
    protected MyNumber op(MyReal base, MyComplex number) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex base, MyInteger number) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex base, MyRational number) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex base, MyReal number) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex base, MyComplex number) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }
}
