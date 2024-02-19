package jumble;

import junit.framework.TestCase;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbersTest extends TestCase {

    public void testGetPrimes() {
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        List<Integer> actualPrimes = PrimeNumbers.getPrimes(100);
        assertEquals(expectedPrimes, actualPrimes);
    }
}
