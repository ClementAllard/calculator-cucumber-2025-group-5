package calculator.expression.number;

import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;

import java.math.BigDecimal;
import java.util.Objects;

public final class MyComplex extends MyNumber {

    private final BigDecimal real;
    private final BigDecimal imaginary;

    public MyComplex(BigDecimal real, BigDecimal imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public BigDecimal getReal() {
        return real;
    }

    public BigDecimal getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary.compareTo(BigDecimal.ZERO) < 0) {
            return  BigDecimalUtil.stripZeros(real) + " - " + BigDecimalUtil.stripZeros(imaginary.negate()) + "i";
        }else {
            return  BigDecimalUtil.stripZeros(real) + " + " + BigDecimalUtil.stripZeros(imaginary) + "i";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return real.equals(myComplex.getReal()) && imaginary.equals(myComplex.getImaginary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
