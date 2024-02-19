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

  
}

