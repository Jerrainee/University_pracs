package block2.prac13.task6;

import java.util.Arrays;

public class Task6 {
    public static String getLine(String... words) {
        if (words == null || words.length == 0) return "";

        StringBuilder result = new StringBuilder(words[0]);
        boolean[] used = new boolean[words.length];
        used[0] = true;

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!used[j]) {
                    char lastChar = Character.toLowerCase(result.charAt(result.length() - 1));
                    char firstChar = Character.toLowerCase(words[j].charAt(0));

                    if (lastChar == firstChar) {
                        used[j] = true;
                        result.append(" ").append(words[j]);
                        break;
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] words = {"киев", "нью-йорк", "амстердам", "мельбурн", "варшава"};
        System.out.println(getLine(words));
    }
}