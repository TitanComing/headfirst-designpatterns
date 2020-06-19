package headfirst.learndesignpatterns.strategy;

/**
 * Created by peng on 2020/6/18.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
