package block2.prac14;

// 9
public class LetterFrequency {
    public static void print(String text) {
        int[] counts = new int[26];
        int total = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));

            if (letter >= 'a' && letter <= 'z') {
                counts[letter - 'a']++;
                total++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.printf("%c - %d раз%n", letter, counts[i]);
            }
        }
    }
}
