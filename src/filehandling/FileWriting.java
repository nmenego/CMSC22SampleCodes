package filehandling;

import java.io.*;

/**
 * Created by nmenego on 10/13/16.
 */
public class FileWriting {
    public static void main(String[] args) {
        try {

            File file = new File("/Users/nmenego/test/filename.txt");
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("The quick brown fox jumps over the lazy dog near the river bank.");
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
