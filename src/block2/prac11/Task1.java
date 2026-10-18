package block2.prac11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String surname = "Ильинский";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2026, Calendar.OCTOBER, 12, 0, 0, 0);
        Date receivedDate = calendar.getTime();
        Date submitDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + surname);
        System.out.println("Задание получено: " + format.format(receivedDate));
        System.out.println("Задание сдано: " + format.format(submitDate));
    }
}
