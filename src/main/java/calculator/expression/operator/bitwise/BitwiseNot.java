package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.UnaryLogicOperation;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class BitwiseNot extends UnaryLogicOperation {

    public BitwiseNot(Expression expression) throws IllegalConstruction {
        super(expression, null);
        symbol = "~";
    }

    @Override
    protected MyNumber op(MyInteger l) {
        BigInteger value = l.getValue().toBigInteger();
        value = value.not();
        return new MyInteger(new BigDecimal(value), l.getBase());
    }
}