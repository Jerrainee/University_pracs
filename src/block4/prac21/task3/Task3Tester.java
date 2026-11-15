package block4.prac21.task3;

/**
 * Тестирование задания 3 практической работы № 21.
 */
public class Task3Tester {
    public static void main(String[] args) {
        String[] words = {"один", "два", "три"};
        GenericIndexedArray<String> array = new GenericIndexedArray<>(words);

        System.out.println("элемент: " + array.get(0));
        System.out.println("элемент: " + array.get(1));

        try {
            array.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
