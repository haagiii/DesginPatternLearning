package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {
	private String owner;

	IDCard(String owner) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		System.out.println(owner + "�̃J�[�h�����܂��B");
		this.owner = owner;
	}
	@Override
	public void use() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println(owner + "�̃J�[�h���g���܂��B");

	}
	public String getOwner() {
		return owner;
		
	}

}
