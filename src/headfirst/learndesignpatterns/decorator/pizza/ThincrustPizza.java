package headfirst.learndesignpatterns.decorator.pizza;

/**
 * Created by peng on 2020/6/21.
 */
public class ThincrustPizza extends Pizza{
    public ThincrustPizza() {
        description = "Thin crust pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
