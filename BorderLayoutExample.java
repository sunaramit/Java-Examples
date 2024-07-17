import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutExample {

    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("BorderLayout Example");

        // Specify BorderLayout for the layout manager
        frame.setLayout(new BorderLayout());

        // Create buttons to add to each region
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        // Add buttons to the frame
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Exit the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}


