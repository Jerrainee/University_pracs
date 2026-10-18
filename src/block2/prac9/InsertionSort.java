package block2.prac9;

public class InsertionSort {

    public static void sort(Student[] a) {
        for (int i = 1; i < a.length; i++) {
            Student current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j].compareTo(current) > 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
    }
}
