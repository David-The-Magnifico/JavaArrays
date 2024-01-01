import org.junit.Test;
import static org.junit.Assert.*;

public class SumCalculatorTest {

    @Test
    public void testSumCalculations() {
        int[] numbers = {1, 2, 3, 4, 5};

        assertEquals(15, SumCalculator.sumWithForLoop(numbers));
        assertEquals(15, SumCalculator.sumWithWhileLoop(numbers));
        assertEquals(15, SumCalculator.sumWithDoWhileLoop(numbers));

        int[] emptyArray = {};
        assertEquals(0, SumCalculator.sumWithForLoop(emptyArray));
        assertEquals(0, SumCalculator.sumWithWhileLoop(emptyArray));
        assertEquals(0, SumCalculator.sumWithDoWhileLoop(emptyArray));

        int[] singleNumberArray = {10};
        assertEquals(10, SumCalculator.sumWithForLoop(singleNumberArray));
        assertEquals(10, SumCalculator.sumWithWhileLoop(singleNumberArray));
        assertEquals(10, SumCalculator.sumWithDoWhileLoop(singleNumberArray));

        int[] negativeNumbers = {-1, -2, -3, -4, -5};
        assertEquals(-15, SumCalculator.sumWithForLoop(negativeNumbers));
        assertEquals(-15, SumCalculator.sumWithWhileLoop(negativeNumbers));
        assertEquals(-15, SumCalculator.sumWithDoWhileLoop(negativeNumbers));

        int[] largeNumbers = {1000, 2000, 3000, 4000, 5000};
        assertEquals(15000, SumCalculator.sumWithForLoop(largeNumbers));
        assertEquals(15000, SumCalculator.sumWithWhileLoop(largeNumbers));
        assertEquals(15000, SumCalculator.sumWithDoWhileLoop(largeNumbers));

        int[] mixedNumbers = {-1, 2, -3, 4, -5, 6};
        assertEquals(3, SumCalculator.sumWithForLoop(mixedNumbers));
        assertEquals(3, SumCalculator.sumWithWhileLoop(mixedNumbers));
        assertEquals(3, SumCalculator.sumWithDoWhileLoop(mixedNumbers));
    }
}
