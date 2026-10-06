package prac1_1;


public class Task5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("аргументы командной строки не переданы.");
            return;
        }

        System.out.println("переданные аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ": " + args[i]);
        }
    }
}
