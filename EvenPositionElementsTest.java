import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvenPositionElementsTest {

    @Test
    public void testPrintEvenPositionElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedOutput = {1, 3, 5, 7, 9};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }

    @Test
    public void testPrintEvenPositionElementsWithSingleElement() {
        int[] arr = {1};
        int[] expectedOutput = {1};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }

    @Test
    public void testPrintEvenPositionElementsWithAllEvenNumbers() {
        int[] arr = {2, 4, 6, 8, 10};
        int[] expectedOutput = {2, 6, 10};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }

    @Test
    public void testPrintEvenPositionElementsWithAllOddNumbers() {
        int[] arr = {1, 3, 5, 7, 9};
        int[] expectedOutput = {1, 5, 9};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }
 
    @Test
    public void testPrintEvenPositionElementsWithNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4, -5, -6};
        int[] expectedOutput = {-1, -3, -5};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }

    @Test
    public void testPrintEvenPositionElementsWithLargeNumbers() {
        int[] arr = {3452, 4657, 8796, 3892, 5234, 6213};
        int[] expectedOutput = {3452, 8796, 5234};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }

    @Test
    public void testPrintEvenPositionElementsWithLargeArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] expectedOutput = {1, 3, 5, 7, 9, 11};
        assertArrayEquals(expectedOutput, EvenPositionElements.printEvenPositionElements(arr));
    }
}
