package cucumberSteps.calculator.expression.number;

import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.Operation;
import calculator.expression.operator.basic.Divides;
import calculator.expression.operator.basic.Minus;
import calculator.expression.operator.basic.Plus;
import calculator.expression.operator.basic.Times;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import io.cucumber.java.en.*;
import jdk.jshell.spi.ExecutionControl;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyIntegerSteps {

    private MyInteger myInteger;
    private MyNumber result;

    private MyInteger int1;
    private MyInteger int2;
    private MyInteger int3;

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

    @Given("an integer {string}")
    public void an_integer(String input) throws IllegalSyntax {
        Expression e = MyExpressionParser.parseExpression(input);
        assertInstanceOf(MyInteger.class, e, "Expected an integer");
        myInteger = (MyInteger) e;
    }

    @When("I add the integer by {string}")
    public void i_add_the_integer_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation plus = new Plus(Arrays.asList(myInteger, other));
        result = plus.op(myInteger, other);
    }

    @When("I subtract the integer by {string}")
    public void i_subtract_the_integer_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation minus = new Minus(Arrays.asList(myInteger, other));
        result = minus.op(myInteger, other);
    }

    @When("I multiply the integer by {string}")
    public void i_multiply_the_integer_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation times = new Times(Arrays.asList(myInteger, other));
        result = times.op(myInteger, other);
    }

    @When("I divide the integer by {string}")
    public void i_divide_the_integer_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation divides = new Divides(Arrays.asList(myInteger, other));
        result = divides.op(myInteger, other);
    }

    @Then("the integer result should be {string}")
    public void the_integer_result_should_be(String expected) {
        assertEquals(expected, result.toString());
    }

    @Given("two integers {string} and {string}")
    public void two_integers_and(String a, String b) {
        int1 = (MyInteger) parse(a);
        int2 = (MyInteger) parse(b);
    }

    @Then("The integers should be equal and have the same hashcode")
    public void they_should_be_equal_and_have_same_hashcode() {
        assertEquals(int1, int2);
        assertEquals(int1.hashCode(), int2.hashCode());
    }

    @Then("a third integer {string} should not be equal to the first")
    public void a_third_integer_should_not_be_equal(String input) {
        int3 = (MyInteger) parse(input);
        assertNotEquals(int1, int3);
    }
}
