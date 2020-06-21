package headfirst.learndesignpatterns.observer.simpleobservable;

import java.util.Observable;

/**
 * Created by peng on 2020/6/20.
 */
public class SimpleSubject extends Observable {
    private int value = 0;

    public SimpleSubject() {
    }


    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    public int getValue() {
        return this.value;
    }

}
