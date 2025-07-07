import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Window extends Frame {
    Window() {
        Button b1 = new Button("Click Me");
        b1.setBounds(30, 100, 80, 40);
        add(b1);
        setSize(300, 400);
        setLayout(null);
        setVisible(true);
    }
}

class WindowClosing extends Frame {
    Label l1;

    WindowClosing() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);

            }

        });
        l1 = new Label("Click the button to close the window");
        this.add(l1);
        setTitle("Window Closing Example");
        setSize(300, 200);
        setVisible(true);

    }

}

class Frontend {
    public static void main(String[] args) {
        new Window();
        new WindowClosing();
    }
}
