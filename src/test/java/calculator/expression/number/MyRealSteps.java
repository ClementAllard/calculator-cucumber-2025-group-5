package calculator.expression.number;

import calculator.expression.Expression;
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

public class MyRealSteps {
    private MyReal myReal;
    private MyNumber result;

    private MyReal real1;
    private MyReal real2;
    private MyReal real3;

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

    @Given("an real {string}")
    public void an_real(String input) throws IllegalSyntax {
        Expression e = MyExpressionParser.parseExpression(input);
        assertInstanceOf(MyReal.class, e, "Expected an real");
        myReal = (MyReal) e;
    }

    @When("I add the real by {string}")
    public void i_add_the_real_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation plus = new Plus(Arrays.asList(myReal, other));
        result = plus.op(myReal, other);
    }

    @When("I subtract the real by {string}")
    public void i_subtract_the_real_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation minus = new Minus(Arrays.asList(myReal, other));
        result = minus.op(myReal, other);
    }

    @When("I multiply the real by {string}")
    public void i_multiply_the_real_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation times = new Times(Arrays.asList(myReal, other));
        result = times.op(myReal, other);
    }

    @When("I divide the real by {string}")
    public void i_divide_the_real_by(String input) throws Exception {
        MyNumber other = parse(input);
        Operation divides = new Divides(Arrays.asList(myReal, other));
        result = divides.op(myReal, other);
    }

    @Then("the real result should be {string}")
    public void the_real_result_should_be(String expected) {
        assertEquals(expected, result.toString());
    }

    @Given("two reals {string} and {string}")
    public void two_reals_and(String a, String b) {
        real1 = (MyReal) parse(a);
        real2 = (MyReal) parse(b);
    }

    @Then("The reals should be equal and have the same hashcode")
    public void they_should_be_equal_and_have_same_hashcode() {
        assertEquals(real1, real2);
        assertEquals(real1.hashCode(), real2.hashCode());
    }

    @Then("a third real {string} should not be equal to the first")
    public void a_third_real_should_not_be_equal(String input) {
        real3 = (MyReal) parse(input);
        assertNotEquals(real1, real3);
    }
}
