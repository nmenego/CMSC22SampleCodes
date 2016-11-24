package designpatterns.strategy;

/**
 * Created by nmenego on 11/24/16.
 */
public class StrategyTest {
    public static void main(String[] args) {
        // initialize
        Duck d1 = new DecoyDuck();
        // set up the strategies
        d1.setFlyBehavior(new FlyNoWay());
        d1.setQuackBehavior(new MuteQuack());

        // initialize
        Duck d2 = new MallardDuck();
        // set up the strategies
        d2.setFlyBehavior(new FlyWithWings());
        d2.setQuackBehavior(new Quack());

        d1.doFly();
        d2.doFly();

        d1.doQuack();
        d2.doQuack();

    }
}
