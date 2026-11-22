package block4.prac19.task2;

public class LabClassDriver {

    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        try {
            labClass.addStudent(new Student("смирнов алексей", 4.75));
            labClass.addStudent(new Student("кузнецова анна", 4.90));
            labClass.addStudent(new Student("васильев дмитрий", 3.80));
        } catch (EmptyStringException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("список:");
        for (Student s : labClass.getStudents()) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("сортировка:");
        labClass.sortStudentsByGpa();
        for (Student s : labClass.getStudents()) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("поиск:");
        try {
            Student found = labClass.findStudentByFio("кузнецова");
            System.out.println("найден: " + found);
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try {
            labClass.findStudentByFio("ильин");
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try {
            labClass.findStudentByFio("   ");
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
