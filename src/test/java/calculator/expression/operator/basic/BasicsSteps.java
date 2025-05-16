package calculator.expression.operator.basic;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;
import calculator.expression.operator.Operation;
import helper.IllegalSyntax;
import helper.MyExpressionParser;
import io.cucumber.java.en.*;
import jdk.jshell.spi.ExecutionControl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BasicsSteps {

    Calculator calculator = new Calculator();
    Operation op;
    List<Expression> args = new ArrayList<>();
    Exception exc;

    @When("I create a {string} operator with null")
    public void iCreateAOperatorWithNull(String operator) {

        try {
            switch (operator){
                case "Divides" :
                    op = new Divides(null);
                    break;
                case "Multiply" :
                    op = new Times(null);
                    break;
                case "Addition" :
                    op = new Plus(null);
                    break;
                case "Minus" :
                    op = new Minus(null);
                    break;
                case "Negate" :
                    op = new Negate(null);
                    break;
                case "Power" :
                    op = new Power(null);
                    break;
                default :
                    fail(operator);
            }
        }catch (Exception e) {
            exc = e;
        }
    }

    @Then("an IllegalConstruction exception is thrown")
    public void anIllegalConstructionExceptionIsThrown() {
        assertInstanceOf(IllegalConstruction.class, exc);
    }

    @When("I divide an integer by {int}")
    public void iDivideAnIntegerBy(int arg0) {
        try {
            List<Expression> expressions = Arrays.asList(new MyInteger(1),new MyInteger(arg0));
            op = new Divides(expressions);
            op.op((MyNumber) expressions.getFirst(), (MyNumber) expressions.getLast());
        } catch (ArithmeticException e) {
            exc = e;
        } catch (IllegalConstruction | ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Then("an ArithmeticException is thrown")
    public void anArithmeticExceptionIsThrown() {
        assertInstanceOf(ArithmeticException.class, exc);
    }

    @Then("an ArithmeticException is thrown with this message {string}")
    public void anArithmeticExceptionIsThrownWithThisMessage(String arg0) {
        try {
            calculator.eval(op);
            fail();
        } catch (ArithmeticException e) {
            assertEquals(arg0, e.getMessage());
        } catch (ExecutionControl.NotImplementedException e) {
            fail(e.getMessage());
        }
    }

    @Then("the result of the basic operation is {string}")
    public void theResultOfTheBasicOperationIs(String arg0) {
        try{
            assertEquals(arg0, calculator.eval(op));
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @When("I divide {string} by {string}")
    public void iDivideBy(String arg0, String arg1) {
        try{
            getArgs(arg0, arg1);
            op = new Divides(args);
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @When("I minus {string} by {string}")
    public void iMinusBy(String arg0, String arg1) {
        try{
            getArgs(arg0, arg1);
            op = new Minus(args);
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @When("I adding {string} by {string}")
    public void iAddingBy(String arg0, String arg1) {
        try{
            getArgs(arg0, arg1);
            op = new Plus(args);
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @When("I multiply {string} by {string}")
    public void iMultiplyBy(String arg0, String arg1) {
        try{
            getArgs(arg0, arg1);
            op = new Times(args);
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @When("I power {string} by {string}")
    public void iPowerBy(String arg0, String arg1) {
        try{
            getArgs(arg0, arg1);
            op = new Power(args);
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }

    private void getArgs(String arg0, String arg1) throws IllegalSyntax {
        Expression myReal0 = MyExpressionParser.parseExpression(arg0);
        Expression myReal1 = MyExpressionParser.parseExpression(arg1);
        args.addAll(Arrays.asList(myReal0,myReal1));
    }

    @When("I negate {string}")
    public void iNegateBy(String arg0) {
        try{
            Expression myReal0 = MyExpressionParser.parseExpression(arg0);
            op = new Negate(myReal0);
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
