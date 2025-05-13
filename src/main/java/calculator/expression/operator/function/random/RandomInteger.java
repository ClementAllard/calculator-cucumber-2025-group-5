package calculator.expression.operator.function.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;

import java.util.Random;

public class RandomInteger extends FunctionRandomUnary {
    public RandomInteger(Expression expression) throws IllegalConstruction {
        super(expression, "rInt");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        Random random = new Random(seed);
        // Generates between a and b (inclusive)
        if (max < 0) {
            throw new IllegalArgumentException(symbol + " require a positive value as argument.");
        }
        return new MyInteger(random.nextInt(max + 1));
    }
}