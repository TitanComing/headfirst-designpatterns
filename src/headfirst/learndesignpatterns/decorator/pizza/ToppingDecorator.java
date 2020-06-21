package headfirst.learndesignpatterns.decorator.pizza;

/**
 * Created by peng on 2020/6/21.
 */
public abstract class ToppingDecorator extends Pizza{
    Pizza pizza;

    public abstract String getDescription();
}
