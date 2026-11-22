package block4.prac20.task3;

public class MinMax<T extends Comparable<T>> {

    private final T[] array;

    public MinMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("массив пуст");
        }
        this.array = array;
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T[] getArray() {
        return array;
    }
}
