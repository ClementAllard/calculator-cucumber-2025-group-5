package visitor;

import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyRational;
import calculator.expression.operator.Operation;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/** Evaluation is a concrete visitor that serves to
 * compute and evaluate the results of arithmetic expressions.
 */
public class Evaluator extends Visitor {

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Evaluator() {}

    /** The result of the evaluation will be stored in this private variable */
    private MyNumber computedValue;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public String getResult() {
        if( computedValue == null ) { return "NaN"; }

        if (computedValue instanceof MyRational rational){
            return BigDecimalUtil.stripZeros(rational.getReal());
        }else{
            return computedValue.toString();
        }
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
    public void visit(Operation o) throws ExecutionControl.NotImplementedException {
        ArrayList<MyNumber> evaluatedArgs = new ArrayList<>();
        //first loop to recursively evaluate each subexpression
        for(Expression a:o.getArgs()) {
            a.accept(this);
            evaluatedArgs.add(computedValue);
        }
        //second loop to accumulate all the evaluated subresults
        MyNumber temp = evaluatedArgs.getFirst();
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
