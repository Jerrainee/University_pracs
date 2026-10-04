package prac1_3.p3_3;

public class Product {
    private String name;
    private double priceRub;

    public Product(String name, double priceRub) {
        this.name = name;
        this.priceRub = priceRub;
    }

    public String getName() {
        return name;
    }

    public double getPriceRub() {
        return priceRub;
    }

    @Override
    public String toString() {
        return name + " — " + priceRub + " руб.";
    }
}
