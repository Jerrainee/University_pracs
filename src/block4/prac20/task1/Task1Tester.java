package block4.prac20.task1;

/**
 * Тестирование заданий 1 и 2 практической работы № 20.
 */
public class Task1Tester {
    public static void main(String[] args) {
        GenericTriple<String, Integer, Double> triple =
                new GenericTriple<>("тест", 42, 3.14);

        System.out.println(triple);
        triple.printClassNames();
    }
}
