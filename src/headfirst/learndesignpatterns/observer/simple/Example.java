package headfirst.learndesignpatterns.observer.simple;

/**
 * Created by peng on 2020/6/20.
 */
public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(80);
    }
}
