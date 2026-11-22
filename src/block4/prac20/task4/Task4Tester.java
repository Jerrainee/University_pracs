package block4.prac20.task4;

public class Task4Tester {
    public static void main(String[] args) {
        System.out.println("сумма: " + Calculator.sum(15, 4.5));
        System.out.println("разность: " + Calculator.subtraction(100L, 2.5f));
        System.out.println("умножение: " + Calculator.multiply(15, 2.5f));
        System.out.println("деление: " + Calculator.divide(100L, 4.0));

        try {
            Calculator.divide(15, 0);
        } catch (ArithmeticException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
