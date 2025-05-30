package calculator.expression.operator.basic;

import calculator.expression.Expression;
import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryOperation;
import calculator.expression.operator.Operation;

import java.math.BigDecimal;
import java.util.List;

/** This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Plus
 * @see Times
 * @see Divides
 */
public final class Minus extends BinaryOperation {

    /**
    * Class constructor specifying a number of Expressions to subtract.
    *
    * @param elist The list of Expressions to subtract
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Minus(List< Expression >, Notation )
    */
    public /*constructor*/ Minus(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
    * Class constructor specifying a number of Expressions to subtract,
    * as well as the Notation used to represent the operation.
    *
    * @param elist The list of Expressions to subtract
    * @param n The Notation to be used to represent the operation
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Minus(List<Expression>)
    * @see Operation#Operation(List<Expression>,Notation)
    */
    public Minus(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist,n);
        symbol = "-";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two numbers
     * @param l The first number
     * @param r The second number that should be subtracted from the first
     * @return The number that is the result of the subtraction
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue().subtract(r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        BigDecimal minusPart = l.getValue().multiply(r.getDenominator());
        return new MyRational(minusPart.subtract(r.getNumerator()), r.getDenominator());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(l.getValue().subtract(r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return new MyComplex(l.getValue().subtract(r.getReal()),r.getImaginary().negate());
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        BigDecimal minusPart = r.getValue().multiply(l.getDenominator());
        return new MyRational(l.getNumerator().subtract(minusPart), l.getDenominator());
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        BigDecimal newDenominator = l.getDenominator().multiply(r.getDenominator());
        BigDecimal newNumerator = l.getNumerator().multiply(r.getDenominator()).subtract(r.getNumerator().multiply(l.getDenominator()));
        return new MyRational(newNumerator, newDenominator);
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(l.getReal().subtract(r.getValue()));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return new MyComplex(l.getReal().subtract(r.getReal()), r.getImaginary().negate());
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(l.getValue().subtract(r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return new MyReal(l.getValue().subtract(r.getReal()));
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(l.getValue().subtract(r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return new MyComplex(l.getValue().subtract(r.getReal()), r.getImaginary().negate());
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        return new MyComplex(l.getReal().subtract(r.getValue()),l.getImaginary());
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        return new MyComplex(l.getReal().subtract(r.getReal()),l.getImaginary());
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        return new MyComplex(l.getReal().subtract(r.getValue()),l.getImaginary());
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        return new MyComplex(l.getReal().subtract(r.getReal()), l.getImaginary().subtract(r.getImaginary()));
    }
}
