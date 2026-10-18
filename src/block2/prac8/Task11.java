package block2.prac8;
import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);

    public static int countOnes() {
        int n = in.nextInt();
        if (n == 0) {
            n = in.nextInt();
            if (n == 0) {
                return 0;
            }
        }
        int rest = countOnes();
        if (n == 1) {
            return rest + 1;
        }
        return rest;
    }

    public static void main(String[] args) {
        System.out.println("кол-во единиц: " + countOnes());
    }
}
