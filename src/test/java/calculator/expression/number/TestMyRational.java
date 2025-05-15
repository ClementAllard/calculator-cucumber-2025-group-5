package calculator.expression.number;

import calculator.IllegalConstruction;
import calculator.expression.operator.*;
import calculator.expression.operator.basic.Divides;
import calculator.expression.operator.basic.Minus;
import calculator.expression.operator.basic.Plus;
import calculator.expression.operator.basic.Times;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

class TestMyRational {

    MyInteger myInteger;
    MyRational myRational;
    MyReal myReal;
    MyComplex myComplex;
    Operation plus;
    Operation minus;
    Operation times;
    Operation divides;

    @BeforeEach
    public void setUp() throws IllegalConstruction {
        myInteger = new MyInteger(3);
        myRational = new MyRational(1,2);
        myReal = new MyReal(new BigDecimal("1.5"));
        myComplex = new MyComplex(new BigDecimal("2.5"),new BigDecimal("4"));

        plus = new Plus(new ArrayList<>());
        minus = new Minus(new ArrayList<>());
        times = new Times(new ArrayList<>());
        divides = new Divides(new ArrayList<>());
    }

    @Test
    void TestAddMyRational() {
        try{
            assertEquals("3 1/2",plus.op(myRational,myInteger).toString());
            assertEquals("1",plus.op(myRational,myRational).toString());
            assertEquals("2",plus.op(myRational,myReal).toString());
            assertEquals("3 + 4i",plus.op(myRational,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestMinusMyRational() {
        try{
            assertEquals("-(2 1/2)",minus.op(myRational,myInteger).toString());
            assertEquals("0",minus.op(myRational,myRational).toString());
            assertEquals("-1",minus.op(myRational,myReal).toString());
            assertEquals("-2 - 4i",minus.op(myRational,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestTimesMyRational() {
        try{
            assertEquals("1 1/2",times.op(myRational,myInteger).toString());
            assertEquals("1/4",times.op(myRational,myRational).toString());
            assertEquals("0.75",times.op(myRational,myReal).toString());
            assertEquals("1.25 + 2i",times.op(myRational,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestDividesMyRational() {
        try{
            assertEquals("1/6",divides.op(myRational,myInteger).toString());
            assertEquals("1",divides.op(myRational,myRational).toString());
            assertEquals("0.3333333333",divides.op(myRational,myReal).toString());
            assertEquals("0.0561797753 - 0.0898876404i",divides.op(myRational,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void testEquality() {
        MyRational myRational1 = new MyRational(1,2);
        MyRational myRational2 = new MyRational(1,2);
        MyRational myRational3 = new MyRational(5,2);

        assertEquals(myRational1, myRational1);
        assertEquals(myRational1, myRational2);
        assertNotEquals(myRational1, myRational3);
    }

    @Test
    void testHashCode() {
        MyRational myRational1 = new MyRational(1,2);
        MyRational myRational2 = new MyRational(1,2);
        MyRational myRational3 = new MyRational(5,2);

        assertEquals(myRational1, myRational1);
        assertEquals(myRational1, myRational2);
        assertNotEquals(myRational1, myRational3);
    }
}
