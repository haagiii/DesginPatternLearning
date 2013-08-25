package decorator;

public class FullBorder extends Border {
	private final int ROWS = 1;

	public FullBorder(Display display) {
		super(display);
	}

	public int getColumns() {
		return this.ROWS + this.display.getColumns() + this.ROWS;
	}

	public int getRows() {
		return this.ROWS + this.display.getRows() + this.ROWS;
	}

	public String getRowText(int row) {
		if (row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + this.ROWS) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {
			return "|" + display.getRowText(row - 1) + "|";
		}
	}

	private String makeLine(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}

		return buf.toString();
	}
}
