import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ElementCheckerTest {

    @Test
    public void testContainsElement() {
        
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        int element1 = 3;
        Assertions.assertTrue(ElementChecker.containsElement(list1, element1));

        
        List<Integer> list2 = List.of(10, 20, 30, 40, 50);
        int element2 = 15;
        Assertions.assertFalse(ElementChecker.containsElement(list2, element2));

        
        List<Integer> list3 = List.of();
        int element3 = 5;
        Assertions.assertFalse(ElementChecker.containsElement(list3, element3));

        
        List<Integer> list4 = List.of(-1, -2, -3, -4, -5);
        int element4 = -3;
        Assertions.assertTrue(ElementChecker.containsElement(list4, element4));

        
        List<Integer> list5 = List.of(1, 1, 1, 1, 1);
        int element5 = 1;
        Assertions.assertTrue(ElementChecker.containsElement(list5, element5));

        
        List<Integer> list6 = List.of(10);
        int element6 = 5;
        Assertions.assertFalse(ElementChecker.containsElement(list6, element6));

       
           }
}
