package block2.prac11;
// Тестовый класс для задания 3 (Student с датой рождения)
public class Tester3 {

    public static void main(String[] args) {
        Student student = new Student("a", "b", 2007, 3, 15);

        System.out.println("toString: " + student);
        System.out.println("Короткий формат: " + student.getBirthDate("short"));
        System.out.println("Средний формат: " + student.getBirthDate("medium"));
        System.out.println("Полный формат: " + student.getBirthDate("full"));
        System.out.println("Свой формат: " + student.getBirthDate("yyyy/MM/dd"));
    }
}
