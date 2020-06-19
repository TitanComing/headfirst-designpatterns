package headfirst.learndesignpatterns.strategy;

/**
 * Created by peng on 2020/6/18.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
