package designpatterns.strategy;

/**
 * Created by nmenego on 11/24/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("not flying...");
    }
}
