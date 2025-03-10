package calculator.expression.number;

import java.math.BigDecimal;

public class MyReal extends MyNewNumber{

    private final BigDecimal real;

    public MyReal(BigDecimal real) {
        this.real = real;
    }

    public BigDecimal getReal() {
        return real;
    }

    @Override
    public MyNewNumber plus(MyNewNumber other) {
        if(other instanceof MyInteger otherInt) {
            return new MyReal(new BigDecimal(String.valueOf(otherInt)).add(real));
        }

        if(other instanceof MyRational otherRational) {
            return new MyReal(otherRational.getReal().add(real));
        }

        if(other instanceof MyReal otherReal) {
            return new MyReal(real.add(otherReal.getReal()));
        }

        return other.plus(this);
    }

    @Override
    public String toString() {
        return this.real.toString();
    }
}
