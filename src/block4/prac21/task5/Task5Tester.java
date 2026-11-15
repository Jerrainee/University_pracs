package block4.prac21.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Тестирование задания 5* практической работы № 21.
 */
public class Task5Tester {
    public static void main(String[] args) {
        ArrayList<String> stringList = Solution.newArrayList("один", "два", "три");
        System.out.println("список: " + stringList);

        HashSet<String> set = Solution.newHashSet("а", "б", "а");
        System.out.println("множество: " + set);

        List<String> keys = Arrays.asList("а", "б");
        List<Integer> values = Arrays.asList(1, 2);
        HashMap<String, Integer> map = Solution.newHashMap(keys, values);
        System.out.println("карта: " + map);

        Solution<String, Integer, Boolean> sol = new Solution<>("тест", 1, true);
        System.out.println(sol);
    }
}
