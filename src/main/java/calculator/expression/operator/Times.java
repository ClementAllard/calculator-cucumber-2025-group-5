package calculator.expression.operator;

import calculator.expression.Expression;
import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

/** This class represents the arithmetic multiplication operation "*".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Plus
 * @see Divides
 */
public final class Times extends Operation {

    /**
    * Class constructor specifying a number of Expressions to multiply.
    *
    * @param elist The list of Expressions to multiply
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Times(List< Expression >, Notation )
    */
    public /*constructor*/ Times(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
    * Class constructor specifying a number of Expressions to multiply,
    * as well as the Notation used to represent the operation.
    *
    * @param elist The list of Expressions to multiply
    * @param n The Notation to be used to represent the operation
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Times(List<Expression>)
    * @see Operation#Operation(List<Expression>,Notation)
    */
    public Times(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist,n);
        symbol = "*";
        neutral = 1;
    }

    /**
     * The actual computation of the (binary) arithmetic multiplication of two numbers
     * @param l The first number
     * @param r The second number that should be multiplied with the first
     * @return The number that is the result of the multiplication
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyInteger(l.getValue() * r.getValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return new MyRational(l.getValue() * r.getNumerator(), r.getDenominator());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(new BigDecimal(l.getValue()).multiply(r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return new MyComplex(new BigDecimal(l.getValue()).multiply(r.getReal()), new BigDecimal(l.getValue()).multiply(r.getImaginary()));
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return op(r,l);
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return new MyRational(l.getNumerator() * r.getNumerator(), l.getDenominator() * r.getDenominator());
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(l.getReal().multiply(r.getValue()));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return new MyComplex(l.getReal().multiply(r.getReal()), l.getReal().multiply(r.getImaginary()));
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
        return new MyReal(l.getValue().multiply(r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return new MyComplex(l.getValue().multiply(r.getReal()), l.getValue().multiply(r.getImaginary()));
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
        BigDecimal realPart = l.getReal().multiply(r.getReal()).subtract(l.getImaginary().multiply(r.getImaginary()));
        BigDecimal imagaryPart = l.getReal().multiply(r.getImaginary()).add(l.getImaginary().multiply(r.getReal()));
        return new MyComplex(realPart, imagaryPart);
    }
}
