package calculator.expression.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TestMyInteger {

    MyInteger myInteger;
    MyRational myRational;
    MyReal myReal;
    MyComplex myComplex;

    @BeforeEach
    public void setUp() {
        myInteger = new MyInteger(1);
        myRational = new MyRational(1,2);
        myReal = new MyReal(new BigDecimal("1.5"));
        myComplex = new MyComplex(new BigDecimal("2.5"),new BigDecimal("4"));
    }

    @Test
    void TestAddMyInteger() {

        // Add 2 integers
        MyNewNumber number = myInteger.plus(myInteger);
        assertInstanceOf(MyInteger.class, number);
        assertEquals("2", number.toString());

        // Add 1 integer & 1 rational
        MyNewNumber number2 = myInteger.plus(myRational);
        assertInstanceOf(MyRational.class, number2);
        assertEquals("3/2", number2.toString());

        // add 1 integer & 1 real
        MyNewNumber number3 = myInteger.plus(myReal);
        assertInstanceOf(MyReal.class, number3);
        assertEquals("2.5", number3.toString());

        // add 1 integer & 1 complex
        MyNewNumber number4 = myInteger.plus(myComplex);
        assertInstanceOf(MyComplex.class, number4);
        assertEquals("3.5 + 4i", number4.toString());
    }
}
