import org.junit.Test;
import static org.junit.Assert.*;

public class ListConcatenatorTest {

    @Test
    public void testListConcatenation() {
        List<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Object> expectedConcatenatedList = new ArrayList<>();
        expectedConcatenatedList.add("a");
        expectedConcatenatedList.add("b");
        expectedConcatenatedList.add("c");
        expectedConcatenatedList.add(1);
        expectedConcatenatedList.add(2);
        expectedConcatenatedList.add(3);

        assertEquals(expectedConcatenatedList, ListConcatenator.concatenateLists(list1, list2));

        List<Object> emptyList = new ArrayList<>();
        assertEquals(list2, ListConcatenator.concatenateLists(emptyList, list2));
        assertEquals(list1, ListConcatenator.concatenateLists(list1, emptyList));

        List<Object> singleItemList = new ArrayList<>();
        singleItemList.add("single");
        List<Object> singleItemList2 = new ArrayList<>();
        singleItemList2.add("item");
        assertEquals(singleItemList2, ListConcatenator.concatenateLists(singleItemList, singleItemList2));
    }
}
