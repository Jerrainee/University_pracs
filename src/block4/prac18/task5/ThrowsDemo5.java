package block4.prac18.task5;

/**
 * Практическая работа № 18. Задание 5.
 * Генерация исключений вручную с помощью оператора throw.
 */
public class ThrowsDemo5 {

    /**
     * Выброс NullPointerException при key == null.
     */
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key");
        }
        System.out.println("ключ: " + key);
    }

    /**
     * Обработка через try-catch внутри метода.
     */
    public void getDetailsHandled(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key");
            }
            System.out.println("ключ: " + key);
        } catch (NullPointerException e) {
            System.out.println("ошибка null");
        }
    }
}
