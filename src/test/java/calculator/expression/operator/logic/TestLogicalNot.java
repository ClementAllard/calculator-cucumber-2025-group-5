package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;
import calculator.expression.operator.Operation;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TestLogicalNot {

    @Test
    void testLogicalNotZero() throws IllegalConstruction {
        try {
            MyNumber operand = new MyInteger(0);
            Operation not = new LogicalNot(operand);
            MyNumber result = not.op(operand);
            assertEquals(new MyInteger(1), result);
        } catch (ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testLogicalNotNonZeroPositive() throws IllegalConstruction {
        try {
            MyNumber operand = new MyInteger(5);
            Operation not = new LogicalNot(operand);
            MyNumber result = not.op(operand);
            assertEquals(new MyInteger(0), result);
        } catch (ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testLogicalNotNegative() throws IllegalConstruction {
        try {
            MyNumber operand = new MyInteger(-3);
            Operation not = new LogicalNot(operand);
            MyNumber result = not.op(operand);
            assertEquals(new MyInteger(0), result);
        } catch (ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        Expression operand = new MyInteger(1);
        Operation not = new LogicalNot(operand);
        assertEquals("not", not.getSymbol());
    }

    @Test
    void testIllegalConstructionNull() {
        assertThrows(IllegalConstruction.class, () -> new LogicalNot(null));
    }

    @Test
    void testIllegalConstructionNotInteger() throws IllegalConstruction {
        MyNumber real = new MyReal(new BigDecimal(0));
        Operation not = new LogicalNot(real);
        assertThrows(UnsupportedOperationException.class, () -> not.op(real));
    }

    @Test
    void testIllegalConstructionTwoOperands() throws IllegalConstruction{
        MyNumber real = new MyReal(new BigDecimal(0));
        Operation not = new LogicalNot(real);
        assertThrows(ArithmeticException.class, () -> not.op(real,real));
    }
}