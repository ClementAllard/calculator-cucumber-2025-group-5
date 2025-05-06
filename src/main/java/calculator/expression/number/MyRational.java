package calculator.expression.number;

import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;

import java.math.BigDecimal;
import java.util.Objects;

public final class MyRational extends MyNumber {

    private int numerator;
    private int denominator;

    public MyRational(int numerator, int denominator) {
        if(denominator == 0){ throw new ArithmeticException("Error : division by zero"); }
        simplify(numerator,denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public BigDecimal getReal() {
        return BigDecimalUtil.divide(BigDecimal.valueOf(numerator), BigDecimal.valueOf(denominator));
    }

    private void simplify(int numerator, int denominator) {
        int gcd = gcd(numerator,denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        if(denominator == 1){
            return String.valueOf(numerator);
        }else{
            int integerPart = numerator / denominator;
            int fractionalPart = numerator % denominator;

            if (fractionalPart == 0) {
                return String.valueOf(integerPart);
            } else if (integerPart == 0) {
                return fractionalPart + "/" + denominator;
            } else {
                return integerPart + " " + fractionalPart + "/" + denominator;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRational myRational = (MyRational) o;
        return myRational.getNumerator() == numerator && myRational.getDenominator() == denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
