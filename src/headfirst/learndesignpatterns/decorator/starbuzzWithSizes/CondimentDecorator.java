package headfirst.learndesignpatterns.decorator.starbuzzWithSizes;

/**
 * Created by peng on 2020/6/21.
 */
public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {return beverage.getSize();}
}
