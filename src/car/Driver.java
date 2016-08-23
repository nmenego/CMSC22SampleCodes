package car;

public class Driver {

    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(); // error or mo reklamo
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.stop(); // mo error
        car.doBrake();
        car.doBrake();
        car.doBrake();
        car.doBrake();
        car.stop();


    }
}
