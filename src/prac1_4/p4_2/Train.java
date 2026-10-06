package prac1_4.p4_2;

public class Train extends Transport {

    public Train() {
        super("поезд");
    }

    @Override
    public double getSpeed() {
        return 100;
    }

    @Override
    public double getPassengerPricePerKm() {
        return 2;
    }

    @Override
    public double getCargoPricePerKm() {
        return 42;
    }
}
