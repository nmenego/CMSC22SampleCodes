package gui;

import java.awt.*;       // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers

/**
 * Created by nmenego on 10/24/16.
 */
// A Swing GUI application inherits from top-level container javax.swing.JFrame
public class JSimpleCalculator extends JFrame {   // JFrame instead of Frame

    private JLabel lblSumLabel;
    private JLabel lblSum;
    private JTextField txtInput;
    private JButton btnSum;
    private int temp = 0;

    // Constructor to setup the GUI components and event handlers
    public JSimpleCalculator() {
        // Retrieve the content-pane of the top-level container JFrame
        // All operations done on the content-pane
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());   // The content-pane sets its layout

        lblSumLabel = new JLabel("Sum: ");
        lblSum = new JLabel("0");
        txtInput = new JTextField("0", 20);
        btnSum = new JButton("Sum");

        // 1. provide new class:
        //btnSum.addActionListener(new MyActionListener());
        // 2. anonymous class:
        btnSum.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (temp != 0) {
                    // FIXME might throw exception if user inputs characters
                    int sum = temp + Integer.parseInt(txtInput.getText());
                    lblSum.setText(sum + "");
                    temp = 0;
                } else {
                    // FIXME might throw exception if user inputs characters
                    temp = Integer.parseInt(txtInput.getText());
                    txtInput.setText("0");
                }
            }
        });

        // add them to container
        add(lblSumLabel);
        add(lblSum);
        add(txtInput);
        add(btnSum);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit program if close-window button clicked
        setTitle("Swing Counter"); // "super" JFrame sets title
        setSize(300, 100);         // "super" JFrame sets initial size
        setVisible(true);          // "super" JFrame shows
    }

    // The entry main() method
    public static void main(String[] args) {
        // Run the GUI construction in the Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JSimpleCalculator(); // Let the constructor do the job
            }
        });
    }
}