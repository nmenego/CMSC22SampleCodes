package car;

/**
 * Created by nmenego on 8/18/16.
 */
public class CarTester {
    public static void main(String[] args) {
        Car car = new Car();
        car.reverse(); // Display error or throw exception
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.doBreak();
        car.doBreak();
        car.doBreak();
        car.stop();
    }
}
