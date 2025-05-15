package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyNumber;

public class RandomRational extends FunctionRandomUnary implements RandomGenerator{
    public RandomRational(Expression expression) throws IllegalConstruction {
        super(expression, "rRational");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        return randomRational(max, seed);
    }
}