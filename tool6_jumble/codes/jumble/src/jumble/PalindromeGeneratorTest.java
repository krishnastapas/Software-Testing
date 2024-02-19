package jumble;


import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeGeneratorTest {

    @Test
    public void testGeneratePalindrome() {
        assertEquals(1221, PalindromeGenerator.generatePalindrome(12));
        assertEquals(123321, PalindromeGenerator.generatePalindrome(123));
        assertEquals(12344321, PalindromeGenerator.generatePalindrome(1234));
    }

  
}
