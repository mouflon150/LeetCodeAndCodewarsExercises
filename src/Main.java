public class Main {

    public static void main(String[] args) {

        int repeat = 4;
        String str = "a";

        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 1; i < repeat; i++) {
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder);
    }
}
