package helper;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.Constant;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.spi.ExecutionControl;

import static org.junit.jupiter.api.Assertions.*;

public class ParserSteps {

    Expression currentExpression;
    String currentExpressionString;
    private Calculator c;

    @Before
    public void resetMemoryBeforeEachScenario() {
        currentExpression = null;
        currentExpressionString = null;
    }

    @Given("I initialise a calculator for parser")
    public void givenIInitialiseACalculator() {
        c = new Calculator();
    }

    @Then("There is an IllegalExpression throw")
    public void whenIProvideAnIllegalExpression() {
        assertThrowsExactly(IllegalSyntax.class, ()->{
            MyExpressionParser.parseExpression(currentExpressionString);
        });
    }

    @Then("There is an IllegalArgumentException throw for constant")
    public void whenIProvideAnIllegalExpressionForConstant() {
        assertThrowsExactly(IllegalArgumentException.class, ()->{
            MyExpressionParser.parseExpression(currentExpressionString);
        });
    }

    @Then("there is an UnsupportedOperationException throw")
    public void whenIProvideAnUnsupportedOperationException() {
        try {
            Expression error = MyExpressionParser.parseExpression(currentExpressionString);
            assertThrowsExactly(UnsupportedOperationException.class, ()->{
                c.eval(error);
            });
        } catch (IllegalSyntax e) {
            fail(e.getMessage());
        }

    }

    @Then("There is an IllegalArgumentException throw")
    public void whenIProvideAnIllegalArgumentException() {
        try {
            Expression error = MyExpressionParser.parseExpression(currentExpressionString);
            assertThrowsExactly(IllegalArgumentException.class, ()->{
                c.eval(error);
            });
        } catch (IllegalSyntax e) {
            fail(e.getMessage());
        }

    }


    @When("I provide an expression {string}")
    public void whenIProvideAnExpression(String val) {
        currentExpressionString = val;
    }

    @When("The expression string is parsing")
    public void whenTheExpressionStringParsing() {
        try{
            currentExpression = MyExpressionParser.parseExpression(currentExpressionString);
        }catch (Exception e){
            fail(e);
        }
    }

    @Then("the expression evaluates to {string}")
    public void whenIProvideANumber(String val) {
        try {
            Expression e = MyExpressionParser.parseExpression(val);
            assertEquals(c.eval(e),c.eval(currentExpression));
        } catch (ExecutionControl.NotImplementedException | IllegalSyntax e) {
            fail();
        }
    }

    @Given("I have defined a constant {string} with value {string}")
    public void i_have_defined_a_constant_with_value(String key, String value) {
        Constant.writeConstant(key, value);
    }
}
