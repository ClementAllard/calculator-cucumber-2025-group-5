package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.UnaryOperation;

import java.util.Objects;

public abstract class FunctionRandomUnary extends UnaryOperation implements HasNumber {
    protected FunctionRandomUnary(Expression expression, String symbol) throws IllegalConstruction {
        super(expression, symbol);
    }

    MyNumber number;

    protected abstract MyNumber randomNumber(int max, long seed);

    @Override
    protected MyNumber op(MyInteger l) {
        return randomNumber(l.getValue().intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyRational l) {
        return randomNumber(l.getReal().intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyReal l) {
        return randomNumber(l.getValue().intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyComplex l) {
        return randomNumber(l.getReal().intValue(), System.currentTimeMillis());
    }

    public MyNumber getRandValue() throws IllegalConstruction {
        return getRandValue(this);
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        return Objects.equals(this.number, ((FunctionRandomUnary) other).number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number);
    }

    @Override
    public MyNumber getNumber() {
        return number;
    }

    @Override
    public void setNumber(MyNumber number) {
        this.number = number;
    }
}
