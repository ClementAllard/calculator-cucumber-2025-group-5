package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestLogicalNor {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testLogicalNorFalseCombinations() throws IllegalConstruction {
        LogicalNor nor = new LogicalNor(Arrays.asList(one, zero));
        assertEquals(new MyInteger(0), nor.op(one, zero));  // 1 nor 0
        assertEquals(new MyInteger(0), nor.op(zero, one));  // 0 nor 1
        assertEquals(new MyInteger(0), nor.op(one, one));   // 1 nor 1
    }

    @Test
    void testLogicalNorTrue() throws IllegalConstruction {
        LogicalNor nor = new LogicalNor(Arrays.asList(zero, zero));
        assertEquals(new MyInteger(1), nor.op(zero, zero)); // 0 nor 0
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        LogicalNor nor = new LogicalNor(Arrays.asList(zero, zero));
        assertEquals("nor", nor.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new LogicalNor(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        LogicalNor nor = new LogicalNor(Arrays.asList(one, zero), Notation.INFIX);
        assertNotNull(nor);
    }
}