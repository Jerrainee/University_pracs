package block4.prac19.task1;

public class Task1Tester {
    public static void main(String[] args) {
        OnlinePurchase shop = new OnlinePurchase();

        try {
            shop.processOrder("иванов иван иванович", "770123456789", "ноутбук", 85000.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try {
            shop.processOrder("иванов иван иванович", "770123abc789", "мышь", 1500.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try {
            shop.processOrder("иванов иван иванович", "123", "мышь", 1500.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try {
            shop.processOrder("сидоров сидор", "770123456789", "монитор", 25000.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try {
            shop.processOrder("петров петр петрович", "770123456789", "наушники", 5000.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
