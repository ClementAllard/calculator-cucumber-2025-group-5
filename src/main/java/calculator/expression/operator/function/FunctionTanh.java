package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;
import calculator.expression.operator.basic.Divides;

import java.math.BigDecimal;
import java.util.Arrays;

public class FunctionTanh extends Function {
    public FunctionTanh(Expression expression) throws IllegalConstruction {
        super(expression, "tanh");
    }

    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.tanh(l.doubleValue())));
    }

    /**
     * tanh(z) = sinh(z) / cosh(z)
     */
    @Override
    protected MyNumber op(MyComplex z) {
        // Use Divides, FunctionSinh and FunctionCosh
        try {
            MyComplex sinh = (MyComplex) new FunctionSinh(z).op(z);
            MyComplex cosh = (MyComplex) new FunctionCosh(z).op(z);
            return new Divides(Arrays.asList(sinh, cosh)).op(sinh, cosh);
        } catch (Exception e) {
            throw new IllegalArgumentException("Tanh error: " + e.getMessage());
        }
    }
}
