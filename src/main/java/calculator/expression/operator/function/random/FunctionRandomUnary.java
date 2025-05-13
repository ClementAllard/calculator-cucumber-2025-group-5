package calculator.expression.operator.function.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.UnaryOperation;

abstract class FunctionRandomUnary extends UnaryOperation {
    protected FunctionRandomUnary(Expression expression, String symbol) throws IllegalConstruction {
        super(expression, symbol);
    }

    protected abstract MyNumber randomNumber(int max, long seed);

    @Override
    protected MyNumber op(MyInteger l) {
        return randomNumber(l.getValue().intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyRational l) {
        return randomNumber(l.getReal().intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyReal l) {
        return randomNumber(l.getValue().intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyComplex l) {
        return randomNumber(l.getReal().intValue(), System.currentTimeMillis());
    }
}
