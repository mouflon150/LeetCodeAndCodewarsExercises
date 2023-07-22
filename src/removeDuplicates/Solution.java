package removeDuplicates;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3}; // Input array
        int[] expectedNums = {1, 2, 3}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }

    private static int removeDuplicates(int[] nums) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }

        int index = 0;
        for (int num : uniqueSet) {
            nums[index++] = num;
        }

        return uniqueSet.size();
    }
}