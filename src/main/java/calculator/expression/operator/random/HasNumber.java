package calculator.expression.operator.random;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyReal;
import calculator.expression.operator.basic.Plus;

import java.math.BigDecimal;
import java.util.Arrays;

public interface HasNumber {
    BigDecimal getNumber();

    void setNumber(BigDecimal number);

    default <T extends Expression & HasNumber> BigDecimal getRandValue(T functionRandom) throws IllegalConstruction {
        Calculator calculator = new Calculator();
        final Expression wrap = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), functionRandom));
        BigDecimal number = functionRandom.getNumber();
        try{
            if (number == null) {
                functionRandom.setNumber(BigDecimal.valueOf(Double.parseDouble(calculator.eval(wrap))));
            }
            return functionRandom.getNumber();
        } catch (Exception e) {
            throw new IllegalConstruction();
        }
    }
}