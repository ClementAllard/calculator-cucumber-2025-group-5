package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.BinaryLogicOperation;

import java.math.BigDecimal;
import java.util.List;

public final class LogicalNand extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to LogicalNand
     *
     * @param elist the list of Expressions to LogicalNand
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #LogicalNand(List<Expression>, Notation)
     */
    public /*constructor*/ LogicalNand(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to LogicalNand,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to LogicalNand
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #LogicalNand(List<Expression>)
     */
    public LogicalNand(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.isEmpty()) {
            throw new IllegalConstruction();
        }
        symbol = "NAND";
    }

    /**
     * The actual computation of the (binary) logical nand of two boolean values
     * @param l The first boolean
     * @param r The second boolean
     * @return False if both boolean are True, True otherwise
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) { // If l != 0 and r != 0
            return new MyInteger(0);
        } else {
            return new MyInteger(1);
        }
    }
}