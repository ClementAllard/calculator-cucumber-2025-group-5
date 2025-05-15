package helper;

import calculator.Calculator;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;

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

    @Given("an expression string {string}")
    public void givenAnExpressionString(String s) {
        currentExpressionString = s;
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
            assertEquals(BigDecimalUtil.stripZeros(new BigDecimal(val)),c.eval(currentExpression));
        } catch (ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Then("There is an IllegalExpression throw")
    public void whenIProvideAnIllegalExpression() {
        assertThrowsExactly(IllegalSyntax.class, ()->{
            MyExpressionParser.parseExpression(currentExpressionString);
        });
    }
}
