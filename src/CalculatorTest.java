import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void testNullNumber() {
		Calculator calculator = new Calculator();
		String number = null;
		double total = 0.0;
		number = null;
		assertEquals(Double.toString(total), calculator.add(number) );
	
	}
	
	@Test
	void testEmptyNumber() {
		Calculator calculator = new Calculator();
		String number = "";
		double total = 0.0;
		number = "";
		assertEquals(Double.toString(total), calculator.add(number) );
	
	}
	
	@Test
	void testAddOneNumber() {
		Calculator calculator = new Calculator();
		String number = "";
		double total = 0;
		number = "3.5";
		total = 3.5;
		assertEquals(Double.toString(total), calculator.add(number) );
	
	}
	
	@Test
	void testAddTwoNumber() {
		Calculator calculator = new Calculator();
		String number = "";
		double total = 0;
		number = "3.5, 1.0";
		total = 4.5;
		assertEquals(Double.toString(total), calculator.add(number) );
	
	}

	@Test
	void testAddThreeeNumbers() {
		Calculator calculator = new Calculator();
		String number = "";
		double total = 0;
		
		number = "1.1, 2.2, 1.2";
		
		total = 4.5;
		assertEquals(Double.toString(total), calculator.add(number) );
	}
	
	@Test
	void testNewLine() {
		Calculator calculator = new Calculator();
		String number = "\n";
		double total = 0;
		number = "1.1\n2.2,3.3";
		total = 6.6;
		assertEquals(Double.toString(total), calculator.add(number) );
	}
	
	@Test
	void testInvalidNewLine() {
		Calculator calculator = new Calculator();
		String number = "\n";
		double total = 0;
		number = "1.1,\n2.2";
		total = 3.3;
		assertEquals(Double.toString(total), calculator.add(number) );
	}
	
	
	
	

}
