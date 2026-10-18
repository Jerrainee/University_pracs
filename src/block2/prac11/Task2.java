package block2.prac11;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите год:");
        int year = in.nextInt();
        System.out.println("введите месяц:");
        int month = in.nextInt();
        System.out.println("введите день:");
        int day = in.nextInt();
        System.out.println("введите часы:");
        int hour = in.nextInt();
        System.out.println("введите минуты:");
        int minute = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, 0);
        Date entered = calendar.getTime();
        Date now = new Date();
        int result = entered.compareTo(now);
        if (result < 0) {
            System.out.println("введенная дата РАНЬШЕ текущей.");
        } else if (result > 0) {
            System.out.println("введенная дата ПОЗЖЕ текущей.");
        } else {
            System.out.println("Введенная дата совпадает с текущей.");
        }
    }
}
