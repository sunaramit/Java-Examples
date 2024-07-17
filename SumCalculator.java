import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;
    private JButton calculateButton;

    public SumCalculator() {
        // Create the text fields and button
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make the result field read-only
        calculateButton = new JButton("Calculate");

        // Add an ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSum();
            }
        });

        // Set up the layout
        setLayout(new FlowLayout());
        add(new JLabel("Number 1:"));
        add(textField1);
        add(new JLabel("Number 2:"));
        add(textField2);
        add(calculateButton);
        add(new JLabel("Sum:"));
        add(resultField);

        // Set up the frame
        setTitle("Sum Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
    }

    private void calculateSum() {
        try {
            // Get the values from the text fields
            double number1 = Double.parseDouble(textField1.getText());
            double number2 = Double.parseDouble(textField2.getText());

            // Calculate the sum
            double sum = number1 + number2;

            // Display the result
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException e) {
            // Display an error message if the input is not a valid number
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SumCalculator().setVisible(true);
            }
        });
    }
}
