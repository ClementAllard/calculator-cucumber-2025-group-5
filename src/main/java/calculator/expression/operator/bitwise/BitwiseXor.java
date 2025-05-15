package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryLogicOperation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public final class BitwiseXor extends BinaryLogicOperation {

    /**
     * Class constructor specifying a number of Expressions to apply BitwiseXor
     *
     * @param elist the list of Expressions to apply BitwiseXor
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #BitwiseXor(List<Expression>, Notation)
     */
    public /*constructor*/ BitwiseXor(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to apply BitwiseXor,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to apply BitwiseXor
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #BitwiseXor(List<Expression>)
     */
    public BitwiseXor(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        if (elist.isEmpty()) {
            throw new IllegalConstruction();
        }
        symbol = "^^";
    }

    /**
     * @param l The first binary
     * @param r The second binary
     * @return The actual computation of the BitwiseXor of two binary values
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        int lbase = l.getBase();
        int rbase = r.getBase();
        String lvalue = l.getBaseRepresentation();
        String rvalue = r.getBaseRepresentation();
        BigInteger b1 = new BigInteger(lvalue, lbase);
        BigInteger b2 = new BigInteger(rvalue, rbase);

        boolean lValid = (lbase == 2) || b1.equals(BigInteger.ZERO) || b1.equals(BigInteger.ONE);
        boolean rValid = (rbase == 2) || b2.equals(BigInteger.ZERO) || b2.equals(BigInteger.ONE);

        if (lValid && rValid) {
            BigInteger result = b1.xor(b2);
            return new MyInteger(new BigDecimal(result));
        } else throw new UnsupportedOperationException("Bitwise operations only support binary numbers");
    }
}