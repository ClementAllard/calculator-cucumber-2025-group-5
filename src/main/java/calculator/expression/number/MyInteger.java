package calculator.expression.number;

import calculator.expression.BigDecimalUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

public class MyInteger extends MyNumber {

    private final BigDecimal value;
    private final int base;

    public MyInteger(BigDecimal value) {
        this.value = value.setScale(0, RoundingMode.FLOOR);
        this.base = 10;
    }

    public MyInteger(int value) {
        this.value = new BigDecimal(value).setScale(0, RoundingMode.FLOOR);
        this.base = 10;
    }

    public MyInteger(String value) {
        this.value = new BigDecimal(value).setScale(0, RoundingMode.FLOOR);
        this.base = 10;
    }

    public MyInteger(String value, int base) {
        for (char c : value.toCharArray()) {
            if (Character.digit(c, base) == -1) {
                throw new IllegalArgumentException(
                        "Caractère '" + c + "' invalide pour la base " + base);
            }
        }
        BigInteger integer = new BigInteger(value, base);
        this.value = new BigDecimal(integer).setScale(0, RoundingMode.FLOOR);
        this.base = base;
    }

    public MyInteger(BigDecimal value, int base) {
        BigInteger integer = new BigInteger(String.valueOf(value), base);
        this.value = new BigDecimal(integer).setScale(0, RoundingMode.FLOOR);
        this.base = base;
    }

    public BigDecimal getValue() { // return value in base 10
        return value;
    }

    public int getBase() {
        return base;
    }

    public String getBaseRepresentation() { // return value in the base given at creation
        BigInteger integer = value.toBigIntegerExact();
        return integer.toString(base);
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
