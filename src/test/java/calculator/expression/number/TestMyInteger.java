package calculator.expression.number;

import calculator.IllegalConstruction;
import calculator.expression.operator.*;
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
}
