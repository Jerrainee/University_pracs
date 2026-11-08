package block3.prac5.task4;
import javax.swing.*;
import java.awt.*;

public class Task4Animation extends JPanel implements Runnable {

    private Image strip;
    private int stripHeight;
    private int frameWidth;
    private int frameCount;
    private int current = 0;

    public Task4Animation(ImageIcon icon, int frameCount) {
        this.strip = icon.getImage();
        this.stripHeight = icon.getIconHeight();
        this.frameCount = frameCount;
        this.frameWidth = icon.getIconWidth() / frameCount;
    }

    // в потоке
    public void run() {
        while (true) {
            current = current + 1;
            if (current == frameCount) {
                current = 0;
            }
            repaint();

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // границы кадра
        int left = current * frameWidth;
        int right = left + frameWidth;

        int x = (getWidth() - frameWidth) / 2;
        int y = (getHeight() - stripHeight) / 2;

        g.drawImage(strip, x, y, x + frameWidth, y + stripHeight,
                    left, 0, right, stripHeight, null);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ошибка: нужно указать два аргумента");
            return;
        }

        if (!args[1].matches("\\d+") || Integer.parseInt(args[1]) < 1) {
            System.out.println("ошибка: количество кадров должно быть целым числом больше 0");
            return;
        }
        int frames = Integer.parseInt(args[1]);

        ImageIcon icon = new ImageIcon(args[0]);
        if (icon.getIconWidth() <= 0) {
            System.out.println("ошибка: по пути " + args[0] + " нет картинки");
            return;
        }

        if (frames > icon.getIconWidth()) {
            System.out.println("ошибка: кадров больше, чем ширина картинки");
            return;
        }

        Task4Animation panel = new Task4Animation(icon, frames);

        JFrame frame = new JFrame("animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        new Thread(panel).start();
    }
}
