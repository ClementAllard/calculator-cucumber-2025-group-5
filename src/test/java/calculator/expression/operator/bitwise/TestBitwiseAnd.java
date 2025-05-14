package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseAnd {

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
    void testBitwiseAndTrueCombinations() throws IllegalConstruction {
        BitwiseAnd bitwiseAnd = new BitwiseAnd(Arrays.asList(binary1, binary2));
        assertEquals(new MyInteger("1001", 2), bitwiseAnd.op(binary1, binary2)); // 1101 & 1011 -> 1001
    }

    @Test
    void testBitwiseAndDifferentValues() throws IllegalConstruction {
        BitwiseAnd bitwiseAnd = new BitwiseAnd(Arrays.asList(binary1, binary3));
        assertEquals(new MyInteger("1100", 2), bitwiseAnd.op(binary1, binary3)); // 1101 & 1110 -> 1100
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger decimal = new MyInteger(7); // Base 10 value
        BitwiseAnd bitwiseAnd = new BitwiseAnd(Arrays.asList(binary1, decimal));
        assertThrows(UnsupportedOperationException.class, () -> bitwiseAnd.op(binary1, decimal));  // Invalid base
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        BitwiseAnd bitwiseAnd = new BitwiseAnd(Arrays.asList(binary1, binary2));
        assertEquals("&", bitwiseAnd.getSymbol());  // Should return '&' symbol
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseAnd(Collections.emptyList()));  // Empty list should throw exception
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        BitwiseAnd bitwiseAnd = new BitwiseAnd(Arrays.asList(binary1, binary2), Notation.INFIX);
        assertNotNull(bitwiseAnd);  // Check that BitwiseAnd can be created with a notation
    }
}