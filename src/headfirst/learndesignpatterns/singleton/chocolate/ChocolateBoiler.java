package headfirst.learndesignpatterns.singleton.chocolate;

/**
 * Created by peng on 2020/6/23.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueChocolateBoiler;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueChocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueChocolateBoiler == null) {
                    System.out.println("Creating unique instance of Chocolate Boiler");
                    uniqueChocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueChocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
