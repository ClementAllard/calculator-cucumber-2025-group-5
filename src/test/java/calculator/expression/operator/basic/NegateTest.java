package calculator.expression.operator.basic;

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

class NegateTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void testRad(){
        try {
            Expression expression = new Negate(myInteger);
            assertEquals("-9",calculator.eval(expression));

            expression = new Negate(myReal);
            assertEquals("-0.5",calculator.eval(expression));

            expression = new Negate(myRational);
            assertEquals("-1/2",calculator.eval(expression));

            expression = new Negate(myComplex);
            assertEquals("-0.5 - 0.5i",calculator.eval(expression));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }
}