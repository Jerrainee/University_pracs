package block2.prac13;

public class StringOperations {
    public static void process(String text) {
        System.out.println("1. исходная строка: " + text);
        System.out.println("2. последний символ: " + text.charAt(text.length() - 1));
        System.out.println("3. заканчивается на !!!: " + text.endsWith("!!!"));
        System.out.println("4. начинается с I like: " + text.startsWith("I like"));
        System.out.println("5. содержит Java: " + text.contains("Java"));
        System.out.println("6. позиция Java: " + text.indexOf("Java"));
        System.out.println("7. замена a на o: " + text.replace('a', 'o'));
        System.out.println("8. верхний регистр: " + text.toUpperCase());
        System.out.println("9. нижний регистр: " + text.toLowerCase());
        int start = text.indexOf("Java");
        if (start >= 0) {
            String cut = text.substring(0, start) + text.substring(start + 4);
            System.out.println("10. без слова Java: " + cut);
        } else {
            System.out.println("10. слова Java в строке нет");
        }
    }
}
