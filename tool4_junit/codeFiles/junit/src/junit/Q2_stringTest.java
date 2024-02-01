package junit;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class Q2_stringTest {
	private q2_string str;
	
	@Before
	public void setUp() {
		str=new q2_string();
	}
	
	@Test
	public void testPallindrome() {
		assertTrue(str.ispalindrome("sas"));
	}
	
	@Test
	public void testSimilarity() {
		assertTrue(str.isSimilar("krishna", "krishna"));
	}

}
