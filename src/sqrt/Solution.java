package sqrt;

public class Solution {

    public static int unaryOperator(int x) {

        if (x > 0) {
            return (int) Math.sqrt(x);
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(unaryOperator(4));
    }
}
