package block3.prac5.task1;
import java.awt.*;

public class Rect extends Shape {
    private int width;
    private int height;

    public Rect(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
