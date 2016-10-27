package gui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by nmenego on 10/26/16.
 */
public class MyMouseListener implements MouseListener {
    private JTextField textField;
    public MyMouseListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        textField.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        textField.setText("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        textField.setText("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        textField.setText("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        textField.setText("mouse exited");
    }
}
