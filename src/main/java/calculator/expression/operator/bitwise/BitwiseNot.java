package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.UnaryLogicOperation;

import java.math.BigDecimal;

public final class BitwiseNot extends UnaryLogicOperation {

    public BitwiseNot(Expression expression) throws IllegalConstruction {
        super(expression, null);
        if (expression == null) {
            throw new IllegalConstruction();
        }
        symbol = "~";
    }

    @Override
    protected MyNumber op(MyInteger l) {
        if (l.getValue().equals(BigDecimal.ZERO)) {
            return new MyInteger(1);
        } else if (l.getValue().equals(BigDecimal.ONE)) {
            return new MyInteger(0);
        } else if (l.getBase() == 2) {
            String representation = l.getBaseRepresentation();
            String max = "1".repeat(representation.length());
            int notValue = Integer.parseInt(max) - Integer.parseInt(representation);
            return new MyInteger(new BigDecimal(notValue), l.getBase());
        } else {throw new UnsupportedOperationException("Bitwise operations only support binary numbers");}
    }
}