package designpatterns.strategy;

/**
 * Created by nmenego on 11/24/16.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("flying with wings!");
    }
}
