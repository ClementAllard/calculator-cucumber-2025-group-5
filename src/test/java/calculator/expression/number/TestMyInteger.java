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

class TestMyInteger {

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
    void TestAddMyInteger() {
        try{
            assertEquals("6",plus.op(myInteger,myInteger).toString());
            assertEquals("3 1/2",plus.op(myInteger,myRational).toString());
            assertEquals("4.5",plus.op(myInteger,myReal).toString());
            assertEquals("5.5 + 4i",plus.op(myInteger,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestMinusMyInteger() {
        try{
            assertEquals("0",minus.op(myInteger,myInteger).toString());
            assertEquals("2 1/2",minus.op(myInteger,myRational).toString());
            assertEquals("1.5",minus.op(myInteger,myReal).toString());
            assertEquals("0.5 - 4i",minus.op(myInteger,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestTimesMyInteger() {
        try{
            assertEquals("9",times.op(myInteger,myInteger).toString());
            assertEquals("1 1/2",times.op(myInteger,myRational).toString());
            assertEquals("4.5",times.op(myInteger,myReal).toString());
            assertEquals("7.5 + 12i",times.op(myInteger,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestDividesMyInteger() {
        try{
            assertEquals("1",divides.op(myInteger,myInteger).toString());
            assertEquals("6",divides.op(myInteger,myRational).toString());
            assertEquals("2",divides.op(myInteger,myReal).toString());
            assertEquals("0.3370786517 - 0.5393258427i",divides.op(myInteger,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void testEqualsAndHashCode() {
        MyInteger int1 = new MyInteger(10);
        MyInteger int2 = new MyInteger("10");
        MyInteger int3 = new MyInteger("A", 16); // base 16, A = 10
        MyInteger int4 = new MyInteger(15);

        assertEquals(int1, int2);
        assertEquals(int1, int3);
        assertNotEquals(int1, int4);

        assertEquals(int1.hashCode(), int2.hashCode());
        assertEquals(int1.hashCode(), int3.hashCode());
    }

    @Test
    void testGetBaseRepresentation() {
        MyInteger base10 = new MyInteger("15");
        MyInteger base2 = new MyInteger("1111", 2);
        MyInteger base16 = new MyInteger("F", 16);

        assertEquals("15", base10.getBaseRepresentation());
        assertEquals("1111", base2.getBaseRepresentation());
        assertEquals("f", base16.getBaseRepresentation()); // lower-case output from BigInteger.toString
    }

    @Test
    void testInvalidBaseThrows() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new MyInteger("1G", 16); // 'G' is invalid in base 16
        });

        String expectedMessage = "Caractère 'G' invalide pour la base 16";
        assertTrue(exception.getMessage().contains(expectedMessage));
    }

    @Test
    void testConstructors() {
        MyInteger intFromInt = new MyInteger(7);
        MyInteger intFromString = new MyInteger("7");
        MyInteger intFromBigDecimal = new MyInteger(new BigDecimal("7.99"));
        MyInteger intFromBase = new MyInteger("111", 2); // binary for 7

        assertEquals("7", intFromInt.toString());
        assertEquals("7", intFromString.toString());
        assertEquals("7", intFromBigDecimal.toString());
        assertEquals("7", intFromBase.toString());
    }

    @Test
    void testGetBase() {
        MyInteger defaultBase = new MyInteger(5);
        MyInteger base2 = new MyInteger("101", 2);

        assertEquals(10, defaultBase.getBase());
        assertEquals(2, base2.getBase());
    }

    @Test
    void testEquality() {
        MyInteger myInteger1 = new MyInteger(1);
        MyInteger myInteger2 = new MyInteger(1);
        MyInteger myInteger3 = new MyInteger(2);

        assertEquals(myInteger1, myInteger1);
        assertEquals(myInteger1, myInteger2);
        assertNotEquals(myInteger1, myInteger3);
    }

    @Test
    void testHashCode() {
        MyInteger myInteger1 = new MyInteger(1);
        MyInteger myInteger2 = new MyInteger(1);
        MyInteger myInteger3 = new MyInteger(2);

        assertEquals(myInteger1, myInteger1);
        assertEquals(myInteger1, myInteger2);
        assertNotEquals(myInteger1, myInteger3);
    }
}
