package visitor;

import calculator.expression.Expression;
import calculator.expression.MyNumber;
import calculator.expression.Notation;
import calculator.expression.operator.Operation;

public class Displayer implements NotationVisitor {

    private Notation notation;

    public Displayer(Notation notation) {
        this.notation = notation;
    }

    public Displayer(){
        this.notation = null;
    }

    /**
     * Function that treat leafs of the operation tree recursive calls and return the number as string.
     * @param n the number.
     * @return The string that represents the number.
     */
    @Override
    public String visit(MyNumber n){
        return n.toString();
    }

    /**
     * Function that enter args of operation to expand the string to return.
     * @param operation the operation to display
     * @return string that display the operation following its given notation
     */
    @Override
    public String visit(Operation operation) {
        notation = notation == null ? operation.getNotation() : notation;

        // same but recursively
        String sep = ", ";
        StringBuilder args = new StringBuilder();
        for (Expression exp : operation.getArgs()) {
            args.append(exp.toString(notation)).append(sep);
        }
        int subset = !operation.getArgs().isEmpty() ? sep.length() : 0;
        String formula = args.substring(0, args.toString().length() - subset);

        return switch (notation) {
            case INFIX -> "( "+ formula.replace(sep, " "+operation.getSymbol()+" ")+" )";
            case PREFIX -> String.format("%s (%s)", operation.getSymbol(), formula);
            case POSTFIX -> String.format("(%s) %s", formula, operation.getSymbol());
        };
    }
}
