package prac1_4.p4_2;

public class Plane extends Transport {

    public Plane() {
        super("самолёт");
    }

    @Override
    public double getSpeed() {
        return 800;
    }

    @Override
    public double getPassengerPricePerKm() {
        return 200;
    }

    @Override
    public double getCargoPricePerKm() {
        return 2000;
    }
}
