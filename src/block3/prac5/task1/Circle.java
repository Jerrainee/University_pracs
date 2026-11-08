package block3.prac5.task1;
import java.awt.*;

public class Circle extends Shape {
    private int size;

    public Circle(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
