package decorator;

public class StringDisplay extends Display {
	private String string;
	private final int ROWS = 1;

	public StringDisplay(String string) {
		this.string = string;
	}

	@Override
	public int getColumns() {
		return this.string.getBytes().length;
	}

	@Override
	public int getRows() {
		return this.ROWS;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0) {
			return this.string;
		} else {
			return null;
		}
	}
}
