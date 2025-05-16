package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.UnaryLogicOperation;

import java.math.BigDecimal;

public final class LogicalNot extends UnaryLogicOperation {

    public LogicalNot(Expression expression) throws IllegalConstruction {
        super(expression, null);
        if (expression == null) {
            throw new IllegalConstruction();
        }
        symbol = "NOT";
    }

    @Override
    protected MyNumber op(MyInteger l) {
        if (l.getValue().compareTo(BigDecimal.ZERO) == 0) { // If l == 0
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }
}