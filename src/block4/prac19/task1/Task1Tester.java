package block4.prac19.task1;

/**
 * Тестирование задания 1 практической работы № 19.
 */
public class Task1Tester {
    public static void main(String[] args) {
        OnlinePurchase shop = new OnlinePurchase();

        // успешный заказ
        try {
            shop.processOrder("иванов иван иванович", "770123456789", "ноутбук", 85000.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        // неверный формат (буквы)
        try {
            shop.processOrder("иванов иван иванович", "770123abc789", "мышь", 1500.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        // неверная длина
        try {
            shop.processOrder("иванов иван иванович", "123", "мышь", 1500.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        // клиент не найден
        try {
            shop.processOrder("сидоров сидор", "770123456789", "монитор", 25000.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        // несоответствие инн
        try {
            shop.processOrder("петров петр петрович", "770123456789", "наушники", 5000.0);
        } catch (InvalidInnException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
}
