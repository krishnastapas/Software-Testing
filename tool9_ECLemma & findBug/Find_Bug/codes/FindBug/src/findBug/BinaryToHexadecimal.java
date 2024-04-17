package findBug;

public class BinaryToHexadecimal {
	 public static String convertBinaryToHex(String binary) {
	        int decimal = Integer.parseInt(binary, 3);
	        return Integer.toHexString(decimal).toUpperCase()+"";
	    }

}
