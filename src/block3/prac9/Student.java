package block3.prac9;

public class Student implements Comparable<Student> {
    int idNumber;
    String name;
    double gpa;
    Student next;

    public Student(int idNumber, String name, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int compareTo(Student other) {
        return idNumber - other.idNumber;
    }

    public void print() {
        System.out.println("номер: " + idNumber + ", имя: " + name + ", балл: " + gpa);
    }
}
