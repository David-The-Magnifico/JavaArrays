import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddPositionElementsTest {

    @Test
    public void testPrintOddPositionElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedOutput = {2, 4, 6, 8};
        assertArrayEquals(expectedOutput, OddPositionElements.printOddPositionElements(arr));
    }

    @Test
    public void testPrintOddPositionElementsWithSingleElement() {
        int[] arr = {1};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, OddPositionElements.printOddPositionElements(arr));
    }

    @Test
    public void testPrintOddPositionElementsWithAllEvenNumbers() {
        int[] arr = {2, 4, 6, 8, 10};
        int[] expectedOutput = {4, 8};
        assertArrayEquals(expectedOutput, OddPositionElements.printOddPositionElements(arr));
    }

    @Test
    public void testPrintOddPositionElementsWithAllOddNumbers() {
        int[] arr = {1, 3, 5, 7, 9};
        int[] expectedOutput = {3, 7};
        assertArrayEquals(expectedOutput, OddPositionElements.printOddPositionElements(arr));
    }

    @Test
    public void testPrintOddPositionElementsWithNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4, -5, -6};
        int[] expectedOutput = {-2, -4, -6};
        assertArrayEquals(expectedOutput, OddPositionElements.printOddPositionElements(arr));
    }

    @Test
    public void testPrintOddPositionElementsWithDoubleDigitsNumbers() {
        int[] arr = {11, 32, 53, 64, 75, 96};
        int[] expectedOutput = {32, 64, 96};
        assertArrayEquals(expectedOutput, OddPositionElements.printOddPositionElements(arr));
}
