package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.UnaryLogicOperation;

import java.math.BigDecimal;

public final class BitwiseLeft extends UnaryLogicOperation {

    private final Integer number;

    public BitwiseLeft(Expression expression) throws IllegalConstruction {
        super(expression, null);
        symbol = "<<";
        this.number = 1;
    }

    public BitwiseLeft(Expression expression, String number) throws IllegalConstruction {
        super(expression, null);
        symbol = "<<";
        this.number = Integer.parseInt(number);
    }

    @Override
    protected MyNumber op(MyInteger l) {
        return new MyInteger(l.getValue().multiply(BigDecimal.valueOf(Math.pow(2, number))));
    }
}