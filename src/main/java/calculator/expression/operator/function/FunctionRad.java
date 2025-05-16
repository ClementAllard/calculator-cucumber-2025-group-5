package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

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
     * define the logic when the number is not complex.
     * @param l the number
     * @return the radiant.
     */
    @Override
    protected MyNumber op(BigDecimal l){
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
