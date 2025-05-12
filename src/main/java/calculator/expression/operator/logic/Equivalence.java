package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryOperation;

import java.math.BigDecimal;
import java.util.List;

public final class Equivalence extends BinaryOperation {

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
        if ((l.getValue().compareTo(r.getValue()) == 0)) { // If l == r
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        if ((l.getValue().compareTo(r.getNumerator()) == 0)) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        if ((l.getValue().compareTo(r.getValue()) == 0)) {
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
        if ((l.getNumerator().compareTo(r.getValue()) == 0)) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        if ((l.getNumerator().compareTo(r.getNumerator()) == 0)) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        if ((l.getNumerator().compareTo(r.getValue()) == 0)) {
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
        if ((l.getValue().compareTo(r.getValue()) == 0)) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        if ((l.getValue().compareTo(r.getDenominator()) == 0)) {
            return new MyInteger(1);
        } else {
            return new MyInteger(0);
        }
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        if ((l.getValue().compareTo(r.getValue()) == 0)) {
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