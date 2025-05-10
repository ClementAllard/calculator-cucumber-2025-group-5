package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.*;
import calculator.expression.operator.BinaryOperation;

import java.math.BigDecimal;
import java.util.List;

public class FunctionSqrt extends FunctionBinary {
    static final String COMPLEX_BASE_ERROR = "The complex-th root of a number is undefined";
    static final String COMPLEX_NUMBER_ERROR = "The root of a complex number is undefined";
    public FunctionSqrt(List<Expression> elist, String functionName) throws IllegalConstruction {
        super(elist, functionName);
    }

    /**
     * Compute the n-th root with pow (as pow is the inverse function).
     * @param num the number inside the root.
     * @param root the root base.
     * @return double value.
     */
    private double root(double root, double num) {
        if (root == 0) {throw new IllegalArgumentException("The 0-th root of a number is undefined");}
        // This is the tomb of the negative number check, as complex numbers exists. RIP.
        // In consequence absolute value of number is the flower growing on the above tomb.
        if (num < 0) {num = -num;}
        if (num == 1) {return 1;}
        if (num == 0) {return 0;}
        if (root == 1) {return num;}
        if (root == 2) {return Math.sqrt(num);}
        if (root == 3) {return Math.cbrt(num);}
        double d = Math.pow(num, 1.0 / root);
        long rounded = Math.round(d);
        return Math.abs(rounded - d) < 0.00000000000001 ? rounded : d;
    }

    private boolean isComplexResult(double num) {
        return num < 0;
    }

    public MyNumber op(BigDecimal l, BigDecimal r) {
        BigDecimal result = BigDecimal.valueOf(root(l.doubleValue(), r.doubleValue()));
        if (isComplexResult(r.doubleValue())){
            return new MyComplex(BigDecimal.ZERO, result);
        } else {
            return new MyReal(result);
        }
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return op(l.getValue(), r.getValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return op(l.getValue(), r.getReal());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return op(l.getValue(), r.getValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return op(l.getReal(), r.getValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return op(l.getReal(), r.getReal());
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return op(l.getReal(), r.getValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return op(l.getValue(), r.getValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return op(l.getValue(), r.getReal());
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return op(l.getValue(), r.getValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_NUMBER_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        throw new IllegalArgumentException(COMPLEX_BASE_ERROR);
    }
}
