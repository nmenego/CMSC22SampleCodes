package designpatterns.strategy;

/**
 * Created by nmenego on 11/24/16.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    // may use an overloaded constructor or a setter or both.


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public void swim() {
        System.out.println("swim");
    }

    public abstract void display();

    public void doFly() {
        flyBehavior.fly();
    }

    public void doQuack() {
        quackBehavior.quack();
    }

}
