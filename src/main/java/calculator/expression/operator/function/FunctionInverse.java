package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;

public class FunctionInverse extends Function {
    public FunctionInverse(Expression expression, String functionName) throws IllegalConstruction {
        super(expression, functionName);
    }

    @Override
    protected MyNumber op(MyInteger l) {
        return new MyReal(BigDecimalUtil.divide(BigDecimal.valueOf(1), BigDecimal.valueOf(l.getValue())));
    }

    @Override
    protected MyNumber op(MyRational l) {
        return new MyRational(l.getDenominator(), l.getNumerator());
    }

    @Override
    protected MyNumber op(MyReal l) {
        return new MyReal(BigDecimalUtil.divide(BigDecimal.valueOf(1), l.getValue()));
    }

    @Override
    protected MyNumber op(MyComplex l) {
        BigDecimal real = BigDecimalUtil.divide(l.getReal(), l.getReal().pow(2).add(l.getImaginary().pow(2)));
        BigDecimal imaginary = BigDecimalUtil.divide(l.getImaginary(), l.getReal().pow(2).add(l.getImaginary().pow(2)));
        return new MyComplex(real, imaginary);
    }
}
