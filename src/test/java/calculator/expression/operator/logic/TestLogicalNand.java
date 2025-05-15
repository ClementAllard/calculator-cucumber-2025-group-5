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

class TestLogicalNand {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testLogicalNandTrueCombinations() throws IllegalConstruction {
        LogicalNand nand = new LogicalNand(Arrays.asList(one, zero));
        assertEquals(new MyInteger(1), nand.op(one, zero)); // 1 nand 0
        assertEquals(new MyInteger(1), nand.op(zero, one)); // 0 nand 1
        assertEquals(new MyInteger(1), nand.op(zero, zero)); // 0 nand 0
    }

    @Test
    void testLogicalNandFalse() throws IllegalConstruction {
        LogicalNand nand = new LogicalNand(Arrays.asList(one, one));
        MyNumber result = nand.op(one, one); // 1 nand 1
        assertEquals(new MyInteger(0), result);
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        LogicalNand nand = new LogicalNand(Arrays.asList(one, one));
        assertEquals("nand", nand.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new LogicalNand(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        LogicalNand nand = new LogicalNand(Arrays.asList(one, one), Notation.INFIX);
        assertNotNull(nand);
    }
}