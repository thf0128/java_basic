package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	Player() {
//		System.out.println("Player�� �⺻ ������ ȣ��!");
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	Player(String name) {
		this(); 
//		System.out.println("Player�� 2�� ������ ȣ��!");
		this.name = name;
	}
	
	Player(String name, int hp) {
		this(name); 
		System.out.println("Player�� 3�� ������ ȣ��!");
		this.hp = hp;
	}
	
	void attack(Player target) {
		
		if(this == target) {
			System.out.println("�����δ� ���� �� �����ϴ�.");
			return;
		}
		
		
		System.out.printf("%s(��)�� %s(��)�� �����մϴ�.\n", this.name, target.name);
		
		target.hp -= 10; 
		this.hp += 5;
		System.out.printf("���� ü��: %d, ���� ü��: %d\n", this.hp, target.hp);
				
	}

	void characterInfo() {
		System.out.println("*** ĳ������ ���� ***");
		System.out.println("# ���̵�: " + name);
		System.out.println("# ����: " + level);
		System.out.println("# ���ݷ�: " + atk);
		System.out.println("# ü��: " + hp);
		System.out.println("�� �޼��带 ȣ���� ��ü�� �̸�: " + this.name);
	}
}
