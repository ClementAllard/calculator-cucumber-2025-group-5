package calculator.expression.number;

import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.operator.Operation;
import visitor.Displayer;
import visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
public abstract class MyNumber implements Expression
{
    /**
     * Constructor method
     */
    protected  /*constructor*/ MyNumber() {}

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v	The visitor object
     */
    public void accept(Visitor v) {
        v.visit(this);
    }


    /** The depth of a number expression is always 0
     *
     * @return The depth of a number expression
     */
    public int countDepth() {
        return 0;
    }

    /** The number of operations contained in a number expression is always 0
     *
     * @return The number of operations contained in a number expression
     */
    public int countOps() {
        return 0;
    }

    /** The number of numbers contained in a number expression is always 1
     *
     * @return The number of numbers contained in  a number expression
     */
    public int countNbs() {
        return 1;
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public abstract String toString();

    public abstract MyNumber negate();

    /** Two MyNumber expressions are equal if the values they contain are equal
     *
     * @param o The object to compare to
     * @return  A boolean representing the result of the equality test
     */
    @Override
    public abstract boolean equals(Object o);

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
    @Override
    public abstract int hashCode();

    /**
     * Convert the arithmetic operation into a String to allow it to be printed,
     * using the notation n (prefix, infix or postfix) that is specified as a parameter.
     *
     * @param n	The notation to be used for representing the operation (prefix, infix or postfix)
     * @return	The String that is the result of the conversion.
     */
    public final String toString(Notation n) {
        return new Displayer(n).visit(this);
    }
}