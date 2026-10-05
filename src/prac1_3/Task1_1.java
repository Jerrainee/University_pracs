package prac1_3;

import java.util.Arrays;
import java.util.Random;

public class Task1_1 {
    public static void main(String[] args) {
        int size = 8;

        double[] arrayMath = new double[size];
        for (int i = 0; i < size; i++) {
            arrayMath[i] = Math.random() * 100;
        }

        System.out.println("Массив через match: " + Arrays.toString(formatArray(arrayMath)));
        Arrays.sort(arrayMath);
        System.out.println("Массив через match: сортировка: " + Arrays.toString(formatArray(arrayMath)));

        // Random
        Random random = new Random();
        double[] arrayRandom = new double[size];
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextDouble() * 100;
        }

        System.out.println("Random: " + Arrays.toString(formatArray(arrayRandom)));
        Arrays.sort(arrayRandom);
        System.out.println("Random, сортировка: " + Arrays.toString(formatArray(arrayRandom)));
    }

    // для красоты
    private static String[] formatArray(double[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = String.format("%.2f", array[i]);
        }
        return result;
    }
}
