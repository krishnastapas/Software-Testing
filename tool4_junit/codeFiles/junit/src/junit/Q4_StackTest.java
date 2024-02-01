package junit;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Q4_StackTest {
	private Q4_Stack st;
	
	@Before
	public void setUp() {
		st=new Q4_Stack(10);
	}
	
	@Test
	public void testStack() {
		st.push(10);
		st.push(8);
		assertEquals(8,st.pop());
		assertEquals(10,st.pop());
	}
	
}
