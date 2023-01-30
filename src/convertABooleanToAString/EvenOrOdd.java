package convertABooleanToAString;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println(even_or_odd(-1));
    }

    public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even".toString() : "Odd".toString();
    }
}
