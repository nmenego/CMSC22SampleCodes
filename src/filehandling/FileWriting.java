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

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("The quick brown fox jumps over the lazy dog near the river bank.");
            bw.newLine();
            bw.write("some other line.");
            bw.newLine();
            bw.write(54321);

            // better use finally here...
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
