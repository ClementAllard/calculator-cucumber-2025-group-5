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

class TestEquivalence {

    private MyInteger zero;
    private MyInteger one;

    @BeforeEach
    void setUp() {
        zero = new MyInteger(0);
        one = new MyInteger(1);
    }

    @Test
    void testTrueEquivalence() throws IllegalConstruction {
        Equivalence eq1 = new Equivalence(Arrays.asList(one, one));
        MyNumber result1 = eq1.op(one, one);
        assertEquals(new MyInteger(1), result1);

        Equivalence eq0 = new Equivalence(Arrays.asList(zero, zero));
        MyNumber result0 = eq0.op(zero, zero);
        assertEquals(new MyInteger(1), result0);
    }

    @Test
    void testFalseEquivalence() throws IllegalConstruction {
        Equivalence eq = new Equivalence(Arrays.asList(one, zero));
        MyNumber result = eq.op(one, zero);
        assertEquals(new MyInteger(0), result);

        MyNumber result2 = eq.op(zero, one);
        assertEquals(new MyInteger(0), result2);
    }

    @Test
    void testSymbol() throws IllegalConstruction {
        Equivalence eq = new Equivalence(Arrays.asList(one, one));
        assertEquals("<=>", eq.getSymbol());
    }

    @Test
    void testEmptyListThrows() {
        assertThrows(IllegalConstruction.class, () -> new Equivalence(Collections.emptyList()));
    }

    @Test
    void testWithNotation() throws IllegalConstruction {
        Equivalence eq = new Equivalence(Arrays.asList(one, one), Notation.INFIX);
        assertNotNull(eq); // Just ensure the constructor works with notation
    }
}