package vowelRemover;

public class Kata {
    public static String shortcut(String input) {
        String vowelsToRemove = "aeiou";
        for (char c : vowelsToRemove.toCharArray()) {
            input = input.replace(String.valueOf(c), "");
        }
        return input;
    }
}