package week3.Lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	Calc calc = new Calc();
	
	@Test
	public void testAdd() {
		assertTrue(5 == calc.add(3, 2));
		
		//fail("Not yet implemented");
	}

	@Test (expected = ArithmeticException.class)
	public void testDivbyZer() {
		assertTrue(2 == calc.div(10, 0));
		
		
		//fail("Not yet implemented");
	}
	
	@Test 
	public void testDiv() {
		assertTrue(2 == calc.div(10, 5));
		
		
		//fail("Not yet implemented");
	}

	@Test
	public void testAddPositive() {
		int expected = 5;
		int actual = calc.add(3, 2);
		assertEquals(expected, actual);
	}
	
}
