package calculator.expression.number;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.operator.basic.Negate;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class NegateSteps {

    private Expression expression;
    private final Calculator calculator = new Calculator();
    private String result;

    @Given("I have an integer {int}")
    public void i_have_an_integer(Integer value) throws IllegalConstruction {
        expression = new Negate(new MyInteger(value));
    }

    @Given("I have a rational number {int}\\/{int}")
    public void i_have_a_rational_number(int numerator, int denominator) throws IllegalConstruction {
        expression = new Negate(new MyRational(numerator, denominator));
    }

    @Given("I have a real number {double}")
    public void i_have_a_real_number(Double value) throws IllegalConstruction {
        expression = new Negate(new MyReal(BigDecimal.valueOf(value)));
    }

    @Given("I have a complex number {double} + {double}i")
    public void i_have_a_complex_number(Double re, Double im) throws IllegalConstruction {
        expression = new Negate(new MyComplex(BigDecimal.valueOf(re), BigDecimal.valueOf(im)));
    }

    @When("I negate the value")
    public void i_negate_the_value() throws Exception {
        result = calculator.eval(expression);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        Assertions.assertEquals(expected, result);
    }

}
