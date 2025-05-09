package calculator;

import static org.junit.jupiter.api.Assertions.*;

import calculator.expression.*;
import calculator.expression.number.MyInteger;
import calculator.expression.operator.*;
import calculator.expression.Notation;
import calculator.expression.operator.basic.Divides;
import calculator.expression.operator.basic.Minus;
import calculator.expression.operator.basic.Plus;
import calculator.expression.operator.basic.Times;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorSteps {

	private ArrayList<Expression> params;
	private Operation op;
	private Calculator c;

	@Before
    public void resetMemoryBeforeEachScenario() {
		params = null;
		op = null;
	}

	@Given("I initialise a calculator")
	public void givenIInitialiseACalculator() {
		c = new Calculator();
	}

	@Given("an integer operation {string}")
	public void givenAnIntegerOperation(String s) {
		// Write code here that turns the phrase above into concrete actions
		params = new ArrayList<>(); // create an empty set of parameters to be filled in
		try {
			switch (s) {
				case "+"	->	op = new Plus(params);
				case "-"	->	op = new Minus(params);
				case "*"	->	op = new Times(params);
				case "/"	->	op = new Divides(params);
				default		->	fail();
			}
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	// The following example shows how to use a DataTable provided as input.
	// The example looks slightly complex, since DataTables can take as input
	//  tables in two dimensions, i.e. rows and lines. This is why the input
	//  is a list of lists.
	@Given("the following list of integer numbers")
	public void givenTheFollowingListOfNumbers(List<List<String>> numbers) {
		params = new ArrayList<>();
		// Since we only use one line of input, we use get(0) to take the first line of the list,
		// which is a list of strings, that we will manually convert to integers:
		numbers.getFirst().forEach(n -> params.add(new MyInteger(Integer.parseInt(n))));
	    params.forEach(n -> System.out.println("value ="+ n));
		op = null;
	}

	// The string in the Given annotation shows how to use regular expressions...
	// In this example, the notation d+ is used to represent numbers, i.e. nonempty sequences of digits
	@Given("^the sum of two numbers (\\d+) and (\\d+)$")
	// The alternative, and in this case simpler, notation would be:
	// @Given("the sum of two numbers {int} and {int}")
	public void givenTheSum(int n1, int n2) {
		try {
			params = new ArrayList<>();
		    params.add(new MyInteger(n1));
		    params.add(new MyInteger(n2));
		    op = new Plus(params);}
		catch(IllegalConstruction e) { fail(); }
	}

	@Then("^its (.*) notation is (.*)$")
	public void thenItsNotationIs(String notation, String s) {
		if (notation.equals("PREFIX")||notation.equals("POSTFIX")||notation.equals("INFIX")) {
			op.setNotation(Notation.valueOf(notation));
			assertEquals(s, op.toString());
		}
		else fail(notation + " is not a correct notation! ");
	}

	@When("^I provide a (.*) number (\\d+)$")
	public void whenIProvideANumber(String s, int val) {
		//add extra parameter to the operation
		params = new ArrayList<>();
		params.add(new MyInteger(val));
		op.addMoreParams(params);
	}

	@Then("^the (.*) is (\\d+)$")
	public void thenTheOperationIs(String s, int val) {
		try {
			switch (s) {
				case "sum"			->	op = new Plus(params);
				case "product"		->	op = new Times(params);
				case "quotient"		->	op = new Divides(params);
				case "difference"	->	op = new Minus(params);
				default -> fail();
			}
			assertEquals(String.valueOf(val), c.eval(op));
		} catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
			fail();
		}
	}

	@Then("the operation {string} and number {int} and {int} are correct")
	public void testNotations(String symbol, int value1, int value2){
		//prefix notation:
		testNotation(symbol +" (" + value1 + ", " + value2 + ")", op, Notation.PREFIX);
		//infix notation:
		testNotation("( " + value1 + " " + symbol + " " + value2 + " )", op, Notation.INFIX);
		//postfix notation:
		testNotation("(" + value1 + ", " + value2 + ") " + symbol, op, Notation.POSTFIX);
	}

	/* This is an auxilary method to avoid code duplication. */
	private void testNotation(String s,Operation o,Notation n) {
		assertEquals(s, o.toString(n));
		op.setNotation(n);
		assertEquals(s, o.toString());
	}

	@Then("the operation evaluates to {string}")
	public void thenTheOperationEvaluatesTo(String val) {
        try {
            assertEquals(BigDecimalUtil.stripZeros(new BigDecimal(val)), c.eval(op));
        } catch (ExecutionControl.NotImplementedException e) {
			fail();
        }
    }

	@Then("the fraction evaluates to {string}")
	public void thenTheFractionEvaluatesTo(String val) {
		try {
			assertEquals(val, c.eval(op).toString());
		} catch (ExecutionControl.NotImplementedException e) {
			fail();
		}
	}

	@Then("the operation evaluates to Division By Zero Error")
	public void thenTheOperationEvaluatesToNaN() {
		assertThrows(ArithmeticException.class, () -> {
			c.print(op);
		});
    }

	@Given("a big expression")
	public void theExpressionIs() throws IllegalConstruction {
		List<Expression> plusExpressionArray = new ArrayList<>();
		Collections.addAll(plusExpressionArray, new MyInteger(3), new MyInteger(4), new MyInteger(5));
		final Expression plus = new Plus(plusExpressionArray);

		List<Expression> minusExpressionArray = new ArrayList<>();
		Collections.addAll(minusExpressionArray, new MyInteger(5), new MyInteger(3));
		final Expression minus = new Minus(minusExpressionArray);

		List<Expression> timesExpressionArray = new ArrayList<>();
		Collections.addAll(timesExpressionArray, new MyInteger(3), new MyInteger(3));
		final Expression times = new Times(timesExpressionArray);

		ArrayList<Expression> divideExpressionArray = new ArrayList<>();
		Collections.addAll(divideExpressionArray, plus, minus, times);
		params = divideExpressionArray;
		op = new Divides(divideExpressionArray);
	}

}