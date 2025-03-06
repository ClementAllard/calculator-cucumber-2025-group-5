package visitor;

import calculator.expression.Expression;
import calculator.expression.MyNumber;
import calculator.expression.operator.Operation;

import java.util.ArrayList;

/** Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic expressions.
 */
public class Evaluator extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Evaluator() {}

    /** The result of the evaluation will be stored in this private variable */
    private Integer computedValue;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public Integer getResult() { return computedValue; }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        computedValue = n.getValue();
    }

    /** Use the visitor design pattern to visit an operation
     *
     * @param o The operation being visited
     */
    public void visit(Operation o) {
        ArrayList<Integer> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedValue);
        }
        //second loop to accumulate all the evaluated subresults
        int temp = evaluatedArgs.getFirst();
        int max = evaluatedArgs.size();
        for(int counter=1; counter<max; counter++) {
            try {
                temp = o.op(temp,evaluatedArgs.get(counter));
            }catch (ArithmeticException e) {
                computedValue = null;
                return;
            }
        }
        // store the accumulated result
        computedValue = temp;
    }

}
