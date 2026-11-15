package block4.prac21.task1;

import java.util.List;

/**
 * Тестирование задания 1 практической работы № 21.
 */
public class Task1Tester {
    public static void main(String[] args) {
        String[] stringArray = {"java", "kotlin", "python"};
        List<String> stringList = ArrayToListConverter.convertArrayToList(stringArray);
        System.out.println("список: " + stringList);

        Integer[] intArray = {10, 20, 30};
        List<Integer> intList = ArrayToListConverter.convertArrayToList(intArray);
        System.out.println("список: " + intList);
    }
}
