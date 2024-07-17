import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class SimpleApplication extends JFrame {

    public SimpleApplication() {
        setTitle("Simple Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DrawPanel());
    }

    public static void main(String[] args) {
        SimpleApplication app = new SimpleApplication();
        app.setVisible(true);
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("Hello, Application!", 50, 50);
        }
    }
}

