package calculator.expression.number;

import calculator.Calculator;
import calculator.expression.Expression;
import io.cucumber.java.en.*;
import jdk.jshell.spi.ExecutionControl;

import static org.junit.jupiter.api.Assertions.*;

public class ConstantSteps {

    private String key;
    private Exception caughtException;

    private final Calculator calculator = new Calculator();
    private Expression expression;

    @Given("I define a constant {string} with value {string}")
    public void i_define_a_constant_with_value(String constantKey, String constantValue) {
        this.key = constantKey;
        Constant.writeConstant(constantKey, constantValue);
    }

    @When("I parse the constant {string}")
    public void i_parse_the_constant(String constantKey) {
        try {
            expression = Constant.parseExpression(Constant.readConstant(constantKey));
        } catch (Exception e) {
            caughtException = e;
        }
    }

    @Then("an exception should be thrown")
    public void an_exception_should_be_thrown() {
        assertNotNull(caughtException);
        assertInstanceOf(IllegalArgumentException.class, caughtException);
    }

    @Then("the constant value should be {string}")
    public void the_constant_value_should_be(String expected) {
        assertEquals(expected, Constant.readConstant(key));
    }

    @Then("the evaluated result should be {string}")
    public void the_evaluated_result_should_be(String expected) throws ExecutionControl.NotImplementedException {
        String actual = calculator.eval(expression);
        assertEquals(expected, actual);
    }
}
