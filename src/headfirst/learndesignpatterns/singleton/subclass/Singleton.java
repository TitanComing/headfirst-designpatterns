package headfirst.learndesignpatterns.singleton.subclass;

/**
 * Created by peng on 2020/6/22.
 */
public class Singleton {
    private String color;
    private int num;
    private boolean ordered;

    private volatile static Singleton uniqueInstance;

    protected Singleton() {}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton.class){
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }
}
