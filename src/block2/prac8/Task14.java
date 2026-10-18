package block2.prac8;
import java.util.Scanner;

public class Task14 {

    static void printDigits(int n) {
        if (n >= 10) {
            printDigits(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        printDigits(number);
        System.out.println();
    }
}
