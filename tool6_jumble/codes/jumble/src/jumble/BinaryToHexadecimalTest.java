package jumble;



import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryToHexadecimalTest {
    @Test
    public void testConvertBinaryToHex() {
        assertEquals("A", BinaryToHexadecimal.convertBinaryToHex("1010"));
        assertEquals("1F", BinaryToHexadecimal.convertBinaryToHex("11111"));
    }
}
