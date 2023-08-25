package basic.begin;

import java.util.Scanner;

//1. Scanner api �ε� (�����Ǵ� Scanner ������ ���� Ŭ������ ��������)

public class ScannerExample {
	
	public static void main(String[] args) {
		
		//2. ��ĳ�� ��ü�� ����.
		Scanner sc = new Scanner(System.in);
		
		/*
        3. Scanner�� �Լ����� �̿��Ͽ� �����͸� �Է¹��� �� �ֽ��ϴ�.
        - next(): ������ ���� ���ڿ��� �Է¹޽��ϴ�.
        - nextLine(): ������ ������ ���ڸ� �Է¹޽��ϴ�.
        - next + �⺻Ÿ���̸�(): �ش� Ÿ�Կ� �´� �����͸� �Է¹޽��ϴ�.
        ex)
            nextInt(): ���� �����͸� �Է¹޽��ϴ�.
            nextDouble(): �Ǽ� �����͸� �Է¹޽��ϴ�.
        */
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
//		System.out.println("�� �̸��� " + name + "�̰�, ���̴� " + age + "�� �Դϴ�.");"
		System.out.printf("�� �̸���%s�̰�, ���̴� %d�� �Դϴ�.", name, age);
		
		//4. Scanner ��ü�� �ݳ�
		//��ü�� �ݳ� -> Scanner ��ü�� �޸𸮿��� ����
		sc.close();
		
	}
}