package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionTan extends Function {
    public FunctionTan(Expression expression) throws IllegalConstruction {
        super(expression, "tan");
    }

    /**
     * return the tangent of a radiant value.
     * @param l radiant number
     * @return tangent
     */
    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.tan(l.doubleValue())));
    }

    /**
     * tan(z) = sin(z) / cos(z)
     * where sin(z) and cos(z) are computed using their complex formulas.
     * @param l complex number
     * @return tangent
     */
    @Override
    protected MyNumber op(MyComplex l) {
        // sin(z)
        double sinRe = Math.sin(l.getReal().doubleValue()) * Math.cosh(l.getImaginary().doubleValue());
        double sinIm = Math.cos(l.getReal().doubleValue()) * Math.sinh(l.getImaginary().doubleValue());

        // cos(z)
        double cosRe = Math.cos(l.getReal().doubleValue()) * Math.cosh(l.getImaginary().doubleValue());
        double cosIm = -Math.sin(l.getReal().doubleValue()) * Math.sinh(l.getImaginary().doubleValue());

        // tan(z) = sin(z) / cos(z)
        double denominator = cosRe * cosRe + cosIm * cosIm;
        double realPart = (sinRe * cosRe + sinIm * cosIm) / denominator;
        double imaginaryPart = (sinIm * cosRe - sinRe * cosIm) / denominator;

        return new MyComplex(BigDecimal.valueOf(realPart), BigDecimal.valueOf(imaginaryPart));
    }
}
