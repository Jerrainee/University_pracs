package prac1_6.p6_4;

public class Book implements Priceable {

    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
