package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {

		//�������̽��� ��ü�� ������ �� ���� �߻����� �����Դϴ�.
		//		Inter i1 = new Inter();(x)

		System.out.println("���: " + Inter.NUM);
		Inter.staticMethod(); //static ������ ȣ���� �����մϴ�.

		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();

		System.out.println("------------------------------");

		/*
        - �������� ����� �����Ǿ�� �ϴ� ���� ��Ģ������
         ���ܷ� �������̽��� Ŭ�������� ���� ���迡����
         ������ �߻��� ����մϴ�.
         �������̽� ���� = new ��ü();
		 */

		Inter it1 = new ImplClass1(); //������
		it1.method1();
		it1.parentMethod();

		//�������� �켱����
		//��ȣ() => ����(.) -> ���� -> 2�� -> 3�� -> ����
		((ImplClass1)it1).method2();

		/*
        - �������̽��� �������� �տ��� ��� Ŭ������ ������ó��
         ������ ���ٸ� �޼��� ȣ���� �Ұ����ϱ� ������ �� ��ȯ�� �ʿ��մϴ�.

        - �����ϴ� Ŭ������ ���� �ٸ� �������̽����� ���ÿ� �����ϰ� �ִٸ�
         �����ϴ� Ŭ�����鳢�� ���� ��� �� ��ȯ�� �����մϴ�.
		 */

		((Inter2)it1).method2();

		Inter2 it2 = new ImplClass1();
		it2.method2();
		it2.parentMethod();

		((Inter) it2).method1();

		Inter it3 = new ImplClass2();
		Inter2 it4 = new ImplClass3();

		ParentInter[] inters = {it1, it2, it3, it4};
		
	}

}
