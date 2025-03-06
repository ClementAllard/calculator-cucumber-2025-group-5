package visitor;

import calculator.expression.MyNumber;
import calculator.expression.operator.Operation;

public interface NotationVisitor {
    String visit(Operation operation);

    String visit(MyNumber myNumber);
}