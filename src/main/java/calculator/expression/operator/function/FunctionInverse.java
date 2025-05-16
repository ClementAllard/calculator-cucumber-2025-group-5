package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionInverse extends Function {
    public FunctionInverse(Expression expression) throws IllegalConstruction {
        super(expression, "inv");
    }

    @Override
    protected MyNumber op(MyRational l) {
        return new MyRational(l.getDenominator(), l.getNumerator());
    }

    @Override
    protected MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimalUtil.divide(BigDecimal.valueOf(1), l));
    }

    @Override
    protected MyNumber op(MyComplex l) {
        BigDecimal real = BigDecimalUtil.divide(l.getReal(), l.getReal().pow(2).add(l.getImaginary().pow(2)));
        BigDecimal imaginary = BigDecimalUtil.divide(l.getImaginary().negate(), l.getReal().pow(2).add(l.getImaginary().pow(2)));
        return new MyComplex(real, imaginary);
    }
}
