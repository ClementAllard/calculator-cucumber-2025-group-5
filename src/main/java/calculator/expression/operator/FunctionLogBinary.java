package calculator.expression.operator;

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
    public FunctionLogBinary(List<Expression> elist, String functionName) throws IllegalConstruction {
        super(elist, functionName);
    }

    @Override
    protected MyNumber op(MyInteger base, MyInteger number) {
        if (base.getValue() == 1) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getValue() <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getValue() <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getValue()) / Math.log(base.getValue())));
    }

    @Override
    protected MyNumber op(MyInteger base, MyRational number) {
        if (base.getValue() == 1) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getValue() <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getReal().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getReal().doubleValue()) / Math.log(base.getValue())));
    }

    @Override
    protected MyNumber op(MyInteger base, MyReal number) {
        if (base.getValue() == 1) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getValue() <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getValue().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getValue().doubleValue()) / Math.log(base.getValue())));
    }

    @Override
    protected MyNumber op(MyInteger base, MyComplex number) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyRational base, MyInteger number) {
        if (base.getReal().equals(BigDecimal.ONE)) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getReal().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getValue() <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getValue()) / Math.log(base.getReal().doubleValue())));
    }

    @Override
    protected MyNumber op(MyRational base, MyRational number) {
        if (base.getReal().equals(BigDecimal.ONE)) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getReal().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getReal().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getReal().doubleValue()) / Math.log(base.getReal().doubleValue())));
    }

    @Override
    protected MyNumber op(MyRational base, MyReal number) {
        if (base.getReal().equals(BigDecimal.ONE)) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getReal().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getValue().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getValue().doubleValue()) / Math.log(base.getReal().doubleValue())));
    }

    @Override
    protected MyNumber op(MyRational base, MyComplex number) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyReal base, MyInteger number) {
        if (base.getValue().equals(BigDecimal.ONE)) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getValue().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getValue() <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getValue()) / Math.log(base.getValue().doubleValue())));
    }

    @Override
    protected MyNumber op(MyReal base, MyRational number) {
        if (base.getValue().equals(BigDecimal.ONE)) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getValue().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getReal().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getReal().doubleValue()) / Math.log(base.getValue().doubleValue())));
    }

    @Override
    protected MyNumber op(MyReal base, MyReal number) {
        if (base.getValue().equals(BigDecimal.ONE)) throw new IllegalArgumentException(BASE_ERROR);
        if (base.getValue().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_BASE_ERROR);
        if (number.getValue().compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException(NEGATIVE_NUMBER_ERROR);
        return new MyReal(BigDecimal.valueOf(Math.log(number.getValue().doubleValue()) / Math.log(base.getValue().doubleValue())));
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
