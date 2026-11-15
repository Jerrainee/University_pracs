package block4.prac18.task6;

/**
 * Практическая работа № 18. Задание 6.
 * Передача исключения по стеку вызовов.
 */
public class ThrowsDemo6 {

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key");
        }
        return "ключ: " + key;
    }

    public void printMessageRaw(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("ошибка null");
        }
    }
}
