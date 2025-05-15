package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryLogicOperation;

import java.math.BigDecimal;
import java.util.List;

public final class LogicalXor extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to apply LogicalXor
     *
     * @param elist the list of Expressions to LogicalXor
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #LogicalXor(List<Expression>, Notation)
     */
    public /*constructor*/ LogicalXor(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to apply LogicalXor,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to LogicalXor
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #LogicalXor(List<Expression>)
     */
    public LogicalXor(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.isEmpty()) {
            throw new IllegalConstruction();
        }
        symbol = "XOR";
    }

    /**
     * The actual computation of the (binary) logical xor of two boolean values
     * @param l The first boolean
     * @param r The second boolean
     * @return True if only one of the booleans is True, False is both are false or both are true
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 ^ r.getValue().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }
}