package prac1_4.p4_4;

public class Person {

    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Иван Иваныч";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() { return fullName; }

    public int getAge() { return age; }

    public void move() {
        System.out.println(fullName + " идёт");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}