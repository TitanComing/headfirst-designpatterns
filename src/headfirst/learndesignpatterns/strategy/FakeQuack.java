package headfirst.learndesignpatterns.strategy;

/**
 * Created by peng on 2020/6/18.
 */
public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}
