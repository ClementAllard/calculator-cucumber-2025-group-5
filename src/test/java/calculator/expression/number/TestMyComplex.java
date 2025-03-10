package calculator.expression.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TestMyComplex {

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
    void TestAddMyRational() {

        // Add 1 complex & 1 integer
        MyNewNumber number = myComplex.plus(myInteger);
        assertInstanceOf(MyComplex.class, number);
        assertEquals("3.5 + 4i", number.toString());

        // Add 1 complex & 1 rational
        MyNewNumber number2 = myComplex.plus(myRational);
        assertInstanceOf(MyComplex.class, number2);
        assertEquals("3.0 + 4i", number2.toString());

        // add 1 complex & 1 real
        MyNewNumber number3 = myComplex.plus(myReal);
        assertInstanceOf(MyComplex.class, number3);
        assertEquals("4.0 + 4i", number3.toString());

        // add 2 complex
        MyNewNumber number4 = myComplex.plus(myComplex);
        assertInstanceOf(MyComplex.class, number4);
        assertEquals("5.0 + 8i", number4.toString());
    }
}
