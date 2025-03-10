package calculator.expression.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TestMyReal {

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

        // Add 1 real & 1 integer
        MyNewNumber number = myReal.plus(myInteger);
        assertInstanceOf(MyReal.class, number);
        assertEquals("2.5", number.toString());

        // Add 1 real & 1 rational
        MyNewNumber number2 = myReal.plus(myRational);
        assertInstanceOf(MyReal.class, number2);
        assertEquals("2.0", number2.toString());

        // add 2 reals
        MyNewNumber number3 = myReal.plus(myReal);
        assertInstanceOf(MyReal.class, number3);
        assertEquals("3.0", number3.toString());

        // add 1 real & 1 complex
        MyNewNumber number4 = myReal.plus(myComplex);
        assertInstanceOf(MyComplex.class, number4);
        assertEquals("4.0 + 4i", number4.toString());
    }
}
