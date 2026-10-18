package block2.prac10;

public class Student {

    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(String name, String surname, String specialty,
                   int course, String group, double gpa) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getSpecialty() { return specialty; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getGpa() { return gpa; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(String group) { this.group = group; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public String toString() {
        return surname + " " + name + ", " + specialty + ", курс " + course
                + ", группа " + group + ", балл " + gpa;
    }
}