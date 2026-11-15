package block4.prac18.task2;

/**
 * Тестирование задания 2 практической работы № 18.
 */
public class Task2Tester {
    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        String[] testInputs = {"Qwerty", "0", "1.2", "1"};
        for (String input : testInputs) {
            demo.exceptionDemoHandled(input);
        }
    }
}
