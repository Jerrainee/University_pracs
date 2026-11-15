package block4.prac21.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Практическая работа № 21. Задание 1.
 * Конвертация массива в список.
 */
public class ArrayToListConverter {

    public static <E> List<E> convertArrayToList(E[] array) {
        if (array == null) {
            throw new IllegalArgumentException("пустой массив");
        }

        List<E> list = new ArrayList<>(array.length);
        for (E element : array) {
            list.add(element);
        }
        return list;
    }
}
