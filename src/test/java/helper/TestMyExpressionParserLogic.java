package helper;

import calculator.Calculator;
import calculator.expression.Expression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestMyExpressionParserLogic {

    Calculator c = new Calculator();

    @Test
    void testEquivalence(){
        try{
            Expression expression = MyExpressionParser.parseExpression("1 <=> 1");
            Expression response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 <=> 0");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 <=> 1");
            response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testImplication(){
        try{
            Expression expression = MyExpressionParser.parseExpression("1 => 1");
            Expression response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 => 1");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 => 0");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("1 => 0");
            response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testAnd(){
        try{
            Expression expression = MyExpressionParser.parseExpression("1 and 1");
            Expression response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 and 1");
            response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 and 0");
            response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testOr(){
        try{
            Expression expression = MyExpressionParser.parseExpression("1 or 1");
            Expression response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 or 1");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("1 or 0");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 or 0");
            response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testXor(){
        try{
            Expression expression = MyExpressionParser.parseExpression("1 xor 1");
            Expression response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 xor 1");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("1 xor 0");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("0 xor 0");
            response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(expression), c.eval(response));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
}
