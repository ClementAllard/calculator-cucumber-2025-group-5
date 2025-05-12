package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.operator.BinaryOperation;

import java.util.List;

public abstract class FunctionBinary extends BinaryOperation {
    protected FunctionBinary(List<Expression> elist, String functionName) throws IllegalConstruction {
        super(elist,functionName);
    }
}