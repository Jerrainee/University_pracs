package prac1_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(0, 0, 5);
        Circle b = new Circle(0, 0, 5);
        Circle c = new Circle(1, 1, 3);

        System.out.println(a);
        System.out.printf("Площадь a: %.2f%n", a.calculateArea());
        System.out.printf("Длина окружности a: %.2f%n", a.calculateCircumference());

        System.out.println("\n" + b);
        System.out.printf("Площадь b: %.2f%n", b.calculateArea());
        System.out.printf("Длина окружности b: %.2f%n", b.calculateCircumference());

        System.out.println("\n" + c);
        System.out.printf("Площадь c: %.2f%n", c.calculateArea());
        System.out.printf("Длина окружности c: %.2f%n", c.calculateCircumference());

        System.out.println("\nСравнение a и b: " + (a.equalsCircle(b) ? "одинаковые" : "разные"));
        System.out.println("Сравнение a и c: " + (a.equalsCircle(c) ? "одинаковые" : "разные"));

        c.setRadius(5);
        c.setCenterX(0);
        c.setCenterY(0);
        System.out.println("\nПосле изменения c: " + c);
        System.out.println("Сравнение a и c теперь: " + (a.equalsCircle(c) ? "одинаковые" : "разные"));
    }
}
