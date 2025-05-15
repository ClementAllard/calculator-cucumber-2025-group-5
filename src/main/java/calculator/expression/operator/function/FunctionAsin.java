package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionAsin extends Function {
    public FunctionAsin(Expression expression) throws IllegalConstruction {
        super(expression, "asin");
    }

    @Override
    MyNumber op(BigDecimal l) {
        if (l.compareTo(BigDecimal.ONE) <= 0 && l.compareTo(BigDecimal.ONE.negate()) >= 0) {
            return new MyReal(BigDecimal.valueOf(Math.asin(l.doubleValue())));
        } else {
            throw new IllegalArgumentException("Domain of "+symbol+" is [-1, 1]");
        }

    }

    /**
     * asin(z) = -i * ln(iz + sqrt(1 - z^2))
     */
    @Override
    protected MyNumber op(MyComplex z) {
        double x = z.getReal().doubleValue();
        double y = z.getImaginary().doubleValue();

        // z^2 = (x + iy)^2 = x^2 - y^2 + 2ixy
        double z2Real = x * x - y * y;
        double z2Imag = 2 * x * y;

        // 1 - z^2
        double oneMinusZ2Real = 1 - z2Real;
        double oneMinusZ2Imag = -z2Imag;

        // sqrt(1 - z^2)
        double modulus;
        modulus = Math.hypot(oneMinusZ2Real, oneMinusZ2Imag);
        double arg = Math.atan2(oneMinusZ2Imag, oneMinusZ2Real);
        double sqrtReal = Math.sqrt(modulus) * Math.cos(arg / 2);
        double sqrtImag = Math.sqrt(modulus) * Math.sin(arg / 2);

        // iz + sqrt(...)
        double sumReal = (-y) + sqrtReal;
        double sumImag = x + sqrtImag;

        // ln(...)
        double lnMod = Math.log(Math.hypot(sumReal, sumImag));
        double lnArg = Math.atan2(sumImag, sumReal);

        // -i * ln = lnArg + i * lnMod
        return new MyComplex(BigDecimal.valueOf(lnArg), BigDecimal.valueOf(-lnMod));
    }
}