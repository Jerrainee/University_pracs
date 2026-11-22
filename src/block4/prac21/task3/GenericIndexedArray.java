package block4.prac21.task3;

public class GenericIndexedArray<T> {

    private final T[] array;

    public GenericIndexedArray(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("пустой массив");
        }
        this.array = array;
    }

    public T get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("неверный индекс");
        }
        return array[index];
    }

    public int length() {
        return array.length;
    }

    public static <E> E getElementByIndex(E[] array, int index) {
        if (array == null) {
            throw new IllegalArgumentException("пустой массив");
        }
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("неверный индекс");
        }
        return array[index];
    }
}
