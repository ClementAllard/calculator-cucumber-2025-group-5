package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyNumber;

public class RandomReal extends FunctionRandomUnary implements RandomGenerator{
    public RandomReal(Expression expression) throws IllegalConstruction {
        super(expression, "randomReal");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        // In this case max is the seed and the seed has to be ignored.
        return randomReal(0, max);
    }
}
