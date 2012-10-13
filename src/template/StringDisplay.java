package template;

public class StringDisplay extends AbstarctDisplay {
	private String string;
	private int width;

	public StringDisplay(String string) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	void open() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		printLine();

	}

	@Override
	void print() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("|" + string + "|");

	}

	@Override
	void close() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
