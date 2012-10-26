package builder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String filename = htmlBuilder.getResult();
			System.out.println(filename + "���쐬����܂���");
		} else {
			usage();
			System.exit(0);

		}

	}

	public static void usage() {
		System.out.println("Usage: java Main plain     �v���[���e�L�X�g�ŕ����쐬");
		System.out.println("Usage: java Main html      HTML�t�@�C���ŕ����쐬");
	}

}
