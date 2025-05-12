package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.*;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public abstract class BinaryOperation extends Operation {

    protected BinaryOperation(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
    }

    protected BinaryOperation(List<Expression> elist, String symbol) throws IllegalConstruction {
        this(elist,Notation.INFIX);
        this.symbol = symbol;
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) throws ExecutionControl.NotImplementedException {
        if (l instanceof MyInteger a) {
            if (r instanceof MyInteger b) return op(a,b);
            if (r instanceof MyRational b) return op(a,b);
            if (r instanceof MyReal b) return op(a,b);
            if (r instanceof MyComplex b) return op(a,b);
        } else if (l instanceof MyRational a) {
            if (r instanceof MyInteger b) return op(a,b);
            if (r instanceof MyRational b) return op(a,b);
            if (r instanceof MyReal b) return op(a,b);
            if (r instanceof MyComplex b) return op(a,b);
        } else if (l instanceof MyReal a) {
            if (r instanceof MyInteger b) return op(a,b);
            if (r instanceof MyRational b) return op(a,b);
            if (r instanceof MyReal b) return op(a,b);
            if (r instanceof MyComplex b) return op(a,b);
        } else if (l instanceof MyComplex a) {
            if (r instanceof MyInteger b) return op(a,b);
            if (r instanceof MyRational b) return op(a,b);
            if (r instanceof MyReal b) return op(a,b);
            if (r instanceof MyComplex b) return op(a,b);
        }

        throw new ExecutionControl.NotImplementedException("The operation '" + getSymbol() + "' between "
                + l.getClass() + " and " + r.getClass() + " is not implemented yet");
    }

    public MyNumber op(MyNumber myNumber) throws ExecutionControl.NotImplementedException,ArithmeticException{
        throw new ArithmeticException("The operation '" + getSymbol() + "' needs two operands");
    }

    protected abstract MyNumber op(MyInteger l, MyInteger r);
    protected abstract MyNumber op(MyInteger l, MyRational r);
    protected abstract MyNumber op(MyInteger l, MyReal r);
    protected abstract MyNumber op(MyInteger l, MyComplex r);
    protected abstract MyNumber op(MyRational l, MyInteger r);
    protected abstract MyNumber op(MyRational l, MyRational r);
    protected abstract MyNumber op(MyRational l, MyReal r);
    protected abstract MyNumber op(MyRational l, MyComplex r);
    protected abstract MyNumber op(MyReal l, MyInteger r);
    protected abstract MyNumber op(MyReal l, MyRational r);
    protected abstract MyNumber op(MyReal l, MyReal r);
    protected abstract MyNumber op(MyReal l, MyComplex r);
    protected abstract MyNumber op(MyComplex l, MyInteger r);
    protected abstract MyNumber op(MyComplex l, MyRational r);
    protected abstract MyNumber op(MyComplex l, MyReal r);
    protected abstract MyNumber op(MyComplex l, MyComplex r);
}
