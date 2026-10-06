package prac1_2;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите текст:");
        String line = scanner.nextLine().trim();

        int count;

        if (line.isEmpty()) {
            count = 0;
        } else {
            String[] words = line.split("\\s+");
            count = words.length;
        }

        System.out.println("количество слов: " + count);

        scanner.close();
    }
}
