package oop.this_super;

public class Hunter extends Player{

	String pet;

	Hunter(String name){
		super(name);
		this.pet = "�۸���";
	}

	void characterInfo() {
		super.characterInfo();
		System.out.println("# �� �̸�: " + this.pet);
	}

}
