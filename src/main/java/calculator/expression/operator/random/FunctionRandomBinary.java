package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryOperation;

import java.util.List;

abstract class FunctionRandomBinary extends BinaryOperation {
    protected FunctionRandomBinary(List<Expression> elist, String symbol) throws IllegalConstruction {
        super(elist, symbol);
    }

    protected abstract MyNumber randomNumber(int max, long seed);

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return randomNumber(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return randomNumber(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return randomNumber(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return randomNumber(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return randomNumber(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return randomNumber(l.getReal().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return randomNumber(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return randomNumber(l.getReal().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return randomNumber(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return randomNumber(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return randomNumber(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return randomNumber(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        return randomNumber(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        return randomNumber(l.getReal().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        return randomNumber(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        return randomNumber(l.getReal().intValue(), r.getReal().longValue());
    }
}
