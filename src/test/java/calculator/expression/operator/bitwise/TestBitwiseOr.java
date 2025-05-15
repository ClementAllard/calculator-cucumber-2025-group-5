package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseOr {

    private MyInteger binary1;
    private MyInteger binary2;
    private MyInteger binary3;

    @BeforeEach
    void setUp() {
        binary1 = new MyInteger("1101", 2);
        binary2 = new MyInteger("1011", 2);
        binary3 = new MyInteger("1110", 2);
    }

    @Test
    void testBitwiseOrTrueCombinations() throws IllegalConstruction {
        BitwiseOr bitwiseOr = new BitwiseOr(Arrays.asList(binary1, binary2));
        assertEquals(new MyInteger("1111", 2), bitwiseOr.op(binary1, binary2)); // 1101 | 1011 -> 1111
    }

    @Test
    void testBitwiseOrDifferentValues() throws IllegalConstruction {
        BitwiseOr bitwiseOr = new BitwiseOr(Arrays.asList(binary1, binary3));
        assertEquals(new MyInteger("1111", 2), bitwiseOr.op(binary1, binary3)); // 1101 | 1110 -> 1111
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger decimal = new MyInteger(7); // Base 10 value
        BitwiseOr bitwiseOr = new BitwiseOr(Arrays.asList(binary1, decimal));
        assertThrows(UnsupportedOperationException.class, () -> bitwiseOr.op(binary1, decimal));  // Invalid base
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        BitwiseOr bitwiseOr = new BitwiseOr(Arrays.asList(binary1, binary2));
        assertEquals("|", bitwiseOr.getSymbol());  // Should return '|' symbol
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseOr(Collections.emptyList()));  // Empty list should throw exception
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        BitwiseOr bitwiseOr = new BitwiseOr(Arrays.asList(binary1, binary2), Notation.INFIX);
        assertNotNull(bitwiseOr);  // Check that BitwiseOr can be created with a notation
    }
}