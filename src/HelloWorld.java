/**
 * Created by nmenego on 8/18/16.
 */
public class HelloWorld {
    public static void main(String[] args) {

        if (args != null && args.length != 0) {
            for (String arg : args) {
                System.out.println("Hello "
                        + arg + "!!!");
            }

        } else {
            System.out.println("Hello World!");
        }
    }
}
