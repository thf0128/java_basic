package oop.poly.car;

public class CarShop {

	/*
    - Ű���� instanceof�� ��ü�� ������ Ŭ���� Ÿ���� ���� �� �ִ�
     ��ü������ �˻��� �� ����ϴ� ������ �Դϴ�.
     
    - instanceof�� �������� ������ ��ü�� ������ Ŭ���� Ÿ���� ���� ��
     �ִ� ���� ������� �׷��ٸ� true, �׷��� �ʴٸ� false�� �����մϴ�.
    */
	
	public void carPrice(Car c) {
		if(c instanceof Sonata) {
			System.out.println("�ҳ�Ÿ�� ������ 3000���� �Դϴ�.");
		}else if(c instanceof Tesla) {
			System.out.println("�׽����� ������ 7000���� �Դϴ�.");
		}else if(c instanceof Porsche) {
			System.out.println("�������� ������ 2�� 4õ���� �Դϴ�.");
		}
	}
	
}
