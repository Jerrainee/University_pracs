package prac1_4.p4_2;

public class Car extends Transport {

    public Car() {
        super("автомобиль");
    }

    @Override
    public double getSpeed() { return 80; }

    @Override
    public double getPassengerPricePerKm() { return 100; }

    @Override
    public double getCargoPricePerKm() { return 200; }
}
