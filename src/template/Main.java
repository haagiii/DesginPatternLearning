package template;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstarctDisplay d1 = new CharDisplay('H');
		AbstarctDisplay d2 = new StringDisplay("Hello World");
		AbstarctDisplay d3 = new StringDisplay("こんにちは。");

		d1.display();
		d2.display();
		d3.display();
	}

}
