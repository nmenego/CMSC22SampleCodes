package mp;

import java.util.Scanner;

public class LargeInteger {

    // TODO add the rest of your implementation here!!!
    public LargeInteger(String str) {
        // TODO add implementation
    }

    public LargeInteger(long l) {
        // TODO add implementation
    }

    public LargeInteger(LargeInteger li) {
        // TODO add implementation
    }

    public LargeInteger add(LargeInteger li) {
        // TODO add implementation
        return li;
    }

    public LargeInteger subtract(LargeInteger li) {
        // TODO add implementation
        return li;
    }

    public LargeInteger multiply(LargeInteger li) {
        // TODO add implementation
        return li;
    }

    public LargeInteger divide(LargeInteger li) {
        // TODO add implementation
        return li;
    }

    // NOTE: no need to change this method!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Simply read input from console and perform operations using the LargeInteger class
        String operand1 = sc.next();
        String operator = sc.next();
        String operand2 = sc.next();

        // To test String constructor
        LargeInteger myInt1 = new LargeInteger(operand1);
        // To test LargeInteger constructor
        LargeInteger myInt2 = new LargeInteger(new LargeInteger(operand2));
        // To test long constructor
        LargeInteger result = new LargeInteger(0L);

        switch(operator) {
            case "+":
                result = myInt1.add(myInt2);
                break;
            case "-":
                result = myInt1.subtract(myInt2);
                break;
            case "*":
                result = myInt1.multiply(myInt2);
                break;
            case "/":
                result = myInt1.divide(myInt2);
                break;
            default:
                // do nothing...

        }

        // print out result:
        System.out.println(result); // this line invokes LargeInteger.toString()

    }

}