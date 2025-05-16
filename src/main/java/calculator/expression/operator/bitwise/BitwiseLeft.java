package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.UnaryLogicOperation;

import java.math.BigDecimal;

public final class BitwiseLeft extends UnaryLogicOperation {

    private final Integer number;

    public BitwiseLeft(Expression expression) throws IllegalConstruction {
        super(expression, null);
        if (expression == null) {
            throw new IllegalConstruction();
        }
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
        if (l.getBase() == 2 || l.getValue().equals(BigDecimal.ZERO) || l.getValue().equals(BigDecimal.ONE)) {
            return new MyInteger(l.getValue().multiply(BigDecimal.valueOf(Math.pow(2, number))));
        } else throw new UnsupportedOperationException("Bitwise operations only support binary numbers");
    }
}