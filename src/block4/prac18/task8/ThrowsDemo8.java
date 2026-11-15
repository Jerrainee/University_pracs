package block4.prac18.task8;

import java.util.Scanner;

/**
 * Практическая работа № 18. Задание 8.
 * Циклический ввод данных с обработкой исключений (повторный шанс на ввод).
 */
public class ThrowsDemo8 {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("ключ: ");
                String key = myScanner.nextLine().trim();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("ошибка: " + e.getMessage());
            }
        }
        System.out.println("готово");
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key == null || key.isEmpty()) {
            throw new Exception("пустой ключ");
        }
        return "данные: " + key;
    }
}
