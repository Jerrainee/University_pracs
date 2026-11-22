package block4.prac17.task2;

import java.util.Scanner;

public class Task2Tester {

    private static int readNumber(Scanner in, int min, int max) {
        String text = in.nextLine().trim();
        while (!text.matches("\\d{1,3}") || Integer.parseInt(text) < min || Integer.parseInt(text) > max) {
            System.out.print("введите число от " + min + " до " + max + ": ");
            text = in.nextLine().trim();
        }
        return Integer.parseInt(text);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task2List list = new Task2List();

        while (true) {
            System.out.println();
            System.out.println("1 - добавить студента");
            System.out.println("2 - удалить студента");
            System.out.println("3 - показать одного студента");
            System.out.println("4 - показать весь список");
            System.out.println("5 - очистить список");
            System.out.println("6 - проверить, пуст ли список");
            System.out.println("7 - показать список с конца");
            System.out.println("0 - выход");
            System.out.print("выбор: ");

            int choice = readNumber(in, 0, 7);

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                Task2Student student = new Task2Student();
                student.read(in);
                list.add(student);
                System.out.println("студент добавлен");
            } else if (choice == 5) {
                list.clear();
                System.out.println("список очищен");
            } else if (choice == 6) {
                if (list.isEmpty()) {
                    System.out.println("список пуст");
                } else {
                    System.out.println("в списке студентов: " + list.size());
                }
            } else if (list.isEmpty()) {
                System.out.println("список пуст");
            } else if (choice == 2) {
                System.out.print("номер студента (1-" + list.size() + "): ");
                list.remove(readNumber(in, 1, list.size()));
                System.out.println("студент удален");
            } else if (choice == 3) {
                System.out.print("номер студента (1-" + list.size() + "): ");
                list.printNode(readNumber(in, 1, list.size()));
            } else if (choice == 4) {
                list.printAll();
            } else if (choice == 7) {
                list.printReverse();
            }
        }
    }
}
