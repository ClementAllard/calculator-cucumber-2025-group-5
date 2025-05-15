package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseNand {

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
    void testBitwiseNandTrueCombinations() throws IllegalConstruction {
        BitwiseNand bitwiseNand = new BitwiseNand(Arrays.asList(binary1, binary2));
        assertEquals(new MyInteger("0110", 2), bitwiseNand.op(binary1, binary2)); // ~(1101 & 1011) = ~(1001) = 0110
    }

    @Test
    void testBitwiseNandDifferentValues() throws IllegalConstruction {
        BitwiseNand bitwiseNand = new BitwiseNand(Arrays.asList(binary1, binary3));
        assertEquals(new MyInteger("0011", 2), bitwiseNand.op(binary1, binary3)); // ~(1101 & 1110) = ~(1100) = 0011
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger decimal = new MyInteger(7); // Base 10
        BitwiseNand bitwiseNand = new BitwiseNand(Arrays.asList(binary1, decimal));
        assertThrows(UnsupportedOperationException.class, () -> bitwiseNand.op(binary1, decimal));
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        BitwiseNand bitwiseNand = new BitwiseNand(Arrays.asList(binary1, binary2));
        assertEquals("~&", bitwiseNand.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseNand(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        BitwiseNand bitwiseNand = new BitwiseNand(Arrays.asList(binary1, binary2), Notation.INFIX);
        assertNotNull(bitwiseNand);
    }
}