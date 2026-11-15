package block4.prac20.task1;

/**
 * Практическая работа № 20. Задания 1 и 2.
 * Обобщенный класс с тремя параметрами типа (T, V, K).
 */
public class GenericTriple<T, V, K> {

    private T first;
    private V second;
    private K third;

    public GenericTriple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getThird() {
        return third;
    }

    public void setThird(K third) {
        this.third = third;
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
