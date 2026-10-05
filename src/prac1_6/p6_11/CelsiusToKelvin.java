package prac1_6.p6_11;

// Перевод из Цельсия в Кельвины
public class CelsiusToKelvin implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius + 273;
    }
}
