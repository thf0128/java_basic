package oop.inherit.good;

/*
# �θ� Ŭ����, ���� Ŭ���� (Parent, super class)

- �����͸� �ٸ� Ŭ�������� ����ϴ� Ŭ������ �θ� Ŭ������� �θ��ϴ�.
- ����� ����ϸ� �����͸� �����޴� Ŭ�������� �θ� Ŭ������
 �������(�ʵ�)�� �޼��尡 ��ӵ˴ϴ�. ��, �����ڴ� ��ӵ��� �ʽ��ϴ�.
*/

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	void attack() {
		
	}
	
	void characterInfo() {
		System.out.println("*** ĳ������ ���� ***");
		System.out.println("# ���̵�: " + name);
		System.out.println("# ����: " + level);
		System.out.println("# ���ݷ�: " + atk);
		System.out.println("# ü��: " + hp);
	}
}
