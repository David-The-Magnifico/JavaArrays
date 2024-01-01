import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReversalTest {

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    @Test
    public void testReverseList() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Assertions.assertEquals(List.of(5, 4, 3, 2, 1), reverseList(list1));

        List<Integer> list2 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        Assertions.assertEquals(List.of(50, 40, 30, 20, 10), reverseList(list2));

        List<Integer> list3 = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5), reverseList(list3));

        List<Integer> list4 = new ArrayList<>(List.of(-1, -2, -3, -4, -5));
        Assertions.assertEquals(List.of(-5, -4, -3, -2, -1), reverseList(list4));

        List<Integer> list5 = new ArrayList<>(List.of(1, 1, 1, 1, 1));
        Assertions.assertEquals(List.of(1, 1, 1, 1, 1), reverseList(list5));

        List<Integer> list6 = new ArrayList<>(List.of(1));
        Assertions.assertEquals(List.of(1), reverseList(list6));

        List<Integer> list7 = new ArrayList<>(List.of(-10, 20, -30, 40, -50));
        Assertions.assertEquals(List.of(-50, 40, -30, 20, -10), reverseList(list7));
    }
}
