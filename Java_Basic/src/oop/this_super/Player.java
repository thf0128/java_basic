package oop.this_super;

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	Player() {
		System.out.println("Player�� �⺻ ������ ȣ��!");
//		System.out.println("this�� �ּҰ�: " + this);
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	Player(String name) {
		this(); // ���� Ŭ������ �ٸ� �����ڸ� �θ��� ����.
		System.out.println("Player�� 2�� ������ ȣ��!");
//		System.out.println("this�� �ּҰ�: " + this);
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name;
	}
	
	Player(String name, int hp) {
		this(name); // �ٸ� �������� ȣ���� ������ ������ �ֻ�ܿ� ��ġ�ؾ� �մϴ�.
		System.out.println("Player�� 3�� ������ ȣ��!");
//		this.name = name;
		this.hp = hp;
	}
	
	void attack(Player target) {
		
		//System.out.println("target: " + target);
		//System.out.println("this: " + this);
		
		if(this == target) {
			System.out.println("�����δ� ���� �� �����ϴ�.");
			return;
		}
		
		// ��� �޼���: x�� y�� �����մϴ�.
		System.out.printf("%s(��)�� %s(��)�� �����մϴ�.\n", this.name, target.name);
		// �´� ����� hp�� 10 ���߰� ���� ü���� 5 ȸ���ϰ� �ʹ�.
		// ����� �������. (���� ü��: XX, ����� ü��: XX)
		target.hp -= 10; //target.hp = target.hp -10;
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
