package block2.prac11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("сравнение ArrayList и LinkedList");
        System.out.println();

        List<Integer> arrayList = new ArrayList<Integer>();
        test("ArrayList", arrayList);

        System.out.println();

        List<Integer> linkedList = new LinkedList<Integer>();
        test("LinkedList", linkedList);
    }

    static void test(String name, List<Integer> list) {
        System.out.println(name);

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long time = (System.nanoTime() - start) / 1000000;
        System.out.println("1000000 элементов в конец: " + time + " мс");

        start = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            list.add(0, i);
        }
        time = (System.nanoTime() - start) / 1000000;
        System.out.println("20000 элементов в начало: " + time + " мс");

        start = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            list.indexOf(99999);
        }
        time = (System.nanoTime() - start) / 1000000;
        System.out.println("поиск элемента 500 раз: " + time + " мс");

        start = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            list.remove(list.size() / 2);
        }
        time = (System.nanoTime() - start) / 1000000;
        System.out.println("удаление 5000: " + time + " мс");

        start = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            list.remove(0);
        }
        time = (System.nanoTime() - start) / 1000000;
        System.out.println("удаление 20000: " + time + " мс");
    }
}
