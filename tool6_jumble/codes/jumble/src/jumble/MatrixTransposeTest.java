package jumble;

import junit.framework.TestCase;
import java.util.Arrays;

public class MatrixTransposeTest extends TestCase {
    
    public void testTranspose() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedTranspose1 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expectedTranspose2 = {{1, 3, 5}, {2, 4, 6}};

        int[][] matrix3 = {{1}};
        int[][] expectedTranspose3 = {{1}};

        assertTrue(Arrays.deepEquals(expectedTranspose1, MatrixTranspose.transpose(matrix1)));
        assertTrue(Arrays.deepEquals(expectedTranspose2, MatrixTranspose.transpose(matrix2)));
        assertTrue(Arrays.deepEquals(expectedTranspose3, MatrixTranspose.transpose(matrix3)));
    }
}
