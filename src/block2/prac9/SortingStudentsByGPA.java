package block2.prac9;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getGpa() > b.getGpa()) {
            return -1;
        }
        if (a.getGpa() < b.getGpa()) {
            return 1;
        }
        return 0;
    }

    public void quickSort(Student[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        Student pivot = arr[(low + high) / 2];
        int i = low;
        int j = high;

        while (i <= j) {
            while (compare(arr[i], pivot) < 0) {
                i++;
            }
            while (compare(arr[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr, low, j);
        quickSort(arr, i, high);
    }
}
