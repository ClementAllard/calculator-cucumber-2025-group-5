package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionCosh extends Function {
    public FunctionCosh(Expression expression) throws IllegalConstruction {
        super(expression, "cosh");
    }

    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.cosh(l.doubleValue())));
    }

    /**
     * cosh(a+bi) = cosh(a)cos(b) + i sinh(a)sin(b)
     */
    @Override
    protected MyNumber op(MyComplex z) {
        double a = z.getReal().doubleValue();
        double b = z.getImaginary().doubleValue();

        double real = Math.cosh(a) * Math.cos(b);
        double imag = Math.sinh(a) * Math.sin(b);

        return new MyComplex(BigDecimal.valueOf(real), BigDecimal.valueOf(imag));
    }
}
