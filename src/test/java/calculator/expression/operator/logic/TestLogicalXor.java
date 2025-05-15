package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestLogicalXor {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testLogicalXorTrueCombinations() throws IllegalConstruction {
        LogicalXor xor = new LogicalXor(Arrays.asList(one, zero));
        assertEquals(new MyInteger(1), xor.op(one, zero));  // 1 xor 0
        assertEquals(new MyInteger(1), xor.op(zero, one));  // 0 xor 1
    }

    @Test
    void testLogicalXorFalseCombinations() throws IllegalConstruction {
        LogicalXor xor = new LogicalXor(Arrays.asList(one, one));
        assertEquals(new MyInteger(0), xor.op(one, one));   // 1 xor 1

        xor = new LogicalXor(Arrays.asList(zero, zero));
        assertEquals(new MyInteger(0), xor.op(zero, zero)); // 0 xor 0
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        LogicalXor xor = new LogicalXor(Arrays.asList(one, one));
        assertEquals("xor", xor.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new LogicalXor(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        LogicalXor xor = new LogicalXor(Arrays.asList(one, zero), Notation.INFIX);
        assertNotNull(xor);
    }
}