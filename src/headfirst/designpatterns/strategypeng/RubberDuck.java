package headfirst.designpatterns.strategypeng;

/**
 * Created by peng on 2020/6/18.
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(() -> System.out.println("Squeak"));
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
