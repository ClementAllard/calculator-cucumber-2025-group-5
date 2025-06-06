package calculator.expression;

import static org.junit.jupiter.api.Assertions.*;

import calculator.IllegalConstruction;
import calculator.expression.number.MyInteger;
import calculator.expression.operator.*;
import calculator.expression.operator.basic.Divides;
import calculator.expression.operator.basic.Minus;
import calculator.expression.operator.basic.Plus;
import calculator.expression.operator.basic.Times;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;


class TestNotation {

    /* This is an auxiliary method to avoid code duplication.
     */
	void testNotation(String s, Operation o, Notation n) {
		assertEquals(s, o.toString(n));
		o.setNotation(n);
		assertEquals(s, o.toString());
	}

	/* This is an auxiliary method to avoid code duplication.
     */
	void testNotations(String symbol,int value1,int value2,Operation op) {
		//prefix notation:
		testNotation(symbol +" (" + value1 + ", " + value2 + ")", op, Notation.PREFIX);
		//infix notation:
		testNotation("( " + value1 + " " + symbol + " " + value2 + " )", op, Notation.INFIX);
		//postfix notation:
		testNotation("(" + value1 + ", " + value2 + ") " + symbol, op, Notation.POSTFIX);
	}

	@ParameterizedTest
	@ValueSource(strings = {"*", "+", "/", "-"})
	void testOutput(String symbol) {
		int value1 = 8;
		int value2 = 6;
		Operation op = null;
		List<Expression> params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
		try {
			//construct another type of operation depending on the input value
			//of the parameterised test
			switch (symbol) {
				case "+"	->	op = new Plus(params);
				case "-"	->	op = new Minus(params);
				case "*"	->	op = new Times(params);
				case "/"	->	op = new Divides(params);
				default		->	fail();
			}
		} catch (IllegalConstruction e) {
			fail();
		}
		testNotations(symbol, value1, value2, op);
	}

}
