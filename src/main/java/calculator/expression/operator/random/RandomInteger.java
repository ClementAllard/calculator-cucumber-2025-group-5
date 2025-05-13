package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyNumber;

public class RandomInteger extends FunctionRandomUnary implements RandomGenerator{
    public RandomInteger(Expression expression) throws IllegalConstruction {
        super(expression, "rInt");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        return randomInteger(max, seed);
    }
}