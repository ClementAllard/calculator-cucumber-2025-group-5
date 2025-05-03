package calculator.expression;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.number.MyInteger;
import calculator.expression.operator.Divides;
import calculator.expression.operator.Minus;
import calculator.expression.operator.Plus;
import calculator.expression.operator.Times;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class TestEvaluator {

    private Calculator calc;
    private int value1, value2;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        value1 = 8;
        value2 = 6;
    }

    @Test
    void testEvaluatorMyNumber() {
        try {
            assertEquals( String.valueOf(value1), calc.eval(new MyInteger(value1)));
        } catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateOperations(String symbol) {
        List<Expression> params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
        BigDecimal divide = BigDecimalUtil.divide(BigDecimal.valueOf(value1), BigDecimal.valueOf(value2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( String.valueOf(value1 + value2), calc.eval(new Plus(params)));
                case "-"	->	assertEquals( String.valueOf(value1 - value2), calc.eval(new Minus(params)));
                case "*"	->	assertEquals( String.valueOf(value1 * value2), calc.eval(new Times(params)));
                case "/"	->	assertEquals( divide.toString() , calc.eval(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction| ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

}
