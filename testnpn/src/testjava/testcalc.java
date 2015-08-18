package testjava;
import mainjava.Calculation;

import junit.framework.TestCase;
public class testcalc extends TestCase{
	public void testcalc(){

		String[] tokens = new String[] { "1", "2", "3", "+", "-" };
		Calculation calc = new Calculation();
		assertEquals(-4,calc.calculate(tokens));
	}
}

