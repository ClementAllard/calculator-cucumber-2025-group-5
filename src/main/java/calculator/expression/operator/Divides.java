package calculator.expression.operator;

import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

/** This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends Operation {

    /**
    * Class constructor specifying a number of Expressions to divide.
    *
    * @param elist The list of Expressions to divide
    * @throws IllegalConstruction    If an empty list of expressions if passed as parameter
    * @see #Divides(List< Expression >, Notation )
    */
    public /*constructor*/ Divides(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to divide,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to divide
     * @param n The Notation to be used to represent the operation
     * @throws IllegalConstruction  If an empty list of expressions if passed as parameter
     * @see #Divides(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Divides(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist,n);
        symbol = "/";
        neutral = 1;
    }

    /**
     * The actual computation of the (binary) arithmetic division of two numbers
     * @param l The first number
     * @param r The second number that should divide the first
     * @return The number that is the result of the division
     */
    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyRational(l.getValue(),r.getValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return new MyRational(l.getValue() * r.getDenominator(),r.getNumerator());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(BigDecimalUtil.divide(new BigDecimal(l.getValue()),r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return diviserParComplexe(new BigDecimal(l.getValue()),r);
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return new MyRational(l.getNumerator(),l.getDenominator() * r.getValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return new MyRational(l.getNumerator() * r.getDenominator(),l.getDenominator() * r.getNumerator());
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(BigDecimalUtil.divide(l.getReal(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return diviserParComplexe(l.getReal(),r);
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(BigDecimalUtil.divide(l.getValue(),new BigDecimal(r.getValue())));
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return new MyReal(BigDecimalUtil.divide(l.getValue(),r.getReal()));
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(BigDecimalUtil.divide(l.getValue(),r.getValue()));
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return diviserParComplexe(l.getValue(),r);
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        BigDecimal newReal = BigDecimalUtil.divide(l.getReal(),new BigDecimal(r.getValue()));
        BigDecimal newImaginary = BigDecimalUtil.divide(l.getImaginary(),new BigDecimal(r.getValue()));
        return new MyComplex(newReal,newImaginary);
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        BigDecimal newReal = BigDecimalUtil.divide(l.getReal(),r.getReal());
        BigDecimal newImaginary = BigDecimalUtil.divide(l.getImaginary(),r.getReal());
        return new MyComplex(newReal,newImaginary);
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        BigDecimal newReal = BigDecimalUtil.divide(l.getReal(),r.getValue());
        BigDecimal newImaginary = BigDecimalUtil.divide(l.getImaginary(),r.getValue());
        return new MyComplex(newReal,newImaginary);
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        BigDecimal denom = r.getReal().multiply(r.getReal()).add(r.getImaginary().multiply(r.getImaginary()));

        BigDecimal newReal = l.getReal().multiply(r.getReal()).add(l.getImaginary().multiply(r.getImaginary()));
        BigDecimal newImaginary = l.getImaginary().multiply(r.getReal()).subtract(l.getReal().multiply(r.getImaginary()));

        newReal = BigDecimalUtil.divide(newReal, denom);
        newImaginary = BigDecimalUtil.divide(newImaginary, denom);

        return new MyComplex(newReal, newImaginary);
    }


    private MyComplex diviserParComplexe(BigDecimal num, MyComplex r) {
        BigDecimal denom = r.getReal().multiply(r.getReal()).add(r.getImaginary().multiply(r.getImaginary()));

        BigDecimal newReal = num.multiply(r.getReal());
        BigDecimal newImaginary = num.multiply(r.getImaginary()).negate();

        newReal = BigDecimalUtil.divide(newReal, denom);
        newImaginary = BigDecimalUtil.divide(newImaginary, denom);

        return new MyComplex(newReal, newImaginary);
    }
}
