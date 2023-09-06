package oop.static_calc;

public class Calculator {
	
	/*
    - ���⸶�� ������ ���� �ٸ� �� �ֱ� ������ color���� ������
     �����͸� ������Ű�� ����, ��ü���� ���� �����ؾ� �մϴ�.
     
    - �ݸ鿡 pi���� ���������� ���⸶�� ���� �����ؾ� �ϱ� ������
     static�� �ٿ��� �����͸� �����ϰ� �ϴ� ���� �����մϴ�.
    */

	String color;
	static double pi = 3.141592;
	
	/*
    - �޼��� ���ο��� non-static �����͸� �����ϰ� �ִ� �޼����
     �ش� ������ ��Ȯ�� ��ġ(��ü�� �ּҰ�)�� �˷���� �ϱ� ������
     ���� �޼���� �����ϱⰡ �������մϴ�.
    */
	
	public void paint(String color) {
		System.out.println("���⿡ " + color + "���� ĥ�մϴ�.");
		this.color = color;
	}
	
	/*
    - �޼��� ���ο��� �ν��Ͻ� ������ ������� �ʰ� ���뼺 �ְ� ����ϴ�
     �޼���� static Ű���带 �ٿ��� ���� �޼���� �����ϴ� ����
     �����ϴ�.
    */
	public static double calcAreaCircle(int r) {
		return r * r * pi;
	}
	
	
	
	
}
