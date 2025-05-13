package calculator.expression.operator.random;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

class RandomRationalSeedTest {
    Calculator calculator = new Calculator();
    MyInteger myInteger = new MyInteger(10);
    MyRational myRational = new MyRational(11, 2);
    MyReal myReal = new MyReal(BigDecimal.valueOf(13.16));
    MyComplex myComplex = new MyComplex(BigDecimal.valueOf(14), BigDecimal.valueOf(15));

    @Test
    void testRandomRationalSeedWithIntBase() {
        try {
            List<Expression> args = Arrays.asList(myInteger, myInteger);
            Expression expression = new RandomRationalSeed(args);
            assertEquals("1 2/3", calculator.eval(expression));

            args = Arrays.asList(myInteger, myRational);
            expression = new RandomRationalSeed(args);
            assertEquals("0", calculator.eval(expression));

            args = Arrays.asList(myInteger, myReal);
            expression = new RandomRationalSeed(args);
            assertEquals("2", calculator.eval(expression));

            args = Arrays.asList(myInteger, myComplex);
            expression = new RandomRationalSeed(args);
            assertEquals("1/9", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testRandomRationalSeedWithRationalBase(){
        try {
            List<Expression> args = Arrays.asList(myRational, myInteger);
            Expression expression = new RandomRationalSeed(args);
            assertEquals("3", calculator.eval(expression));

            args = Arrays.asList(myRational, myRational);
            expression = new RandomRationalSeed(args);
            assertEquals("1 1/4", calculator.eval(expression));

            args = Arrays.asList(myRational, myReal);
            expression = new RandomRationalSeed(args);
            assertEquals("1", calculator.eval(expression));

            args = Arrays.asList(myRational, myComplex);
            expression = new RandomRationalSeed(args);
            assertEquals("5", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testRandomRationalSeedWithRealBase(){
        try {
            List<Expression> args = Arrays.asList(myReal, myInteger);
            Expression expression = new RandomRationalSeed(args);
            assertEquals("1 1/8", calculator.eval(expression));

            args = Arrays.asList(myReal, myRational);
            expression = new RandomRationalSeed(args);
            assertEquals("2 1/4", calculator.eval(expression));

            args = Arrays.asList(myReal, myReal);
            expression = new RandomRationalSeed(args);
            assertEquals("1 1/2", calculator.eval(expression));

            args = Arrays.asList(myReal, myComplex);
            expression = new RandomRationalSeed(args);
            assertEquals("7/8", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testRandomRationalSeedWithComplexBase(){
        try {
            List<Expression> args = Arrays.asList(myComplex, myInteger);
            Expression expression = new RandomRationalSeed(args);
            assertEquals("3", calculator.eval(expression));

            args = Arrays.asList(myComplex, myRational);
            expression = new RandomRationalSeed(args);
            assertEquals("2/7", calculator.eval(expression));

            args = Arrays.asList(myComplex, myReal);
            expression = new RandomRationalSeed(args);
            assertEquals("7/10", calculator.eval(expression));

            args = Arrays.asList(myComplex, myComplex);
            expression = new RandomRationalSeed(args);
            assertEquals("5/9", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testRandomRationalSeedErrorCases(){
        MyInteger integer = new MyInteger(-10);
        MyRational rational = new MyRational(-11, 2);
        MyReal real = new MyReal(BigDecimal.valueOf(-13.16));
        MyComplex complex = new MyComplex(BigDecimal.valueOf(-14), BigDecimal.valueOf(15));
        try {
            List<Expression> args = Arrays.asList(integer, myInteger);
            final Expression error = new RandomRationalSeed(args);
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error));

            args = Arrays.asList(rational, myInteger);
            final Expression error2 = new RandomRationalSeed(args);
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error2));

            args = Arrays.asList(real, myInteger);
            final Expression error3 = new RandomRationalSeed(args);
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error3));

            args = Arrays.asList(complex, myInteger);
            final Expression error4 = new RandomRationalSeed(args);
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error4));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
