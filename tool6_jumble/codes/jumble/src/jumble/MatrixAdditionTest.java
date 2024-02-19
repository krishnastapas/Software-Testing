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

    public void testAddMatricesWithZeros() {
        int[][] matrix1 = {{0, 0}, {0, 0}};
        int[][] matrix2 = {{0, 0}, {0, 0}};
        int[][] expectedSum = {{0, 0}, {0, 0}};
        int[][] result = MatrixAddition.addMatrices(matrix1, matrix2);
        assertTrue(Arrays.deepEquals(expectedSum, result));
    }

    public void testAddMatricesNegativeNumbers() {
        int[][] matrix1 = {{1, -2}, {-3, 4}};
        int[][] matrix2 = {{-5, 6}, {7, -8}};
        int[][] expectedSum = {{-4, 4}, {4, -4}};
        int[][] result = MatrixAddition.addMatrices(matrix1, matrix2);
        assertTrue(Arrays.deepEquals(expectedSum, result));
    }
    public void testAddMatrices2() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] expectedSum = {{6, 8}, {10, 12}};
        int[][] result = MatrixAddition.addMatrices(matrix1, matrix2);
        assertTrue(Arrays.deepEquals(expectedSum, result));
    }
    public void testAddMatrices3() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] expectedSum = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        int[][] result = MatrixAddition.addMatrices(matrix1, matrix2);
        assertTrue(Arrays.deepEquals(expectedSum, result));
    }

    
}
