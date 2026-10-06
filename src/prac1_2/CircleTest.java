package prac1_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(0, 0, 5);
        Circle b = new Circle(0, 0, 5);
        Circle c = new Circle(1, 1, 3);

        System.out.println(a);
        System.out.printf("площадь a: %.2f%n", a.calculateArea());
        System.out.printf("длина окружности a: %.2f%n", a.calculateCircumference());

        System.out.println(b);
        System.out.printf("площадь b: %.2f%n", b.calculateArea());
        System.out.printf("длина окружности b: %.2f%n", b.calculateCircumference());

        System.out.println(c);
        System.out.printf("площадь c: %.2f%n", c.calculateArea());
        System.out.printf("длина окружности c: %.2f%n", c.calculateCircumference());

        System.out.println("сравнение a и b: " + (a.equalsCircle(b) ? "одинаковые" : "разные"));
        System.out.println("сравнение a и c: " + (a.equalsCircle(c) ? "одинаковые" : "разные"));

        c.setRadius(5);
        c.setCenterX(0);
        c.setCenterY(0);
        System.out.println("после изменения c: " + c);
        System.out.println("сравнение a и c: " + (a.equalsCircle(c) ? "одинаковые" : "разные"));
    }
}
