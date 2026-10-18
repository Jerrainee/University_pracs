package block2.prac11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Student {

    private String name;
    private String surname;
    private Date birthDate;

    public Student(String name, String surname, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, 0, 0, 0);
        this.birthDate = calendar.getTime();
    }

    public String getBirthDate(String format) {
        Locale russian = Locale.forLanguageTag("ru");
        SimpleDateFormat dateFormat;
        if (format.equals("short")) {
            dateFormat = new SimpleDateFormat("dd.MM.yy");
        } else if (format.equals("medium")) {
            dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        } else if (format.equals("full")) {
            dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy", russian);
        } else {
            dateFormat = new SimpleDateFormat(format);
        }
        return dateFormat.format(birthDate);
    }

    public String toString() {
        return surname + " " + name + ", дата рождения: " + getBirthDate("medium");
    }
}
