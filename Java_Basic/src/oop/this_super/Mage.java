package oop.this_super;

public class Mage extends Player {

	int mana;

	Mage(String name){

		super(name);
		this.mana = 180;
	}


	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# Á¤½Å·Â: " + mana);
	}
}
