package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyNumber;

public class RandomComplex extends FunctionRandomUnary implements RandomGenerator{
    public RandomComplex(Expression expression) throws IllegalConstruction {
        super(expression, "rComplex");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        // In this case max is the seed and the seed has to be ignored.
        return randomComplex(0, max);
    }
}
