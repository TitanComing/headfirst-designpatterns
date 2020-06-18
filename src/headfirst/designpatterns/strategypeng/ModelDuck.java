package headfirst.designpatterns.strategypeng;

/**
 * Created by peng on 2020/6/18.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
