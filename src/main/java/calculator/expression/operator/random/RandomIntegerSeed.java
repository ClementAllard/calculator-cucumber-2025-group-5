package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.util.List;

public class RandomIntegerSeed extends FunctionRandomBinary implements RandomGenerator {
    public RandomIntegerSeed(List<Expression> elist) throws IllegalConstruction {
        super(elist, "rIntSeed");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        return randomInteger(max, seed);
    }
}