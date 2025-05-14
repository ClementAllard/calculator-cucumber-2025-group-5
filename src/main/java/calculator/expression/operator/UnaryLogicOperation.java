package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.util.Collections;
import java.util.Objects;

public abstract class UnaryLogicOperation extends Operation {

    protected UnaryLogicOperation(Expression expression, String symbol) throws IllegalConstruction {
        super(Collections.singletonList(expression));
        this.symbol = symbol;
    }

    public MyNumber op(MyNumber myNumber) throws UnsupportedOperationException {
        if (Objects.requireNonNull(myNumber) instanceof MyInteger a) {
            return op(a);
        }
        throw new UnsupportedOperationException("The operation '" + getSymbol() + "' on "
                + myNumber.getClass() + " is not supported");
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) throws ArithmeticException {
        throw new ArithmeticException("The operation '" + getSymbol() + "' needs one operands");
    }

    protected abstract MyNumber op(MyInteger l);
}