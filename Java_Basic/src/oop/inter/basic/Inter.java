package oop.inter.basic;

// �������̽�: ��ü�� �԰�(���)�� ǥ��ȭ�ؼ� ���ϴ� ����.
public interface Inter extends ParentInter {

	//�������̽����� ������ �����ϸ� ���(static final)�� �����մϴ�.
	int NUM = 5;
	
//	Inter() {
//		�������̽��� �����ڸ� ���� �� �����ϴ�. (��üȭ �� �� ���� �����Դϴ�.)
//	}
	
	//�������̽����� �޼��带 �����ϸ� �߻� �޼���� �����˴ϴ�.
	void method1();
	
	public static void staticMethod() {
		System.out.println("�����մϴ�~");
	}
}