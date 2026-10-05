package prac1_3.p3_3;

import java.util.Scanner;

public class OnlineShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        Product[] catalog = {
                new Product("Ноутбук", 85000),
                new Product("Смартфон", 70000),
                new Product("Наушники", 7500),
                new Product("Клавиатура", 4990),
                new Product("Мышь", 2199)
        };

        System.out.println("Каталог товаров");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println((i + 1) + ") " + catalog[i].getName() + " — " + catalog[i].getPriceRub() + " руб.");
        }

        System.out.print("\nВыберите номер товара: ");
        int productIndex = scanner.nextInt() - 1;

        if (productIndex < 0 || productIndex >= catalog.length) {
            System.out.println("Такого товара нет в каталоге.");
            return;
        }
        Product selected = catalog[productIndex];

        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();
        double totalRub = selected.getPriceRub() * quantity;

        System.out.println();
        System.out.println("Товар: " + selected.getName());
        System.out.println("Количество: " + quantity);
        System.out.println("Стоимость в рублях: " + totalRub + " руб.");

        System.out.print("\nВ какой валюте хотите оплатить (RUB, USD, EUR, CNY)? ");
        scanner.nextLine();
        String currency = scanner.nextLine();
        if (!converter.isSupported(currency)) {
            System.out.println("Такая валюта не поддерживается.");
            return;
        }

        double totalInChosenCurrency = converter.convert(totalRub, converter.baseCur, currency);
        System.out.println("Итого к оплате: " + totalInChosenCurrency + " " + currency.toUpperCase());

        scanner.close();
    }
}
