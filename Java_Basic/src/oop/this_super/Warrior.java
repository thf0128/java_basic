package oop.this_super;

public class Warrior extends Player {

	int rage;
	
	Warrior(String name) {
		//��� �����ڿ��� super()�� ����Ǿ� �ֽ��ϴ�.
		//�ڽ� ��ü�� ������ ���� �θ��� ��ü�� ������ �Ǿ��
		//�θ��� �Ӽ��� ����� �����ϰ� �ǰ�, ���� �� �� �ֱ� �����Դϴ�.
		super(name);
		this.rage = 60;
		
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# �г�: " + rage);
	}

}
