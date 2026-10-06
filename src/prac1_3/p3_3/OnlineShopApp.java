package prac1_3.p3_3;

import java.util.Scanner;

public class OnlineShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        Product[] catalog = {
                new Product("ноутбук", 85000),
                new Product("смартфон", 70000),
                new Product("наушники", 7500),
                new Product("клавиатура", 4990),
                new Product("мышь", 2199)
        };

        System.out.println("каталог товаров");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println((i + 1) + ") " + catalog[i].getName() + " — " + catalog[i].getPriceRub() + " руб.");
        }

        System.out.println();
        System.out.print("выберите номер товара: ");
        int productIndex = scanner.nextInt() - 1;

        if (productIndex < 0 || productIndex >= catalog.length) {
            System.out.println("такого товара нет в каталоге.");
            return;
        }
        Product selected = catalog[productIndex];

        System.out.print("введите количество: ");
        int quantity = scanner.nextInt();
        double totalRub = selected.getPriceRub() * quantity;

        System.out.println();
        System.out.println("товар: " + selected.getName());
        System.out.println("количество: " + quantity);
        System.out.println("стоимость в рублях: " + totalRub + " руб.");

        System.out.println();
        System.out.print("в какой валюте хотите оплатить (RUB, USD, EUR, CNY)? ");
        scanner.nextLine();
        String currency = scanner.nextLine();
        if (!converter.isSupported(currency)) {
            System.out.println("такая валюта не поддерживается.");
            return;
        }

        double totalInChosenCurrency = converter.convert(totalRub, converter.baseCur, currency);
        System.out.println("итого к оплате: " + totalInChosenCurrency + " " + currency.toUpperCase());

        scanner.close();
    }
}
