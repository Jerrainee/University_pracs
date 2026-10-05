package prac1_3;

import java.util.Random;

public class Task1_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lst = new int[4];

        for (int i = 0; i < lst.length; i++) {
            lst[i] = 10 + random.nextInt(90);
        }
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");
        }

        boolean flag = true;
        for (int i = 0; i < lst.length - 1; i++) {
            if (lst[i] >= lst[i + 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("- является");
        } else {
            System.out.println("- не является");
        }
    }
}
