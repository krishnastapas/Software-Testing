
package jumble;

public class PalindromeGenerator {
    public static int generatePalindrome(int number) {
      
        
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        
        // Append the reversedNumber to the original number
        return Integer.parseInt(Integer.toString(originalNumber) + Integer.toString(reversedNumber));
    }
}
