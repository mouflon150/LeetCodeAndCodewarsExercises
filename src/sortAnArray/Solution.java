package sortAnArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Arrays.stream(sortArray(new int[]{12, 342, 354, 534, 6546})).toArray()));
    }

    public static int[] sortArray(int[] nums) {
        return Arrays.stream(nums).sorted().toArray();
    }
}
