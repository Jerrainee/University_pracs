package block3.prac5.task2;

import block3.prac5.task1.Circle;
import block3.prac5.task1.Rect;
import block3.prac5.task1.Shape;
import block3.prac5.task1.Triangle;

import javax.swing.*;
import java.awt.*;

public class ShapesPanel extends JPanel {

    private block3.prac5.task1.Shape[] shapes = new Shape[20];

    public ShapesPanel() {
        for (int i = 0; i < shapes.length; i++) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            Color color = new Color(r, g, b);

            int x = (int) (Math.random() * 500);
            int y = (int) (Math.random() * 400);
            int size = 30 + (int) (Math.random() * 60);

            int kind = (int) (Math.random() * 3);
            if (kind == 0) {
                shapes[i] = new Circle(color, x, y, size);
            } else if (kind == 1) {
                shapes[i] = new Rect(color, x, y, size, size / 2 + 10);
            } else {
                shapes[i] = new Triangle(color, x, y, size);
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(g);
        }
    }
}
