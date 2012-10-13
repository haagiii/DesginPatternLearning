package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;
import java.util.*;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<String>();

	@Override
	protected Product createProduct(String owner) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		owners.add(((IDCard) product).getOwner());

	}

	public List getOwners() {
		return owners;

	}
}
