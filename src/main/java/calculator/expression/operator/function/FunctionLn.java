package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;

public class FunctionLn extends Function {
    static final String NEGATIVE_ERROR_STRING = "Invalid argument: The value inside log must be positive.";
    public FunctionLn(Expression expression) throws IllegalConstruction {
        super(expression, "ln");
    }

    @Override
    protected MyNumber op(BigDecimal l) {
        if (l.compareTo(BigDecimal.ZERO) > 0){
            return new MyReal(BigDecimal.valueOf(Math.log(l.doubleValue())));
        } else {
            throw new IllegalArgumentException(NEGATIVE_ERROR_STRING);
        }
    }

    @Override
    protected MyNumber op(MyComplex l) {
        throw new IllegalArgumentException("Invalid argument: The logarithm of a complex is undefined.");
    }
}
