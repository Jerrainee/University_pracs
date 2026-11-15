package block4.prac18.task7;

import java.util.Scanner;

/**
 * Практическая работа № 18. Задание 7.
 * Прохождение проверяемого исключения (checked exception) по цепочке вызовов.
 */
public class ThrowsDemo7 {

    public void getKey(Scanner scanner) throws Exception {
        System.out.print("ключ: ");
        String key = scanner.nextLine().trim();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("пустой ключ");
        }
        return "данные: " + key;
    }
}
