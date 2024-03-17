package jumble;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorialOfFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void testFactorialOfThree() {
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    public void testFactorialOfEight() {
        assertEquals(40320, Factorial.factorial(8));
    }
    
  
    
}
