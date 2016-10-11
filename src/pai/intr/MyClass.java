package pai.intr;

/**
 * Created by nmenego on 10/10/16.
 */
public class MyClass implements MyInterface, MyOtherInterface {

    public String foo(double x) {
        int z = MyInterface.DEFAULT_INT;
        return "something" + z;
    }

    public String foo(int x) {
        return "";
    }



}
