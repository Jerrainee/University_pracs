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
        String regex = "(^|\\s)(\\d+(\\.\\d{1,2})?\\s(USD|RUB|EU)\\b)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Найдена цена: " + matcher.group(2));
        }
    }

    // 7
    public static boolean isStrongPassword(String text) {
        boolean longEnough = text.length() >= 8;
        boolean onlyAllowed = text.matches("[A-Za-z0-9_]+");
        boolean hasUpper = text.matches(".*[A-Z].*");
        boolean hasLower = text.matches(".*[a-z].*");
        boolean hasDigit = text.matches(".*\\d.*");

        return longEnough && onlyAllowed && hasUpper && hasLower && hasDigit;
    }
}
