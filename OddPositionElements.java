public class OddPositionElements {

    public static void printOddPositionElements(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
