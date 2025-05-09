package calculator.expression.number;

import calculator.expression.BigDecimalUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class MyInteger extends MyNumber {

    private final BigDecimal value;

    public MyInteger(BigDecimal value) {
        this.value = value.setScale(0, RoundingMode.FLOOR);
    }

    public MyInteger(int value) {
        this.value = new BigDecimal(value).setScale(0, RoundingMode.FLOOR);
    }

    public MyInteger(String value) {
        this.value = new BigDecimal(value).setScale(0, RoundingMode.FLOOR);
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return BigDecimalUtil.stripZeros(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value.equals(myInteger.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
