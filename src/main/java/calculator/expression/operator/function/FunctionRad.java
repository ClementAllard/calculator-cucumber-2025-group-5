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
     */
    public FunctionRad(Expression expression) throws IllegalConstruction {
        super(expression, "rad");
    }

    /**
     * define the logic when the number is integer
     * @param l the integer value
     * @return real value from degree to radiant
     */
    @Override
    protected MyNumber op(MyInteger l) {
        return op(l.getValue());
    }

    /**
     * define the logic when the number is rational
     * @param l the rational value
     * @return real value from degree to radiant.
     */
    @Override
    protected MyNumber op(MyRational l) {
        return op(l.getReal());
    }

    /**
     * define the logic when the number is real
     * @param l the real number
     * @return real value from degree to radiant.
     */
    @Override
    protected MyNumber op(MyReal l) {
        return op(l.getValue());
    }

    private MyNumber op(BigDecimal l){
        BigDecimal bd = BigDecimalUtil.preciseDivide(BigDecimal.valueOf(Math.PI), BigDecimal.valueOf(180));
        return new MyReal(l.multiply(bd));
    }

    /**
     * define the logic when the number is complex.
     * @param l the complex number
     * @return complex in radiant.
     */
    @Override
    protected MyNumber op(MyComplex l) {
        double radiant = Math.atan2(l.getImaginary().doubleValue(),l.getReal().doubleValue()); // degree to rad
        return new MyReal(BigDecimal.valueOf(radiant));
    }
}
