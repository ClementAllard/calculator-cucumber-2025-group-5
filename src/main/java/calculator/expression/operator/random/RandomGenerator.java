package calculator.expression.operator.random;

import calculator.expression.number.*;

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
        if (max < 0){
            throw new IllegalArgumentException(ERROR_MSG);
        }
        BigDecimal numerator = BigDecimal.valueOf(random.nextInt(max + 1));
        BigDecimal denominator = BigDecimal.valueOf(random.nextInt(max + 1));

        // One way to avoid division by zero.
        if (denominator.compareTo(BigDecimal.ZERO) == 0){
            denominator = BigDecimal.ONE;
        }
        return new MyRational(numerator, denominator);
    }

    default MyReal randomReal(int ignoredMax, long seed) {
        Random random = new Random(seed);
        // No need to check negative max, since it is ignored.
        return new MyReal(BigDecimal.valueOf(random.nextDouble()));
    }

    default MyComplex randomComplex(int ignoredMax, long seed) {
        Random random = new Random(seed);
        // No need to check negative max, since it is ignored.
        BigDecimal real = BigDecimal.valueOf(random.nextDouble());
        BigDecimal imaginary = BigDecimal.valueOf(random.nextDouble());
        return new MyComplex(real, imaginary);
    }
}