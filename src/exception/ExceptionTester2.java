package exception;

/**
 * Created by nmenego on 11/7/16.
 */
public class ExceptionTester2 {
    public static void main(String[] args) {
        ExceptionTester2 tester = new ExceptionTester2();
        try {
            tester.explode();
        } catch (ExplodingException e) {
            e.printStackTrace();
        }
    }

    public void explode() throws ExplodingException {
        throw new ExplodingException("BOOM!");
    }
}
