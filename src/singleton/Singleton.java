package singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){
		System.out.println("インスタンスを生生きました。");
	}
	public static Singleton getInstance(){
		return singleton;
	}

}
