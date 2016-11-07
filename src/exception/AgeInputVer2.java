package exception;

import javax.swing.*;

/**
 * Created by nmenego on 11/7/16.
 */
public class AgeInputVer2 {
    private static final String DEFAULT_MESSAGE = "Your age: ";

    public int getAge() {
        return getAge(DEFAULT_MESSAGE);
    }

    public int getAge(String prompt) {

        int age = -1;
        String inputStr;
        boolean keepGoingFlag = true;

        while(keepGoingFlag) {
            // show dialog
            inputStr = JOptionPane.showInputDialog(null, prompt);
            try {
                age = Integer.parseInt(inputStr);
                keepGoingFlag = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid!\n Please enter digits only.");
            }
        }

        return age;
    }
}
