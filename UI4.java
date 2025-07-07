import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI4 extends JFrame implements ActionListener {
    JFrame f;
    JPanel p;
    JCardLayout cl;

    UI4() {
        f = new JFrame("Card Layout Example");
        cl = new CardLayout();

        /*
         * Creating a main panel with CardLayout
         * that will contain two child panels.
         */
        p = new JPanel();
        // creating to child panels
        JPanel cp1 = new JPanel();
        JPanel cp2 = new JPanel();
        JButton b1 = new JButton("Numbers");
        JButton b2 = new JButton("Alphabets");
        JButton b3 = new JButton("1");
        JButton b4 = new JButton("2");
        JButton b5 = new JButton("3");

        Container cp;
        cp.add(b3);
        cp.add(b4);
        cp.add(b5);

        JButton b6 = new JButton("A");
        JButton b7 = new JButton("B");
        JButton b8 = new JButton("C");
        JButton b9 = new JButton("D");

        cp2.add(b6);
        cp2.add(b7);
        cp2.add(b8);
        cp2.add(b9);

        p.setLayout(cl);

        p.add(cp1, "Numbers");
        p.add(cp2, "Alphabets");

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);
        f.add(p);

        f.setSize(300, 400);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == "Numbers") {
            cl.show(p, "Numbers");
        } else {
            cl.show(p, "Alphabets");
        }
    }

    public static void main(String[] args) {
        new UI4();

    }

}