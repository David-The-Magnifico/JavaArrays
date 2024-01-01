import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 7, 3, 8, 5, 6};
        System.out.println(findLargestElement(arr));
    }

    public static int findLargestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
