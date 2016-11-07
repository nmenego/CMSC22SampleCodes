package exception;

/**
 * Created by nmenego on 11/7/16.
 */
public class ExceptionTester {
    public static void main(String[] args) {
        ExceptionTester tester = new ExceptionTester();
        try {
            tester.explode();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void explode() throws Exception {
        throw new Exception("BOOM!");
    }
}
