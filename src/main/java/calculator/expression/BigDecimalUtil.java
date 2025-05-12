package calculator.expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {

    private BigDecimalUtil() {}

    private static int scale = 10;
    private static RoundingMode roundingMode = RoundingMode.HALF_UP;

    public static void setScale(int newScale) {
        scale = newScale;
    }

    public static int getScale() {
        return scale;
    }

    public static void setRoundingMode(int newRoundingMode) {
        roundingMode = RoundingMode.valueOf(newRoundingMode);
    }

    public static RoundingMode getRounding() {
        return roundingMode;
    }

    public static String stripZeros(BigDecimal bigDecimal) {
        return bigDecimal.stripTrailingZeros().toPlainString();
    }

    public static BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {

        if (divisor.compareTo(BigDecimal.ZERO) == 0) {
            if (dividend.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("NaN");
            } else if (dividend.compareTo(BigDecimal.ZERO) > 0) {
                throw new ArithmeticException("+ Infinity");
            } else {
                throw new ArithmeticException("- Infinity");
            }
        }

        return dividend.divide(divisor, scale, roundingMode);
    }

    public static BigDecimal preciseDivide(BigDecimal bigDecimal, BigDecimal bigDecimal1) {
        scale = scale+20;
        BigDecimal temp = divide(bigDecimal, bigDecimal1);
        scale = scale-20;
        return temp;
    }

}
