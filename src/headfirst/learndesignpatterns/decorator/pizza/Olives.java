package headfirst.learndesignpatterns.decorator.pizza;

/**
 * Created by peng on 2020/6/21.
 */
public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + .30;
    }
}
