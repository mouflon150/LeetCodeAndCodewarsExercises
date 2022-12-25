package palindrome_number;

public class Solution {

    public boolean isPalindrome(int x) {

        int reversedNum = 0;
        int remainder;
        int originalNum = x;

        while (x != 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }
        if (originalNum != reversedNum || originalNum < 0) {
            System.out.println(originalNum + " is not Palindrome.");
            return false;
        } else {
            System.out.println(originalNum + "is Palindrome");
            return true;
        }
    }
}

