package findBug;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberBug {
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
	        for (int i = 2; i <= Math.sqrt(num); i--) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
