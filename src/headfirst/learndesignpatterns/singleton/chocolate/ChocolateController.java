package headfirst.learndesignpatterns.singleton.chocolate;

/**
 * Created by peng on 2020/6/23.
 */
public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println(boiler2.isEmpty());
        System.out.println(boiler2.isBoiled());
    }
}
