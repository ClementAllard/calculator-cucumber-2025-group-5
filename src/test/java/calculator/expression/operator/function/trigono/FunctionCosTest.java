package calculator.expression.operator.function.trigono;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import calculator.expression.operator.function.FunctionCos;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionCosTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(30);
    MyRational myRational = new MyRational(1,3);
    MyReal myReal = new MyReal(BigDecimal.valueOf(0)); // cos(0) = 1
    MyComplex myComplex = new MyComplex(new BigDecimal("1"),new BigDecimal("2"));

    @Test
    void testCos() {
        try {
            Expression expression = new FunctionCos(myInteger);
            assertEquals("0.1542514499", calculator.eval(expression)); // cos(30)

            expression = new FunctionCos(myRational);
            assertEquals("0.9449569463", calculator.eval(expression)); // cos(1/3)

            expression = new FunctionCos(myReal);
            assertEquals("1", calculator.eval(expression)); // cos(0)

            expression = new FunctionCos(myComplex);
            assertEquals("2.0327230070196656 - 3.0518977991518i", calculator.eval(expression)); // cos(1+2i)

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }
}
