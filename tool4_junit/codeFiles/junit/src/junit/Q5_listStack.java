package junit;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class Q5_listStack {
	private Q5_list ls;
		
		@Before
		public void setUp() {
			ls=new Q5_list();
		}
		
		@Test
		public void testList() {
			ls.insert(10);
			ls.insert(78);
			ls.insert(7);
			ls.insert(70);
			ls.insert(78);
			assertTrue(ls.find(10));
			assertTrue(ls.find(7));
		
		}
}




