package block3.prac5.task1;
import java.awt.*;

public class Triangle extends Shape {
    private int size;

    public Triangle(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    public void draw(Graphics g) {
        int[] xs = {x, x + size, x + size / 2};
        int[] ys = {y + size, y + size, y};
        g.setColor(color);
        g.fillPolygon(xs, ys, 3);
    }
}
