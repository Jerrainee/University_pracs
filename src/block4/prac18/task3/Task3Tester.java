package block4.prac18.task3;

public class Task3Tester {
    public static void main(String[] args) {
        Exception3 demo = new Exception3();
        String[] testInputs = {"Qwerty", "0", "1.2", "1"};
        for (String input : testInputs) {
            demo.exceptionDemoProperOrder(input);
        }
    }
}
