package block4.prac20.task2;

import java.io.Serializable;

public class BoundedTriple<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private final T first;
    private final V second;
    private final K third;

    public BoundedTriple(T first, V second, K third) {
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

    public void printClassNames() {
        System.out.println("поле 1: " + (first != null ? first.getClass().getSimpleName().toLowerCase() : "null"));
        System.out.println("поле 2: " + (second != null ? second.getClass().getSimpleName().toLowerCase() : "null"));
        System.out.println("поле 3: " + (third != null ? third.getClass().getSimpleName().toLowerCase() : "null"));
    }

    @Override
    public String toString() {
        return "тройка: " + first + ", " + second + ", " + third;
    }
}
