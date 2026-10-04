package prac1_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Задача 1 (Math и Random).
 * Создание массива вещественных чисел случайным образом двумя способами:
 * через Math.random() и через класс Random. Вывод до и после сортировки.
 */
public class Task1_1 {
    public static void main(String[] args) {
        int size = 8;

        // --- Способ 1: Math.random() ---
        // Math.random() возвращает double в диапазоне [0.0, 1.0),
        // умножаем, чтобы получить диапазон [0.0, 100.0)
        double[] arrayMath = new double[size];
        for (int i = 0; i < size; i++) {
            arrayMath[i] = Math.random() * 100;
        }

        System.out.println("=== Массив через Math.random() ===");
        System.out.println("До сортировки:    " + Arrays.toString(formatArray(arrayMath)));
        Arrays.sort(arrayMath);
        System.out.println("После сортировки: " + Arrays.toString(formatArray(arrayMath)));

        // --- Способ 2: класс Random ---
        Random random = new Random();
        double[] arrayRandom = new double[size];
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextDouble() * 100; // тоже диапазон [0.0, 100.0)
        }

        System.out.println("\n=== Массив через класс Random ===");
        System.out.println("До сортировки:    " + Arrays.toString(formatArray(arrayRandom)));
        Arrays.sort(arrayRandom);
        System.out.println("После сортировки: " + Arrays.toString(formatArray(arrayRandom)));
    }

    // Вспомогательный метод: округляет числа до 2 знаков для красивого вывода
    private static String[] formatArray(double[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = String.format("%.2f", array[i]);
        }
        return result;
    }
}
