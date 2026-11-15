package block4.prac18.task4;

/**
 * Тестирование задания 4 практической работы № 18.
 */
public class Task4Tester {
    public static void main(String[] args) {
        Exception4 demo = new Exception4();
        String[] testInputs = {"Qwerty", "0", "1.2", "1"};
        for (String input : testInputs) {
            demo.exceptionDemoWithFinally(input);
        }
    }
}
