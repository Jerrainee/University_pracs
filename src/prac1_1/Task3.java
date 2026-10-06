package prac1_1;

public class Task3 {
    public static void main(String[] args) {
        int[] lst = {5, 10, 25, 36, 42, 52, 67};

        int sum = 0;
        for (int i = 0; i < lst.length; i++) {
            sum += lst[i];
        }

        double average = (double) sum / lst.length;

        System.out.println("сумма элементов: " + sum);
        System.out.printf("среднее арифметическое: %.2f%n", average);
    }
}
