package prototype;
import prototype.framework.Product;

public class MessageCreater {
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
