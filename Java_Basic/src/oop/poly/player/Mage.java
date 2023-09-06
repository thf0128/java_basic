package oop.poly.player;

public class Mage extends Player {

	int mana;

	Mage(String name){

		super(name);
		this.mana = 180;
	}

	public void blizzard(Player[] target) {
		System.out.printf("%s���� ������ ����!!\n", this.name);
		this.mana -= 30;
		System.out.println("30�� ������ �Ҹ�˴ϴ�. ���� ���ŷ�: " + this.mana);
		System.out.println("-----------------------------------");
		for(Player p : target) {
			int damage = (int) ((Math.random()*6) + 10);
			p.hp -= damage;
			System.out.printf("%s���� %d�� ���ظ� �Ծ����ϴ�.(���� ü��: %d)\n"
					, p.name, damage, p.hp);
		}
		
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# ���ŷ�: " + mana);
	}
}
