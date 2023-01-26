package addStrings;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {

        System.out.println(addStrings("11", "123"));
    }

    public static String addStrings(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger sum = n1.add(n2);
        return (sum.toString());
    }
}