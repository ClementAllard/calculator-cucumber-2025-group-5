package helper;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @Then("^the expression evaluates to (\\d+)$")
    public void whenIProvideANumber(int val) {
        assertEquals(val,c.eval(currentExpression));
    }

    @Then("There is an IllegalExpression throw")
    public void whenIProvideAnIllegalExpression() {
        assertThrowsExactly(IllegalConstruction.class, ()->{
            MyExpressionParser.parseExpression(currentExpressionString);
        });
    }

}
