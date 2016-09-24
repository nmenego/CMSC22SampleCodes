package car;

public class Driver {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carCount++;

        Car car2 = new Car();
        System.out.println(car2.carCount);
        car2.carCount++;


        System.out.println(car1.carCount);
        System.out.println(car2.carCount);





    }
}
