package jumble;

import junit.framework.TestCase;
import java.util.Arrays;

public class QuickSortTest extends TestCase {

	public void testQuickSort() {
        int[] arr1 = {3, 7, 2, 1, 6, 5, 4};
        int[] arr2 = {9, 1, 5, 4, 8, 2, 7, 3, 6};
        int[] arr3 = {5, 4, 3, 2, 1};

        int[] sortedArr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] sortedArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] sortedArr3 = {1, 2, 3, 4, 5};

        QuickSort.quickSort(arr1);
        QuickSort.quickSort(arr2);
        QuickSort.quickSort(arr3);

        assertTrue(Arrays.equals(sortedArr1, arr1));
        assertTrue(Arrays.equals(sortedArr2, arr2));
        assertTrue(Arrays.equals(sortedArr3, arr3));
    }

    public void testQuickSortEmptyArray() {
        int[] arr = {};
        int[] sortedArr = {};

        QuickSort.quickSort(arr);

        assertTrue(Arrays.equals(sortedArr, arr));
    }

    public void testQuickSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = {1, 2, 3, 4, 5};

        QuickSort.quickSort(arr);

        assertTrue(Arrays.equals(sortedArr, arr));
    }

    public void testQuickSortSingleElementArray() {
        int[] arr = {5};
        int[] sortedArr = {5};

        QuickSort.quickSort(arr);

        assertTrue(Arrays.equals(sortedArr, arr));
    }

  
}
