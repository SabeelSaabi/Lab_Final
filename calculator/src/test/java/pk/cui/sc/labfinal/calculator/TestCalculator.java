package pk.cui.sc.labfinal.calculator;

import org.junit.Test;

import junit.framework.TestCase;
 

public class TestCalculator extends TestCase {
	@Test
	public void CalculatorTest1() {
	Calculator c = new Calculator();
	int value = c.findMax(10, -5, 5);
	assertEquals(2, value);
	}

	@Test
	public void CalculatorTest2() {
	Calculator c1 = new Calculator();
	int value = c1.findMax(-3, 0, -6);
	assertEquals(0, value);
	}

	@Test
	public void CalculatorTest3() {
	Calculator c2 = new Calculator();
	int value = c2.findMax(-7, -2, -1);
	assertEquals(-1, value);
	}
	
	@Test
	public void CalculatorTest4() {
		Calculator c3=new Calculator();
		int square=c3.square(10);
		assertEquals(100, square);
		
	}
	@Test
	public void CalculatorTest5() {
		Calculator c4=new Calculator();
		c4.square(-1);
	}
	
	@Test
	public void CalcuatorTest6() {
		Calculator c3=new Calculator();
		int cube=c3.cube(3);
		assertEquals(27, cube);
	}
}
