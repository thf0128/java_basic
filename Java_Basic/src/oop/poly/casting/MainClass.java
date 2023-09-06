package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x)
		
		p.method1();
		p.method2();
//		p.method3(); (x)
		
		System.out.println("---------------------------");
		
		Child c = new Child();
		c.n1 = 1; //�θ𿡰� �������� �Ӽ���
		c.n2 = 2; //�ڽ��� ���� �Ӽ�
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("------------------------");
		
		//������ ����(promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2();
//		p2.method3(); (x)
		
		/*
		- �������� ����Ǹ� �ڽ� Ŭ������ 
		������ ���(�ʵ�, �޼���)�� �������� ���ϴ� ������ �߻��մϴ�.
		
		- �̸� �ذ��ϱ� ���� ���� Ÿ�� ��ȯ�� ����մϴ�.
		*/
		
		Child c2 = (Child) p2; // �θ� Ÿ���� �ڽ� Ÿ������ ���� ��ȯ(Downcasting)
		c2.n2 = 2;
		c2.method2();
		c2.method3();
		System.out.println("p2�� �ּҰ�: " + p2);
		System.out.println("c2�� �ּҰ�: " + c2);
		
		Object o = new String("�ȳ��ϼ���~~");
		String str = (String) o;
		System.out.println("���ڿ��� ����: " + str.length());
		
		//�������� �� ���� �߻����� ���� ��쿡��
		//���� �� ��ȯ�� ����� �� �����ϴ�.
		Parent ppp = new Parent();
//		Child ccc = (Child) ppp; (x)
		
	}

}
