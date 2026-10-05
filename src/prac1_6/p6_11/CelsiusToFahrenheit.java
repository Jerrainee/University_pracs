package prac1_6.p6_11;

public class CelsiusToFahrenheit implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
