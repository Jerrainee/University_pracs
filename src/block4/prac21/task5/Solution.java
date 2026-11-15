package block4.prac21.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Практическая работа № 21. Задание 5*.
 * Класс Solution с обобщенными фабричными методами коллекций.
 */
public class Solution<T, V, K> {

    private final T first;
    private final V second;
    private final K third;

    public Solution(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        if (elements != null) {
            Collections.addAll(list, elements);
        }
        return list;
    }

    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        if (elements != null) {
            Collections.addAll(set, elements);
        }
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys == null || values == null) {
            throw new IllegalArgumentException("пустые данные");
        }
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("размеры не совпадают");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys == null || values == null) {
            throw new IllegalArgumentException("пустые данные");
        }
        if (keys.length != values.length) {
            throw new IllegalArgumentException("размеры не совпадают");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    @Override
    public String toString() {
        return "решение: " + first + ", " + second + ", " + third;
    }
}
