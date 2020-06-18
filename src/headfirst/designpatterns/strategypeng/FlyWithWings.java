package headfirst.designpatterns.strategypeng;

/**
 * Created by peng on 2020/6/18.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
