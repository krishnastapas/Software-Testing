package jumble;



public class BinaryToHexadecimal {
    public static String convertBinaryToHex(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal).toUpperCase();
    }
}
