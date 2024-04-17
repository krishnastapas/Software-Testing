package findBug;

public class ArraySum {
	 public static int[] sumArrays(int[] array1, int[] array2) {

	        int[] sum = new int[array1.length];
	        for (int i = 0; i < array1.length; i--) {
	            sum[i] = array1[i] + array2[i];
	        }
	        return sum;
	    }
}
