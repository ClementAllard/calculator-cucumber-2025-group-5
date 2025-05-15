package helper;

import calculator.Calculator;
import calculator.expression.Expression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyExpressionParserBitwise {

    Calculator c = new Calculator();

    @Test
    void testBitwiseAnd(){
        try{
            Expression expression = MyExpressionParser.parseExpression("2b1101 & 2b1011");
            Expression response = MyExpressionParser.parseExpression("2b1001");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("2b1101 & 2b1110");
            response = MyExpressionParser.parseExpression("2b1100");
            assertEquals(c.eval(expression), c.eval(response));

            Expression newExpression = MyExpressionParser.parseExpression("2 & 2b111");
            assertThrows(UnsupportedOperationException.class, () -> c.eval(newExpression));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testBitwiseOr(){
        try{
            Expression expression = MyExpressionParser.parseExpression("2b1101 | 2b1011");
            Expression response = MyExpressionParser.parseExpression("2b1111");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("2b1100 | 2b1110");
            response = MyExpressionParser.parseExpression("2b1110");
            assertEquals(c.eval(expression), c.eval(response));

            Expression newExpression = MyExpressionParser.parseExpression("2 | 2b111");
            assertThrows(UnsupportedOperationException.class, () -> c.eval(newExpression));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testBitwiseXor(){
        try{
            Expression expression = MyExpressionParser.parseExpression("2b1101 ^^ 2b1011");
            Expression response = MyExpressionParser.parseExpression("2b0110");
            assertEquals(c.eval(expression), c.eval(response));

            expression = MyExpressionParser.parseExpression("2b1100 ^^ 2b1110");
            response = MyExpressionParser.parseExpression("2b0010");
            assertEquals(c.eval(expression), c.eval(response));

            Expression newExpression = MyExpressionParser.parseExpression("2 ^^ 2b111");
            assertThrows(UnsupportedOperationException.class, () -> c.eval(newExpression));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testBitwiseRight(){
        try{
            Expression expression = MyExpressionParser.parseExpression(">> 2b10");
            Expression response = MyExpressionParser.parseExpression("2b01");
            assertEquals(c.eval(expression), c.eval(response));

            Expression newExpression = MyExpressionParser.parseExpression(">> 1");
            assertThrows(UnsupportedOperationException.class, () -> c.eval(newExpression));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testBitwiseLeft(){
        try{
            Expression expression = MyExpressionParser.parseExpression("<< 2b1");
            Expression response = MyExpressionParser.parseExpression("2b10");
            assertEquals(c.eval(expression), c.eval(response));

            Expression newExpression = MyExpressionParser.parseExpression("<< 1");
            assertThrows(UnsupportedOperationException.class, () -> c.eval(newExpression));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testBitwiseNot(){
        try{
            Expression expression = MyExpressionParser.parseExpression("~ 2b1101");
            Expression response = MyExpressionParser.parseExpression("2b0010");
            assertEquals(c.eval(expression), c.eval(response));

            Expression newExpression = MyExpressionParser.parseExpression("~ 1");
            assertThrows(UnsupportedOperationException.class, () -> c.eval(newExpression));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
}
