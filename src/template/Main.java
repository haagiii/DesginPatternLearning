package template;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		AbstarctDisplay d1 = new CharDisplay('H');
		AbstarctDisplay d2 = new StringDisplay("Hello World");
		AbstarctDisplay d3 = new StringDisplay("����ɂ��́B");

		d1.display();
		d2.display();
		d3.display();
	}

}
