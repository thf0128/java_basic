package oop.static_.init;

public class MainClass {

	public static void main(String[] args) {

//		DBManager DBmanager = new DBManager();
		
		/*
        - ���� �ʱ�ȭ�ڸ� ȣ���Ϸ��� Ŭ������ �ε��Ͻø� �˴ϴ�.
        # Ŭ���� �ε� ���
        1. Ŭ������ �̸��� �����Ͽ� static ����� ȣ��.
        2. ��ü�� ������.
        - ���� �ʱ�ȭ�ڴ� Ŭ���� �ε� �� ���� 1ȸ�� ȣ��˴ϴ�.
        */
		
		System.out.println("�ּ�: " + DBManager.addr);
		System.out.println("������: " + DBManager.uid);
		System.out.println("��й�ȣ: " + DBManager.upw);
		
		
	}

}
