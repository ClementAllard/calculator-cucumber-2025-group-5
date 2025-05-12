package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionCos extends Function {
    public FunctionCos(Expression expression) throws IllegalConstruction {
        super(expression, "cos");
    }

    /**
     * return the cosinus of a radiant value.
     * @param l radiant number
     * @return cosinus
     */
    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.cos(l.doubleValue())));
    }

    /**
     * cos(a+bi) = cos(a) cosh(b) - i sin(a) sinh(b)
     * @param l complex number
     * @return cosinus
     */
    @Override
    protected MyNumber op(MyComplex l) {
        double realPart = Math.cos(l.getReal().doubleValue()) * Math.cosh(l.getImaginary().doubleValue());
        double imaginaryPart = -Math.sin(l.getReal().doubleValue()) * Math.sinh(l.getImaginary().doubleValue());
        return new MyComplex(BigDecimal.valueOf(realPart), BigDecimal.valueOf(imaginaryPart));
    }
}
