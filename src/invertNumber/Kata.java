package invertNumber;
import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(invert(new int[]{-1, -2, -3, -4, -5})));
    }

    public static int[] invert(int[] array) {

        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = -array[i];
        }
        return arr;
    }
}
