package findBug;

public class MatrixAddition {
	 public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        if (matrix1 == null || matrix2 == null ||
	            matrix1.length == 0 || matrix2.length == 0 ||
	            matrix1.length != matrix2.length ||
	            matrix1[0].length != matrix2[0].length) {
	            return null; // Matrices cannot be added
	        }

	        int rows = matrix1.length;
	        int cols = matrix1[0].length;

	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return result;
	    }
}
