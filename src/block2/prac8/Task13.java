package block2.prac8;
import java.util.Scanner;

public class Task13 {
    static Scanner in = new Scanner(System.in);

    static void printOddPositions() {
        int n = in.nextInt();
        if (n == 0) {
            return;
        }
        System.out.println(n);
        int skipped = in.nextInt();
        if (skipped == 0) {
            return;
        }
        printOddPositions();
    }

    public static void main(String[] args) {
        printOddPositions();
    }
}
