package block4.prac19.task2;

import java.util.List;
import java.util.Scanner;

public class LabClassUI {

    private final LabClass labClass;
    private final Scanner scanner;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("1 - показать всех");
            System.out.println("2 - добавить");
            System.out.println("3 - сортировать");
            System.out.println("4 - поиск");
            System.out.println("0 - выход");
            System.out.print("выбор: ");

            String choice = scanner.nextLine().trim();
            if (choice.equals("0")) {
                running = false;
            } else if (choice.equals("1")) {
                displayAllStudents();
            } else if (choice.equals("2")) {
                addNewStudent();
            } else if (choice.equals("3")) {
                sortStudents();
            } else if (choice.equals("4")) {
                searchStudent();
            } else {
                System.out.println("неверный выбор");
            }
        }
    }

    public void displayAllStudents() {
        if (labClass.isEmpty()) {
            System.out.println("список пуст");
            return;
        }
        List<Student> list = labClass.getStudents();
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public void addNewStudent() {
        try {
            System.out.print("фио: ");
            String fio = scanner.nextLine();

            System.out.print("балл: ");
            String gpaStr = scanner.nextLine().trim().replace(',', '.');
            double gpa = Double.parseDouble(gpaStr);

            Student student = new Student(fio, gpa);
            labClass.addStudent(student);
            System.out.println("добавлен");
        } catch (EmptyStringException e) {
            System.out.println("ошибка: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ошибка: не число");
        }
    }

    public void sortStudents() {
        if (labClass.isEmpty()) {
            System.out.println("список пуст");
            return;
        }
        labClass.sortStudentsByGpa();
        System.out.println("отсортировано");
        displayAllStudents();
    }

    public void searchStudent() {
        System.out.print("поиск: ");
        String query = scanner.nextLine();

        try {
            Student found = labClass.findStudentByFio(query);
            System.out.println("найден: " + found);
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
