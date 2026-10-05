package prac1_6;

public class Car implements Nameable {

    private String brand; // марка

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}
