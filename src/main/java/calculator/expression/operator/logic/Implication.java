package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryLogicOperation;

import java.math.BigDecimal;
import java.util.List;

public final class Implication extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to Implies
     *
     * @param elist the list of Expressions to Implies
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Implication(List<Expression>, Notation)
     */
    public /*constructor*/ Implication(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to Implies,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to Implies
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Implication(List<Expression>)
     */
    public Implication(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "=>";
    }

    /**
     * The actual computation of the (binary) logical implication of two boolean values
     * @param l The first boolean
     * @param r The second boolean
     * @return False if l is true and r is false, True otherwise
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) == 0) { // If l != 0 and r == 0
            return new MyInteger(0);
        } else {
            return new MyInteger(1);
        }
    }
}