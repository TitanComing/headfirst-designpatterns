package headfirst.designpatterns.strategypeng;

/**
 * Created by peng on 2020/6/18.
 */
public class MimiDuckSimulator {
    public static void main(String[] args){
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
        MallardDuck mallard = new MallardDuck();
        DecoyDuck decoy = new DecoyDuck();

        mallard.performQuack();
        rubberDuck.performQuack();
        decoy.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
