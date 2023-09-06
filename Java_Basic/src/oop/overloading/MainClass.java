package oop.overloading;

public class MainClass {

	public static void main(String[] args) {

		/*
        - Calculator Ŭ������ calcRectArea() �޼��带 �����Ͽ�

        1. ���̸� �ϳ��� �����ϸ� ���簢���� ���̸� ����.
        2. ���̸� �� �� �����ϸ� (����, ����) ���簢���� ���̸� ����.
        3. ���̸� �� �� �����ϸ� (�غ�, ����, ����) ��ٸ����� ���̸� ����.

        MainClass���� ��ü�� ������ �� ���� �޼��带 ȣ���ؼ� ����� ������.
        (���̰� 5�� ���簢���� ����, ����10 ����20�� ���簢���� ����
        ���� 5 �غ� 13 ���� 7�� ��ٸ����� ����) 
		 */

		Calculator c = new Calculator();
		System.out.println("���簢���� ����: " + c.calcRectArea(5));
		System.out.println("���簢���� ����: " + c.calcRectArea(10, 20));
		System.out.println("��ٸ����� ����: " + c.calcRectArea(5, 13, 7));

		
	}
}
