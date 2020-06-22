package headfirst.learndesignpatterns.singleton.classic;

/**
 * Created by peng on 2020/6/22.
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
