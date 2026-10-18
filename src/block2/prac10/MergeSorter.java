package block2.prac10;
import java.util.Comparator;

public class MergeSorter {

    public static Student[] mergeSort(Student[] arr, Comparator<Student> comp) {
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        Student[] left = new Student[middle];
        Student[] right = new Student[arr.length - middle];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[middle + i];
        }

        left = mergeSort(left, comp);
        right = mergeSort(right, comp);
        return merge(left, right, comp);
    }

    public static Student[] merge(Student[] left, Student[] right, Comparator<Student> comp) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (comp.compare(left[i], right[j]) <= 0) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}