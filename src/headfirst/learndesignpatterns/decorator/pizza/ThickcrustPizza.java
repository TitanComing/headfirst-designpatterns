package headfirst.learndesignpatterns.decorator.pizza;

/**
 * Created by peng on 2020/6/21.
 */
public class ThickcrustPizza extends Pizza {

    public ThickcrustPizza() {
        description = "Thick crust pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
