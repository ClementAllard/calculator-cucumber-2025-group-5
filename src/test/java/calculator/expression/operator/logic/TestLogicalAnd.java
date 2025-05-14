package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestLogicalAnd {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testLogicalAndTrue() throws IllegalConstruction {
        LogicalAnd and = new LogicalAnd(Arrays.asList(one, one));
        MyNumber result = and.op(one, one); // 1 and 1
        assertEquals(new MyInteger(1), result);
    }

    @Test
    void testLogicalAndFalseCombinations() throws IllegalConstruction {
        LogicalAnd and = new LogicalAnd(Arrays.asList(one, zero));
        assertEquals(new MyInteger(0), and.op(one, zero)); // 1 and 0
        assertEquals(new MyInteger(0), and.op(zero, one)); // 0 and 1
        assertEquals(new MyInteger(0), and.op(zero, zero)); // 0 and 0
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        LogicalAnd and = new LogicalAnd(Arrays.asList(one, one));
        assertEquals("and", and.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new LogicalAnd(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        LogicalAnd and = new LogicalAnd(Arrays.asList(one, one), Notation.INFIX);
        assertNotNull(and); // Ensure it builds without error
    }
}