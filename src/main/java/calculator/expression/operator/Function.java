package calculator.expression.operator;

import calculator.IllegalConstruction;
import calculator.expression.BigDecimalUtil;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.math.BigDecimal;
import java.util.List;


public class Function extends BinaryOperation{
    /**
     * Class constructor specifying the arguments of a function.
     *
     * @param elist The list of Expressions as arguments of the function.
     * @param functionName the name of the function.
     */
    public Function(List<Expression> elist, String functionName) throws IllegalConstruction {
        super(elist);
        symbol = functionName;
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(l.getValue() * Math.PI / 180));
            case "degree" -> new MyReal(BigDecimal.valueOf(l.getValue() / Math.PI * 180));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(l.getValue() * Math.PI / 180));
            case "degree" -> new MyReal(BigDecimal.valueOf(l.getValue() / Math.PI * 180));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(l.getValue() * Math.PI / 180));
            case "degree" -> new MyReal(BigDecimal.valueOf(l.getValue() / Math.PI * 180));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(l.getValue() * Math.PI / 180));
            case "degree" -> new MyReal(BigDecimal.valueOf(l.getValue() / Math.PI * 180));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getReal().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(Math.PI)), BigDecimal.valueOf(180)));
            case "degree" -> new MyReal(BigDecimalUtil.divide(l.getValue().multiply(BigDecimal.valueOf(180)), BigDecimal.valueOf(Math.PI)));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        double module = Math.hypot(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // module
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        double degrees = Math.toDegrees(radiant); // rad to degree

        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(radiant));
            case "degree" -> new MyReal(BigDecimal.valueOf(degrees));
            case "module" -> new MyReal(BigDecimal.valueOf(module));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        double module = Math.hypot(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // module
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        double degrees = Math.toDegrees(radiant); // rad to degree

        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(radiant));
            case "degree" -> new MyReal(BigDecimal.valueOf(degrees));
            case "module" -> new MyReal(BigDecimal.valueOf(module));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        double module = Math.hypot(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // module
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        double degrees = Math.toDegrees(radiant); // rad to degree

        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(radiant));
            case "degree" -> new MyReal(BigDecimal.valueOf(degrees));
            case "module" -> new MyReal(BigDecimal.valueOf(module));
            default -> null;
        };
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        double module = Math.hypot(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // module
        double radiant = Math.atan2(l.getReal().doubleValue(), l.getImaginary().doubleValue()); // degree to rad
        double degrees = Math.toDegrees(radiant); // rad to degree

        return switch (symbol) {
            case "rad" -> new MyReal(BigDecimal.valueOf(radiant));
            case "degree" -> new MyReal(BigDecimal.valueOf(degrees));
            case "module" -> new MyReal(BigDecimal.valueOf(module));
            default -> null;
        };
    }
}
