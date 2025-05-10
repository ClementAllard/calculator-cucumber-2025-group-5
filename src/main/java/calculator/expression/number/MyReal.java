package calculator.expression.number;

import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;

import java.math.BigDecimal;
import java.util.Objects;

public final class MyReal extends MyNumber{

    private final BigDecimal real;

    public MyReal(BigDecimal real) {
        this.real = real;
    }

    public BigDecimal getValue() {
        return real;
    }

    @Override
    public String toString() {
        return BigDecimalUtil.stripZeros(real.setScale(BigDecimalUtil.getScale(), BigDecimalUtil.getRounding()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyReal myReal = (MyReal) o;
        return real.equals(myReal.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(real);
    }
}
