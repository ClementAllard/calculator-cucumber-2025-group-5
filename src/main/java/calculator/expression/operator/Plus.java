package calculator.expression.operator;

import calculator.expression.Expression;
import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

/** This class represents the arithmetic sum operation "+".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Times
 * @see Divides
 */
public final class Plus extends Operation {

    /**
    * Class constructor specifying a number of Expressions to add.
    *
    * @param elist The list of Expressions to add
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Plus(List< Expression >, Notation )
    */
    public /*constructor*/ Plus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
    * Class constructor specifying a number of Expressions to add,
    * as well as the Notation used to represent the operation.
    *
    * @param elist The list of Expressions to add
    * @param n The Notation to be used to represent the operation
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Plus(List<Expression>)
    * @see Operation#Operation(List<Expression>,Notation)
    */
    public Plus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist,n);
        symbol = "+";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) arithmetic addition of two numbers
     * @param l The first number
     * @param r The second number that should be multiplied with the first
     * @return The number that is the result of the addition
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue() + r.getValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
     int addingPart = l.getValue() * r.getDenominator();
        return new MyRational(r.getNumerator() + addingPart, r.getDenominator());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(r.getValue().add(new BigDecimal(l.getValue())));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return new MyComplex(r.getReal().add(new BigDecimal(l.getValue())), r.getImaginary());
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        int newDenominator = l.getDenominator() * r.getDenominator();
        int newNumerator = l.getNumerator() * r.getDenominator() + r.getNumerator() * l.getDenominator();
        return new MyRational(newNumerator, newDenominator);
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(r.getValue().add(l.getReal()));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return new MyComplex(r.getReal().add(l.getReal()), r.getImaginary());
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(l.getValue().add(r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
         return new MyComplex(l.getValue().add(r.getReal()), r.getImaginary());
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
         return new MyComplex(l.getReal().add(r.getReal()), l.getImaginary().add(r.getImaginary()));
    }
}
