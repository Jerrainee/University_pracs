package block4.prac18.task2;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemoRaw(String input) {
        int i = Integer.parseInt(input);
        System.out.println("результат: " + (2 / i));
    }

    public void exceptionDemoHandled(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        }
    }

    public void exceptionDemoInteractive() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("число: ");
        String intString = myScanner.next();
        exceptionDemoHandled(intString);
    }
}
