package serialization;

import java.io.*;

/**
 * Created by nmenego on 11/2/16.
 */
public class SerializationTester {

    private static final String FILE_NAME = "MyGame.ser";

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            // declare and construct objects
            GameCharacter g1 = new GameCharacter("char1", 10, 10, new Shoe("red", 5));
            GameCharacter g2 = new GameCharacter("char2", 10, 15, new Shoe("blue", 15));
            GameCharacter g3 = new GameCharacter("char3", 5, 20, new Shoe("yellow", 10));

            // print them out. note: toString() methods have been defined
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);

            // SERIALIZATION...
            File fout = new File(FILE_NAME);
            fos = new FileOutputStream(fout);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(g1);
            oos.writeObject(g2);
            oos.writeObject(g3);

            oos.close();

            // DESERIALIZATION...
            File fin = new File(FILE_NAME);
            if(fin.length() == 0) {
                // file is emtpy!!
                System.err.println("FILE IS EMPTY");
                System.exit(-1);
            }
            fis = new FileInputStream(fin);
            ois = new ObjectInputStream(fis);


            GameCharacter g4 = (GameCharacter) ois.readObject();
            GameCharacter g5 = (GameCharacter) ois.readObject();
            GameCharacter g6 = (GameCharacter) ois.readObject();

            // print them out. note: toString() methods have been defined
            System.out.println(g4);
            System.out.println(g5);
            System.out.println(g6);

            ois.close();
        } catch (IOException e) {
            // standard file handling exception
            e.printStackTrace();
        } catch (ClassNotFoundException ce) {
            // this might be thrown by ois.readObject()
            ce.printStackTrace();
        } finally {

            // make sure to close the files!
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
