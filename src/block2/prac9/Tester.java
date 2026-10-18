package block2.prac9;
// Тестовый класс для практической работы 9
public class Tester {

    public static void main(String[] args) {

        // 1
        System.out.println("задание 1");
        Student[] students = new Student[5];
        students[0] = new Student(30, "Ivan", 4.2);
        students[1] = new Student(10, "Anna", 4.8);
        students[2] = new Student(50, "Pr", 3.9);
        students[3] = new Student(20, "ga", 4.5);
        students[4] = new Student(40, "den", 4.0);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        InsertionSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 2
        System.out.println();
        System.out.println("задание 2");
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 3
        System.out.println();
        System.out.println("задание 3");
        Student[] list1 = new Student[3];
        list1[0] = new Student(7, "Max", 4.1);
        list1[1] = new Student(2, "Max1", 4.7);
        list1[2] = new Student(9, "Oleg", 3.8);
        Student[] list2 = new Student[3];
        list2[0] = new Student(5, "n", 4.4);
        list2[1] = new Student(1, "t", 3.6);
        list2[2] = new Student(8, "e", 4.9);

        Student[] sorted1 = MergeSort.sort(list1);
        Student[] sorted2 = MergeSort.sort(list2);
        Student[] all = MergeSort.merge(sorted1, sorted2);
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }

        // 4
        System.out.println();
        System.out.println("задание 4");
        Student a = new Student(1, "test A", 4.0);
        Student b = new Student(2, "test B", 4.0);
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));
    }
}
