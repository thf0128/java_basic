package oop.abs.good;

public class MainClass {
	public static void main(String[] args) {
		
		/*
        - �߻� Ŭ����(�߻� �޼���)�� ����ϸ� �������̵��� ����ȭ �Ǳ� ������
         ���α׷����� �������̵� �Ǽ��� ������ �� �ְ�, �θ� Ŭ��������
         �޼��带 ������ �� �޼��� ���ο� � ������ ��� �� �� ������ ����
         �����ϱⰡ ���մϴ�.
         
        - �������� ��������� ��쿡�� �����ϰ� ����� �����մϴ�.
        */
		
		//�߻� Ŭ������ �������� ��ü ������ �Ұ����մϴ�.
		//������, �߻� Ŭ������ ��ü�� �ƿ� ������ �� �Ǵ� ���� �ƴ϶�
		//���� ��ý�� ���� ��üȭ�� �����մϴ�.
//		HeadStore h = new HeadStore(); (x)
		
		HeadStore s = new SeoulStore();
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderWaterMelon();
		
		
	}
}
