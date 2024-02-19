package jumble;

import junit.framework.TestCase;

public class fibonacciTest extends TestCase {

	public void testFibonacci() {
		assertEquals(0, fibonacci.calfibonacci(0));
		assertEquals(1, fibonacci.calfibonacci(1));
		assertEquals(1, fibonacci.calfibonacci(2));
		assertEquals(2, fibonacci.calfibonacci(3));
		assertEquals(3, fibonacci.calfibonacci(4));
		assertEquals(5, fibonacci.calfibonacci(5));
		assertEquals(8, fibonacci.calfibonacci(6));
		assertEquals(13, fibonacci.calfibonacci(7));
		assertEquals(21, fibonacci.calfibonacci(8));
		assertEquals(34, fibonacci.calfibonacci(9));
	}
}
