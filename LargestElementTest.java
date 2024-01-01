import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LargestElementTest {

    @Test
    public void testFindLargestElement() {
        int[] arr1 = {3, 5, 1, 9, 7, 2, 8, 4, 6};
        Assertions.assertEquals(9, findLargestElement(arr1));

        int[] arr2 = {10, 20, 30, 40, 50};
        Assertions.assertEquals(50, findLargestElement(arr2));

        int[] arr3 = {5, 4, 3, 2, 1};
        Assertions.assertEquals(5, findLargestElement(arr3));

        int[] arr4 = {-1, -2, -3, -4, -5};
        Assertions.assertEquals(-1, findLargestElement(arr4));

        int[] arr5 = {1, 1, 1, 1, 1};
        Assertions.assertEquals(1, findLargestElement(arr5));

        int[] arr6 = {1};
        Assertions.assertEquals(1, findLargestElement(arr6));

        int[] arr7 = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> findLargestElement(arr7));
    }

    public static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
