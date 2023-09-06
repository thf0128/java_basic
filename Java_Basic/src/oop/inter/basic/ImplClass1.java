package oop.inter.basic;

	/*
	 1. �������̽��� �ۼ��� �Ŀ��� Ŭ������ �����ؼ�
	  �������̽��� ���� ������ �����Ͻø� �˴ϴ�.
	  
	 2. �������̽��� ���� Ű����� implements �Դϴ�.
	  ��Ӱ� ���� Ŭ���� �̸� �ڿ� �����ϰ��� �ϴ� �������̽� �̸��� �ۼ��մϴ�.
	  
	 3. �������̽��� ����� �߻� �޼���� �ݵ�� ���� Ŭ��������
	  �������̵��� �����ؾ� �մϴ�.
	  
	 4. �������̽��� �ϳ��� Ŭ�������� ���� ���� �������̽���
	  ���ÿ� ���� ������ �� �ֽ��ϴ�.
	 */
	
	public class ImplClass1 implements Inter, Inter2 {
	
		@Override
		public void method1() {
			System.out.println("Inter�� �߻� �޼��� ����!");
			
		}

		@Override
		public void method2() {
			System.out.println("Inter2�� �߻� �޼��� ����!");
			
		}

		@Override
		public void parentMethod() {
			System.out.println("�θ� �������̽��� �޼��� ����!");
		}
		
		public void method3() {
			System.out.println("ImplClass1�� �޼��� ����!");
		}
		
		
	}
	

