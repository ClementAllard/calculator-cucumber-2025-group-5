package calculator.expression.operator.function.trigono;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import calculator.expression.operator.function.FunctionTan;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionTanTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(30);
    MyRational myRational = new MyRational(1,3);
    MyReal myReal = new MyReal(BigDecimal.valueOf(Math.PI / 4)); // tan(pi/4) = 1
    MyComplex myComplex = new MyComplex(new BigDecimal("1"),new BigDecimal("2"));

    @Test
    void testTan() {
        try {
            Expression expression = new FunctionTan(myInteger);
            assertEquals("-6.4053311966", calculator.eval(expression)); // tan(30)

            expression = new FunctionTan(myRational);
            assertEquals("0.3462535495", calculator.eval(expression)); // tan(1/3)

            expression = new FunctionTan(myReal);
            assertEquals("1", calculator.eval(expression)); // tan(pi/4)

            expression = new FunctionTan(myComplex);
            assertEquals("0.0338128260798966 + 1.0147936161466335i", calculator.eval(expression)); // tan(1+2i)

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }
}
