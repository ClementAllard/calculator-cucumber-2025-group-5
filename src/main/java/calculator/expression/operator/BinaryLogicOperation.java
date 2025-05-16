package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyNumber;

import java.util.List;

public abstract class BinaryLogicOperation extends Operation {

    protected BinaryLogicOperation(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
    }

    protected BinaryLogicOperation(List<Expression> elist, String symbol) throws IllegalConstruction {
        this(elist,Notation.INFIX);
        this.symbol = symbol;
    }

    @Override
    public MyNumber op(MyNumber l, MyNumber r) throws UnsupportedOperationException {
        if (l instanceof MyInteger a && r instanceof MyInteger b) {
            return op(a,b);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public MyNumber op(MyNumber myNumber) throws ArithmeticException {
        throw new ArithmeticException("The operation '" + getSymbol() + "' needs two operands");
    }

    protected abstract MyNumber op(MyInteger l, MyInteger r);
}