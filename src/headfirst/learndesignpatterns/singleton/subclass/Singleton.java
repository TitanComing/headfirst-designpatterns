package headfirst.learndesignpatterns.singleton.subclass;

/**
 * Created by peng on 2020/6/22.
 */
public class Singleton {
    protected static Singleton uniqueInstance;

    protected Singleton(){};

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
