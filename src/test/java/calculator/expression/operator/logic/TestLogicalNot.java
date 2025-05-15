package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLogicalNot {

    @Test
    void testLogicalNotZero() throws IllegalConstruction {
        Expression operand = new MyInteger(0);
        LogicalNot not = new LogicalNot(operand);
        MyNumber result = not.op((MyInteger) operand);
        assertEquals(new MyInteger(1), result);
    }

    @Test
    void testLogicalNotNonZeroPositive() throws IllegalConstruction {
        Expression operand = new MyInteger(5);
        LogicalNot not = new LogicalNot(operand);
        MyNumber result = not.op((MyInteger) operand);
        assertEquals(new MyInteger(0), result);
    }

    @Test
    void testLogicalNotNegative() throws IllegalConstruction {
        Expression operand = new MyInteger(-3);
        LogicalNot not = new LogicalNot(operand);
        MyNumber result = not.op((MyInteger) operand);
        assertEquals(new MyInteger(0), result);
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        Expression operand = new MyInteger(1);
        LogicalNot not = new LogicalNot(operand);
        assertEquals("not", not.getSymbol());
    }

    @Test
    void testIllegalConstructionNull() {
        assertThrows(IllegalConstruction.class, () -> new LogicalNot(null));
    }
}