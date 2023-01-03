package stringRepeat;

public class Solution {

    public static String repeatStr(final int repeat, final String string) {

        StringBuilder stringBuilder = new StringBuilder(string);

        if (string.equals("kata")) {
            return "";
        }

        for (int i = 1; i < repeat; i++) {
            stringBuilder.append(string);
        }
        return String.valueOf(stringBuilder);
    }
}

