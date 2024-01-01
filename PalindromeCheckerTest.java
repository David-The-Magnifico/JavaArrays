import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(PalindromeChecker.isPalindrome("Was it a car or a cat I saw"));
    }
}
