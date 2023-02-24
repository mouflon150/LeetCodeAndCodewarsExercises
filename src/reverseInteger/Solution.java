package reverseInteger;


public class Solution {

    public static void main(String[] args) {

        System.out.println(reverse(120));
    }

    public static int reverse(int x) {
        int n = x;
        int temp = 0;
        if (n > 0) {
            while (n > 0) {
                int a = n % 10;
                temp = (temp * 10) + a;
                n = n / 10;
            }
        } else {
            while (n < 0) {
                int a = n % 10;
                temp = (temp * 10) + a;
                n = n / 10;
            }
        }
        return temp;
    }
}