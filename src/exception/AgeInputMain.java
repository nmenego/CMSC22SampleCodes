package exception;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by nmenego on 11/7/16.
 */
public class AgeInputMain {

    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int age, thisYear, bornYr, answer;
        AgeInputVer1 input = new AgeInputVer1();
        age = input.getAge("How old are you?");
        // get year
        thisYear = today.get(Calendar.YEAR);
        // get birth year
        bornYr = thisYear - age;

        // check if user already had his/her birthday this year.
        answer = JOptionPane.showConfirmDialog(null, "Already had your birthday?", "", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.NO_OPTION) {
            bornYr--;
        }

        JOptionPane.showMessageDialog(null, "You are born in " + bornYr);

    }
}
