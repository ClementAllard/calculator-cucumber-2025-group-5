package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CLITest {

    @Test
    void CLIExpressionTest() {
        useCLI("( 5 + 4 )\n","Welcome to CLI Calculator: Please, enter expression: > Result : ( 5 + 4 ) = 9>");
    }

    @Test
    void CLIInvalidExpressionTest() {
        useCLI("( 5 + 4 \n","Welcome to CLI Calculator: Please, enter expression: > Illegal SyntaxPlease, enter a valid expression: >");
    }

    @Test
    void CLIHelpTest() {
        useCLI("help\n","Welcome to CLI Calculator: Please, enter expression:" +
                " > Basic usage: write basic expression like add, subtract, multiply, divide with infix,postfix,prefix notation" +
                "Command : help, give command helpscale, allows change of the precisionrounding, allows change of the rounding>");
    }

    @Test
    void CLIChangeScaleTest() {
        useCLI("scale\n12\n", "Welcome to CLI Calculator: Please, enter expression:"
                + " > Current scale expression: 10New chosen scale : New current scale expression: 12>");
        useCLI("scale\nexit\n","Welcome to CLI Calculator: Please, enter expression: > Current scale expression: 12New chosen scale : >");
    }

    @Test
    void CLIChangeRoundingTest() {
        useCLI("rounding\n0\n", "Welcome to CLI Calculator: Please, enter expression: > Current rounding expression:"
                + " HALF_UP0 : UP1 : DOWN2 : CEILING3 : FLOOR4 : HALF_UP5 HALF_DOWN6 :"
                + " HALF_EVEN7 : UNNECESSARYNew chosen rounding : New current rounding expression: UP>");
        useCLI("rounding\nexit\n","Welcome to CLI Calculator: Please, enter expression: > Current rounding expression:"
                + " UP0 : UP1 : DOWN2 : CEILING3 : FLOOR4 : HALF_UP5 HALF_DOWN6 : HALF_EVEN7 : UNNECESSARYNew chosen rounding : >");

    }

    private void useCLI(String input,String output) {

        input += "exit\n"; // For exit the loop in the end

        // IN
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // OUT
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Launch main
        CLI.main(new String[]{});

        assertEquals(output, outputStreamCaptor.toString().trim().replace("\n", "").replace("\r", ""));

    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

}
