package block4.prac18.task5;

/**
 * Тестирование задания 5 практической работы № 18.
 */
public class Task5Tester {
    public static void main(String[] args) {
        ThrowsDemo5 demo = new ThrowsDemo5();
        demo.getDetailsHandled("тест");
        demo.getDetailsHandled(null);
    }
}
