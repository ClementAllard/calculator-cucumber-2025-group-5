package calculator.expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {

    private static int scale = 10;
    private static RoundingMode roundingMode = RoundingMode.HALF_UP;

    public static void setScale(int newScale) {
        scale = newScale;
    }

    public static int getScale() {
        return scale;
    }

    public static void setRoundingMode(RoundingMode newRoundingMode) {
        roundingMode = newRoundingMode;
    }

    public static RoundingMode getRounding() {
        return roundingMode;
    }

    public static String stripZeros(BigDecimal bigDecimal) {
        return bigDecimal.stripTrailingZeros().toPlainString();
    }

    public static BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
        return dividend.divide(divisor, scale, roundingMode);
    }
}
