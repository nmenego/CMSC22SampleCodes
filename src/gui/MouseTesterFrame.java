package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by nmenego on 10/26/16.
 */
public class MouseTesterFrame extends JFrame {
    public static void main(String[] args) {

        new MouseTesterFrame();
    }

    public MouseTesterFrame() {
        setLayout(new FlowLayout());
        JButton btnTest = new JButton("My Button");
        JTextField txtTest = new JTextField("The quick brown fox...");
        txtTest.addMouseListener(new MyMouseListener(txtTest));
        btnTest.addMouseListener(new MyMouseListener(txtTest));
        add(txtTest);
        add(btnTest);
        setTitle("Mouse Listener Tester");
        setSize(200, 200);
        setVisible(true);

        // close window using an Adapter
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent we) {
//                System.exit(0);
//            }
//        });
        // close window using the Listener
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
