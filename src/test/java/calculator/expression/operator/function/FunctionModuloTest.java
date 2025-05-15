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

class FunctionModuloTest {
    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(5);
    MyRational myRational = new MyRational(10,4);
    MyReal myReal = new MyReal(new BigDecimal("5.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("5"), BigDecimal.ONE);
    MyComplex myFalseComplex = new MyComplex(new BigDecimal("5"), BigDecimal.ZERO);

    @Test
    void TestOperationIntegerBase() {
        try {
            Expression expression = new FunctionModulo(Arrays.asList(myInteger, myInteger));
            assertEquals("0",calculator.eval(expression));

            expression = new FunctionModulo(Arrays.asList(myInteger, myRational));
            assertEquals("0",calculator.eval(expression));

            expression = new FunctionModulo(Arrays.asList(myInteger, myReal));
            assertEquals("5",calculator.eval(expression));

            final Expression error = new FunctionModulo(Arrays.asList(myInteger, myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error));

            expression = new FunctionModulo(Arrays.asList(myInteger, myFalseComplex));
            assertEquals("0", calculator.eval(expression));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRationalBase() {
        try {
            Expression expression = new FunctionModulo(Arrays.asList(myRational, myInteger));
            assertEquals("2.5",calculator.eval(expression));

            expression = new FunctionModulo(Arrays.asList(myRational, myRational));
            assertEquals("0",calculator.eval(expression));

            expression = new FunctionModulo(Arrays.asList(myRational, myReal));
            assertEquals("2.5",calculator.eval(expression));

            final Expression error = new FunctionModulo(Arrays.asList(myRational, myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error));

            expression = new FunctionModulo(Arrays.asList(myRational, myFalseComplex));
            assertEquals("2.5", calculator.eval(expression));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRealBase() {
        try {
            Expression expression = new FunctionModulo(Arrays.asList(myReal, myInteger));
            assertEquals("0.5",calculator.eval(expression));

            expression = new FunctionModulo(Arrays.asList(myReal, myRational));
            assertEquals("0.5",calculator.eval(expression));

            expression = new FunctionModulo(Arrays.asList(myReal, myReal));
            assertEquals("0",calculator.eval(expression));

            final Expression error = new FunctionModulo(Arrays.asList(myReal, myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error));

            expression = new FunctionModulo(Arrays.asList(myReal, myFalseComplex));
            assertEquals("0.5", calculator.eval(expression));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationComplexBase() {
        try {
            final Expression error1 = new FunctionModulo(Arrays.asList(myComplex, myInteger));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error1));

            final Expression error2 = new FunctionModulo(Arrays.asList(myComplex, myRational));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error2));

            final Expression error3 = new FunctionModulo(Arrays.asList(myComplex, myReal));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error3));

            final Expression error4 = new FunctionModulo(Arrays.asList(myComplex, myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error4));

            Expression expression = new FunctionModulo(Arrays.asList(myFalseComplex, myFalseComplex));
            assertEquals("0", calculator.eval(expression));
        } catch (IllegalConstruction | ExecutionControl.NotImplementedException _){
            fail();
        }
    }
}