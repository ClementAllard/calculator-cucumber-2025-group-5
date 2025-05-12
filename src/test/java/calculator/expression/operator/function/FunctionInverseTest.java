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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionInverseTest {

    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void testInverse(){
        try {
            Expression expression = new FunctionInverse(myInteger);
            assertEquals("0.1111111111",calculator.eval(expression));

            expression = new FunctionInverse(myReal);
            assertEquals("2",calculator.eval(expression));

            expression = new FunctionInverse(myRational);
            assertEquals("2",calculator.eval(expression));

            expression = new FunctionInverse(myComplex);
            assertEquals("1 - 1i",calculator.eval(expression));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }
}