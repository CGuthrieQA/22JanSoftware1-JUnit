package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@BeforeAll
	static void testStart() {
		System.out.println("Starting test suite!");
	}
	
	@BeforeEach
	void newTest() {
		System.out.println("Running a new test...");
	}
	
	@Test
	void testAddition() {
		Calculator calc = new Calculator();
		Float actual = calc.addition(3F,7F);
		Float expected = 10F;
		assertEquals(expected, actual, "the answer was wrong");
	}
	
	@Test
	void testSubtraction() {
		Calculator calc = new Calculator();
		Float actual = calc.subtraction(8F,3F);
		Float expected = 5F;
		assertEquals(expected, actual, "the answer was wrong");
	}
	
	@Test
	void testMultiplication() {
		Calculator calc = new Calculator();
		Float actual = calc.multiplication(5F,4F);
		Float expected = 20F;
		
		// check we get a value back
		assertNotNull(actual);
		
		// check the data type of the value
		assertEquals(Float.class, actual.getClass(), "not the right class");
		
		// check the length of the return
		assertEquals(expected.toString().length(), actual.toString().length(), "number is too long: " + actual.toString());
		
		// assert that the actual matches the expected
		assertEquals(expected, actual, "the answer was wrong");
	}
	
	@AfterEach
	void finishedTest() {
		System.out.println("Finished test!");
	}
	
	@AfterAll
	static void youreMyWonderwall() {
		System.out.println("All done!");
	}

}
