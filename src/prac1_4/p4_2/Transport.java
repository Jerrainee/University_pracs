package prac1_4.p4_2;

public abstract class Transport {

    protected String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSpeed();

    public abstract double getPassengerPricePerKm();

    public abstract double getCargoPricePerKm();

    // Обычные методы
    public double getTime(double distance) {
        return distance / getSpeed();
    }

    public double getPassengerCost(double distance, int passengers) { return distance * getPassengerPricePerKm() * passengers; }

    public double getCargoCost(double distance, double tons) {
        return distance * getCargoPricePerKm() * tons;
    }
}
