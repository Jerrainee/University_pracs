package block4.prac20.task3;

public class Task3Tester {
    public static void main(String[] args) {
        Integer[] intArr = {45, 12, 89, 3, -5, 100};
        MinMax<Integer> intMinMax = new MinMax<>(intArr);
        System.out.println("минимум: " + intMinMax.findMin());
        System.out.println("максимум: " + intMinMax.findMax());

        String[] strArr = {"банан", "ананас", "яблоко"};
        MinMax<String> strMinMax = new MinMax<>(strArr);
        System.out.println("минимум: " + strMinMax.findMin());
        System.out.println("максимум: " + strMinMax.findMax());
    }
}
