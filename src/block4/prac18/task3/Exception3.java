package block4.prac18.task3;

/**
 * Практическая работа № 18. Задание 3.
 * Изучение порядка перехвата исключений (иерархия наследования исключений).
 */
public class Exception3 {

    /**
     * Корректный порядок: специфические исключения сверху, общее Exception снизу.
     */
    public void exceptionDemoProperOrder(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        } catch (Exception e) {
            System.out.println("ошибка");
        }
    }

    /**
     * Использование общего Exception для перехвата любых ошибок.
     */
    public void exceptionDemoGeneralCatch(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (Exception e) {
            System.out.println("ошибка");
        }
    }
}
