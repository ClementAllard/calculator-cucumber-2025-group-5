package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionAcos extends Function {
    public FunctionAcos(Expression expression) throws IllegalConstruction {
        super(expression, "acos");
    }

    @Override
    MyNumber op(BigDecimal l) {
        if (l.compareTo(BigDecimal.ONE) <= 0 && l.compareTo(BigDecimal.ONE.negate()) >= 0) {
            return new MyReal(BigDecimal.valueOf(Math.acos(l.doubleValue())));
        } else {
            throw new IllegalArgumentException("Domain of "+symbol+" is [-1, 1]");
        }
    }

    /**
     * acos(z) = -i * ln(z + sqrt(z^2 - 1))
     */
    @Override
    protected MyNumber op(MyComplex z) {
        double x = z.getReal().doubleValue();
        double y = z.getImaginary().doubleValue();

        // z^2
        double z2Real = x * x - y * y;
        double z2Imag = 2 * x * y;

        // z^2 - 1
        double minus1Real = z2Real - 1;

        // sqrt(z^2 - 1)
        double modulus = Math.hypot(minus1Real, z2Imag);
        double arg = Math.atan2(z2Imag, minus1Real);
        double sqrtReal = Math.sqrt(modulus) * Math.cos(arg / 2);
        double sqrtImag = Math.sqrt(modulus) * Math.sin(arg / 2);

        // z + sqrt(...)
        double sumReal = x + sqrtReal;
        double sumImag = y + sqrtImag;

        // ln(...)
        double lnMod = Math.log(Math.hypot(sumReal, sumImag));
        double lnArg = Math.atan2(sumImag, sumReal);

        // -i * ln = lnArg + i * -lnMod
        double imagPart = -lnMod;

        return new MyComplex(BigDecimal.valueOf(lnArg), BigDecimal.valueOf(imagPart));
    }
}