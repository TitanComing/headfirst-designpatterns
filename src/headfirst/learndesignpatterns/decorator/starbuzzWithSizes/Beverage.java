package headfirst.learndesignpatterns.decorator.starbuzzWithSizes;

/**
 * Created by peng on 2020/6/21.
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
