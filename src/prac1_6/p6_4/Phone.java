package prac1_6.p6_4;

public class Phone implements Priceable {

    private String model;
    private double price;

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
