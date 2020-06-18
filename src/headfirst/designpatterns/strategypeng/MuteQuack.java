package headfirst.designpatterns.strategypeng;

/**
 * Created by peng on 2020/6/18.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
