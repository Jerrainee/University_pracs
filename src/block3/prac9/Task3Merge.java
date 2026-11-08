package block3.prac9;

public class Task3Merge {

    public static void main(String[] args) {
        StudentList first = new StudentList();
        first.add(new Student(105, "A", 4.2));
        first.add(new Student(101, "B", 4.8));
        first.add(new Student(110, "D", 3.9));
        first.add(new Student(103, "C", 4.5));
        StudentList second = new StudentList();
        second.add(new Student(108, "Aaa", 4.0));
        second.add(new Student(102, "Ccc", 4.9));
        second.add(new Student(107, "Bbb", 3.7));

        System.out.println("1 список:");
        first.print();
        System.out.println();
        System.out.println("2 список:");
        second.print();
        System.out.println();

        StudentList result = StudentList.mergeLists(first, second);

        System.out.println("общий:");
        result.print();
    }
}
