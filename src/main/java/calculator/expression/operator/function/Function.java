package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.operator.UnaryOperation;

public abstract class Function extends UnaryOperation {
    protected Function(Expression expression,  String functionName) throws IllegalConstruction {
        super(expression, functionName);
    }
}