package jumble;

import junit.framework.TestCase;
import java.util.Arrays;

public class MatrixTransposeTest extends TestCase {
    
    public void testTranspose() {
    	   // Test case 1
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedTranspose1 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertTrue(Arrays.deepEquals(expectedTranspose1, MatrixTranspose.transpose(matrix1)));

        // Test case 2
        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expectedTranspose2 = {{1, 3, 5}, {2, 4, 6}};
        assertTrue(Arrays.deepEquals(expectedTranspose2, MatrixTranspose.transpose(matrix2)));

        // Test case 3
        int[][] matrix3 = {{1}};
        int[][] expectedTranspose3 = {{1}};
        assertTrue(Arrays.deepEquals(expectedTranspose3, MatrixTranspose.transpose(matrix3)));

        // Test case 4
        int[][] matrix4 = {{1, 2}, {3, 4}};
        int[][] expectedTranspose4 = {{1, 3}, {2, 4}};
        assertTrue(Arrays.deepEquals(expectedTranspose4, MatrixTranspose.transpose(matrix4)));

        // Test case 5
        int[][] matrix5 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] expectedTranspose5 = {{1, 5}, {2, 6}, {3, 7}, {4, 8}};
        assertTrue(Arrays.deepEquals(expectedTranspose5, MatrixTranspose.transpose(matrix5)));
   
    }
}
