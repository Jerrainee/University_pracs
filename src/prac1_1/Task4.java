package prac1_1;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] lst = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }

        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += lst[i];
            i++;
        } while (i < n);

        int sumWhile = 0;
        int j = 0;
        while (j < n) {
            sumWhile += lst[j];
            j++;
        }

        int n_max = lst[0];
        int n_min = lst[0];
        int k = 1;
        while (k < n) {
            if (lst[k] > n_max) {
                n_max = lst[k];
            }
            if (lst[k] < n_min) {
                n_min = lst[k];
            }
            k++;
        }

        System.out.println("Сумма doWhile: " + sumDoWhile);
        System.out.println("Сумма while: " + sumWhile);
        System.out.println("Максимальный элемент: " + n_max);
        System.out.println("Минимальный элемент: " + n_min);

        scanner.close();
    }
}
