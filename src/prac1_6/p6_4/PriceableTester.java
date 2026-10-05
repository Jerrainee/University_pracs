package prac1_6.p6_4;

public class PriceableTester {

    public static void main(String[] args) {

        System.out.println("книга");
        Book book = new Book("азбука", 500);
        System.out.println("название: " + book.getTitle() + ", цена: " + book.getPrice() + " руб.");
        System.out.println();

        System.out.println("телефон");
        Phone phone = new Phone("WW", 30000);
        System.out.println("модель: " + phone.getModel() + ", цена: " + phone.getPrice() + " руб.");
        System.out.println();

        System.out.println("кофе");
        Coffee coffee = new Coffee("Латте", 300, 40);
        System.out.println("напиток: " + coffee.getName() + ", цена: " + coffee.getPrice() + " руб.");
        System.out.println();
        
        System.out.println("массив Priceable");
        Priceable[] goods = { book, phone, coffee };
        double total = 0;
        for (Priceable item : goods) {
            System.out.println("цена: " + item.getPrice() + " руб.");
            total = total + item.getPrice();
        }
        System.out.println("общая сумма: " + total + " руб.");
    }
}
