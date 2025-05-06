package calculator.expression.number;

import calculator.expression.Expression;

import java.util.Objects;

public final class MyInteger extends MyNumber {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public Expression negate() {
        return new MyInteger(-value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value == myInteger.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
