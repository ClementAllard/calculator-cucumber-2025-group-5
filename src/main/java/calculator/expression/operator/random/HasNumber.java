package calculator.expression.operator.random;

import calculator.Calculator;
import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyNumber;
import calculator.expression.number.MyReal;
import calculator.expression.operator.basic.Plus;

import java.math.BigDecimal;
import java.util.Arrays;

public interface HasNumber {
    MyNumber getNumber();

    void setNumber(MyNumber number);

    default <T extends Expression & HasNumber> MyNumber getRandValue(T functionRandom) throws IllegalConstruction {
        Calculator calculator = new Calculator();
        final Expression wrap = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), functionRandom));
        MyNumber number = functionRandom.getNumber();
        String evaluation = null;
        try{
            if (number == null) {
                evaluation = calculator.eval(wrap);
                BigDecimal value = BigDecimal.valueOf(Double.parseDouble(evaluation));
                functionRandom.setNumber(new MyReal(value));
            }
            return functionRandom.getNumber();
        } catch (NumberFormatException _) {
            // we also have complex number that we need to parse by hand.
            if (evaluation == null){
                throw new IllegalConstruction();
            }

            // find indexes.
            int indexReal = evaluation.indexOf("+");
            if (indexReal == -1) {
                indexReal = evaluation.indexOf("-");
            }

            // split the string into 2 numbers
            String real = evaluation.substring(0, indexReal);
            String img = evaluation.substring(indexReal + 1, evaluation.indexOf("i"));

            // read the numbers
            BigDecimal realNumber = BigDecimal.valueOf(Double.parseDouble(real));
            BigDecimal imgNumber = BigDecimal.valueOf(Double.parseDouble(img));

            // build and return the complex
            return new MyComplex(realNumber, imgNumber);
        } catch (Exception _){
            throw new IllegalConstruction();
        }
    }
}