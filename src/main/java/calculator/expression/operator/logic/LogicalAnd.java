package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryOperation;

import java.math.BigDecimal;
import java.util.List;

public final class LogicalAnd extends BinaryOperation {

    /**
     * Class constructor specifying a number of Expressions to LogicalAnd
     *
     * @param elist the list of Expressions to LogicalAnd
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #LogicalAnd(List<Expression>, Notation)
     */
    public /*constructor*/ LogicalAnd(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to LogicalAnd,
     * as well as the Notation used to represent the operation.
     *
     * @param elist the list of Expressions to LogicalAnd
     * @param n the Notation to be used to represent the operation
     * @throws IllegalConstruction If an empty list of expressions if passed as parameter
     * @see #LogicalAnd(List<Expression>)
     */
    public LogicalAnd(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "and";
    }

    /**
     * The actual computation of the (binary) logical and of two boolean values
     * @param l The first boolean
     * @param r The second boolean
     * @return True if both boolean are True, False otherwise
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) { // If l != 0 and r != 0
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getNumerator().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        if (l.getNumerator().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        if (l.getNumerator().compareTo(BigDecimal.ZERO) != 0 && r.getNumerator().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        if (l.getNumerator().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getNumerator().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        if (l.getValue().compareTo(BigDecimal.ZERO) != 0 && r.getValue().compareTo(BigDecimal.ZERO) != 0) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        throw new IllegalArgumentException("No propositional logic for Complex Numbers");
    }
}