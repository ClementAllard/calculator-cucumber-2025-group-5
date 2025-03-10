package calculator.expression.number;

import java.math.BigDecimal;

public class MyRational extends MyNewNumber {

    private int numerator;
    private int denominator;

    public MyRational(int numerator, int denominator) {
        simplify(numerator,denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public BigDecimal getReal() {
        return new BigDecimal(numerator).divide(new BigDecimal(denominator));
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
    public MyNewNumber plus(MyNewNumber other) {
        if(other instanceof MyInteger otherInt) {
            return new MyRational(numerator + (otherInt.getValue() * denominator), denominator);
        }

        if(other instanceof MyRational otherRational) {
            int newDenominator = otherRational.getDenominator() * denominator;
            int num1 = numerator * otherRational.getDenominator();
            int num2 = otherRational.getNumerator() * denominator;
            return new MyRational(num1 + num2, newDenominator);
        }

        return other.plus(this);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
