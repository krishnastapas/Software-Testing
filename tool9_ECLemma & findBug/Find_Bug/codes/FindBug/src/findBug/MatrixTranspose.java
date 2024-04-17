package findBug;

public class MatrixTranspose {
	public static int[][] transpose(int[][] matrix) {
    if (matrix == null || matrix.length == 0)
        return null;

    int rows = matrix.length;
    int cols = matrix[0].length;

    int[][] result = new int[cols][rows];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[j][i] = matrix[i][j];
        }
    }

    return result;
}
}
