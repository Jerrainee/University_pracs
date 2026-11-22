package block4.prac18.task1;

public class Exception1 {

    public void step1IntegerDivisionByZero() {

        System.out.println("деление на ноль: ошибка arithmetic exception");
    }

    public void step2FloatingPointDivisionByZero() {
        System.out.println("дробное: " + (2.0 / 0.0));
        System.out.println("ноль на ноль: " + (0.0 / 0.0));
    }

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        }
        System.out.println("готово");
    }
}
