package calculator.expression.operator.function;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.basic.Plus;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FunctionSqrtTest {

    Calculator calculator = new Calculator();

    MyInteger myInteger = new MyInteger(9);
    MyRational myRational = new MyRational(1,2);
    MyReal myReal = new MyReal(new BigDecimal("0.5"));
    MyComplex myComplex = new MyComplex(new BigDecimal("0.5"),new BigDecimal("0.5"));

    @Test
    void TestOperationIntegerBase() {
        try {
            // pow(sqrt(n1, n2), n1) = n2
            MyNumber n1 = myInteger;
            MyNumber n2 = myInteger;
            Expression expression = new FunctionSqrt(Arrays.asList(n1,n2));
            Expression result = new FunctionPow(Arrays.asList(expression, n1));
            assertEquals(calculator.eval(n2),calculator.eval(result));

            n1 = myInteger;
            n2 = myRational;
            expression = new FunctionSqrt(Arrays.asList(n1,n2));
            result = new FunctionPow(Arrays.asList(expression, n1));
            // forces real comparison
            Expression realConvert = new Plus(Arrays.asList(n2, new MyReal(new BigDecimal("0.0"))));
            assertEquals(calculator.eval(realConvert), calculator.eval(result));

            n1 = myInteger;
            n2 = myReal;
            expression = new FunctionSqrt(Arrays.asList(n1,n2));
            result = new FunctionPow(Arrays.asList(expression, n1));
            assertEquals(calculator.eval(n2),calculator.eval(result));

            // Undefined for complexes.
            final Expression error = new FunctionSqrt(Arrays.asList(myInteger,myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRationalBase() {
        try {
            // pow(sqrt(n1, n2), n1) = n2
            MyNumber n1 = myRational;
            MyNumber n2 = myInteger;
            Expression expression = new FunctionSqrt(Arrays.asList(n1,n2));
            Expression result = new FunctionPow(Arrays.asList(expression, n1));
            assertEquals(calculator.eval(n2),calculator.eval(result));

            n1 = myRational;
            n2 = myRational;
            expression = new FunctionSqrt(Arrays.asList(n1,n2));
            result = new FunctionPow(Arrays.asList(expression, n1));
            // forces real comparison
            Expression realConvert = new Plus(Arrays.asList(n2, new MyReal(new BigDecimal("0.0"))));
            assertEquals(calculator.eval(realConvert), calculator.eval(result));

            n1 = myRational;
            n2 = myReal;
            expression = new FunctionSqrt(Arrays.asList(n1,n2));
            result = new FunctionPow(Arrays.asList(expression, n1));
            assertEquals(calculator.eval(n2),calculator.eval(result));

            // Undefined for complexes.
            final Expression error = new FunctionSqrt(Arrays.asList(myRational,myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationRealBase() {
        try {
            // pow(sqrt(n1, n2), n1) = n2
            MyNumber n1 = myReal;
            MyNumber n2 = myInteger;
            Expression expression = new FunctionSqrt(Arrays.asList(n1,n2));
            Expression result = new FunctionPow(Arrays.asList(expression, n1));
            assertEquals(calculator.eval(n2),calculator.eval(result));

            n1 = myReal;
            n2 = myRational;
            expression = new FunctionSqrt(Arrays.asList(n1,n2));
            result = new FunctionPow(Arrays.asList(expression, n1));
            // forces real comparison
            Expression realConvert = new Plus(Arrays.asList(n2, new MyReal(new BigDecimal("0.0"))));
            assertEquals(calculator.eval(realConvert), calculator.eval(result));

            n1 = myReal;
            n2 = myReal;
            expression = new FunctionSqrt(Arrays.asList(n1,n2));
            result = new FunctionPow(Arrays.asList(expression, n1));
            assertEquals(calculator.eval(n2),calculator.eval(result));

            // Undefined for complexes.
            final Expression error = new FunctionSqrt(Arrays.asList(myReal,myComplex));
            assertThrows(IllegalArgumentException.class, () -> calculator.eval(error));

        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void TestOperationComplexBase() throws IllegalConstruction {
        final Expression error1 = new FunctionSqrt(Arrays.asList(myComplex,myInteger));
        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(error1));

        final Expression error2 = new FunctionSqrt(Arrays.asList(myComplex,myRational));
        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(error2));

        final Expression error3 = new FunctionSqrt(Arrays.asList(myComplex,myReal));
        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(error3));

        final Expression error4 = new FunctionSqrt(Arrays.asList(myComplex,myComplex));
        assertThrows(IllegalArgumentException.class, () ->
                calculator.eval(error4));
    }
}
