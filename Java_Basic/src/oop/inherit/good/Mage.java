package oop.inherit.good;

public class Mage extends Player  {

	int mana;

	void characterInfo() {
		super.characterInfo();
		System.out.println(("# ���ŷ�: " + mana));
	}
}
