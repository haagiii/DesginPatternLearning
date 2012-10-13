package template;

public class CharDisplay extends AbstarctDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.ch = ch;
	}
	void open(){
		System.out.print("<<");
	}
	void print(){
		System.out.print(ch);
	}

	void close(){
		System.out.println(">>");
	}
}
