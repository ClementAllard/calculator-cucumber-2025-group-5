package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseXor {

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
    void testBitwiseXorTrueCombinations() throws IllegalConstruction {
        BitwiseXor bitwiseXor = new BitwiseXor(Arrays.asList(binary1, binary2));
        assertEquals(new MyInteger("0110", 2), bitwiseXor.op(binary1, binary2)); // 1101 ^ 1011 -> 0110
    }

    @Test
    void testBitwiseXorDifferentValues() throws IllegalConstruction {
        BitwiseXor bitwiseXor = new BitwiseXor(Arrays.asList(binary1, binary3));
        assertEquals(new MyInteger("0011", 2), bitwiseXor.op(binary1, binary3)); // 1101 ^ 1110 -> 0011
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger decimal = new MyInteger(7); // Default base = 10
        BitwiseXor bitwiseXor = new BitwiseXor(Arrays.asList(binary1, decimal));
        assertThrows(UnsupportedOperationException.class, () -> bitwiseXor.op(binary1, decimal));  // Invalid base
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        BitwiseXor bitwiseXor = new BitwiseXor(Arrays.asList(binary1, binary2));
        assertEquals("^^", bitwiseXor.getSymbol());  // Should return '^^' symbol
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseXor(Collections.emptyList()));  // Empty list should throw exception
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        BitwiseXor bitwiseXor = new BitwiseXor(Arrays.asList(binary1, binary2), Notation.INFIX);
        assertNotNull(bitwiseXor);  // Check that BitwiseXor can be created with a notation
    }
}