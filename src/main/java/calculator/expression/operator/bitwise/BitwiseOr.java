package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryLogicOperation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public final class BitwiseOr extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to LogicalAnd
     *
     * @param elist the list of Expressions to LogicalAnd
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #BitwiseOr(List<Expression>, Notation)
     */
    public /*constructor*/ BitwiseOr(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to LogicalAnd,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to LogicalAnd
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #BitwiseOr(List<Expression>)
     */
    public BitwiseOr(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "|";
    }

    /**
     * The actual computation of the (binary) logical and of two boolean values
     * @param l The first boolean
     * @param r The second boolean
     * @return True if both boolean are True, False otherwise
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getBase() == 2) {
            String binary1 = l.getBaseRepresentation();
            String binary2 = r.getBaseRepresentation();
            BigInteger b1 = new BigInteger(binary1, 2);
            BigInteger b2 = new BigInteger(binary2, 2);
            BigInteger result = b1.or(b2);
            return new MyInteger(new BigDecimal(result));
        } else throw new UnsupportedOperationException("Bitwise operations only support binary numbers");
    }
}