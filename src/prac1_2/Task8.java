package prac1_2;

import java.util.Arrays;


public class Task8 {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d", "e", "f"};

        System.out.println("До: " + Arrays.toString(words));

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        System.out.println("После: " + Arrays.toString(words));
    }
}
