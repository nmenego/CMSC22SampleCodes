package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nmenego on 10/13/16.
 */
public class FileReading {


    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("/Users/nmenego/test/testing.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine + ">>");
                if (sCurrentLine.equals("Ugh!")) {
                    System.out.println("UGH!");
                }
            }

            System.out.println("goodbye 1");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                // sad :(
            }

        }

    }

}
