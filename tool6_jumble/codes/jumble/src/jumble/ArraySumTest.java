package jumble;


import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArraySumTest {
	  @Test
	    public void testSumArrays() {
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};
	        int[] expected = {5, 7, 9};
	        assertArrayEquals(expected, ArraySum.sumArrays(array1, array2));
	    }

	    @Test
	    public void testSumArraysEmpty() {
	        int[] array1 = {};
	        int[] array2 = {};
	        int[] expected = {};
	        assertArrayEquals(expected, ArraySum.sumArrays(array1, array2));
	    }

	    @Test
	    public void testSumArraysDifferentLength() {
	    	 int[] array1 = {1, 5, 3};
		        int[] array2 = {0, 0, 0};
		        int[] expected = {1, 5, 3};
		        assertArrayEquals(expected, ArraySum.sumArrays(array1, array2));
	    }

	    @Test
	    public void testSumArraysNegativeNumbers() {
	        int[] array1 = {-1, -2, -3};
	        int[] array2 = {-4, -5, -6};
	        int[] expected = {-5, -7, -9};
	        assertArrayEquals(expected, ArraySum.sumArrays(array1, array2));
	    }

	    @Test
	    public void testSumArraysLargeNumbers() {
	        int[] array1 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
	        int[] array2 = {1, 1};
	        long sum1 = (long) Integer.MAX_VALUE + 1;
	        long sum2 = (long) Integer.MAX_VALUE + 1;
	        int[] expected = {(int) sum1, (int) sum2};
	        assertArrayEquals(expected, ArraySum.sumArrays(array1, array2));
	    }

  
}

