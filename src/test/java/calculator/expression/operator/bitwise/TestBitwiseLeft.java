package calculator.expression.operator.bitwise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import calculator.IllegalConstruction;
import calculator.expression.number.MyInteger;
import java.math.BigDecimal;

public class TestBitwiseLeft {

    @Test
    void testNullExpressionThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseLeft(null)); // Empty expression throw Exception
    }

    @Test
    void testValidExpressionWithDefaultShift() throws IllegalConstruction {
        MyInteger expression = new MyInteger(new BigDecimal("1"), 2);
        BitwiseLeft bitwiseLeft = new BitwiseLeft(expression);

        MyInteger result = (MyInteger) bitwiseLeft.op(expression);
        assertEquals(new BigDecimal("2"), result.getValue()); // "1" << 1 = "10" (2 in decimal)
    }

    @Test
    void testValidExpressionWithCustomShift() throws IllegalConstruction {
        MyInteger expression = new MyInteger(new BigDecimal("1"), 2);
        BitwiseLeft bitwiseLeft = new BitwiseLeft(expression, "3"); // 3 bits shift

        MyInteger result = (MyInteger) bitwiseLeft.op(expression);
        assertEquals(new BigDecimal("8"), result.getValue()); // "1" << 3 = "1000" (8 in decimal)
    }

    @Test
    void testUnsupportedBaseThrows() throws IllegalConstruction {
        MyInteger expression = new MyInteger(new BigDecimal("1")); // Default base = 10
        BitwiseLeft bitwiseLeft = new BitwiseLeft(expression);

        assertThrows(UnsupportedOperationException.class, () -> bitwiseLeft.op(expression)); // Invalid base
    }

    @Test
    void testNullExpressionInConstructorThrows() {
        assertThrows(IllegalConstruction.class, () -> new BitwiseLeft(null)); // Throw Exception on null constructor
    }
}