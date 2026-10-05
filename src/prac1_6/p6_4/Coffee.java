package prac1_6.p6_4;

public class Coffee implements Priceable {

    private String name;
    private int ML;
    private double pricePer100Ml;

    public Coffee(String name, int ML, double pricePer100Ml) {
        this.name = name;
        this.ML = ML;
        this.pricePer100Ml = pricePer100Ml;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return ML / 100.0 * pricePer100Ml;
    }
}
