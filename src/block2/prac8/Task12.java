package block2.prac8;
import java.util.Scanner;

public class Task12 {
    static Scanner in = new Scanner(System.in);

    static void printOdd() {
        int n = in.nextInt();
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        printOdd();
    }

    public static void main(String[] args) {
        printOdd();
    }
}
