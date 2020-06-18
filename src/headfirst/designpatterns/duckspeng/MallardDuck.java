package headfirst.designpatterns.duckspeng;

/**
 * Created by peng on 2020/6/18.
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
