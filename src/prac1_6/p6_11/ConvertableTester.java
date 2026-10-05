package prac1_6.p6_11;

public class ConvertableTester {

    public static void main(String[] args) {

        Convertable toKelvin = new CelsiusToKelvin();
        Convertable toFahrenheit = new CelsiusToFahrenheit();

        System.out.println("c = 0");
        double c1 = 0;
        System.out.println(c1 + " C = " + toKelvin.convert(c1) + " K");
        System.out.println(c1 + " C = " + toFahrenheit.convert(c1) + " F");
        System.out.println();

        System.out.println("c = 25");
        double c2 = 25;
        System.out.println(c2 + " C = " + toKelvin.convert(c2) + " K");
        System.out.println(c2 + " C = " + toFahrenheit.convert(c2) + " F");
        System.out.println();

        System.out.println("c = 100");
        double c3 = 100;
        System.out.println(c3 + " C = " + toKelvin.convert(c3) + " K");
        System.out.println(c3 + " C = " + toFahrenheit.convert(c3) + " F");
        System.out.println();

        System.out.println("массив Convertable, 37 C");
        Convertable[] converters = { toKelvin, toFahrenheit };
        for (Convertable converter : converters) {
            System.out.println("результат: " + converter.convert(37));
        }
    }
}
