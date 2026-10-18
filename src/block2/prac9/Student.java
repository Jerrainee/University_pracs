package block2.prac9;

public class Student implements Comparable<Student> {
    private int idNumber;
    private String name;
    private double gpa;

    public Student(int idNumber, String name, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }

    public int compareTo(Student other) {
        if (this.idNumber < other.idNumber) {
            return -1;
        }
        if (this.idNumber > other.idNumber) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "id=" + idNumber + ", " + name + ", балл=" + gpa;
    }
}
