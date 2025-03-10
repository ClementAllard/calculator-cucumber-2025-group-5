package calculator.expression.number;

import java.math.BigDecimal;

public class MyComplex extends MyNewNumber {

    private BigDecimal real;
    private BigDecimal imaginary;

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
    public MyNewNumber plus(MyNewNumber other) {
        if(other instanceof MyInteger otherInter) {
            return new MyComplex(this.real.add(new BigDecimal(otherInter.getValue())), this.imaginary);
        }

        if(other instanceof MyRational otherRational) {
            return new MyComplex(this.real.add(otherRational.getReal()), this.imaginary);
        }

        if(other instanceof MyReal otherReal) {
            return new MyComplex(this.real.add(otherReal.getReal()), this.imaginary);
        }

        return new MyComplex(this.real.add(((MyComplex)other).getReal()), this.imaginary.add(((MyComplex)other).getImaginary()));
    }

    @Override
    public String toString() {
        return real.toString() + " + " + imaginary.toString() + "i";
    }
}
