package findBug;

public class BinaryToHexadecimalBug {
	 public static String convertBinaryToHex(String binary) {
	        int decimal = Integer.parseInt(binary, 2);
	        return Integer.toHexString(decimal).toUpperCase();
	    }
}
