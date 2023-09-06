package oop.poly.player;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("����1");
		Warrior w2 = new Warrior("����2");
		Mage m1 = new Mage("������1");
		Mage m2 = new Mage("������2");
		Hunter h1 = new Hunter("��ɲ�1");
		Hunter h2 = new Hunter("��ɲ�2");
		
		/*
        1. Mage�� blizzard��� ���� ���(�޼���)�� ������ �ֽ��ϴ�.
        
        2. Mage Ŭ������ blizzard��� �޼��带 �ϼ��ϼ���.
        
        3. �޼��� ȣ��ο� �� �Ű������� �˸��� �Ű������� �����ϼ���.
         ���� �����̱� ������ Ÿ���� ���� ���̾�� �մϴ�.
         �׷��� �Ű������� �ϳ��Դϴ�.
         ex) m1.blizzard(???); (�迭 ����� �Ҹ�����.)
         
        4. blizzard��� ����� �����ϴ� ĳ������ �̸��� ������ Ű���带
         ����Ͽ� ����� ������.
         
        5. ���ط�(������)�� 10 ~ 15������ ������ �߻����Ѽ�
         Ÿ�ٵ鿡�� ���� ������ �ּ���.
         
        6. �⺻ ��ü�� hp�� 50�Դϴ�. hp���� ���ط��� �� ���� ü����
         ����� �ּ���.
        */
		
		Player[] target = {w1, w2, m2, h1, h2};
		
		m1.blizzard(target);
		
		System.out.println("==============================");
		
		w1.rush(m1);
		w1.rush(w2);
		w1.rush(h1);
		
	}

}
