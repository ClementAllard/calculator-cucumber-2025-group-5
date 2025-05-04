package calculator.expression.operator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.expression.Expression;
import calculator.IllegalConstruction;
import calculator.expression.Notation;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyReal;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestDivides {

	private final int value1 = 8;
	private final int value2 = 6;
	private Divides op;
	private List<Expression> params;

	@BeforeEach
	void setUp() {
		  params = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		  try {
		  	op = new Divides(params);
			op.notation = Notation.INFIX; // reset the notation to infix (which is the default) before each test
		  }
		  catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalConstruction.class, () -> op = new Divides(null));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() {
		// A Times expression should not be the same as a Divides expression
		try {
			assertNotSame(new Times(new ArrayList<>()), op);
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Test
	void testEquals() {
		// Two similar expressions, constructed separately (and using different constructors) should be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Divides d = new Divides(p, Notation.INFIX);
			assertEquals(op, d);
		}
		catch(IllegalConstruction e) { fail(); }
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
		assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Divides e = new Divides(p, Notation.INFIX);
			assertEquals(e.hashCode(), op.hashCode());
		}
		catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalConstruction.class, () -> op = new Divides(params));
	}

	@Test
	void zeroDivisionError() {
		// Division by zero should throw an ArithmeticException to be handled by the Evaluator
		params = Arrays.asList(new MyInteger(value1), new MyInteger(0));
		try {
			op = new Divides(params);
			assertThrows(ArithmeticException.class, () -> op.op(new MyInteger(value1), new MyInteger(0)));
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Test
	void zeroDivisionRealError() {
		MyReal real1 = new MyReal(new BigDecimal("0.0"));
		MyReal real2 = new MyReal(new BigDecimal("1.0"));
		MyReal real3 = new MyReal(new BigDecimal("-1.0"));

		// Division by zero should throw an ArithmeticException to be handled by the Evaluator

		try {
			params = Arrays.asList(real1, real1);
			op = new Divides(params);
			ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> op.op(real1,real1));
			assertEquals("NaN", thrown.getMessage());

			params = Arrays.asList(real2, real1);
			op = new Divides(params);
			thrown = assertThrows(ArithmeticException.class, () -> op.op(real2,real1));
			assertEquals("+ Infinity", thrown.getMessage());

			params = Arrays.asList(real3, real1);
			op = new Divides(params);
			thrown = assertThrows(ArithmeticException.class, () -> op.op(real3,real1));
			assertEquals("- Infinity", thrown.getMessage());
		} catch (IllegalConstruction e) {
			fail();
		}
	}

}
