import java.awt.*;
import javax.swing.*;

public class Currency {
    public static void main(String[] args) {
        JFrame f = new JFrame("Converter");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());

        JTextField amt = new JTextField(10);
        JButton usd = new JButton("USD to INR");
        JButton inr = new JButton("INR to USD");
        JLabel res = new JLabel("");

        double rate = 83;

        usd.addActionListener(e -> {
            double a = Double.parseDouble(amt.getText());
            res.setText("INR: " + (a * rate));
        });

        inr.addActionListener(e -> {
            double a = Double.parseDouble(amt.getText());
            res.setText("USD: " + (a / rate));
        });

        f.add(new JLabel("Enter amount:"));
        f.add(amt);
        f.add(usd);
        f.add(inr);
        f.add(res);

        f.setVisible(true);
    }
}