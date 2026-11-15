package block4.prac19.task2;

/**
 * Практическая работа № 19. Задание 2.
 * Пользовательское исключение: студент не найден по заданному ФИО.
 *
 * ДЛЯ ЗАЩИТЫ:
 * Это проверяемое исключение (extends Exception).
 * Выбрасывается в LabClass при поиске студента, если в списке нет ни одного
 * студента с переданным ФИО.
 */
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
