package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;

import java.util.List;

public abstract class FunctionBinary extends BinaryOperation{
    protected FunctionBinary(List<Expression> elist, String functionName) throws IllegalConstruction {
        super(elist);
        symbol = functionName;
    }
}