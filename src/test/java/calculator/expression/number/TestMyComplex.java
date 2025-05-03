package calculator.expression.number;

import calculator.IllegalConstruction;
import calculator.expression.operator.*;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestMyComplex {

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
    void TestAddMyComplex() {
        try{
          assertEquals("5.5 + 4i",plus.op(myComplex,myInteger).toString());
          assertEquals("3 + 4i",plus.op(myComplex,myRational).toString());
          assertEquals("4 + 4i",plus.op(myComplex,myReal).toString());
          assertEquals("5 + 8i",plus.op(myComplex,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestMinusMyComplex() {
        try{
            assertEquals("-0.5 + 4i",minus.op(myComplex,myInteger).toString());
            assertEquals("2 + 4i",minus.op(myComplex,myRational).toString());
            assertEquals("1 + 4i",minus.op(myComplex,myReal).toString());
            assertEquals("0 + 0i",minus.op(myComplex,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestTimesMyComplex() {
        try{
            assertEquals("7.5 + 12i",times.op(myComplex,myInteger).toString());
            assertEquals("1.25 + 2i",times.op(myComplex,myRational).toString());
            assertEquals("3.75 + 6i",times.op(myComplex,myReal).toString());
            assertEquals("-9.75 + 20i",times.op(myComplex,myComplex).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void TestDividesMyComplex() {
        try{
            assertEquals("1.25 + 2i",divides.op(myComplex,new MyInteger(2)).toString());
            assertEquals("5 + 8i",divides.op(myComplex,myRational).toString());
            assertEquals("0.625 + 1i",divides.op(myComplex,new MyReal(new BigDecimal(4))).toString());
            assertEquals("1 + 0i",divides.op(myComplex,myComplex).toString());
            assertEquals("0.6226415094 - 0.179245283i",divides.op(myComplex,new MyComplex(new BigDecimal(2),new BigDecimal(7))).toString());
        }catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }
}
