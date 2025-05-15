package calculator.expression.number;

import calculator.expression.BigDecimalUtil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class MyRational extends MyNumber {

    private BigDecimal numerator;
    private BigDecimal denominator;

    public MyRational(BigDecimal numerator, BigDecimal denominator) {
        if (denominator.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Error: division by zero");
        }
        simplify(numerator, denominator);
    }

    public MyRational(int numerator, int denominator) {
        this(new BigDecimal(numerator), new BigDecimal(denominator));
    }

    public MyRational(String numerator, String denominator) {
        this(new BigDecimal(numerator), new BigDecimal(denominator));
    }

    public BigDecimal getNumerator() {
        return numerator;
    }

    public BigDecimal getDenominator() {
        return denominator;
    }

    public BigDecimal getReal() {
        return BigDecimalUtil.divide(numerator, denominator);
    }

    private void simplify(BigDecimal num, BigDecimal den) {
        BigInteger numInt = num.toBigIntegerExact();
        BigInteger denInt = den.toBigIntegerExact();
        BigInteger currentGCD = numInt.gcd(denInt);

        this.numerator = new BigDecimal(numInt.divide(currentGCD));
        this.denominator = new BigDecimal(denInt.divide(currentGCD));

        if (this.denominator.compareTo(BigDecimal.ZERO) < 0) {
            this.numerator = this.numerator.negate();
            this.denominator = this.denominator.negate();
        }
    }

    @Override
    public String toString() {
        if (denominator.equals(BigDecimal.ONE)) {
            return numerator.toPlainString();
        } else {
            boolean negative = numerator.compareTo(BigDecimal.ZERO) < 0;
            BigDecimal absNumerator = numerator.abs();
            BigDecimal[] divisionResult = absNumerator.divideAndRemainder(denominator);

            BigDecimal integerPart = divisionResult[0];
            BigDecimal fractionalPart = divisionResult[1];

            if (fractionalPart.compareTo(BigDecimal.ZERO) == 0) {
                return (negative ? "-" : "") + integerPart.toPlainString();
            } else if (integerPart.compareTo(BigDecimal.ZERO) == 0) {
                return (negative ? "-" : "") + fractionalPart.toPlainString() + "/" + denominator.toPlainString();
            } else {
                String simplification = integerPart.toPlainString() + " "
                        + fractionalPart.toPlainString() + "/" + denominator.toPlainString();
                return negative ? String.format("-(%s)", simplification) : simplification;
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        MyRational myRational = (MyRational) o;
        return numerator.equals(myRational.numerator) && denominator.equals(myRational.denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
