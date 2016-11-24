package designpatterns.strategy;

/**
 * Created by nmenego on 11/24/16.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
