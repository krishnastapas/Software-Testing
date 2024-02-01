package junit;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
	private calculator cal;
	
	@Before
	public void setUp() {
		cal=new calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5,cal.add(2, 3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(3,cal.subtract(5, 2));
		
	}
	
	@Test 
	public void testMultiply() {
		assertEquals(15,cal.multiply(5, 3));
	}
	
	
	@Test
	public void testDivide() {
		assertEquals(3,cal.divide(15, 5));
	}


}
