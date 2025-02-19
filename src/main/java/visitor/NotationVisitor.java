package visitor;

import calculator.MyNumber;
import calculator.Operation;

public interface NotationVisitor {
    String visit(Operation operation);

    String visit(MyNumber myNumber);
}