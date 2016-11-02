package gui;

import javax.swing.text.JTextComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by nmenego on 10/26/16.
 */
public class MyMouseListener implements MouseListener {
    private JTextComponent textComponent;
    public MyMouseListener(JTextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        textComponent.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        textComponent.setText("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        textComponent.setText("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        textComponent.setText("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        textComponent.setText("mouse exited");
    }
}
