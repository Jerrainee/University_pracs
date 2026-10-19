package block2.prac14;
public class Tester14 {

    public static void main(String[] args) {

        // 2
        System.out.println("abcdefghijklmnopqrstuv18340"
                + RegexTasks.isExactString("abcdefghijklmnopqrstuv18340"));
        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340"
                + RegexTasks.isExactString("abcdefghijklmnoasdfasdpqrstuv18340"));

        // 3
        System.out.println();
        String text = "Цены: 25.98 USD, 44 ERR, 1500 RUB, 0.004 EU, 12.5 EU, 100 USD";
        System.out.println("Текст: " + text);
        RegexTasks.printPrices(text);

        // 7
        System.out.println();
        System.out.println("F032_Password" + RegexTasks.isStrongPassword("F032_Password"));
        System.out.println("TrySpy12" + RegexTasks.isStrongPassword("TrySpy12"));
        System.out.println("TrySpy1" + RegexTasks.isStrongPassword("TrySpy1"));
        System.out.println("smart_pass" + RegexTasks.isStrongPassword("smart_pass"));
        System.out.println("A007" + RegexTasks.isStrongPassword("A007"));

        // 9
        System.out.println();
        String sample = "a bb ccc dddd eeeee ffffff ggggggg h i";
        System.out.println("Текст: " + sample);
        LetterFrequency.print(sample);
    }
}
