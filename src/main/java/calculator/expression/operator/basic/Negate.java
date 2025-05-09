package calculator.expression.operator.basic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.UnaryOperation;

public final class Negate extends UnaryOperation {

    public Negate(Expression expression) throws IllegalConstruction {
        super(expression, null);
        symbol = "-";
    }

    @Override
    protected MyNumber op(MyInteger l) {
        return new MyInteger(-l.getValue());
    }

    @Override
    protected MyNumber op(MyRational l) {
        return new MyRational(-l.getNumerator(), l.getDenominator());
    }

    @Override
    protected MyNumber op(MyReal l) {
        return new MyReal(l.getValue().negate());
    }

    @Override
    protected MyNumber op(MyComplex l) {
        return new MyComplex(l.getReal().negate(), l.getImaginary().negate());
    }
}
