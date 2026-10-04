package prac1_3;

import java.util.Random;

/**
 * Задача 3.
 * Массив из 4 случайных целых чисел из отрезка [10;99].
 * Проверка, является ли массив строго возрастающей последовательностью.
 */
public class Task1_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 + random.nextInt(90); // 90 чисел: от 10 до 99 включительно
        }

        // Вывод массива в строку
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println("Массив: " + sb);

        // Проверка строгого возрастания: каждый следующий элемент строго больше предыдущего
        boolean isIncreasing = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}
