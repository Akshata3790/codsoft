import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    @Override
    public String toString() {
        return name + " - " + roll;
    }
}

public class Student1 {
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        JFrame f = new JFrame("Student System");
        f.setSize(350, 400);
        f.setLayout(new FlowLayout());

        JTextField name = new JTextField(10);
        JTextField roll = new JTextField(5);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> display = new JList<>(model);

        JButton add = new JButton("Add");
        JButton del = new JButton("Delete");

        add.addActionListener(e -> {
            String n = name.getText();
            int r = Integer.parseInt(roll.getText());

            Student s = new Student(n, r);
            list.add(s);
            model.addElement(s.toString());
        });

        del.addActionListener(e -> {
            int index = display.getSelectedIndex();
            if (index != -1) {
                list.remove(index);
                model.remove(index);
            }
        });

        f.add(new JLabel("Name:"));
        f.add(name);
        f.add(new JLabel("Roll:"));
        f.add(roll);
        f.add(add);
        f.add(del);
        f.add(new JScrollPane(display));

        f.setVisible(true);
    }
}