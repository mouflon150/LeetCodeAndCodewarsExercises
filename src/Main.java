import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = new int[]{0, 1, 2, 4, 3};
        int[] arr2 = Arrays.stream(arr1).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arr1)); // [0, 1, 2, 4, 3]
        System.out.println(Arrays.toString(arr2)); // [4, 3, 2, 1, 0]
    }
}