package designpatterns.strategy;

/**
 * Created by nmenego on 11/24/16.
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println(this.getClass().getName());
    }
}
