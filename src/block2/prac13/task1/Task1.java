package block2.prac13.task1;

public class Task1 {
    public static void process(String text) {
        System.out.println("1: " + text);
        System.out.println("2: " + text.charAt(text.length() - 1));
        System.out.println("3: " + text.endsWith("!!!"));
        System.out.println("4: " + text.startsWith("I like"));
        System.out.println("5: " + text.contains("Java"));
        System.out.println("6: " + text.indexOf("Java"));
        System.out.println("7: " + text.replace('a', 'o'));
        System.out.println("8: " + text.toUpperCase());
        System.out.println("9: " + text.toLowerCase());
        int start = text.indexOf("Java");
        if (start >= 0) {
            String cut = text.substring(0, start) + text.substring(start + 4);
            System.out.println("10: " + cut);
        } else {
            System.out.println("10 слова Java в строке нет");
        }
    }
}
