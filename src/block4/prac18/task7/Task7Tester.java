package block4.prac18.task7;

public class Task7Tester {
    public static void main(String[] args) {
        ThrowsDemo7 demo = new ThrowsDemo7();
        try {
            demo.printDetails("тест");
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        try {
            demo.printDetails("");
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
