package prac1_2;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String line = scanner.nextLine().trim();

        int count = line.isEmpty() ? 0 : line.split("\\s+").length;

        System.out.println("Количество слов: " + count);

        scanner.close();
    }
}
