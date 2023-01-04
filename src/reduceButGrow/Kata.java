package reduceButGrow;

public class Kata {

    public static void main(String[] args) {

        System.out.println(grow(new int[]{4,1,1,1,4}));
    }

    public static int grow(int[] x) {

        int sum = 1;
        for (int j : x) {
            sum *= j;
        }
        return sum;
    }
}
