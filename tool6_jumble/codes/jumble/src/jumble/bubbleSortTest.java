package jumble;
import junit.framework.TestCase;
import static org.junit.Assert.assertArrayEquals;;

public class bubbleSortTest extends TestCase {
	
	public void test1(){
		int a=3;
		int b=6;
		assertEquals(b,factorial.fact(a));
		}
		public void test2(){
		int[] arr= {1,3,2,4,5};
		int[] result= {1,2,3,4,5};
		
		assertArrayEquals(bubbleSort.sort(arr, 5),result);
		}

}
