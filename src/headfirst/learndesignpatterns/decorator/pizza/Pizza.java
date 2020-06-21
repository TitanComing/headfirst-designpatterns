package headfirst.learndesignpatterns.decorator.pizza;

/**
 * Created by peng on 2020/6/21.
 */
public abstract class Pizza {
    String description = "Basic Pizza";

    public String getDescription() {return description;}

    public abstract double cost();
}
