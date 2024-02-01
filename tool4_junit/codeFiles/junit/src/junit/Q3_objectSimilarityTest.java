package junit;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Q3_objectSimilarityTest {
	
	private department d1,d2;
	private student stu1,stu2;
	private book b1,b2;
	private subject sub1,sub2;
	private result r1,r2;
    		 
	@Before
	public void setUp() {
		d1=new department("Computer Science");
		sub1=new subject("Maths");
		b1=new book("computer", 300.0);
		stu1=new student("Tapas");
		r1=new result(8.0);
		
		d2=d1;
		sub2=new subject("Maths");
		b2=new book("computer",300);
		stu2=new student("Tapas");
		r2=new result(8.0);
	}
	
	@Test
	public void testSimilarity() {
		
		assertEquals(d1,d2);
		assertNotEquals(sub1,sub2);
		assertNotEquals(b1,b2);
		assertNotEquals(stu1,stu2);
		assertNotEquals(r1,r2);
	}

}
