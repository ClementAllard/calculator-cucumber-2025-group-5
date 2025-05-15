package cucumberSteps.calculator.expression.number;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.basic.*;
import calculator.expression.operator.Operation;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import io.cucumber.java.en.*;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyComplexSteps {

    private MyComplex baseComplex;
    private MyComplex result;

    private MyComplex complex1;
    private MyComplex complex2;
    private MyComplex complex3;

    private MyNumber parse(String input) {
        try {
            Expression e = MyExpressionParser.parseExpression(input);
            if (e instanceof MyNumber myNumber) {
                return myNumber;
            }else if (e instanceof Divides divides) {
                List<Expression> expression = divides.getArgs();
                return divides.op((MyNumber) expression.getFirst(), (MyNumber) expression.getLast());
            }else {
                throw new IllegalArgumentException("Expected numeric expression, got: " + e.getClass());
            }
        } catch (IllegalSyntax | ExecutionControl.NotImplementedException ex) {
            fail(ex.getMessage());
        }
        return null;
    }

    @Given("a complex number {string}")
    public void a_complex_number(String input) {
        Expression e = parse(input);
        assertInstanceOf(MyComplex.class, e, "Expected a complex number");
        baseComplex = (MyComplex) e;
    }

    @When("I add the complex by {string}")
    public void i_add_it_to(String input) throws Exception {
        MyNumber e = parse(input);
        Operation plus = new Plus(Arrays.asList(baseComplex, e));
        result = (MyComplex) plus.op(baseComplex, e);
    }

    @When("I subtract the complex by {string}")
    public void i_subtract(String input) throws Exception {
        MyNumber e = parse(input);
        Operation minus = new Minus(Arrays.asList(baseComplex, e));
        result = (MyComplex) minus.op(baseComplex, e);
    }

    @When("I divide the complex by {string}")
    public void i_divide_by(String input) throws Exception {
        MyNumber e = parse(input);
        Operation divides = new Divides(Arrays.asList(baseComplex, e));
        result = (MyComplex) divides.op(baseComplex, e);
    }

    @When("I multiply the complex by {string}")
    public void i_multiply_by(String input) throws Exception {
        MyNumber e = parse(input);
        Operation times = new Times(Arrays.asList(baseComplex, e));
        result = (MyComplex) times.op(baseComplex, e);
    }

    // Dans MyComplexSteps.java
    @Then("the complex result should be {string}")
    public void the_complex_result_should_be(String expected) {
        assertEquals(expected, result.toString());
    }


    @Given("two complex numbers {string} and {string}")
    public void two_complex_numbers(String a, String b) {
        complex1 = (MyComplex) parse(a);
        complex2 = (MyComplex) parse(b);
    }

    @Then("The complex should be equal and have the same hashcode")
    public void they_should_be_equal_and_same_hashcode() {
        assertEquals(complex1, complex2);
        assertEquals(complex1.hashCode(), complex2.hashCode());
    }

    @Then("a third complex number {string} should not be equal to the first")
    public void third_complex_should_not_be_equal(String input) {
        complex3 = (MyComplex) parse(input);
        assertNotEquals(complex1, complex3);
    }
}
