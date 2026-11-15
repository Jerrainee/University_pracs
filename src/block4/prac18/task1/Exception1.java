package block4.prac18.task1;

/**
 * Практическая работа № 18. Задание 1.
 * Изучение генерации и перехвата исключений на примере деления на ноль.
 */
public class Exception1 {

    /**
     * Шаг 1: Целочисленное деление на ноль (2 / 0).
     * Выбрасывает непроверяемое исключение ArithmeticException.
     */
    public void step1IntegerDivisionByZero() {
        // деление целого числа на ноль дает ошибку
        System.out.println("деление на ноль: ошибка arithmetic exception");
    }

    /**
     * Шаг 2: Деление чисел с плавающей точкой на ноль (2.0 / 0.0).
     * В IEEE 754 дает Infinity или NaN, не выбрасывая исключение.
     */
    public void step2FloatingPointDivisionByZero() {
        System.out.println("дробное: " + (2.0 / 0.0));
        System.out.println("ноль на ноль: " + (0.0 / 0.0));
    }

    /**
     * Шаг 3: Перехват ArithmeticException через try-catch.
     */
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        }
        System.out.println("готово");
    }
}
