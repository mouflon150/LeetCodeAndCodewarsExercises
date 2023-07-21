package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static String fizzBuzz(int n) {
        StringBuilder sb = new StringBuilder();
        int[] array = new int[n];

        for (int i = 1; i <= array.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("Fizzbuzz");
            } else if (i % 3 == 0) {
                sb.append("Fizz");
            } else if (i % 5 == 0) {
                sb.append("Buzz");
            } else {
                sb.append(i);
            }

            if (i < array.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static List<String> fizzBuzzJuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currStr = " ";

            if (divisibleBy3) {
                currStr += "Fizz";
            }
            if (divisibleBy5) {
                currStr += "Buzz";
            }
            if (currStr.isEmpty()) {
                currStr += String.valueOf(i);
            }

            answer.add(currStr);
        }

        return answer;
    }
}