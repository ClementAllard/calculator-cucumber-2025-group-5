package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryLogicOperation;

import java.util.List;

public final class Equivalence extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to apply Equivalence
     *
     * @param elist the list of Expressions to apply Equivalence
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Equivalence(List<Expression>, Notation)
     */
    public /*constructor*/ Equivalence(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to apply Equivalence,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to apply Equivalence
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #Equivalence(List<Expression>)
     */
    public Equivalence(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.isEmpty()) {
            throw new IllegalConstruction();
        }
        symbol = "<=>";
    }

    /**
     * The actual computation of the (binary) logical Equivalence of two boolean values
     * @param l The first boolean
     * @param r The second boolean
     * @return True if they have the same boolean value, False otherwise
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getValue().compareTo(r.getValue()) == 0) { // If l == r
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }
}