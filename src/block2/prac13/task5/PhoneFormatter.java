package block2.prac13.task5;

public class PhoneFormatter {
    public static String format(String phone) {
        String code;
        String number;
        if (phone.startsWith("8") && phone.length() == 11) {
            code = "7";
            number = phone.substring(1);
        } else if (phone.startsWith("+") && phone.length() >= 12) {
            code = phone.substring(1, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else {
            return "неверный формат номера: " + phone;
        }

        return "+" + code + number.substring(0, 3) + "-"
                + number.substring(3, 6) + "-"
                + number.substring(6, 10);
    }
}
