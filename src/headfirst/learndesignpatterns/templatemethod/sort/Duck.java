package headfirst.learndesignpatterns.templatemethod.sort;

/**
 * Created by peng on 2020/6/29.
 */
public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck o) {
        Duck otherDuck = o;
        if(this.weight < otherDuck.weight){
            return -1;
        } else if (this.weight == o.weight){
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }
}
