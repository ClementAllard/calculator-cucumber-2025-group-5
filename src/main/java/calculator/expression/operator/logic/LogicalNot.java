package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.UnaryOperation;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public final class LogicalNot extends UnaryOperation {

    public LogicalNot(Expression expression) throws IllegalConstruction {
        super(expression, null);
        symbol = "not";
    }

    @Override
    protected MyNumber op(MyInteger l) {
        if (l.getValue().compareTo(BigDecimal.ZERO) == 0) { // If l == 0
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyRational l) {
        if (l.getNumerator().compareTo(BigDecimal.ZERO) == 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyReal l) {
        if (l.getValue().compareTo(BigDecimal.ZERO) == 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyComplex l) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }
}