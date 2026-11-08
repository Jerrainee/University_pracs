package block3.prac5.task1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task1Match extends JFrame implements ActionListener {

    private int milanGoals = 0;
    private int madridGoals = 0;
    private String lastScorer = "N/A";

    private JButton milanButton = new JButton("AC Milan");
    private JButton madridButton = new JButton("Real Madrid");
    private JLabel resultLabel = new JLabel("result: 0 X 0");
    private JLabel scorerLabel = new JLabel("last scorer: N/A");
    private JLabel winnerLabel = new JLabel("winner: DRAW");

    public Task1Match() {
        super("match");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(scorerLabel);
        add(winnerLabel);

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanGoals++;
            lastScorer = "AC Milan";
        } else {
            madridGoals++;
            lastScorer = "Real Madrid";
        }

        resultLabel.setText("result: " + milanGoals + " X " + madridGoals);
        scorerLabel.setText("last scorer: " + lastScorer);

        if (milanGoals > madridGoals) {
            winnerLabel.setText("winner: AC Milan");
        } else if (madridGoals > milanGoals) {
            winnerLabel.setText("winner: Real Madrid");
        } else {
            winnerLabel.setText("winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Task1Match().setVisible(true);
    }
}
