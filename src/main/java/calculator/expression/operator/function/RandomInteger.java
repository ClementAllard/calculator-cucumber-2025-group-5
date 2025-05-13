package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;

import java.math.BigDecimal;
import java.util.Random;

public class RandomInteger extends Function {
    public RandomInteger(Expression expression) throws IllegalConstruction {
        super(expression, "rInt");
    }

    private MyNumber randomInt(int max, long seed) {
        int min = 0;
        Random random = new Random(seed);
        // Generates between a and b (inclusive)
        try{
            return new MyInteger(random.nextInt(max - min + 1) + min);
        } catch(Exception e){
            throw new IllegalArgumentException(symbol + " require a positive value as argument.");
        }

    }

    @Override
    MyNumber op(BigDecimal l) {
        return randomInt(l.intValue(), System.currentTimeMillis());
    }

    @Override
    protected MyNumber op(MyComplex l) {
        return randomInt(l.getReal().intValue(), System.currentTimeMillis());
    }
}
