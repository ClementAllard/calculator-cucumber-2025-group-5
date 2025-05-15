package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CLITest {

    @Test
    void CLIInvalidExpressionTest() {
        List<String> test = useCLI("( 5 + 4 ");
        assertEquals("> Illegal Syntax", test.getFirst());
        assertEquals("Please, enter a valid expression: ", test.get(1));
    }


    @Test
    void CLITestInputExpression() {
        List<String> test = useCLI("(5+1)");
        assertEquals("> Result : ( 5 + 1 ) = 6", test.getFirst());

        test = useCLI("(5/1)");
        assertEquals("> Result : ( 5 / 1 ) = 5", test.getFirst());

        test = useCLI("1 <=> 1");
        assertEquals("> Result : ( 1 <=> 1 ) = 1", test.getFirst());

        test = useCLI("not 1");
        assertEquals("> Result : NOT(1) = 0", test.getFirst());

        test = useCLI("sin(180)");
        assertEquals("> Result : sin(180) = -0.8011526357", test.getFirst());

        test = useCLI("-1");
        assertEquals("> Result : - 1 = -1", test.getFirst());

        test = useCLI("rINTEGER(100, e) + 1");
        assertEquals("> Result : ( 5 + 1 ) = 6", test.getFirst());

        test = useCLI("rint(9)");
        String result = test.getFirst();
        int random = parseInt(result.substring(result.length()-1));
        assertTrue(random >= 0 && random <= 9);
        String formatedResult = String.format("> Result : %s = %s", random,random);
        assertEquals(result,formatedResult);

    }

    @Test
    void CLIHelpTest() {
        List<String> test = useCLI("help");
        assertEquals("> Basic usage: write basic expression like add, subtract, multiply, divide with infix,postfix,prefix notation", test.getFirst());
        assertEquals("", test.get(1));
        assertEquals("Command : ", test.get(2));
        assertEquals("help, give command help", test.get(3));
        assertEquals("scale, allows change of the precision", test.get(4));
        assertEquals("rounding, allows change of the rounding", test.get(5));
        assertEquals("fraction, change the display of the fraction type to a real", test.getLast());
    }

    @Test
    void CLIFractionTest(){
        List<String> test = useCLI("1/2");
        assertEquals("> Result : ( 1 / 2 ) = 1/2", test.getFirst());
        test = useCLI("fraction");
        assertEquals("> mode fraction: false", test.getFirst());
        test = useCLI("1/2");
        assertEquals("> Result : ( 1 / 2 ) = 0.5", test.getFirst());
        test = useCLI("fraction");
        assertEquals("> mode fraction: true", test.getFirst());
        test = useCLI("1/2");
        assertEquals("> Result : ( 1 / 2 ) = 1/2", test.getFirst());
    }

    @Test
    void CLIChangeScaleTest() {
        List<String> test = useCLI("scale\n12");
        assertEquals("> Current scale expression: 10", test.getFirst());
        assertEquals("New chosen scale : ", test.get(1));
        assertEquals("New current scale expression: 12", test.getLast());
        test = useCLI("scale\n10");
        assertEquals("> Current scale expression: 12", test.getFirst());
        assertEquals("New chosen scale : ", test.get(1));
        assertEquals("New current scale expression: 10", test.getLast());
        test = useCLI("scale\nexit");
        assertEquals("> Current scale expression: 10", test.getFirst());
        assertEquals("New chosen scale : ", test.get(1));
        test = useCLI("scale\naaafveds");
        assertEquals("> Current scale expression: 10", test.getFirst());
        assertEquals("New chosen scale : ", test.get(1));
        assertEquals("Invalid scale", test.getLast());
    }

    @Test
    void CLIChangeRoundingTest() {
        List<String> test = useCLI("rounding\n0");
        assertEquals("> Current rounding expression: HALF_UP", test.getFirst());
        CLIRoundingMode(test.subList(1,10));
        assertEquals("New current rounding expression: UP", test.getLast());

        test = useCLI("rounding\n4");
        assertEquals("> Current rounding expression: UP", test.getFirst());
        CLIRoundingMode(test.subList(1,10));
        assertEquals("New current rounding expression: HALF_UP", test.getLast());

        test = useCLI("rounding\nexit");
        assertEquals("> Current rounding expression: HALF_UP", test.getFirst());
        CLIRoundingMode(test.subList(1,test.size()));

        test = useCLI("rounding\naaa");
        assertEquals("> Current rounding expression: HALF_UP", test.getFirst());
        CLIRoundingMode(test.subList(1,test.size()-1));
        assertEquals("Invalid rounding mode", test.getLast());

        test = useCLI("rounding\n329");
        assertEquals("> Current rounding expression: HALF_UP", test.getFirst());
        CLIRoundingMode(test.subList(1,test.size()-1));
        assertEquals("Invalid rounding mode", test.getLast());

        test = useCLI("rounding\n-1");
        assertEquals("> Current rounding expression: HALF_UP", test.getFirst());
        CLIRoundingMode(test.subList(1,test.size()-1));
        assertEquals("Invalid rounding mode", test.getLast());
    }

    private void CLIRoundingMode(List<String> mode){
        assertEquals("0 : UP", mode.getFirst());
        assertEquals("1 : DOWN", mode.get(1));
        assertEquals("2 : CEILING", mode.get(2));
        assertEquals("3 : FLOOR", mode.get(3));
        assertEquals("4 : HALF_UP", mode.get(4));
        assertEquals("5 : HALF_DOWN", mode.get(5));
        assertEquals("6 : HALF_EVEN", mode.get(6));
        assertEquals("7 : UNNECESSARY", mode.get(7));
        assertEquals("New chosen rounding : ", mode.getLast());
    }

    private List<String> useCLI(String input) {

        input += "\nexit\n";

        // IN
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // OUT
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Launch main
        CLI.main(new String[]{});

        List<String> output = Arrays.asList(outputStreamCaptor.toString().trim().replace("\r", "").split("\n"));

        assertEquals("Welcome to CLI Calculator: ", output.getFirst());
        assertEquals("Please, enter expression: ", output.get(1));
        assertEquals(">", output.getLast());

        return output.subList(2, output.size()-1);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

}
