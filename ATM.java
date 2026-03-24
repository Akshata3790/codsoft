import java.awt.*;
import javax.swing.*;

public class ATM {
    static double balance = 1000;

    public static void main(String[] args) {
        JFrame f = new JFrame("ATM");
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());

        JTextField amount = new JTextField(10);
        JLabel res = new JLabel("Balance: 1000");

        JButton dep = new JButton("Deposit");
        JButton wit = new JButton("Withdraw");

        dep.addActionListener(e -> {
            double a = Double.parseDouble(amount.getText());
            balance += a;
            res.setText("Balance: " + balance);
        });

        wit.addActionListener(e -> {
            double a = Double.parseDouble(amount.getText());
            if (a <= balance) {
                balance -= a;
                res.setText("Balance: " + balance);
            } else {
                res.setText("Not enough balance");
            }
        });

        f.add(new JLabel("Enter amount:"));
        f.add(amount);
        f.add(dep);
        f.add(wit);
        f.add(res);

        f.setVisible(true);
    }
}