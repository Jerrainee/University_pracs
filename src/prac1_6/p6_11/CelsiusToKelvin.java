package prac1_6.p6_11;

public class CelsiusToKelvin implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius + 273;
    }
}
