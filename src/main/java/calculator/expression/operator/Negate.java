package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;

import java.util.Collections;
import java.util.List;

public final class Negate extends UnaryOperation{

    public Negate(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "-";
    }

    public Negate(Expression expression) throws IllegalConstruction {
        this(Collections.singletonList(expression), null);
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
