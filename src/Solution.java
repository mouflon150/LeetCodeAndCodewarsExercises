public class Solution {

    public static void main(String[] args) {

        System.out.println(reverseWords(""));

    }

    public static String reverseWords(String str) {
        StringBuilder sb = new StringBuilder();

        String[] strs = str.split("\\s");
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]).append(" ");
        }
        return String.valueOf(sb.toString());
    }
}