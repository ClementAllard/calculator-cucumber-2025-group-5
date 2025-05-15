package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseNot {

    private MyInteger binary1;
    private MyInteger binary2;

    @BeforeEach
    void setUp() {
        binary1 = new MyInteger("1101", 2);
        binary2 = new MyInteger("1011", 2);
    }

    @Test
    void testBitwiseNot() throws IllegalConstruction {
        BitwiseNot bitwiseNot = new BitwiseNot(binary1);
        assertEquals(new MyInteger("0010", 2), bitwiseNot.op(binary1)); // ~1101 -> 0010
    }

    @Test
    void testBitwiseNotDifferentBinary() throws IllegalConstruction {
        BitwiseNot bitwiseNot = new BitwiseNot(binary2);
        assertEquals(new MyInteger("0100", 2), bitwiseNot.op(binary2)); // ~1011 -> 0100
    }

    @Test
    void testBitwiseNotThrowsForNonBinary() throws IllegalConstruction {
        MyInteger decimal = new MyInteger(7); // Default base = 10
        BitwiseNot bitwiseNot = new BitwiseNot(decimal);
        assertThrows(UnsupportedOperationException.class, () -> bitwiseNot.op(decimal)); // Invalid base
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        BitwiseNot bitwiseNot = new BitwiseNot(binary1);
        assertEquals("~", bitwiseNot.getSymbol());  // Should return '~' symbol
    }

    @Test
    void testNullExpressionThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseNot(null));  // Should throw exception if null is passed
    }
}