package visitor;

import calculator.expression.number.MyNumber;
import calculator.expression.operator.Operation;

public interface NotationVisitor {
    String visit(Operation operation);

    String visit(MyNumber n);
}