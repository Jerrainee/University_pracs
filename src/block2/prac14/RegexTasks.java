package block2.prac14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTasks {

    // 2
    public static boolean isExactString(String text) {
        return text.matches("abcdefghijklmnopqrstuv18340");
    }

    // 3
    public static void printPrices(String text) {
        String regex = "(?<![\\d.])\\d+(\\.\\d{1,2})?\\s(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Найдена цена: " + matcher.group());
        }
    }

    // 5
    public static boolean isValidDate(String text) {

        String day31 = "31/(0[13578]|1[02])";
        String day2930 = "(29|30)/(0[13-9]|1[0-2])";
        String day1to28 = "(0[1-9]|1\\d|2[0-8])/(0[1-9]|1[0-2])";
        String year = "(19|[2-9]\\d)\\d\\d";

        String normalDates = "(" + day31 + "|" + day2930 + "|" + day1to28 + ")/" + year;
        String leapYear = "((19|[2-9]\\d)(0[48]|[2468][048]|[13579][26])"
                + "|([2468][048]|[3579][26])00)";
        String feb29 = "29/02/" + leapYear;

        return text.matches(normalDates + "|" + feb29);
    }

    // 7
    public static boolean isStrongPassword(String text) {
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z0-9_]{8,}";
        return text.matches(regex);
    }
}
