package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionDegree extends Function {
    public FunctionDegree(Expression expression) throws IllegalConstruction {
        super(expression, "degree");
    }

    @Override
    protected MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimalUtil.divide(l.multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
    }

    @Override
    protected MyNumber op(MyComplex l) {
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        double degrees = Math.toDegrees(radiant); // rad to degree
        return new MyReal(BigDecimal.valueOf(degrees));
    }
}
