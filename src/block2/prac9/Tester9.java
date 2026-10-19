package block2.prac9;
public class Tester9 {

    public static void main(String[] args) {

        System.out.println("задание 1");
        Student[] students = new Student[5];
        students[0] = new Student(30, "a", 4.2);
        students[1] = new Student(10, "b", 4.8);
        students[2] = new Student(50, "c", 3.9);
        students[3] = new Student(20, "d", 4.5);
        students[4] = new Student(40, "Den", 4.0);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        InsertionSort.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // 4
        System.out.println();
        System.out.println("задание 4");
        Student a = new Student(1, "Test A", 4.0);
        Student b = new Student(2, "Test B", 4.0);
        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        System.out.println("b.compareTo(a) = " + b.compareTo(a));
        System.out.println("a.compareTo(a) = " + a.compareTo(a));
    }
}
