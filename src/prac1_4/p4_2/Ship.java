package prac1_4.p4_2;

public class Ship extends Transport {

    public Ship() {
        super("Корабль");
    }

    @Override
    public double getSpeed() {
        return 40;
    }

    @Override
    public double getPassengerPricePerKm() {
        return 20;
    }

    @Override
    public double getCargoPricePerKm() {
        return 100;
    }
}
