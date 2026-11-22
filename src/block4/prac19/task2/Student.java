package block4.prac19.task2;

public class Student implements Comparable<Student> {

    private String fullName;
    private double gpa;

    public Student(String fullName, double gpa) throws EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("пустая строка");
        }
        this.fullName = fullName.trim();
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("пустая строка");
        }
        this.fullName = fullName.trim();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return fullName + ", балл=" + gpa;
    }
}
