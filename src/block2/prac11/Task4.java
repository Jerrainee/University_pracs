package block2.prac11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = in.nextInt();
        System.out.println("Введите месяц (1-12):");
        int month = in.nextInt();
        System.out.println("Введите число:");
        int day = in.nextInt();
        System.out.println("Введите часы:");
        int hour = in.nextInt();
        System.out.println("Введите минуты:");
        int minute = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // месяцы с нуля!
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        Date date = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Date: " + format.format(date));

        System.out.println("Calendar, год: " + calendar.get(Calendar.YEAR));
        System.out.println("Calendar, месяц: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Calendar, день: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar, часы: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar, минуты: " + calendar.get(Calendar.MINUTE));
    }
}
