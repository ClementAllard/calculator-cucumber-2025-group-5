package calculator.expression.operator.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyNumber;

import java.util.List;

public class RandomRationalSeed extends FunctionRandomBinary implements RandomGenerator{
    public RandomRationalSeed(List<Expression> elist) throws IllegalConstruction {
        super(elist, "rRationalSeed");
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        return randomRational(max, seed);
    }
}