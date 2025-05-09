package calculator;

import calculator.expression.Expression;
import calculator.expression.number.*;
import jdk.jshell.spi.ExecutionControl;
import visitor.Evaluator;

import java.text.DecimalFormat;

/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate arithmetic expressions.
 *
 * @author tommens
 */
public class Calculator {

    /**
     * Default constructor of the class.
     * Does nothing since the class does not have any variables that need to be initialised.
     */
    public Calculator() {}

    private boolean scientificNotation = false;

    public void setScientificNotation(boolean scientificNotation) {
        this.scientificNotation = scientificNotation;
    }

    /*
     For the moment the calculator only contains a print method and an eval method
     It would be useful to complete this with a read method, so that we would be able
     to implement a full REPL cycle (Read-Eval-Print loop) such as in Scheme, Python, R and other languages.
     To do so would require to implement a method with the following signature, converting an input string
     into an arithmetic expression:
     public Expression read(String s)
    */

    /**
     * Prints an arithmetic expression provided as input parameter.
     * @param e the arithmetic Expression to be printed
     * @see #printExpressionDetails(Expression)
     */
    public void print(Expression e) throws ExecutionControl.NotImplementedException {
        System.out.print("The result of evaluating expression " + e); //NOSONAR
        if (eval(e) != null) {
            System.out.println(" is " + eval(e) + "."); //NOSONAR
        } else {
            System.out.println(" is NaN."); //NOSONAR
        }
    }

    /**
     * Prints verbose details of an arithmetic expression provided as input parameter.
     * @param e the arithmetic Expression to be printed
     * @see #print(Expression)
     */
    public void printExpressionDetails(Expression e) throws ExecutionControl.NotImplementedException {
        print(e);
        System.out.print("It contains " + e.countDepth() + " levels of nested expressions, "); //NOSONAR
        System.out.print(e.countOps() + " operations"); //NOSONAR
        System.out.println(" and " + e.countNbs() + " numbers."); //NOSONAR
        System.out.println(); //NOSONAR
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public String eval(Expression e) throws ExecutionControl.NotImplementedException {
        // create a new visitor to evaluate expressions
        Evaluator v = new Evaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);
        // and return the result of the evaluation at the end of the process
        MyNumber result = v.getResult();

        return switch (result) {
            case null -> v.getErrorMessage();
            case MyComplex complex -> complex.toString();
            case MyReal real when scientificNotation -> {
                DecimalFormat sciFormat = new DecimalFormat("0.###E0");
                yield sciFormat.format(real);
            }
            default -> result.toString();
        };

    }

    /*
     We could also have other methods, e.g. to verify whether an expression is syntactically correct
     public Boolean validate(Expression e)
     or to simplify some expression
     public Expression simplify(Expression e)
    */
}
