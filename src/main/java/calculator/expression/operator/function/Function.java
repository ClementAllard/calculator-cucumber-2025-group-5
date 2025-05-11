package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import calculator.expression.operator.UnaryOperation;

import java.math.BigDecimal;

public abstract class Function extends UnaryOperation {
    protected Function(Expression expression,  String functionName) throws IllegalConstruction {
        super(expression, functionName);
    }

    @Override
    protected MyNumber op(MyInteger l) {
        return op(l.getValue());
    }

    @Override
    protected MyNumber op(MyRational l) {
        return op(l.getReal());
    }

    @Override
    protected MyNumber op(MyReal l) {
        return op(l.getValue());
    }

    abstract MyNumber op(BigDecimal l);
}