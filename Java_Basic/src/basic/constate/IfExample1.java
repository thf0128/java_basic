package basic.constate;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int point = sc.nextInt();
		System.out.println("�� ����: " + point + "��");
		System.out.println("---------------------");
		
		if(point >= 70) {
			System.out.println("70�� �̻��Դϴ�.");
			System.out.println("�հ��ϼ̽��ϴ�!");
		} else {
			System.out.println("70�� �̸��Դϴ�.");
			System.out.println("���հ��ϼ̽��ϴ� �̤�");
		}
		
		System.out.println("���� ġ������ �����ϼ̽��ϴ�!");
		
		sc.close();
		
		
	}

}
