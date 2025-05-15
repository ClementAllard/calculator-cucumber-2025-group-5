package visitor;

import calculator.expression.Expression;
import calculator.expression.number.MyNumber;
import calculator.expression.operator.Operation;
import calculator.expression.operator.UnaryLogicOperation;
import calculator.expression.operator.UnaryOperation;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

/** Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic expressions.
 */
public class Evaluator extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Evaluator() {} // Keep it for clarity, uses Visitor design pattern to evaluate expressions

    /** The result of the evaluation will be stored in this private variable */
    private MyNumber computedValue;

    private String errorMessage;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public MyNumber getResult() {
        return computedValue;
    }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        computedValue = n;
    }

    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    public void visit(Operation o) throws ExecutionControl.NotImplementedException, ArithmeticException {
        List<MyNumber> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedValue);
        }

        MyNumber temp = evaluatedArgs.getFirst();
        if((o instanceof UnaryOperation) || (o instanceof UnaryLogicOperation)) {
            temp = o.op(temp);
        }else{
            //second loop to accumulate all the evaluated subresults
            int max = evaluatedArgs.size();
            for(int counter=1; counter<max; counter++) {
                temp = o.op(temp,evaluatedArgs.get(counter));
            }
            // store the accumulated result
        }
        computedValue = temp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
