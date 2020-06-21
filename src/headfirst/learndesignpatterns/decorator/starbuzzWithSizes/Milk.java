package headfirst.learndesignpatterns.decorator.starbuzzWithSizes;

import headfirst.designpatterns.decorator.starbuzzWithSizes.Beverage;
import headfirst.designpatterns.decorator.starbuzzWithSizes.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
