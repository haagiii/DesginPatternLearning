package template;

public class StringDisplay extends AbstarctDisplay {
	private String string;
	private int width;

	public StringDisplay(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	void open() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();

	}

	@Override
	void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("|" + string + "|");

	}

	@Override
	void close() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();

	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
