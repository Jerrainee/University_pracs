package block2.prac14;
// Тестовый класс для практической работы 14
public class Tester {

    public static void main(String[] args) {

        // 2
        System.out.println("задание 2");
        System.out.println("abcdefghijklmnopqrstuv18340 -> "
                + RegexTasks.isExactString("abcdefghijklmnopqrstuv18340"));
        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340 -> "
                + RegexTasks.isExactString("abcdefghijklmnoasdfasdpqrstuv18340"));

        // 3
        System.out.println();
        System.out.println("задание 3");
        String text = "Цены: 25.98 USD, 44 ERR, 1500 RUB, 0.004 EU, 12.5 EU, 100 USD";
        System.out.println("Текст: " + text);
        RegexTasks.printPrices(text);

        // 5
        System.out.println();
        System.out.println("задание 5");
        System.out.println("29/02/2000 -> " + RegexTasks.isValidDate("29/02/2000"));
        System.out.println("30/04/2003 -> " + RegexTasks.isValidDate("30/04/2003"));
        System.out.println("29/02/2001 -> " + RegexTasks.isValidDate("29/02/2001"));

        // 7
        System.out.println();
        System.out.println("задание 7");
        System.out.println("F032_Password -> " + RegexTasks.isStrongPassword("F032_Password"));
        System.out.println("TrySpy12 -> " + RegexTasks.isStrongPassword("TrySpy12"));
        System.out.println("TrySpy1 -> " + RegexTasks.isStrongPassword("TrySpy1"));
        System.out.println("smart_pass -> " + RegexTasks.isStrongPassword("smart_pass"));
        System.out.println("A007 -> " + RegexTasks.isStrongPassword("A007"));
    }
}
