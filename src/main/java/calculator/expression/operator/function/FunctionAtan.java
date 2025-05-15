package calculator.expression.operator.function;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;

import java.math.BigDecimal;

public class FunctionAtan extends Function {
    public FunctionAtan(Expression expression) throws IllegalConstruction {
        super(expression, "atan");
    }

    @Override
    MyNumber op(BigDecimal l) {
        return new MyReal(BigDecimal.valueOf(Math.atan(l.doubleValue())));
    }

    /**
     * atan(z) = (i/2) * ln((1 - iz) / (1 + iz))
     */
    @Override
    protected MyNumber op(MyComplex z) {
        double x = z.getReal().doubleValue();
        double y = z.getImaginary().doubleValue();

        // iz = -y + ix
        double izReal = -y;

        // 1 - iz
        double aReal = 1 - izReal;
        double aImag = -x;

        // 1 + iz
        double bReal = 1 + izReal;

        // ratio = (a / b)
        double denom = bReal * bReal + x * x;
        double ratioReal = (aReal * bReal + aImag * x) / denom;
        double ratioImag = (aImag * bReal - aReal * x) / denom;

        // ln(...)
        double lnMod = Math.log(Math.hypot(ratioReal, ratioImag));
        double lnArg = Math.atan2(ratioImag, ratioReal);

        // (i/2) * ln = 0.5 * lnArg + i * 0.5 * lnMod
        double realPart = 0.5 * lnArg;
        double imagPart = 0.5 * lnMod;

        return new MyComplex(BigDecimal.valueOf(realPart), BigDecimal.valueOf(imagPart));
    }
}
