package block4.prac18.task4;

import java.util.Scanner;

/**
 * Практическая работа № 18. Задание 4.
 * Использование блока finally.
 */
public class Exception4 {

    /**
     * Метод из Задания 2 с добавлением блока finally.
     */
    public void exceptionDemoWithFinally(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        } finally {
            System.out.println("блок finally");
        }
    }

    /**
     * Интерактивный метод ввода через Scanner.
     */
    public void interactiveDemo() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("число: ");
            String input = scanner.next();
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (Exception e) {
            System.out.println("ошибка");
        } finally {
            System.out.println("блок finally");
        }
    }
}
