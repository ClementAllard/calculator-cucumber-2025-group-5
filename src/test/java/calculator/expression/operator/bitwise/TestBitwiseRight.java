package calculator.expression.operator.bitwise;

import calculator.IllegalConstruction;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TestBitwiseRight {

    @Test
    void testNullExpressionThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseRight(null)); // Empty expression throw Exception
    }

    @Test
    void testDefaultRightShift() throws IllegalConstruction {
        MyInteger expr = new MyInteger(new BigDecimal("100"), 2);
        BitwiseRight bitwiseRight = new BitwiseRight(expr);

        MyInteger result = (MyInteger) bitwiseRight.op(expr);
        assertEquals(new BigDecimal("2"), result.getValue()); // "100" >> 1 = "10" (2 in decimal)
    }

    @Test
    void testCustomRightShift() throws IllegalConstruction {
        MyInteger expr = new MyInteger(new BigDecimal("10000"), 2);
        BitwiseRight bitwiseRight = new BitwiseRight(expr, "3"); // 3 bits shift

        MyInteger result = (MyInteger) bitwiseRight.op(expr);
        assertEquals(new BigDecimal("2"), result.getValue()); // "10000" >> 3 = "10"
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger expr = new MyInteger(new BigDecimal("4")); // Default base = 10
        BitwiseRight bitwiseRight = new BitwiseRight(expr);

        assertThrows(UnsupportedOperationException.class, () -> bitwiseRight.op(expr)); // Invalid base
    }

    @Test
    void testRightShiftSuppression() throws IllegalConstruction {
        MyInteger expr = new MyInteger(new BigDecimal("11"), 2);
        BitwiseRight bitwiseRight = new BitwiseRight(expr);

        MyInteger result = (MyInteger) bitwiseRight.op(expr);
        assertEquals(new BigDecimal("1"), result.getValue()); // "11" >> 1 = "1"
    }
}