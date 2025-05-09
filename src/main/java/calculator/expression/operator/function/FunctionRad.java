package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;


public class FunctionRad extends Function {
    /**
     * Class constructor specifying the arguments of a function.
     *
     * @param expression Expressions as arguments of the function.
     * @param functionName the name of the function.
     */
    public FunctionRad(Expression expression, String functionName) throws IllegalConstruction {
        super(expression, functionName);
    }

    /**
     * define the logic when the number is integer
     * @param l the integer value
     * @return real value from degree to radiant
     */
    @Override
    protected MyNumber op(MyInteger l) {
        return new MyReal(BigDecimal.valueOf(l.getValue() * Math.PI / 180));
    }

    /**
     * define the logic when the number is rational
     * @param l the rational value
     * @return real value from degree to radiant.
     */
    @Override
    protected MyNumber op(MyRational l) {
        return new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
    }

    /**
     * define the logic when the number is real
     * @param l the real number
     * @return real value from degree to radiant.
     */
    @Override
    protected MyNumber op(MyReal l) {
        return new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
    }

    /**
     * define the logic when the number is complex.
     * @param l the complex number
     * @return complex in radiant.
     */
    @Override
    protected MyNumber op(MyComplex l) {
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        return new MyReal(BigDecimal.valueOf(radiant));
    }
}
