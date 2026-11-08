package block3.prac17.task1;

import java.util.Scanner;

public class Task1Student {
    String name;
    int age;
    Task1Student next;

    public void read(Scanner in) {
        System.out.print("имя: ");
        name = in.nextLine().trim();
        while (!name.matches("[a-zA-Zа-яА-ЯёЁ][a-zA-Zа-яА-ЯёЁ -]*")) {
            System.out.print("имя должно состоять из букв, попробуйте еще раз: ");
            name = in.nextLine().trim();
        }

        System.out.print("возраст: ");
        String text = in.nextLine().trim();
        while (!text.matches("\\d{1,3}") || Integer.parseInt(text) < 1 || Integer.parseInt(text) > 120) {
            System.out.print("возраст от 1 до 120, попробуйте еще раз: ");
            text = in.nextLine().trim();
        }
        age = Integer.parseInt(text);
    }

    public void print() {
        System.out.println("имя: " + name + ", возраст: " + age);
    }
}
