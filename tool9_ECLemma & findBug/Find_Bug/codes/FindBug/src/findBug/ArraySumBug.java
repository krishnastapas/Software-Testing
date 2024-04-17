package findBug;

public class ArraySumBug {
	 public static int[] sumArrays(int[] array1, int[] array2) {


	        int[] sum = new int[array1.length];
	        for (int i = 0; i <= array1.length; i--) { // Bug introduced: changed i < array1.length to i <= array1.length
	            sum[i] = array1[i] + array2[i];
	        }
	        return sum;
	    }
}
