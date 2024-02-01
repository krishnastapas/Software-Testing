package junit;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class q1_rectangleTest {
	private q1_rectangle r1;
	
	@Before
	public void setUp() {
		r1=new q1_rectangle();
	}
	
	@Test
	public void testArea() {
		assertEquals(6,r1.area(2, 3));
	}
	
	@Test
	public void testPerimeter() {
		assertEquals(10,r1.perimeter(2, 3));
	}
	
}
