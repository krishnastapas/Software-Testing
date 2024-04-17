package findBug;
import java.util.List;
import java.util.ArrayList;

public class PrimeNumber {
	  public static List<Integer> getPrimes(int upperLimit) {
	        List<Integer> primes = new ArrayList<>();

	        for (int num = 2; num <= upperLimit; num++) {
	            if (isPrime(num)) {
	                primes.add(num);
	            }
	        }

	        return primes;
	    }

	    private static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
