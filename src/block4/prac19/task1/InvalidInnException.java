package block4.prac19.task1;

/**
 * Практическая работа № 19. Задание 1.
 * Пользовательское проверяемое исключение для недействительного ИНН.
 *
 * ДЛЯ ЗАЩИТЫ:
 * Наследование от java.lang.Exception делает это исключение ПРОВЕРЯЕМЫМ (checked).
 * Это означает, что метод, в котором оно выбрасывается, обязан либо объявить throws InvalidInnException,
 * либо перехватить его внутри try-catch.
 * Это гарантирует, что вызывающий код обязательно предусмотрит реакцию на недействительный ИНН клиента.
 */
public class InvalidInnException extends Exception {

    private final String invalidInn;

    public InvalidInnException(String message, String invalidInn) {
        super(message);
        this.invalidInn = invalidInn;
    }

    public InvalidInnException(String message, String invalidInn, Throwable cause) {
        super(message, cause);
        this.invalidInn = invalidInn;
    }

    public String getInvalidInn() {
        return invalidInn;
    }
}
