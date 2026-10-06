package prac1_1;
import java.util.Scanner;

public class Task7 {

    public static long factorial(int number) {
        if (number < 0) {
            System.out.println("факториал отрицательного числа!");
            return -1;
        }
        long res = 1;
        for (int i = 2; i <= number; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите число: ");
        int number = scanner.nextInt();
        long res = factorial(number);
        System.out.println(number + "! = " + res);

        scanner.close();
    }
}
