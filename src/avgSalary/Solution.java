package avgSalary;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] salary = new int[]{8000, 9000, 2000, 3000, 6000, 1000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
//        return Arrays.stream(salary).average().getAsDouble();
        final int N = salary.length;
        Arrays.sort(salary);
        double t = salary[1];
        for (int i = 2; i < N - 1; i++) {
            t += salary[i];
        }
        return t / (N - 2);
    }
}
