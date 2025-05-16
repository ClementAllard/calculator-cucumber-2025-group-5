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
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestPower {

    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void TestOperationIntegerBase() {
        try {
            Expression expression = new Power(Arrays.asList(myInteger,myInteger));
            assertEquals("387420489",calculator.eval(expression));

            expression = new Power(Arrays.asList(myInteger,myRational));
            assertEquals("3",calculator.eval(expression));

            expression = new Power(Arrays.asList(myInteger,myReal));
            assertEquals("3",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () ->
                    calculator.eval(new Power(Arrays.asList(myInteger,myComplex))));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRationalBase() {
        try {
            Expression expression = new Power(Arrays.asList(myRational,myInteger));
            assertEquals("1/512",calculator.eval(expression));

            expression = new Power(Arrays.asList(myRational,myRational));
            assertEquals("0.7071067812",calculator.eval(expression));

            expression = new Power(Arrays.asList(myRational,myReal));
            assertEquals("0.7071067812",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () ->
                    calculator.eval(new Power(Arrays.asList(myRational,myComplex))));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRealBase() {
        try {
            Expression expression = new Power(Arrays.asList(myReal,myInteger));
            assertEquals("0.001953125",calculator.eval(expression));

            expression = new Power(Arrays.asList(myReal,myRational));
            assertEquals("0.7071067812",calculator.eval(expression));

            expression = new Power(Arrays.asList(myReal,myReal));
            assertEquals("0.7071067812",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () ->
                    calculator.eval(new Power(Arrays.asList(myReal,myComplex))));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationComplexBase() {
        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new Power(Arrays.asList(myComplex,myInteger))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new Power(Arrays.asList(myComplex,myRational))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new Power(Arrays.asList(myComplex,myReal))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new Power(Arrays.asList(myComplex,myComplex))));

    }

}