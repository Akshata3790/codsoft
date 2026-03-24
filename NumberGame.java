import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class NumberGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Game");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Guess number (1-100)");
        JTextField field = new JTextField(10);
        JButton btn = new JButton("Check");
        JLabel result = new JLabel("");

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        btn.addActionListener(e -> {
            int guess = Integer.parseInt(field.getText());

            if (guess == number) {
                result.setText("Correct!");
            } else if (guess > number) {
                result.setText("Too high");
            } else {
                result.setText("Too low");
            }
        });

        frame.add(label);
        frame.add(field);
        frame.add(btn);
        frame.add(result);

        frame.setVisible(true);
    }
}