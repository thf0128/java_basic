package oop.this_super;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player();
		p1.name = "�÷��̾�1";
		System.out.println("p1�� �ּҰ�: " + p1);
		p1.characterInfo();
		
		System.out.println("---------------------------------");
		
		Player p2 = new Player("�÷��̾�2");
		System.out.println("p2�� �ּҰ�: " + p2);
		p2.characterInfo();
		
		System.out.println("---------------------------------");
		
		Player p3 = new Player("�÷��̾�3", 200);
		p3.characterInfo();
		
		System.out.println("---------------------------------");
		
		p3.attack(p2);
		p2.attack(p1);
		p1.attack(p3);
		
		System.out.println("---------------------------------");
		
		Warrior w1 = new Warrior("����¯¯��");
		w1.characterInfo();
		
		System.out.println("---------------------------------");
		
		Mage m1 = new Mage("����¯¯��");
		m1.characterInfo();
		
		System.out.println("---------------------------------");

		Hunter h1 = new Hunter("�ɲ�¯¯��");
		h1.characterInfo();
	}

}
