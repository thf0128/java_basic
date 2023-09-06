package oop.poly.player;

public class Warrior extends Player {

	int rage;
	
	Warrior(String name) {
		super(name);
		this.rage = 60;
		
	}
	
	public void rush(Player p) {
		/*
        - ������ ���� ����� rush �޼��带 �ۼ��մϴ�.
        
        - rush�� ����� ��� ������ �Դϴ�. (1Ÿ�������� ��� ����)
        
        - ���� rush�� ����� ������ 10�� ���ظ� �ް�,
         �������� 20�� ���ظ� �ް�, ��ɲ��̶�� 15�� ���ظ� �޽��ϴ�.
         
        - ���� �ٸ� �������� instanceof�� ����Ͽ� �����ؼ� ������ �ּ���.
        
        - ���� ü�µ� ����� �ּ���.
        
        - main���� ��ü�� ������ �� ȣ���ϼż� �� ����ƴ��� Ȯ���� �ּ���.
        */
		
		System.out.printf("%s���� %s�Կ��� ������ �����߽��ϴ�!\n"
				, this.name, p.name);
		
		int damage; String job;
		if(p instanceof Warrior) {
			damage = 10; job = "����";
		} else if(p instanceof Mage) {
			damage = 20; job = "������";
		} else {
			damage = 15; job = "��ɲ�";
		}
		
		p.hp -= damage;
		System.out.printf("%s��(%s)�� %d�� ���ظ� �Ծ����ϴ�.\n", p.name, job, damage);
		System.out.printf("%s���� ���� ü��: %d\n", p.name, p.hp);
		
		System.out.println("---------------------------------");
		
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# �г�: " + rage);
	}

}
