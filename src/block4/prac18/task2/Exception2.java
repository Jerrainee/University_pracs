package block4.prac18.task2;

import java.util.Scanner;

/**
 * Практическая работа № 18. Задание 2.
 * Анализ исключений при разборе строки в число и делении (NumberFormatException и ArithmeticException).
 */
public class Exception2 {

    /**
     * Исходный метод без блоков try-catch.
     */
    public void exceptionDemoRaw(String input) {
        int i = Integer.parseInt(input);
        System.out.println("результат: " + (2 / i));
    }

    /**
     * Модифицированный метод с блоками try-catch.
     */
    public void exceptionDemoHandled(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        }
    }

    /**
     * Интерактивный метод для ввода из консоли.
     */
    public void exceptionDemoInteractive() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("число: ");
        String intString = myScanner.next();
        exceptionDemoHandled(intString);
    }
}
