package headfirst.learndesignpatterns.decorator.factory.pizzas;


/**
 * Created by peng on 2020/6/22.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


        public Pizza orderPizza(String type) {
            Pizza pizza;

            pizza = factory.createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            return pizza;
    }
}
