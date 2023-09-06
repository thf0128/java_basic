package oop.static_.singleton;

public class Singleton {

	/*
	# ��Ŭ�� ������ ����: Ŭ������ ��ü�� �� 1���� �����ϱ� ���� �ڵ� ������ ����.
	
	1. �ܺο��� �� Ŭ������ ��ü�� �������� ���ϰ� �����ڸ� �� 1����
	�����ϰ�, private ���� ������ ����.
	*/
	
	private Singleton() {
		System.out.println("��ü�� ������!");
	}
	
	//2. �����ڸ� ȣ���� �� �ִ� ������ ���� Ŭ���� ���� ���̹Ƿ�
	//�ڽ��� Ŭ���� ���ο��� �������� ��ü�� �� 1���� ������.
	private static Singleton s = new Singleton();
	
	//3. �ܺο��� �� Ŭ������ ��ü�� �䱸�� ��, 2������ �̸� ����� ����
	//�� �ϳ��� ��ü�� �ּҰ��� ������ �޼��带 ���� �����Ѵ�.
	public static Singleton getInstance() {
		return s;
	}
	
	
	//////////////////////////////////////////
	
	public void method1() {
		System.out.println("���� �������� ���̴� �߿��� �޼���");
	}
	
	public void method2() {
		System.out.println("���α׷� ������ �� �ѹ� �ҷ��� �ϴ� ���� �޼���");
	}
	
	
}
