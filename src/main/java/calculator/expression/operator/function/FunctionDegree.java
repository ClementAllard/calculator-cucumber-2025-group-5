package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;

public class FunctionDegree extends Function {
    public FunctionDegree(Expression expression, String functionName) throws IllegalConstruction {
        super(expression, functionName);
    }

    @Override
    protected MyNumber op(MyInteger l) {
        return new MyReal(BigDecimal.valueOf(l.getValue() / Math.PI * 180));
    }

    @Override
    protected MyNumber op(MyRational l) {
        return new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
    }

    @Override
    protected MyNumber op(MyReal l) {
        return new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
    }

    @Override
    protected MyNumber op(MyComplex l) {
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        double degrees = Math.toDegrees(radiant); // rad to degree
        return new MyReal(BigDecimal.valueOf(degrees));
    }
}
