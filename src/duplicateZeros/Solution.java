package duplicateZeros;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(arr[i]);
            }
            Integer first = queue.poll();
            arr[i] = first;
        }
    }
}