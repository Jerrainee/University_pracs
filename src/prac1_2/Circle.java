package prac1_2;

public class Circle {
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean equalsCircle(Circle other) {
        return this.radius == other.radius
                && this.centerX == other.centerX
                && this.centerY == other.centerY;
    }

    @Override
    public String toString() {
        return "Окружность: центр=(" + centerX + ", " + centerY + "), радиус=" + radius;
    }
}
