package cucumberSteps.calculator.expression.number;

import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyRational;
import calculator.expression.operator.Operation;
import calculator.expression.operator.basic.Divides;
import calculator.expression.operator.basic.Minus;
import calculator.expression.operator.basic.Plus;
import calculator.expression.operator.basic.Times;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.spi.ExecutionControl;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyRationalSteps {
    private MyRational myRational;
    private MyNumber result;

    private MyRational rational1;
    private MyRational rational2;
    private MyRational rational3;

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

    @Given("an rational {string}")
    public void an_rational(String input) {
        MyNumber e = parse(input);
        assertInstanceOf(MyRational.class, e, "Expected an rational");
        myRational = (MyRational) e;
    }

    @When("I add the rational by {string}")
    public void i_add_the_rational_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation plus = new Plus(Arrays.asList(myRational, other));
        result = plus.op(myRational, other);
    }

    @When("I subtract the rational by {string}")
    public void i_subtract_the_rational_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation minus = new Minus(Arrays.asList(myRational, other));
        result = minus.op(myRational, other);
    }

    @When("I multiply the rational by {string}")
    public void i_multiply_the_rational_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation times = new Times(Arrays.asList(myRational, other));
        result = times.op(myRational, other);
    }

    @When("I divide the rational by {string}")
    public void i_divide_the_rational_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation divides = new Divides(Arrays.asList(myRational, other));
        result = divides.op(myRational, other);
    }

    @Then("the rational result should be {string}")
    public void the_rational_result_should_be(String expected) {
        assertEquals(expected, result.toString());
    }

    @Given("two rationals {string} and {string}")
    public void two_rationals_and(String a, String b) {
        rational1 = (MyRational) parse(a);
        rational2 = (MyRational) parse(b);
    }

    @Then("The rationals should be equal and have the same hashcode")
    public void they_should_be_equal_and_have_same_hashcode() {
        assertEquals(rational1, rational2);
        assertEquals(rational1.hashCode(), rational2.hashCode());
    }

    @Then("a third rational {string} should not be equal to the first")
    public void a_third_rational_should_not_be_equal(String input) {
        rational3 = (MyRational) parse(input);
        assertNotEquals(rational1, rational3);
    }
}
