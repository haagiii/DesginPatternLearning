package singleton;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		System.out.println("Start");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("same obj");
		} else {
			System.out.println("different obj");
		}
		System.out.println("End");
*/
		if(Triple.getInstance(1).getTripleNumber() == 1){
		System.out.println("yes the number is 1");
		}
		System.out.println(Triple.getInstance(1).getTripleNumber());
	}

}
