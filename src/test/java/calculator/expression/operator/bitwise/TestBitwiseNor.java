package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseNor {

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
    void testBitwiseNorTrueCombinations() throws IllegalConstruction {
        BitwiseNor bitwiseNor = new BitwiseNor(Arrays.asList(binary1, binary2));
        assertEquals(new MyInteger("0000", 2), bitwiseNor.op(binary1, binary2)); // ~(1101 | 1011) = ~1111 = 0000
    }

    @Test
    void testBitwiseNorDifferentValues() throws IllegalConstruction {
        BitwiseNor bitwiseNor = new BitwiseNor(Arrays.asList(binary1, binary3));
        assertEquals(new MyInteger("0000", 2), bitwiseNor.op(binary1, binary3)); // ~(1101 | 1110) = ~1111 = 0000
    }

    @Test
    void testBitwiseNorPartialOverlap() throws IllegalConstruction {
        MyInteger binA = new MyInteger("1000", 2);
        MyInteger binB = new MyInteger("0011", 2);
        BitwiseNor bitwiseNor = new BitwiseNor(Arrays.asList(binA, binB));
        assertEquals(new MyInteger("0100", 2), bitwiseNor.op(binA, binB)); // ~(1000 | 0011) = ~1011 = 0100
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger decimal = new MyInteger(7);
        BitwiseNor bitwiseNor = new BitwiseNor(Arrays.asList(binary1, decimal));
        assertThrows(UnsupportedOperationException.class, () -> bitwiseNor.op(binary1, decimal));
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        BitwiseNor bitwiseNor = new BitwiseNor(Arrays.asList(binary1, binary2));
        assertEquals("~|", bitwiseNor.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseNor(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        BitwiseNor bitwiseNor = new BitwiseNor(Arrays.asList(binary1, binary2), Notation.INFIX);
        assertNotNull(bitwiseNor);
    }
}