package prac1_1;
import java.util.Scanner;

public class Task7 {

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        long result = factorial(number);
        System.out.println(number + "! = " + result);

        scanner.close();
    }
}
