package block3.prac5.task2;

import javax.swing.*;

public class Task2Shapes extends JFrame {

    public Task2Shapes() {
        super("20 random shapes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new ShapesPanel());
        setSize(650, 550);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Task2Shapes().setVisible(true);
    }
}
