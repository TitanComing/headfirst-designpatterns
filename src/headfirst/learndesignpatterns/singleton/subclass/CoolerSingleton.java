package headfirst.learndesignpatterns.singleton.subclass;

/**
 * Created by peng on 2020/6/22.
 */
public class CoolerSingleton extends Singleton{

    protected static Singleton uniqueInstance;

    private CoolerSingleton(){super();}
}
