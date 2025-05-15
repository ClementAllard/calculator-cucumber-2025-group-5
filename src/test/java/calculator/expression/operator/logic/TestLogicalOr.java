package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestLogicalOr {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testLogicalOrTrueCombinations() throws IllegalConstruction {
        LogicalOr or = new LogicalOr(Arrays.asList(one, zero));
        assertEquals(new MyInteger(1), or.op(one, zero));  // 1 or 0
        assertEquals(new MyInteger(1), or.op(zero, one));  // 0 or 1
        assertEquals(new MyInteger(1), or.op(one, one));   // 1 or 1
    }

    @Test
    void testLogicalOrFalse() throws IllegalConstruction {
        LogicalOr or = new LogicalOr(Arrays.asList(zero, zero));
        assertEquals(new MyInteger(0), or.op(zero, zero)); // 0 or 0
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        LogicalOr or = new LogicalOr(Arrays.asList(one, one));
        assertEquals("or", or.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new LogicalOr(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        LogicalOr or = new LogicalOr(Arrays.asList(one, zero), Notation.INFIX);
        assertNotNull(or);
    }
}