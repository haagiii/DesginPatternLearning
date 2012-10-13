package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {
	private String owner;

	IDCard(String owner) {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}
	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(owner + "のカードを使います。");

	}
	public String getOwner() {
		return owner;
		
	}

}
