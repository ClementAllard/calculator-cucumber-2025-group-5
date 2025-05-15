package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryLogicOperation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public final class BitwiseNand extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to apply BitwiseAnd
     *
     * @param elist the list of Expressions to apply BitwiseAnd
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #BitwiseNand(List<Expression>, Notation)
     */
    public /*constructor*/ BitwiseNand(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to apply BitwiseAnd,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to apply BitwiseAnd
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #BitwiseNand(List<Expression>)
     */
    public BitwiseNand(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.isEmpty()) {
            throw new IllegalConstruction();
        }
        symbol = "~&";
    }

    /**
     * @param l The first binary
     * @param r The second binary
     * @return The actual computation of the BitwiseAnd of two binary values
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getBase() == 2 && r.getBase() == 2) {
            String binary1 = l.getBaseRepresentation();
            String binary2 = r.getBaseRepresentation();
            BigInteger b1 = new BigInteger(binary1, 2);
            BigInteger b2 = new BigInteger(binary2, 2);
            BigInteger andResult = b1.and(b2);
            int bitLength = Math.max(binary1.length(), binary2.length());
            BigInteger mask = BigInteger.ONE.shiftLeft(bitLength).subtract(BigInteger.ONE);
            BigInteger result = andResult.not().and(mask);
            return new MyInteger(new BigDecimal(result));
        } else throw new UnsupportedOperationException("Bitwise operations only support binary numbers");
    }
}