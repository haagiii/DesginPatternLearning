package template;

public class CharDisplay extends AbstarctDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
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
