package headfirst.learndesignpatterns.singleton.dcl;

/**
 * Created by peng on 2020/6/22.
 */
public class Singleton {
    protected volatile static Singleton uniqueInstance;

    protected Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a dcl Singleton!";
    }

}
