package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "Àü»ç1";
		w1.rage = 60;
		w1.characterInfo();

		System.out.println("-----------------");
		
		Mage m1 = new Mage();
		m1.name = "¸¶¹ý»ç1";
		m1.level = 2;
		m1.hp = 50;
		m1.mana = 100;
		m1.characterInfo();
		
		System.out.println("-----------------");
		
		Hunter h1 = new Hunter();
		h1.name = "»ç³É²Û1";
		h1.level = 1;
		h1.atk = 4;
		h1.hp = 50;
		h1.pet = "¸Û¸ÛÀÌ";
		h1.characterInfo();
		
	}
}
