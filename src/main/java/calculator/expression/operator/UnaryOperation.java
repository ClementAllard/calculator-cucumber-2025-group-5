package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public abstract class UnaryOperation extends Operation {
    protected UnaryOperation(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
    }

    protected UnaryOperation(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) throws ExecutionControl.NotImplementedException {
        throw new ArithmeticException("The operation '" + getSymbol() + "' needs one operands");
    }

    public MyNumber op(MyNumber myNumber) throws ExecutionControl.NotImplementedException,ArithmeticException{
        switch (myNumber){
            case MyInteger a -> { return op(a); }
            case MyRational a -> { return op(a); }
            case MyReal a -> { return op(a); }
            case MyComplex a -> { return op(a); }
            default -> throw new ExecutionControl.NotImplementedException("The operation '" + getSymbol() + "' on "
                    + myNumber.getClass() + " is not implemented yet");
        }
    }

    protected abstract MyNumber op(MyInteger l);
    protected abstract MyNumber op(MyRational l);
    protected abstract MyNumber op(MyReal l);
    protected abstract MyNumber op(MyComplex l);
}
