package jumble;

import junit.framework.TestCase;
import java.util.Arrays;

public class MatrixAdditionTest extends TestCase {
    
    public void testAddMatrices() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] expectedSum = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};

        int[][] result = MatrixAddition.addMatrices(matrix1, matrix2);

        assertTrue(Arrays.deepEquals(expectedSum, result));
    }
}
