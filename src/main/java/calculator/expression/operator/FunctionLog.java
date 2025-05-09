package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

public class FunctionLog extends Function{
    static final String NEGATIVE_ERROR_STRING = "Invalid argument: The value inside log must be positive.";
    public FunctionLog(List<Expression> elist, String functionName) throws IllegalConstruction {
        super(elist, functionName);
    }

    @Override
    protected MyNumber op(MyInteger l) {

        if (l.getValue() > 0){
            return new MyReal(BigDecimal.valueOf(Math.log10(l.getValue())));
        } else {
            throw new IllegalArgumentException(NEGATIVE_ERROR_STRING);
        }
    }

    @Override
    protected MyNumber op(MyRational l) {
        if (l.getReal().compareTo(BigDecimal.ZERO) > 0){
            return new MyReal(BigDecimal.valueOf(Math.log10(l.getReal().doubleValue())));
        } else {
            throw new IllegalArgumentException(NEGATIVE_ERROR_STRING);
        }
    }

    @Override
    protected MyNumber op(MyReal l) {
        if (l.getValue().compareTo(BigDecimal.ZERO) > 0){
            return new MyReal(BigDecimal.valueOf(Math.log10(l.getValue().doubleValue())));
        } else {
            throw new IllegalArgumentException(NEGATIVE_ERROR_STRING);
        }
    }

    @Override
    protected MyNumber op(MyComplex l) {
        throw new IllegalArgumentException("Invalid argument: The logarithm of a complex is undefined.");
    }
}
