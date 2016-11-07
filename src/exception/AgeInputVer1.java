package exception;

import javax.swing.*;

/**
 * Created by nmenego on 11/7/16.
 */
public class AgeInputVer1 {

    private static final String DEFAULT_MESSAGE = "Your age: ";

    public int getAge() {
        return getAge(DEFAULT_MESSAGE);
    }

    public int getAge(String prompt) {
        // show dialog
        String inputStr = JOptionPane.showInputDialog(null, prompt);
        int age = Integer.parseInt(inputStr);
        return age;
    }
}
