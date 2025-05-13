package calculator.expression.operator.random;

import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyRational;

import java.math.BigDecimal;
import java.util.Random;

public interface RandomGenerator {
    String ERROR_MSG = "Random generator require a positive high bound.";
    default MyNumber randomInteger(int max, long seed) {
        Random random = new Random(seed);
        // Generates between a and b (inclusive)
        if (max < 0){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        return new MyInteger(random.nextInt(max + 1));
    }

    default MyRational randomRational(int max, long seed){
        Random random = new Random(seed);
        // Generates between a and b (inclusive)
        if (max < 0){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        BigDecimal numerator = BigDecimal.valueOf(random.nextInt(max));
        BigDecimal denominator = BigDecimal.valueOf(random.nextInt(max));

        // One way to avoid division by zero.
        if (denominator.compareTo(BigDecimal.ZERO) == 0){
            denominator = BigDecimal.ONE;
        }
        return new MyRational(numerator, denominator);
    }
}
