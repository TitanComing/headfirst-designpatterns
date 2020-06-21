package headfirst.learndesignpatterns.decorator.pizza;

/**
 * Created by peng on 2020/6/21.
 */
public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost(); // cheese is free
    }
}
