package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;

public class FunctionModulo extends FunctionBinary{
    static final String COMP_NO_MODULO_BASE = "Cannot use complex number as modulo base";
    static final String COMP_NO_MODULO = "Complex numbers have no modulo";

    public FunctionModulo(List<Expression> elist) throws IllegalConstruction {
        super(elist, "mod");
    }

    /**
     * Compute a mod b.
     * @param a the first number.
     * @param b the base of the modulo (second number).
     * @return the response of a mod b.
     */
    protected BigDecimal modulo(BigDecimal a, BigDecimal b) {
        BigDecimal mod = a.remainder(b);
        if (mod.compareTo(BigDecimal.ZERO) < 0) {
            mod = mod.add(b);
        }
        return mod;
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return new MyReal(modulo(l.getValue(), r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return new MyReal(modulo(l.getValue(), r.getReal()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return new MyReal(modulo(l.getValue(), r.getValue()));
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        if (r.getImaginary().compareTo(BigDecimal.ZERO) == 0) {
            return new MyReal(modulo(l.getValue(), r.getReal()));
        } else {
            throw new IllegalArgumentException(COMP_NO_MODULO_BASE);
        }
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return new MyReal(modulo(l.getReal(), r.getValue()));
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return new MyReal(modulo(l.getReal(), r.getReal()));
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return new MyReal(modulo(l.getReal(), r.getValue()));

    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        if (r.getImaginary().compareTo(BigDecimal.ZERO) == 0) {
            return new MyReal(modulo(l.getReal(), r.getReal()));
        } else {
            throw new IllegalArgumentException(COMP_NO_MODULO_BASE);
        }
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return new MyReal(modulo(l.getValue(), r.getValue()));

    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return new MyReal(modulo(l.getValue(), r.getReal()));

    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return new MyReal(modulo(l.getValue(), r.getValue()));

    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        if (r.getImaginary().compareTo(BigDecimal.ZERO) == 0) {
            return new MyReal(modulo(l.getValue(), r.getReal()));
        } else {
            throw new IllegalArgumentException(COMP_NO_MODULO_BASE);
        }
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        if (l.getImaginary().compareTo(BigDecimal.ZERO) == 0) {
            return new MyReal(modulo(l.getReal(), r.getValue()));
        } else {
            throw new IllegalArgumentException(COMP_NO_MODULO);
        }
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        if (l.getImaginary().compareTo(BigDecimal.ZERO) == 0) {
            return new MyReal(modulo(l.getReal(), r.getReal()));
        } else {
            throw new IllegalArgumentException(COMP_NO_MODULO);
        }
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        if (l.getImaginary().compareTo(BigDecimal.ZERO) == 0) {
            return new MyReal(modulo(l.getReal(), r.getValue()));
        } else {
            throw new IllegalArgumentException(COMP_NO_MODULO);
        }
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        if (l.getImaginary().compareTo(BigDecimal.ZERO) != 0) {
            throw new IllegalArgumentException(COMP_NO_MODULO);
        } else if (r.getImaginary().compareTo(BigDecimal.ZERO) != 0){
            throw new IllegalArgumentException(COMP_NO_MODULO_BASE);
        } else {
            return new MyReal(modulo(l.getReal(), r.getReal()));
        }
    }
}
