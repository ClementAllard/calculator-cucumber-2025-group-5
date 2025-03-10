package calculator.expression.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TestMyRational {

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

        // Add 1 rational & 1 integer
        MyNewNumber number = myRational.plus(myInteger);
        assertInstanceOf(MyRational.class, number);
        assertEquals("3/2", number.toString());

        // Add 2 rationals
        MyNewNumber number2 = myRational.plus(myRational);
        assertInstanceOf(MyRational.class, number2);
        assertEquals("1/1", number2.toString());

        // add 1 rational & 1 real
        MyNewNumber number3 = myRational.plus(myReal);
        assertInstanceOf(MyReal.class, number3);
        assertEquals("2.0", number3.toString());

        // add 1 rational & 1 complex
        MyNewNumber number4 = myRational.plus(myComplex);
        assertInstanceOf(MyComplex.class, number4);
        assertEquals("3.0 + 4i", number4.toString());
    }
}
