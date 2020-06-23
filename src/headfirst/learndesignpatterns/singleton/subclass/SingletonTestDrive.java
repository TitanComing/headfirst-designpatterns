package headfirst.learndesignpatterns.singleton.subclass;


public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		foo.setColor("red");
		Singleton bar = HotterSingleton.getInstance();
		bar.setNum(10);

		System.out.println(foo);
		System.out.println(bar);
		System.out.println(bar == foo);

		System.out.println(foo.getColor());
		System.out.println(foo.getNum());
		System.out.println(bar.getColor());
		System.out.println(bar.getNum());
 	}
}
