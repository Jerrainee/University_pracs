package block4.prac18.task5;

public class ThrowsDemo5 {

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key");
        }
        System.out.println("ключ: " + key);
    }

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
