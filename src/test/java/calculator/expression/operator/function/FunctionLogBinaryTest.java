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
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FunctionLogBinaryTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void TestOperationIntegerBase() {
        try {
            Expression expression = new FunctionLogBinary(Arrays.asList(myInteger,myInteger));
            assertEquals("1",calculator.eval(expression));

            expression = new FunctionLogBinary(Arrays.asList(myInteger,myRational));
            assertEquals("-0.3154648768",calculator.eval(expression));

            expression = new FunctionLogBinary(Arrays.asList(myInteger,myReal));
            assertEquals("-0.3154648768",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () ->
                    calculator.eval(new FunctionLogBinary(Arrays.asList(myInteger,myComplex))));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRationalBase() {
        try {
            Expression expression = new FunctionLogBinary(Arrays.asList(myRational,myInteger));
            assertEquals("-3.1699250014",calculator.eval(expression));

            expression = new FunctionLogBinary(Arrays.asList(myRational,myRational));
            assertEquals("1",calculator.eval(expression));

            expression = new FunctionLogBinary(Arrays.asList(myRational,myReal));
            assertEquals("1",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () ->
                    calculator.eval(new FunctionLogBinary(Arrays.asList(myRational,myComplex))));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRealBase() {
        try {
            Expression expression = new FunctionLogBinary(Arrays.asList(myReal,myInteger));
            assertEquals("-3.1699250014",calculator.eval(expression));

            expression = new FunctionLogBinary(Arrays.asList(myReal,myRational));
            assertEquals("1",calculator.eval(expression));

            expression = new FunctionLogBinary(Arrays.asList(myReal,myReal));
            assertEquals("1",calculator.eval(expression));

            assertThrows(IllegalArgumentException.class, () ->
                    calculator.eval(new FunctionLogBinary(Arrays.asList(myReal,myComplex))));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationComplexBase() {
        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(myComplex,myInteger))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(myComplex,myRational))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(myComplex,myReal))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(myComplex,myComplex))));

    }

    @Test
    void TestOperationErrorCase(){
        MyInteger zero = new MyInteger(0);
        MyInteger one = new MyInteger(1);

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(zero,myInteger))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(one,myInteger))));

        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(new FunctionLogBinary(Arrays.asList(myInteger,zero))));
    }
}