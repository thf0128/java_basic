package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		/*
        - ��ĳ�ʸ� ����Ͽ� �̸��� ���̸� �Է¹޾Ƽ�
        
        �̸�: XXX
        ����: XX��
        ����⵵: XXXX��
        
        �� ����ϼ���. (��� �Լ��� ������� ����ؼ� ����Ͻð�
        ����⵵�� �Է»����� �ƴմϴ�.)
        */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.next();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		int birthyear = 2023 - age;
		
		
		System.out.println("-----------------");
		System.out.printf("�̸�: %s\n����: %d��\n����⵵: %d��\n", name, age, 2023-age);
		System.out.println("-----------------");
		
		sc.close();
		
		
	}

}
