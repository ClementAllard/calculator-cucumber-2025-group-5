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

class FunctionSinTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(30);
    MyRational myRational = new MyRational(1,3);
    MyReal myReal = new MyReal(BigDecimal.valueOf(Math.PI/2));
    MyComplex myComplex = new MyComplex(new BigDecimal("1"),new BigDecimal("2"));

    @Test
    void testInverse(){
        try {
            Expression expression = new FunctionSin(myInteger);
            assertEquals("-0.9880316241",calculator.eval(expression));

            assertEquals(1, Math.sin(Math.PI/2));

            expression = new FunctionSin(myRational);
            assertEquals("0.3271946968",calculator.eval(expression));

            expression = new FunctionSin(myReal);
            assertEquals("1",calculator.eval(expression));

            expression = new FunctionSin(myComplex);
            assertEquals("3.165778513216168 + 1.9596010414216063i",calculator.eval(expression));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }
}
