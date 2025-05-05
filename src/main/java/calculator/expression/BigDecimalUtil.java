package calculator.expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {

    private static int scale = 10;
    private static RoundingMode roundingMode = RoundingMode.HALF_UP;
    private static boolean scientificNotation = false;

    public static void setScale(int newScale) {
        scale = newScale;
    }

    public static int getScale() {
        return scale;
    }

    public static void setRoundingMode(int newRoundingMode) {
        roundingMode = RoundingMode.valueOf(newRoundingMode);
    }

    public static void setScientificNotation(boolean scientificNotation) {
        BigDecimalUtil.scientificNotation = scientificNotation;
    }

    public static boolean isScientificNotation() {
        return scientificNotation;
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
}
