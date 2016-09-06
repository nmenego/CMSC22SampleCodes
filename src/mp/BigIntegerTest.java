package mp; /**
 * Created by nmenego on 8/18/16.
 */

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {

        BigInteger bi1 = new BigInteger("83496963634236656497584949");
        BigInteger bi2 = new BigInteger("39373959222297959386161");
        System.out.println("a: " + bi1);
        System.out.println("b: " + bi2);
        System.out.println("a + b = " + bi1.add(bi2));
        System.out.println("a - b = " + bi1.subtract(bi2));
        System.out.println("a * b = " + bi1.multiply(bi2));
        System.out.println("a / b = " + bi1.divide(bi2));
        System.out.println("a / 0 = " + "ERR");


    }
}
