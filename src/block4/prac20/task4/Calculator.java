package block4.prac20.task4;

/**
 * Практическая работа № 20. Задание 4 (Часть 2: Необобщенный класс Калькулятор).
 */
public class Calculator {

    private Calculator() {}

    public static <T extends Number, V extends Number> double sum(T a, V b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("пустой аргумент");
        }
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("пустой аргумент");
        }
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("пустой аргумент");
        }
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("пустой аргумент");
        }
        if (b.doubleValue() == 0.0) {
            throw new ArithmeticException("деление на ноль");
        }
        return a.doubleValue() / b.doubleValue();
    }
}
