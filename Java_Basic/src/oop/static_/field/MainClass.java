package oop.static_.field;

public class MainClass {

	public static void main(String[] args) {

		Count c1 = new Count();
		
		c1.a += 5;
		c1.b += 5;
		
		System.out.println("�ν��Ͻ� ���� c1.a: " + c1.a);
		System.out.println("���� ���� c1.b: " + c1.b);
		
		System.out.println("--------------------------");
		
		Count c2 = new Count();
		
		c2.a += 7;
		c2.b += 7;
		
		System.out.println("�ν��Ͻ� ���� c2.a: " + c2.a);
		System.out.println("���� ���� c2.b: " + c2.b);
		
		System.out.println("--------------------------");
		
		Count c3 = new Count();
		
		c3.a += 8;
		c3.b += 8;
		
		System.out.println("�ν��Ͻ� ���� c3.a: " + c3.a);
		System.out.println("���� ���� c3.b: " + c3.b);
		System.out.println("���� ���� c1.b: " + c1.b);
		System.out.println("���� ���� c2.b: " + c2.b);
		
		/*
		- static�� ���� �����ʹ� �� static �����Ͱ� �����
		Ŭ������ �̸����� �ٷ� ������ �� �ֽ��ϴ�. 
		- �Ϲ� �������(�ʵ�)�� ȥ���� ���ɼ��� �ֱ� ������
		�ּҰ����� �������� �ʽ��ϴ�.
		*/
		
		
		Count.b++;
		Count.b++;
		
		System.out.println("���� ���� Count.b: " + Count.b);
		
	}
}
