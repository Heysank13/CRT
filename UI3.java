import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UI3 extends Frame {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    JFrame frame;

    UI3() {

        frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);

        l1 = new JLabel("Enter First Number:");
        l1.setBounds(50, 50, 150, 20);
        t1 = new JTextField();
        t1.setBounds(200, 50, 150, 20);

        l2 = new JLabel("Enter Second Number:");
        l2.setBounds(50, 100, 150, 20);
        t2 = new JTextField();
        t2.setBounds(200, 100, 150, 20);

        b1 = new JButton("Add");
        b1.setBounds(50, 150, 80, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int result = num1 + num2;
                t3.setText(String.valueOf(result));
            }
        });
        b2 = new JButton("Subtract");
        b2.setBounds(150, 150, 100, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int result = num1 - num2;
                t3.setText(String.valueOf(result));
            }
        });
        b3 = new JButton("Multiply");
        b3.setBounds(270, 150, 100, 30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int result = num1 * num2;
                t3.setText(String.valueOf(result));
            }
        });

        l3 = new JLabel("Result:");
        l3.setBounds(50, 200, 150, 20);

        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(l3);
        add(t3);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new UI3();
        UI3 ui = new UI3();

    }
}