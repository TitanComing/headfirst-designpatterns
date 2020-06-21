package headfirst.learndesignpatterns.observer.simpleobservable;

import headfirst.designpatterns.observer.simpleobservable.SimpleObserver;
import headfirst.designpatterns.observer.simpleobservable.SimpleSubject;

/**
 * Created by peng on 2020/6/20.
 */
public class Example {
    public static void main(String[] args){
        headfirst.designpatterns.observer.simpleobservable.SimpleSubject simpleSubject = new SimpleSubject();

        headfirst.designpatterns.observer.simpleobservable.SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(80);
    }
}
