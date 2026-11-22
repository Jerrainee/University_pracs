package block4.prac21.task2;

public class Task2Tester {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        AnyTypeArray<Integer> intHolder = new AnyTypeArray<>(intArray);
        intHolder.print();

        Long[] longArray = {100L, 200L};
        AnyTypeArray<Long> longHolder = new AnyTypeArray<>(longArray);
        longHolder.print();

        String[] strArray = {"один", "два"};
        AnyTypeArray<String> strHolder = new AnyTypeArray<>(strArray);
        strHolder.print();
    }
}
