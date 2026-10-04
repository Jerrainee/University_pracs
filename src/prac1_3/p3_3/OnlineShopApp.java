package prac1_3.p3_3;

import java.util.Scanner;

public class OnlineShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        // Каталог товаров магазина
        Product[] catalog = {
                new Product("Ноутбук", 65000),
                new Product("Смартфон", 32000),
                new Product("Наушники", 4500),
                new Product("Клавиатура", 2500),
                new Product("Мышь", 1200)
        };

        System.out.println("Каталог товаров");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println((i + 1) + ") " + catalog[i]);
        }

        System.out.print("\nВыберите номер товара: ");
        int productIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (productIndex < 0 || productIndex >= catalog.length) {
            System.out.println("Такого товара нет в каталоге.");
            scanner.close();
            return;
        }

        Product selected = catalog[productIndex];

        System.out.print("Введите количество: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        double totalRub = selected.getPriceRub() * quantity;
        System.out.printf("%nТовар: %s%nКоличество: %d%nСтоимость в рублях: %.2f руб.%n",
                selected.getName(), quantity, totalRub);

        System.out.print("\nВ какой валюте хотите оплатить (RUB, USD, EUR, CNY)? ");
        String currency = scanner.nextLine().trim().toUpperCase();

        if (!converter.isSupported(currency)) {
            System.out.println("Такая валюта не поддерживается.");
            scanner.close();
            return;
        }

        double totalInChosenCurrency = converter.convert(totalRub, Converter.BASE_CURRENCY, currency);
        System.out.printf("Итого к оплате: %.2f %s%n", totalInChosenCurrency, currency);

        scanner.close();
    }
}
