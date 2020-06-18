package headfirst.designpatterns.strategypeng;

/**
 * Created by peng on 2020/6/18.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
