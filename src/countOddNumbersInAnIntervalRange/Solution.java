package countOddNumbersInAnIntervalRange;

public class Solution {

    public static void main(String[] args) {

        System.out.println(countOdds(3, 7));
    }

    public static int countOdds(int low, int high) {
//        int count = 0;
//        for (int i = low; i <= high; i++) {
//            if (i % 2 == 1) {
//                count++;
//            }
//        }
//        return count;

//        int count = 0;
//
//        for (int i = low; i <= high; ) {
//            if (i % 2 != 0) {
//                ++count;
//                i += 2;
//            } else {
//                ++i;
//            }
//        }
//        return count;

        int total = high - low + 1;

        if (total % 2 == 0)
            return total / 2;
        else {
            if (low % 2 != 0 || high % 2 != 0)
                return ((total / 2) + 1);
            else
                return total / 2;
        }
    }
}