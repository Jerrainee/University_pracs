package block4.prac18.task3;

public class Exception3 {

    public void exceptionDemoProperOrder(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        } catch (Exception e) {
            System.out.println("ошибка");
        }
    }

    public void exceptionDemoGeneralCatch(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("результат: " + (2 / i));
        } catch (Exception e) {
            System.out.println("ошибка");
        }
    }
}
