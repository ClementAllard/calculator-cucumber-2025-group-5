package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionSinh extends Function {
    public FunctionSinh(Expression expression) throws IllegalConstruction {
        super(expression, "sinh");
    }

    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.sinh(l.doubleValue())));
    }

    /**
     * sinh(a+bi) = sinh(a)cos(b) + i cosh(a)sin(b)
     */
    @Override
    protected MyNumber op(MyComplex z) {
        double a = z.getReal().doubleValue();
        double b = z.getImaginary().doubleValue();

        double real = Math.sinh(a) * Math.cos(b);
        double imag = Math.cosh(a) * Math.sin(b);

        return new MyComplex(BigDecimal.valueOf(real), BigDecimal.valueOf(imag));
    }
}
