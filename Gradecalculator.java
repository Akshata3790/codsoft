import java.awt.*;
import javax.swing.*;

public class Gradecalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Grade Calculator");
        f.setSize(300, 250);
        f.setLayout(new FlowLayout());

        JTextField m1 = new JTextField(5);
        JTextField m2 = new JTextField(5);
        JTextField m3 = new JTextField(5);
        JButton btn = new JButton("Calculate");
        JLabel res = new JLabel("");

        f.add(new JLabel("Marks 1:"));
        f.add(m1);
        f.add(new JLabel("Marks 2:"));
        f.add(m2);
        f.add(new JLabel("Marks 3:"));
        f.add(m3);
        f.add(btn);
        f.add(res);

        btn.addActionListener(e -> {
            int a = Integer.parseInt(m1.getText());
            int b = Integer.parseInt(m2.getText());
            int c = Integer.parseInt(m3.getText());

            double avg = (a + b + c) / 3.0;
            String grade;

            if (avg >= 90) grade = "A";
            else if (avg >= 75) grade = "B";
            else if (avg >= 60) grade = "C";
            else grade = "Fail";

            res.setText("Avg: " + avg + " Grade: " + grade);
        });

        f.setVisible(true);
    }
}