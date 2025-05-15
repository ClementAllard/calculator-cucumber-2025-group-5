package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionSin extends Function{
    public FunctionSin(Expression expression) throws IllegalConstruction {
        super(expression, "sin");
    }

    /**
     * return the sinus of a radiant value.
     * @param l radiant number
     * @return sinus
     */
    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.sin(l.doubleValue())));
    }

    /**
     * sin(a+bi) = sin(a) cosh(b) + i cos(a) sinh(b)
     * @param l complex number
     * @return sinus
     */
    @Override
    protected MyNumber op(MyComplex l) {
        double realPart = Math.sin(l.getReal().doubleValue()) * Math.cosh(l.getImaginary().doubleValue());
        double imaginaryPart = Math.cos(l.getReal().doubleValue()) * Math.sinh(l.getImaginary().doubleValue());
        return new MyComplex(BigDecimal.valueOf(realPart), BigDecimal.valueOf(imaginaryPart));
    }
}
