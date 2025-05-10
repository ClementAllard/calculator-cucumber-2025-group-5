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

class FunctionLogTest {

    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void testLogarithm() {
        try {
            Expression expression = new FunctionLog(myInteger);
            assertEquals("0.9542425094",calculator.eval(expression));

            expression = new FunctionLog(myReal);
            assertEquals("-0.3010299957",calculator.eval(expression));

            expression = new FunctionLog(myRational);
            assertEquals("-0.3010299957",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () -> calculator.eval(new FunctionLog(myComplex)));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

}