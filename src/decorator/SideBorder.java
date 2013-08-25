package decorator;

public class SideBorder extends Border {
	private char boderChar;
	private final int ROWS = 1;

	public SideBorder(Display display, char ch) {
		super(display);
		this.boderChar = ch;
	}

	public int getColumns() {
		return this.ROWS + this.display.getColumns() + this.ROWS;
	}

	public int getRows() {
		return this.display.getRows();
	}

	public String getRowText(int row) {
		return this.boderChar + this.display.getRowText(row) + this.boderChar;
	}

}
