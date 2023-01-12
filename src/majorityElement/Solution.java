package majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {

        if (nums.length == 1) return nums[0];

        int floor = nums.length / 2;
        HashMap<Integer, Integer> num = new HashMap<>();

        for (int key : nums) {
            Integer val = num.putIfAbsent(key, 1);
            if (val != null) {

                if (++val > floor) return key;

                num.put(key, val);
            }
        }

        for (Map.Entry<Integer, Integer> e : num.entrySet()) {
            if (e.getValue() > floor) return e.getKey();
        }

        return -1;
    }
}

