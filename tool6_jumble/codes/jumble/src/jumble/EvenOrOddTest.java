package jumble;



import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void testCheckEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.checkEvenOrOdd(4));
        assertEquals("Odd", EvenOrOdd.checkEvenOrOdd(7));
        assertEquals("Even", EvenOrOdd.checkEvenOrOdd(0));
        assertEquals("Even", EvenOrOdd.checkEvenOrOdd(-4));
        assertEquals("Odd", EvenOrOdd.checkEvenOrOdd(-7));
    }
}
