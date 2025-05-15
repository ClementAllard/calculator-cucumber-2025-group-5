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

class TestMyReal {

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
            assertEquals("4.5",plus.op(myReal,myInteger).toString());
            assertEquals("2",plus.op(myReal,myRational).toString());
            assertEquals("3",plus.op(myReal,myReal).toString());
            assertEquals("4 + 4i",plus.op(myReal,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestMinusMyRational() {
        try{
            assertEquals("-1.5",minus.op(myReal,myInteger).toString());
            assertEquals("-1",minus.op(myReal,myRational).toString());
            assertEquals("0",minus.op(myReal,myReal).toString());
            assertEquals("-1 - 4i",minus.op(myReal,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestTimesMyRational() {
        try{
            assertEquals("4.5",times.op(myReal,myInteger).toString());
            assertEquals("0.75",times.op(myReal,myRational).toString());
            assertEquals("2.25",times.op(myReal,myReal).toString());
            assertEquals("3.75 + 6i",times.op(myReal,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestDividesMyRational() {
        try{
            assertEquals("0.5",divides.op(myReal,myInteger).toString());
            assertEquals("3",divides.op(myReal,myRational).toString());
            assertEquals("1",divides.op(myReal,myReal).toString());
            assertEquals("0.1685393258 - 0.2696629213i",divides.op(myReal,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void testEquality() {
        MyReal myReal1 = new MyReal(new BigDecimal(1));
        MyReal myReal2 = new MyReal(new BigDecimal(1));
        MyReal myReal3 = new MyReal(new BigDecimal(6));

        assertEquals(myReal1, myReal1);
        assertEquals(myReal1, myReal2);
        assertNotEquals(myReal1, myReal3);
    }

    @Test
    void testHashCode() {
        MyReal myReal1 = new MyReal(new BigDecimal(1));
        MyReal myReal2 = new MyReal(new BigDecimal(1));
        MyReal myReal3 = new MyReal(new BigDecimal(6));

        assertEquals(myReal1, myReal1);
        assertEquals(myReal1, myReal2);
        assertNotEquals(myReal1, myReal3);
    }
}
