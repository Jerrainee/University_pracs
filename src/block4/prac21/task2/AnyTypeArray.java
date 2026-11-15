package block4.prac21.task2;

import java.util.Arrays;

/**
 * Практическая работа № 21. Задание 2.
 * Класс для хранения массива любых типов данных.
 */
public class AnyTypeArray<E> {

    private final E[] data;

    public AnyTypeArray(E[] data) {
        if (data == null) {
            throw new IllegalArgumentException("пустой массив");
        }
        this.data = data;
    }

    public int length() {
        return data.length;
    }

    public E[] getData() {
        return data;
    }

    public void set(int index, E value) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("индекс вне границ");
        }
        data[index] = value;
    }

    public void print() {
        System.out.println("массив: " + Arrays.toString(data));
    }
}
