package prac1_4.p4_2;

public class PersonTester {

    public static void main(String[] args) {

        System.out.println("конструктор без параметров");
        Person p1 = new Person();
        System.out.println("имя: " + p1.getFullName() + ", возраст " + p1.getAge());
        p1.move();
        p1.talk();

        System.out.println();
        System.out.println("конструктор с параметрами");
        Person p2 = new Person("Бибам Бема", 19);
        System.out.println("имя: " + p2.getFullName() + ", возраст " + p2.getAge());
        p2.move();
        p2.talk();

    }
}
