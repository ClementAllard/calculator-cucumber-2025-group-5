package calculator.expression.operator.function;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FunctionLnTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void testLn() {
        try {
            Expression expression = new FunctionLn(myInteger);
            assertEquals("2.1972245773",calculator.eval(expression));

            expression = new FunctionLn(myReal);
            assertEquals("-0.6931471806",calculator.eval(expression));

            expression = new FunctionLn(myRational);
            assertEquals("-0.6931471806",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () -> calculator.eval(new FunctionLn(myComplex)));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }
}