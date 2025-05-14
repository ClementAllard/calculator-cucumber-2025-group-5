package calculator.expression.operator.logic;

import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestImplication {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testTrueImplications() throws IllegalConstruction {
        Implication implication = new Implication(Arrays.asList(one, one));
        assertEquals(new MyInteger(1), implication.op(one, one)); // true => true

        assertEquals(new MyInteger(1), implication.op(zero, one)); // false => true
        assertEquals(new MyInteger(1), implication.op(zero, zero)); // false => false
    }

    @Test
    void testFalseImplication() throws IllegalConstruction {
        Implication implication = new Implication(Arrays.asList(one, zero));
        assertEquals(new MyInteger(0), implication.op(one, zero)); // true => false
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        Implication implication = new Implication(Arrays.asList(one, one));
        assertEquals("=>", implication.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new Implication(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        Implication implication = new Implication(Arrays.asList(one, zero), Notation.INFIX);
        assertNotNull(implication);
    }
}