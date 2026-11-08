package block3.prac5.task3;

import javax.swing.*;

public class Task3Image extends JFrame {

    public Task3Image(ImageIcon icon, String path) {
        super("image: " + path);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel(icon);
        add(new JScrollPane(label));
        setSize(600, 500);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ошибка: укажите путь к картинке.");
            return;
        }
        String path = args[0];

        // нет файла = ширина -1
        ImageIcon icon = new ImageIcon(path);
        if (icon.getIconWidth() <= 0) {
            System.out.println("ошибка: по пути " + path + " нет картинки.");
            return;
        }

        new Task3Image(icon, path).setVisible(true);
    }
}
