package findBug;

public class fibonaciiBug {
	 public static int calfibonacci(int n) {
	        if (n <= 1)
	            return n;
	        else
	            return calfibonacci(n) + calfibonacci(n);
	    }
}
