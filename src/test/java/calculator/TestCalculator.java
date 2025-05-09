package calculator;

import calculator.expression.Expression;
import calculator.expression.MyNumber;
import calculator.expression.operator.Divides;
import calculator.expression.operator.Plus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCalculator {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    Calculator c;
    Expression e1;
    Expression e2;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
        c = new Calculator();
        try{
            e1 = new Plus(Arrays.asList(new MyNumber(3), new MyNumber(6)));
            e2 = new Divides(Arrays.asList(new MyNumber(3), new MyNumber(0)));
        }catch (IllegalConstruction _){
            fail();
        }

    }

    @Test
    void testPrint() {
        c.print(e1);
        assertEquals("The result of evaluating expression ( 3 + 6 ) is 9.", outputStreamCaptor.toString().trim().replace("\n","").replace("\r",""));
    }

    @Test
    void testPrintNaN() {
        c.print(e2);
        assertEquals("The result of evaluating expression ( 3 / 0 ) is NaN.", outputStreamCaptor.toString().trim().replace("\n","").replace("\r",""));
    }

    @Test
    void testPrintExpressionDetails(){
        c.printExpressionDetails(e1);

        String expressionDetails = outputStreamCaptor.toString().trim().replace("\n","").replace("\r","");
        assertEquals("The result of evaluating expression ( 3 + 6 ) is 9.It contains 1 levels of nested expressions, 1 operations and 2 numbers.", expressionDetails);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }


}
