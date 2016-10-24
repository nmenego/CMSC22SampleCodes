package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nmenego on 10/24/16.
 */
public class SimpleCalculator extends Frame {
    private Label lblSumLabel;
    private Label lblSum;
    private TextField txtInput;
    private Button btnSum;

    private int temp = 0;

    public SimpleCalculator() {
        setLayout(new FlowLayout());
        // "super" Frame (a Container) sets its layout to FlowLayout, which arranges
        // the components from left-to-right, and flow to next row from top-to-bottom.

        lblSumLabel = new Label("Sum: ");
        lblSum = new Label("0");
        txtInput = new TextField("0", 20);
        btnSum = new Button("Sum");

        // anonymous class
        btnSum.addActionListener(new MyActionListener());

        // add them to container
        add(lblSumLabel);
        add(lblSum);
        add(txtInput);
        add(btnSum);

        setTitle("Simple Calculator");
        setSize(250, 100);
        setVisible(true);
    }

    // inner class
    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(temp != 0) {
                // FIXME might throw exception if user inputs characters
                int sum = temp + Integer.parseInt(txtInput.getText());
                lblSum.setText(sum + "");
            } else {
                // FIXME might throw exception if user inputs characters
                temp = Integer.parseInt(txtInput.getText());
                txtInput.setText("0");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
