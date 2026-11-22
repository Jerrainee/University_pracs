package block4.prac18.task8;

public class Task8Tester {
    public static void main(String[] args) {
        ThrowsDemo8 demo = new ThrowsDemo8();
        String[] mockKeys = {"", "тест"};
        for (String testKey : mockKeys) {
            try {
                demo.printDetails(testKey.trim());
                System.out.println("успех");
                break;
            } catch (Exception e) {
                System.out.println("ошибка: " + e.getMessage());
            }
        }
    }
}
