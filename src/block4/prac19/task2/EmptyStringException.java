package block4.prac19.task2;

/**
 * Практическая работа № 19. Задание 2.
 * Пользовательское исключение: передана пустая строка вместо значения.
 *
 * ДЛЯ ЗАЩИТЫ:
 * Выбрасывается при валидации входных данных пользователя (например, при попытке
 * выполнить поиск с пустой строкой запроса или добавить студента с пустым ФИО).
 */
public class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}
