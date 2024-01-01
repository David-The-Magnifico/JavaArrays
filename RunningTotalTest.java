import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RunningTotalTest {

    @Test
    public void testComputeRunningTotal() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedOutput = {1, 3, 6, 10, 15, 21, 28, 36, 45};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }

    @Test
    public void testComputeRunningTotalWithSingleElement() {
        int[] arr = {1};
        int[] expectedOutput = {1};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }

    @Test
    public void testComputeRunningTotalWithEmptyArray() {
        int[] arr = {};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }

    @Test
    public void testComputeRunningTotalWithAllZeros() {
        int[] arr = {0, 0, 0, 0, 0};
        int[] expectedOutput = {0, 0, 0, 0, 0};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }

    @Test
    public void testComputeRunningTotalWithNegativeNumbers() {
        int[] arr = {-1, 2, -3, 4, -5};
        int[] expectedOutput = {-1, 1, -2, 2, -3};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }

    @Test
    public void testComputeRunningTotalWithLargeNumbers() {
        int[] arr = {1000000, 2000000, 3000000};
        int[] expectedOutput = {1000000, 3000000, 6000000};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }

    @Test
    public void testComputeRunningTotalWithRepeatedNumbers() {
        int[] arr = {2, 2, 2, 2, 2};
        int[] expectedOutput = {2, 4, 6, 8, 10};
        assertArrayEquals(expectedOutput, RunningTotal.computeRunningTotal(arr));
    }
}
