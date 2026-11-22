package block4.prac20.task2;

public class Task2Tester {
    public static void main(String[] args) {
        BoundedTriple<String, Dog, Double> triple =
                new BoundedTriple<>("текст", new Dog("овчарка", "бобик"), 9.9);

        System.out.println(triple);
        triple.printClassNames();
    }
}
